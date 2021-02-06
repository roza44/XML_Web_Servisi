package tim20.xml.poverenik.poverenikBek.service.Resenje;

import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.Resenje.Resenje;

import javax.xml.bind.JAXBException;
import java.util.List;

public interface GetAllResenjeUseCase {

    public List<Resenje> getAll() throws XMLDBException, JAXBException;
}
