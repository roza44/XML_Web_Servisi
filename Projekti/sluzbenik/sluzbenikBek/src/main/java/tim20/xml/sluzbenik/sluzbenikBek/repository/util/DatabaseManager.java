package tim20.xml.sluzbenik.sluzbenikBek.repository.util;

import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.update.UpdateExecutionFactory;
import org.apache.jena.update.UpdateFactory;
import org.apache.jena.update.UpdateProcessor;
import org.apache.jena.update.UpdateRequest;
import org.exist.xmldb.EXistResource;
import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.exist.xmldb.EXistResource;
import org.springframework.stereotype.Repository;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.CollectionManagementService;
import org.xmldb.api.modules.XMLResource;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.TransformerException;
import java.io.*;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

@Repository
public class DatabaseManager {

    private static AuthenticationUtilities.ExistProperties conn;
    private static Database database;

    static {
        try {
            conn = AuthenticationUtilities.loadExistProperties();

            // initialize database driver
            Class<?> cl = Class.forName(conn.driver);
            database = (Database) cl.newInstance();

            // entry point for the API which enables you to get the Collection reference
            org.xmldb.api.DatabaseManager.registerDatabase(database);


        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static <T> void store(T entity, String collectionId, String documentId) throws XMLDBException, JAXBException {

        // a collection of Resources stored within an XML database
        Collection col = null;
        XMLResource res = null;
        OutputStream os = new ByteArrayOutputStream();

        try {
            System.out.println("[INFO] Retrieving the collection: " + collectionId);
            col = getOrCreateCollection(collectionId);

            System.out.println("[INFO] Inserting the document: " + documentId);
            res = (XMLResource) col.createResource(documentId, XMLResource.RESOURCE_TYPE);

            System.out.println("[INFO] Unmarshalling XML document to an JAXB instance: ");
            JAXBContext context = JAXBContext.newInstance(entity.getClass());

            Marshaller m = context.createMarshaller();

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(entity, os);

            // link the stream to the XML resource
            res.setContent(os);
            System.out.println("[INFO] Storing the document: " + res.getId());

            col.storeResource(res);
            System.out.println("[INFO] Done.");

        } finally {

            cleanUp(col, res);
        }

    }

    public static <T> void storeRdf(T entity, String rdfFilePath) throws IOException, TransformerException, SAXException, JAXBException {

        final String SPARQL_NAMED_GRAPH_URI = "/metadata";

        ByteArrayOutputStream os = new ByteArrayOutputStream();
        AuthenticationUtilities.FusekiProperties properties =
                AuthenticationUtilities.loadFusekiProperties();

        // Automatic extraction of RDF triples from XML file
        MetadataExtractor metadataExtractor = new MetadataExtractor();
        JAXBContext context = JAXBContext.newInstance(entity.getClass().getPackage().getName());
        Marshaller m = context.createMarshaller();
        m.setProperty("com.sun.xml.bind.namespacePrefixMapper", new NPMapper());
        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(entity, os);

        InputStream xmlContent = new ByteArrayInputStream(os.toByteArray());
        System.out.println("[INFO] Extracting metadata from RDFa attributes...");
        metadataExtractor.extractMetadata(
                xmlContent,
                new FileOutputStream(new File(rdfFilePath)));
        xmlContent.close();
        // Loading a default model with extracted metadata
        Model model = ModelFactory.createDefaultModel();
        model.read(rdfFilePath);

        ByteArrayOutputStream out = new ByteArrayOutputStream();

        model.write(out, SparqlUtil.NTRIPLES);

        // Writing the named graph
        System.out.println("[INFO] Populating named graph \"" + SPARQL_NAMED_GRAPH_URI + "\" with extracted metadata.");
        String sparqlUpdate = SparqlUtil.insertData(properties.dataEndpoint + SPARQL_NAMED_GRAPH_URI, new String(out.toByteArray()));
        System.out.println(sparqlUpdate);

        // UpdateRequest represents a unit of execution
        UpdateRequest update = UpdateFactory.create(sparqlUpdate);

        UpdateProcessor processor = UpdateExecutionFactory.createRemote(update, properties.updateEndpoint);
        processor.execute();

    }

    public static <T> T retrieve(Class<T> classT, String collectionId, String documentId) throws XMLDBException, JAXBException {

        Collection col = null;
        XMLResource res = null;
        T retValue = null;

        try {
            // get the collection
            System.out.println("[INFO] Retrieving the collection: " + collectionId);
            col = org.xmldb.api.DatabaseManager.getCollection(conn.uri + collectionId);
            col.setProperty(OutputKeys.INDENT, "yes");

            System.out.println("[INFO] Retrieving the document: " + documentId);
            res = (XMLResource)col.getResource(documentId);

            if(res == null) {
                System.out.println("[WARNING] Document '" + documentId + "' can not be found!");
            } else {

                System.out.println("[INFO] Binding XML resouce to an JAXB instance: ");


                //This may not work

                JAXBContext context = JAXBContext.newInstance(classT);


                Unmarshaller unmarshaller = context.createUnmarshaller();

                retValue= (T) unmarshaller.unmarshal(res.getContentAsDOM());

                System.out.println("[INFO] Showing the document as JAXB instance: ");
                System.out.println(retValue);

            }
        } finally {
           cleanUp(col, res);
        }

        return retValue;

    }

    public static long count(String collectionId) throws XMLDBException {
        Collection col = null;
        long retValue = 0;

        try {
            // get the collection
            System.out.println("[INFO] Retrieving the collection: " + collectionId);
            col = org.xmldb.api.DatabaseManager.getCollection(conn.uri + collectionId);
            col.setProperty(OutputKeys.INDENT, "yes");

            retValue = col.getResourceCount();

        } finally {
            cleanUp(col, null);
        }

        return retValue;
    }

    private static void cleanUp(Collection col, XMLResource res) {

        //don't forget to cleanup
        if(res != null) {
            try {
                ((EXistResource)res).freeResources();
            } catch (XMLDBException xe) {
                xe.printStackTrace();
            }
        }


        if(col != null) {
            try {
                col.close();
            } catch (XMLDBException xe) {
                xe.printStackTrace();
            }
        }

    }

    private static Collection getOrCreateCollection(String collectionUri) throws XMLDBException {
        return getOrCreateCollection(collectionUri, 0);
    }

    private static Collection getOrCreateCollection(String collectionUri, int pathSegmentOffset) throws XMLDBException, XMLDBException {

        Collection col = org.xmldb.api.DatabaseManager.getCollection(conn.uri + collectionUri, conn.user, conn.password);

        // create the collection if it does not exist
        if(col == null) {

            if(collectionUri.startsWith("/")) {
                collectionUri = collectionUri.substring(1);
            }

            String pathSegments[] = collectionUri.split("/");

            if(pathSegments.length > 0) {
                StringBuilder path = new StringBuilder();

                for(int i = 0; i <= pathSegmentOffset; i++) {
                    path.append("/" + pathSegments[i]);
                }

                Collection startCol = org.xmldb.api.DatabaseManager.getCollection(conn.uri + path, conn.user, conn.password);

                if (startCol == null) {

                    // child collection does not exist

                    String parentPath = path.substring(0, path.lastIndexOf("/"));
                    Collection parentCol = org.xmldb.api.DatabaseManager.getCollection(conn.uri + parentPath, conn.user, conn.password);

                    CollectionManagementService mgt = (CollectionManagementService) parentCol.getService("CollectionManagementService", "1.0");

                    System.out.println("[INFO] Creating the collection: " + pathSegments[pathSegmentOffset]);
                    col = mgt.createCollection(pathSegments[pathSegmentOffset]);

                    col.close();
                    parentCol.close();

                } else {
                    startCol.close();
                }
            }
            return getOrCreateCollection(collectionUri, ++pathSegmentOffset);
        } else {
            return col;
        }
    }

}
