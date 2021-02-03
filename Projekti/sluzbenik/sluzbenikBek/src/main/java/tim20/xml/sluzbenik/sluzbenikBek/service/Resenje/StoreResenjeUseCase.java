package tim20.xml.sluzbenik.sluzbenikBek.service.Resenje;

import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Resenje.Resenje;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public interface StoreResenjeUseCase {

    public void store(Resenje resenje) throws  JAXBException, TransformerException, IOException, SAXException, XMLDBException;

}
