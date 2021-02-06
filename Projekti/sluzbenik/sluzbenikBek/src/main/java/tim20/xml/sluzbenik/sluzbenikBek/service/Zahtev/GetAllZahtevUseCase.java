package tim20.xml.sluzbenik.sluzbenikBek.service.Zahtev;

import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Zahtev.Zahtev;

import javax.xml.bind.JAXBException;
import java.util.List;

public interface GetAllZahtevUseCase {

    public List<Zahtev> getAll() throws XMLDBException, JAXBException;

}
