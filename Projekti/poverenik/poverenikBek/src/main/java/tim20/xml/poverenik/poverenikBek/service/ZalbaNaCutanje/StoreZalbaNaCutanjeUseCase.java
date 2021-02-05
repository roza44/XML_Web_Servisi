package tim20.xml.poverenik.poverenikBek.service.ZalbaNaCutanje;

import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaCutanje.Zalba;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public interface StoreZalbaNaCutanjeUseCase {

    public void store(Zalba zalba) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException;

}
