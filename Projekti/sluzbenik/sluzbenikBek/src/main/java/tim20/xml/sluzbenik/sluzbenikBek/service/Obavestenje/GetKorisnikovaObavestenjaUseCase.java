package tim20.xml.sluzbenik.sluzbenikBek.service.Obavestenje;

import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Obavestenje.Obavestenje;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

public interface GetKorisnikovaObavestenjaUseCase {

    public List<Obavestenje> get() throws XMLDBException, JAXBException, IOException;
}
