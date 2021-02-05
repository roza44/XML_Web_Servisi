package tim20.xml.sluzbenik.sluzbenikBek.service.Zahtev;

import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Zahtev.Zahtev;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public interface StoreZahtevUseCase {

    public void store(Zahtev zahtev) throws JAXBException, TransformerException, IOException, SAXException, XMLDBException;

}
