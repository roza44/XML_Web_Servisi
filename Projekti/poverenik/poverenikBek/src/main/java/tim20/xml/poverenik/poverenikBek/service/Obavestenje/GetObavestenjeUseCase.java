package tim20.xml.poverenik.poverenikBek.service.Obavestenje;

import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.Obavestenje.Obavestenje;

import javax.xml.bind.JAXBException;

public interface GetObavestenjeUseCase {

    public Obavestenje get(String id) throws XMLDBException, JAXBException;
}
