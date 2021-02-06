package tim20.xml.poverenik.poverenikBek.service.Obavestenje;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.Obavestenje.Obavestenje;
import tim20.xml.poverenik.poverenikBek.repository.repositories.ObavestenjeRepository;

import javax.xml.bind.JAXBException;

@RequiredArgsConstructor
@Service
public class GetObavestenjeService implements GetObavestenjeUseCase{

    private final ObavestenjeRepository repository;

    @Override
    public Obavestenje get(String id) throws XMLDBException, JAXBException {
        return repository.get(id);
    }
}
