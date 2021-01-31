package tim20.xml.poverenik.poverenikBek.service.ZalbaNaOdluku;

import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaOdluku.Zalba;

import javax.xml.bind.JAXBException;

public interface StoreZalbaNaOdlukuUseCase {

    public void store(Zalba zalba) throws XMLDBException, JAXBException;

}
