package tim20.xml.sluzbenik.sluzbenikBek.service.ZalbaNaOdluku;

import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.ZalbaNaOdluku.Zalba;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

public interface StoreZalbaNaOdlukuUseCase {

    public void store(Zalba zalba) throws  JAXBException, TransformerException, IOException, SAXException, XMLDBException;

}
