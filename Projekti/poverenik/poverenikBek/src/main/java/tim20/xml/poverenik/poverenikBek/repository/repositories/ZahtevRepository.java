package tim20.xml.poverenik.poverenikBek.repository.repositories;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.Zahtev.Zahtev;
import tim20.xml.poverenik.poverenikBek.repository.util.DatabaseManager;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

@Repository
public class ZahtevRepository {

    private final String COLLECTION_ID ="/db/sample/Zahtev";
    private final String rdfFilePath = "temp/Zahtev.rdf";

    public void store(Zahtev zahtev) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        DatabaseManager.<Zahtev>store(zahtev, COLLECTION_ID, null);
        DatabaseManager.<Zahtev>storeRdf(zahtev, rdfFilePath);
    }

    public Zahtev get(String id) throws XMLDBException, JAXBException {
        return DatabaseManager.<Zahtev>retrieve(Zahtev.class, COLLECTION_ID, "1.xml");
    }

    public List<Zahtev> getAll() throws XMLDBException, JAXBException {
        return DatabaseManager.<Zahtev>getAll(Zahtev.class, COLLECTION_ID);
    }
}
