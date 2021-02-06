package tim20.xml.poverenik.poverenikBek.service.Zahtev;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.Zahtev.Zahtev;
import tim20.xml.poverenik.poverenikBek.repository.repositories.ZahtevRepository;

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
