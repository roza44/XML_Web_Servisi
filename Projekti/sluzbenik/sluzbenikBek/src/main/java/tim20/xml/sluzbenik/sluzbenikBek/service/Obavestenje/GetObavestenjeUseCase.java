package tim20.xml.sluzbenik.sluzbenikBek.service.Obavestenje;

import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Obavestenje.Obavestenje;

import javax.xml.bind.JAXBException;

public interface GetObavestenjeUseCase {

    public Obavestenje get(String id) throws XMLDBException, JAXBException;
}
