package tim20.xml.poverenik.poverenikBek.service.Obavestenje;

import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.Obavestenje.Obavestenje;

import javax.xml.bind.JAXBException;
import java.util.List;

public interface GetAllObavestenjaUseCase {

    public List<Obavestenje> getAll() throws XMLDBException, JAXBException;
}
