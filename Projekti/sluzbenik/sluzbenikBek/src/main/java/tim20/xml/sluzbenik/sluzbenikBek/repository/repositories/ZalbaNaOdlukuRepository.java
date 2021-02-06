package tim20.xml.sluzbenik.sluzbenikBek.repository.repositories;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.ZalbaNaOdluku.Zalba;
import tim20.xml.sluzbenik.sluzbenikBek.repository.util.DatabaseManager;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@Repository
public class ZalbaNaOdlukuRepository {

    private final String COLLECTION_ID ="/db/sample/ZalbaNaOdluku";
    private final String rdfFilePath = "temp/ZalbaNaOdluku.rdf";

    public void store(Zalba zalba) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        long cnt = DatabaseManager.count(COLLECTION_ID);
        cnt = cnt + 1;
        DatabaseManager.<Zalba>store(zalba, COLLECTION_ID, null);
        DatabaseManager.<Zalba>storeRdf(zalba, rdfFilePath);
    }

}
