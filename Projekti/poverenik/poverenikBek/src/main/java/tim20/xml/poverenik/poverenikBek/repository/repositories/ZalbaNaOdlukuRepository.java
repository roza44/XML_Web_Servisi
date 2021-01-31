package tim20.xml.poverenik.poverenikBek.repository.repositories;

import org.springframework.stereotype.Repository;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaOdluku.Zalba;
import tim20.xml.poverenik.poverenikBek.repository.util.DatabaseManager;

import javax.xml.bind.JAXBException;

@Repository
public class ZalbaNaOdlukuRepository {

    private final String COLLECTION_ID ="/db/sample/ZalbaNaOdluku";

    public void store(Zalba zalba) throws XMLDBException, JAXBException {
        DatabaseManager.<Zalba>store(zalba, COLLECTION_ID, "1.xml");
    }

}
