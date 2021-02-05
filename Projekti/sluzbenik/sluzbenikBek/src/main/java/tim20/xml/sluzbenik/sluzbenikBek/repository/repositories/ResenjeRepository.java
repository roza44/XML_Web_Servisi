package tim20.xml.sluzbenik.sluzbenikBek.repository.repositories;

import org.springframework.stereotype.Repository;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Resenje.Resenje;
import tim20.xml.sluzbenik.sluzbenikBek.repository.util.DatabaseManager;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@Repository
public class ResenjeRepository {

    private final String COLLECTION_ID ="/db/sample/Resenje";
    private final String rdfFilePath = "temp/Resenje.rdf";

    public void store(Resenje resenje) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        DatabaseManager.<Resenje>store(resenje, COLLECTION_ID, "1.xml");
        DatabaseManager.<Resenje>storeRdf(resenje, rdfFilePath);
    }
}
