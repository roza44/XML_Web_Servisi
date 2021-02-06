package tim20.xml.sluzbenik.sluzbenikBek.service.Zahtev;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Zahtev.Zahtev;
import tim20.xml.sluzbenik.sluzbenikBek.model.user.User;
import tim20.xml.sluzbenik.sluzbenikBek.repository.repositories.ZahtevRepository;
import tim20.xml.sluzbenik.sluzbenikBek.security.api.AuthenticationService;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class GetKorisnikoviZahteviService implements GetKorisnikoviZahteviUseCase {

    private final AuthenticationService authService;
    private final ZahtevRepository repository;

    private final String queryPath = "src/main/resources/data/query/getKorisnikoviZahtevi.xqy";

    @Override
    public List<Zahtev> get() throws XMLDBException, JAXBException, IOException {
        User user = authService.getAuthenticated();
        return repository.query(queryPath, user.getEmail());

    }
}
