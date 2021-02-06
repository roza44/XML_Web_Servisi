package tim20.xml.sluzbenik.sluzbenikBek.service.Obavestenje;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Obavestenje.Obavestenje;
import tim20.xml.sluzbenik.sluzbenikBek.model.user.User;
import tim20.xml.sluzbenik.sluzbenikBek.repository.repositories.ObavestenjeRepository;
import tim20.xml.sluzbenik.sluzbenikBek.security.api.AuthenticationService;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class GetSluzbenikovaObavestenjaService implements GetSluzbenikovaObavestenjaUseCase{

    private final AuthenticationService authService;
    private final ObavestenjeRepository repository;

    private final String queryPath = "src/main/resources/data/query/getSluzbenikovaObavestenja.xqy";

    @Override
    public List<Obavestenje> get() throws XMLDBException, JAXBException, IOException {
        User user = authService.getAuthenticated();
        return repository.get(queryPath, user.getEmail());
    }
}
