package tim20.xml.poverenik.poverenikBek.service.ZalbaNaOdluku;

import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaOdluku.Zalba;

import javax.xml.bind.JAXBException;
import java.util.List;

public interface GetAllZalbaNaOdlukuUseCase {

    public List<Zalba> getAll() throws XMLDBException, JAXBException;
}
