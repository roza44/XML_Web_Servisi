package tim20.xml.poverenik.poverenikBek.service.Zahtev;

import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.Zahtev.Zahtev;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public interface StoreZahtevUseCase {

    public void store(Zahtev zahtev) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException;

}
