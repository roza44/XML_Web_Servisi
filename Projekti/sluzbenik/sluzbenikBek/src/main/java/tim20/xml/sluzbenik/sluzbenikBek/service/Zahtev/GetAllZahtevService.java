package tim20.xml.sluzbenik.sluzbenikBek.service.Zahtev;

import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Zahtev.Zahtev;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tim20.xml.sluzbenik.sluzbenikBek.repository.repositories.ZahtevRepository;

import javax.xml.bind.JAXBException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class GetAllZahtevService implements GetAllZahtevUseCase{

    private final ZahtevRepository repository;
    @Override
    public List<Zahtev> getAll() throws XMLDBException, JAXBException {
        return repository.getAll();
    }
}
