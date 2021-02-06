package tim20.xml.sluzbenik.sluzbenikBek.service.Zahtev;

import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Zahtev.Zahtev;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

public interface GetKorisnikoviZahteviUseCase {

    public List<Zahtev> get() throws XMLDBException, JAXBException, IOException;
}
