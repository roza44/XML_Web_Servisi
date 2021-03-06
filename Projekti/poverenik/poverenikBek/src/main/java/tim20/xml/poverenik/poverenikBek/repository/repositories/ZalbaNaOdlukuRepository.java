package tim20.xml.poverenik.poverenikBek.repository.repositories;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaOdluku.Zalba;
import tim20.xml.poverenik.poverenikBek.repository.util.DatabaseManager;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.List;

@Repository
public class ZalbaNaOdlukuRepository {

    private final String COLLECTION_ID ="/db/sample/ZalbaNaOdluku";
    private final String rdfFilePath = "temp/ZalbaNaOdluku.rdf";

    public void store(Zalba zalba) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        DatabaseManager.<Zalba>store(zalba, COLLECTION_ID, null);
        DatabaseManager.<Zalba>storeRdf(zalba, rdfFilePath);
    }

    public List<Zalba> query(String pathQuery, String paramQuery) throws XMLDBException, JAXBException, IOException {
        return DatabaseManager.<Zalba>query(Zalba.class, COLLECTION_ID, pathQuery, paramQuery);
    }

    public List<Zalba> getAll() throws XMLDBException, JAXBException {
        return DatabaseManager.<Zalba>getAll(Zalba.class, COLLECTION_ID);
    }

}
