package tim20.xml.poverenik.poverenikBek.service.ZalbaNaCutanje;

import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaCutanje.Zalba;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

public interface GetKorisnikoveZalbeNaCutanjeUseCase {

    public List<Zalba> get() throws XMLDBException, JAXBException, IOException;
}
