package tim20.xml.poverenik.poverenikBek.service.ZalbaNaCutanje;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaCutanje.Zalba;
import tim20.xml.poverenik.poverenikBek.model.user.User;
import tim20.xml.poverenik.poverenikBek.repository.repositories.ZalbaNaCutanjeRepository;
import tim20.xml.poverenik.poverenikBek.security.api.AuthenticationService;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RequiredArgsConstructor
@Service
public class StoreZalbaNaCutanjeService implements StoreZalbaNaCutanjeUseCase{

    private final AuthenticationService authService;
    private final ZalbaNaCutanjeRepository repository;

    @Override
    public void store(Zalba zalba) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        User user = authService.getAuthenticated();
        zalba.setAuthor(user.getEmail());
        repository.store(zalba);
    }
}
