package tim20.xml.sluzbenik.sluzbenikBek.service.Obavestenje;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Obavestenje.Obavestenje;
import tim20.xml.sluzbenik.sluzbenikBek.repository.repositories.ObavestenjeRepository;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RequiredArgsConstructor
@Service
public class StoreObavestenjeService implements StoreObavestenjeUseCase{

    private final ObavestenjeRepository repository;
    @Override
    public void store(Obavestenje obavestenje) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        repository.store(obavestenje);
    }
}
