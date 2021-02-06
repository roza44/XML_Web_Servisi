package tim20.xml.poverenik.poverenikBek.service.ZalbaNaCutanje;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaCutanje.Zalba;
import tim20.xml.poverenik.poverenikBek.model.user.User;
import tim20.xml.poverenik.poverenikBek.repository.repositories.ZalbaNaCutanjeRepository;
import tim20.xml.poverenik.poverenikBek.security.api.AuthenticationService;

import javax.xml.bind.JAXBException;
import java.io.IOException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class GetKorisnikoveZalbeNaCutanjeService implements GetKorisnikoveZalbeNaCutanjeUseCase{

    private final AuthenticationService authService;
    private final ZalbaNaCutanjeRepository repository;

    private final String queryPath = "src/main/resources/data/query/getKorisnikoveZalbeNaCutanje.xqy";

    @Override
    public List<Zalba> get() throws XMLDBException, JAXBException, IOException {
        User user = authService.getAuthenticated();
        return repository.query(queryPath, user.getEmail());
    }
}
