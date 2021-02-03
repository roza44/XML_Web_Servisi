package tim20.xml.poverenik.poverenikBek.repository.repositories;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaCutanje.Zalba;
import tim20.xml.poverenik.poverenikBek.repository.util.DatabaseManager;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
@Repository
public class ZalbaNaCutanjeRepository {

    private final String COLLECTION_ID ="/db/sample/ZalbaNaCutanje";
    private final String rdfFilePath = "src/data/gen/ZalbaNaCutanje.rdf";

    public void store(Zalba zalba) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        DatabaseManager.<Zalba>store(zalba, COLLECTION_ID, "1.xml");
        DatabaseManager.<Zalba>storeRdf(zalba, rdfFilePath);
    }
}
