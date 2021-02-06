package tim20.xml.sluzbenik.sluzbenikBek.repository.repositories;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Zahtev.Zahtev;
import tim20.xml.sluzbenik.sluzbenikBek.repository.util.DatabaseManager;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@Repository
public class ZahtevRepository {

    private final String COLLECTION_ID ="/db/sample/Zahtev";
    private final String rdfFilePath = "temp/Zahtev.rdf";

    public void store(Zahtev zahtev) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        DatabaseManager.<Zahtev>store(zahtev, COLLECTION_ID, "1.xml");
        DatabaseManager.<Zahtev>storeRdf(zahtev, rdfFilePath);
    }

    public Zahtev retrieve(String documentId) throws XMLDBException, JAXBException {
        return DatabaseManager.<Zahtev>retrieve(Zahtev.class, COLLECTION_ID, documentId);
    }

    public String retrieveRaw(String documentId) throws XMLDBException, JAXBException {
        return DatabaseManager.<Zahtev>retrieveRaw(COLLECTION_ID, documentId);
    }
}
