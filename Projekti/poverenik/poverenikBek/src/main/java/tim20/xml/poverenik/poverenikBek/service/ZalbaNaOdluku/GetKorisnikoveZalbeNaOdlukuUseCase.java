package tim20.xml.poverenik.poverenikBek.service.ZalbaNaOdluku;

import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaOdluku.Zalba;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

public interface GetKorisnikoveZalbeNaOdlukuUseCase {

    public List<Zalba> get() throws XMLDBException, JAXBException, IOException;

}
