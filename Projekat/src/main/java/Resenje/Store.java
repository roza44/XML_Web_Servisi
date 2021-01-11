package Resenje;

import Obavestenje.model.Obavestenje;
import Resenje.model.Resenje;
import org.apache.jena.rdf.model.Model;
import org.apache.jena.rdf.model.ModelFactory;
import org.apache.jena.update.UpdateExecutionFactory;
import org.apache.jena.update.UpdateFactory;
import org.apache.jena.update.UpdateProcessor;
import org.apache.jena.update.UpdateRequest;
import org.exist.xmldb.EXistResource;
import org.xml.sax.SAXException;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.CollectionManagementService;
import org.xmldb.api.modules.XMLResource;
import util.AuthenticationUtilities;
import util.MetadataExtractor;
import util.SparqlUtil;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.TransformerException;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Store {

    private static final String SCHEMA_URL = "./../Dokumenti/XML Seme/resenje.xsd";
    private static final String IN_URL = "./../Dokumenti/XML Dokumenti/Ulaz/Resenje1.xml";
    private static final String OUT_URL = "./../Dokumenti/XML Dokumenti/Izlaz/Resenje1.xml";

    public static AuthenticationUtilities.ExistProperties conn;

    public static void main(String[] args) throws Exception {
        run(conn = AuthenticationUtilities.loadExistProperties());
        storeRdf();
    }

    public static void run(AuthenticationUtilities.ExistProperties conn) throws Exception {

        System.out.println("[INFO] " + Store.class.getSimpleName());

        // initialize collection and document identifiers
        String collectionId = "/db/sample/Resenje";
        String documentId = "1.xml";

        System.out.println("\t- collection ID: " + collectionId);
        System.out.println("\t- document ID: " + documentId);
        System.out.println("\t- file path: " + IN_URL + "\n");

        // initialize database driver
        System.out.println("[INFO] Loading driver class: " + conn.driver);

        // initialize database driver
        Class<?> cl = Class.forName(conn.driver);

        // encapsulation of the database driver functionality
        Database database = (Database) cl.newInstance();
        database.setProperty("create-database", "true");

        // entry point for the API which enables you to get the Collection reference
        DatabaseManager.registerDatabase(database);

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
            JAXBContext context = JAXBContext.newInstance(Resenje.class);
            Unmarshaller um = context.createUnmarshaller();

            //Setup schema validator
//            SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
//            Schema employeeSchema = sf.newSchema(new File(SCHEMA_URL));
//            um.setSchema(employeeSchema);

            Resenje resenje = (Resenje) um.unmarshal(new InputStreamReader(
                    new FileInputStream(IN_URL), StandardCharsets.UTF_8));

            System.out.println("\nISPIS Resenja:\n");
            System.out.println(resenje);

            Marshaller m = context.createMarshaller();

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(resenje, os);

            // link the stream to the XML resource
            res.setContent(os);
            System.out.println("[INFO] Storing the document: " + res.getId());

            col.storeResource(res);
            System.out.println("[INFO] Done.");
        } finally {

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

    }

    private static void storeRdf() throws IOException, TransformerException, SAXException {

        final String SPARQL_NAMED_GRAPH_URI = "/metadata";

        AuthenticationUtilities.FusekiProperties properties =
                AuthenticationUtilities.loadFusekiProperties();

        // Automatic extraction of RDF triples from XML file
        MetadataExtractor metadataExtractor = new MetadataExtractor();

        String rdfFilePath = "Resenje.rdf";

        System.out.println("[INFO] Extracting metadata from RDFa attributes...");
        metadataExtractor.extractMetadata(
                new FileInputStream(new File(IN_URL)),
                new FileOutputStream(new File(rdfFilePath)));

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


    private static Collection getOrCreateCollection(String collectionUri) throws XMLDBException {
        return getOrCreateCollection(collectionUri, 0);
    }

    private static Collection getOrCreateCollection(String collectionUri, int pathSegmentOffset) throws XMLDBException, XMLDBException {

        Collection col = DatabaseManager.getCollection(conn.uri + collectionUri, conn.user, conn.password);

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

                Collection startCol = DatabaseManager.getCollection(conn.uri + path, conn.user, conn.password);

                if (startCol == null) {

                    // child collection does not exist

                    String parentPath = path.substring(0, path.lastIndexOf("/"));
                    Collection parentCol = DatabaseManager.getCollection(conn.uri + parentPath, conn.user, conn.password);

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
