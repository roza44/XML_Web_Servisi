package tim20.xml.sluzbenik.sluzbenikBek.repository.repositories;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Obavestenje.Obavestenje;
import tim20.xml.sluzbenik.sluzbenikBek.model.Zahtev.Zahtev;
import tim20.xml.sluzbenik.sluzbenikBek.repository.util.DatabaseManager;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

@Repository
public class ZahtevRepository {

    private final String COLLECTION_ID ="/db/sample/Zahtev";
    private final String rdfFilePath = "temp/Zahtev.rdf";

    public void store(Zahtev zahtev) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        DatabaseManager.<Zahtev>store(zahtev, COLLECTION_ID,  null);
        DatabaseManager.<Zahtev>storeRdf(zahtev, rdfFilePath);
    }

    public List<Zahtev> query(String pathQuery, String paramQuery) throws XMLDBException, JAXBException, IOException {
        return DatabaseManager.<Zahtev>query(Zahtev.class, COLLECTION_ID, pathQuery, paramQuery);
    }

    public List<Zahtev> getAll() throws XMLDBException, JAXBException {
        return DatabaseManager.<Zahtev>getAll(Zahtev.class, COLLECTION_ID);
    }

    public Zahtev retrieve(String documentId) throws XMLDBException, JAXBException {
        return DatabaseManager.<Zahtev>retrieve(Zahtev.class, COLLECTION_ID, documentId);
    }

    public String retrieveRaw(String documentId) throws XMLDBException, JAXBException {
        return DatabaseManager.<Zahtev>retrieveRaw(COLLECTION_ID, documentId);
    }
}
