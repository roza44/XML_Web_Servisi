package tim20.xml.sluzbenik.sluzbenikBek.service.Obavestenje;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Obavestenje.Obavestenje;
import tim20.xml.sluzbenik.sluzbenikBek.repository.repositories.ObavestenjeRepository;

import javax.xml.bind.JAXBException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class GetAllObavestenjaService implements GetAllObavestenjaUseCase{

    private final ObavestenjeRepository repository;
    @Override
    public List<Obavestenje> getAll() throws XMLDBException, JAXBException {
        return repository.getAll();
    }
}