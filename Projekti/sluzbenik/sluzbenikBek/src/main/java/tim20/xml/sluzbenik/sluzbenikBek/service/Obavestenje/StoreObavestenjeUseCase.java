package tim20.xml.sluzbenik.sluzbenikBek.service.Obavestenje;

import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Obavestenje.Obavestenje;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public interface StoreObavestenjeUseCase {

    public void store(Obavestenje obavestenje) throws JAXBException, TransformerException, IOException, SAXException, XMLDBException;

}
