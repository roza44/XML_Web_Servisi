package tim20.xml.poverenik.poverenikBek.repository.repositories;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.Obavestenje.Obavestenje;
import tim20.xml.poverenik.poverenikBek.repository.util.DatabaseManager;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

@Repository
public class ObavestenjeRepository {
    private final String COLLECTION_ID ="/db/sample/Obavestenje";
    private final String rdfFilePath = "temp/Obavestenje.rdf";

    public void store(Obavestenje obavestenje) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        DatabaseManager.<Obavestenje>store(obavestenje, COLLECTION_ID, "1.xml");
        DatabaseManager.<Obavestenje>storeRdf(obavestenje, rdfFilePath);
    }

    public Obavestenje get(String id) throws XMLDBException, JAXBException {
        return DatabaseManager.<Obavestenje>retrieve(Obavestenje.class, COLLECTION_ID, "1.xml");
    }

    public List<Obavestenje> getAll() throws XMLDBException, JAXBException {
        return DatabaseManager.<Obavestenje>getAll(Obavestenje.class, COLLECTION_ID);
    }
}
