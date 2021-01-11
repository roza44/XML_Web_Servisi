package Zahtev;

import Zahtev.model.Zahtev;
import org.xml.sax.SAXException;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.CollectionManagementService;
import org.xmldb.api.modules.XMLResource;
import util.AuthenticationUtilities;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Store {
    private static final String SCHEMA_URL = "./../Dokumenti/XML Seme/zahtevcir.xsd";
    private static final String IN_URL = "./../Dokumenti/XML Dokumenti/Ulaz/Zahtev1.xml";
//    private static final String OUT_URL = "./../Dokumenti/XML Dokumenti/Izlaz/Zahtev1.xml";

    public static AuthenticationUtilities.ExistProperties conn;

    public static void main(String[] args) throws Exception {
        run(conn = AuthenticationUtilities.loadExistProperties());
    }

    public static void run(AuthenticationUtilities.ExistProperties conn) throws Exception {
        System.out.println("[INFO] " + Store.class.getSimpleName());

        // Initialize collection and document identifiers
        String collectionId = "/db/sample/Zahtev";
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
            JAXBContext context = JAXBContext.newInstance(Zahtev.class);
            Unmarshaller um = context.createUnmarshaller();

            // Setup schema validator
            SchemaFactory sf = SchemaFactory.newInstance((XMLConstants.W3C_XML_SCHEMA_NS_URI));
            Schema zahtevSchema = sf.newSchema(new File(SCHEMA_URL));
            um.setSchema(zahtevSchema);

            Zahtev zahtev = (Zahtev) um.unmarshal(new InputStreamReader(
                    new FileInputStream(IN_URL),
                    StandardCharsets.UTF_8
            ));
            System.out.println("\nISPIS ZAHTEVA\n");
            System.out.println(zahtev);

            Marshaller m = context.createMarshaller();

            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
            m.marshal(zahtev, os);

            // link the stream to the XML Resource
            res.setContent(os);
            System.out.println("[INFO] Storing the document: " + res.getId());

            col.storeResource(res);
            System.out.println("[INFO] Done.");
        } finally {

//            //don't forget to cleanup
//            if(res != null) {
//                try {
//                    ((EXistResource)res).freeResources();
//                } catch (XMLDBException xe) {
//                    xe.printStackTrace();
//                }
//            }



            if(col != null) {
                try {
                    col.close();
                } catch (XMLDBException xe) {
                    xe.printStackTrace();
                }
            }
        }
    }

    private static Collection getOrCreateCollection(String collectionUri) throws XMLDBException {
        return getOrCreateCollection(collectionUri, 0);
    }

    private static Collection getOrCreateCollection(String collectionUri, int pathSegmentOffset) throws XMLDBException {

        Collection col = DatabaseManager.getCollection(conn.uri + collectionUri, conn.user, conn.password);

        // create the collection if it does not exist
        if (col == null) {

            if (collectionUri.startsWith("/")) {
                collectionUri = collectionUri.substring(1);
            }

            String[] pathSegments = collectionUri.split("/");

            if (pathSegments.length > 0) {
                StringBuilder path = new StringBuilder();

                for (int i = 0; i <= pathSegmentOffset; i++) {
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
