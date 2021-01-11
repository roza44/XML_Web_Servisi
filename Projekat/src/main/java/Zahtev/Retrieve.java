package Zahtev;

import Zahtev.model.Zahtev;
import org.xmldb.api.DatabaseManager;
import org.xmldb.api.base.Collection;
import org.xmldb.api.base.Database;
import org.xmldb.api.base.XMLDBException;
import org.xmldb.api.modules.XMLResource;
import util.AuthenticationUtilities;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.OutputKeys;
import java.io.IOException;

public class Retrieve {

    public static void main(String[] args) throws Exception {
        run(AuthenticationUtilities.loadProperties(), args);
    }

    public static void run(AuthenticationUtilities.ConnectionProperties conn, String args[]) throws Exception  {

        System.out.println("[INFO] " + Retrieve.class.getSimpleName());

        // Initialize collection and document identifiers
        String collectionId = null;
        String documentId = null;

        collectionId = "/db/sample/Zahtev";
        documentId = "1.xml";

        System.out.println("\t- collection ID: " + collectionId);
        System.out.println("\t- document ID: " + documentId + "\n");

        // initialize database driver
        System.out.println("[INFO] Loading driver class: " + conn.driver);
        Class<?> cl = Class.forName(conn.driver);

        Database database = (Database) cl.newInstance();
        database.setProperty("create-database", "true");

        DatabaseManager.registerDatabase(database);

        Collection col = null;
        XMLResource res = null;

        try {
            // get the collection
            System.out.println("[INFO] Retrieving the collection: " + collectionId);
            col = DatabaseManager.getCollection(conn.uri + collectionId);
            col.setProperty(OutputKeys.INDENT, "yes");

            System.out.println("[INFO] Retrieving the document: " + documentId);
            res = (XMLResource)col.getResource(documentId);

            if(res == null) {
                System.out.println("[WARNING] Document '" + documentId + "' can not be found!");
            } else {

                System.out.println("[INFO] Binding XML resouce to an JAXB instance: ");
                JAXBContext context = JAXBContext.newInstance(Zahtev.class);

                Unmarshaller unmarshaller = context.createUnmarshaller();

                Zahtev zahtev = (Zahtev) unmarshaller.unmarshal(res.getContentAsDOM());

                System.out.println("[INFO] Showing the document as JAXB instance: ");
                System.out.println(zahtev);
            }
        } finally {
            //don't forget to clean up!

            /*
            if(res != null) {
                try {
                    ((EXistResource)res).freeResources();
                } catch (XMLDBException xe) {
                    xe.printStackTrace();
                }
            }
            */

            if(col != null) {
                try {
                    col.close();
                } catch (XMLDBException xe) {
                    xe.printStackTrace();
                }
            }
        }
    }
}
