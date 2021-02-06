package tim20.xml.poverenik.poverenikBek.repository.repositories;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.Resenje.Resenje;
import tim20.xml.poverenik.poverenikBek.repository.util.DatabaseManager;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

@Repository
public class ResenjeRepository {

    private final String COLLECTION_ID ="/db/sample/Resenje";
    private final String rdfFilePath = "temp/Resenje.rdf";

    public void store(Resenje resenje) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        DatabaseManager.<Resenje>store(resenje, COLLECTION_ID, null);
        DatabaseManager.<Resenje>storeRdf(resenje, rdfFilePath);
    }

    public List<Resenje> getAll() throws XMLDBException, JAXBException {
        return DatabaseManager.<Resenje>getAll(Resenje.class, COLLECTION_ID);
    }
}
