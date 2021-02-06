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
public class ObavestenjeRepository {
    private final String COLLECTION_ID ="/db/sample/Obavestenje";
    private final String rdfFilePath = "temp/Obavestenje.rdf";


    public void store(Obavestenje obavestenje) throws JAXBException, TransformerException, IOException, SAXException, XMLDBException {
        DatabaseManager.<Obavestenje>store(obavestenje, COLLECTION_ID, null);
        DatabaseManager.<Obavestenje>storeRdf(obavestenje, rdfFilePath);
    }

    public List<Obavestenje> get(String pathQuery, String paramQuery) throws XMLDBException, JAXBException, IOException {
        return DatabaseManager.<Obavestenje>query(Obavestenje.class, COLLECTION_ID, pathQuery, paramQuery);
    }

    public List<Obavestenje> getAll() throws XMLDBException, JAXBException {
        return DatabaseManager.<Obavestenje>getAll(Obavestenje.class, COLLECTION_ID);
    }
}
