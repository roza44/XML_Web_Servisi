package tim20.xml.sluzbenik.sluzbenikBek.service.Obavestenje;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Obavestenje.Obavestenje;
import tim20.xml.sluzbenik.sluzbenikBek.model.user.User;
import tim20.xml.sluzbenik.sluzbenikBek.repository.repositories.ObavestenjeRepository;
import tim20.xml.sluzbenik.sluzbenikBek.security.api.AuthenticationService;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RequiredArgsConstructor
@Service
public class StoreObavestenjeService implements StoreObavestenjeUseCase{

    private final AuthenticationService authService;
    private final ObavestenjeRepository repository;

    @Override
    public void store(Obavestenje obavestenje, String userEmail) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        User user = authService.getAuthenticated();
        obavestenje.setAuthor(user.getEmail());
        obavestenje.setForWho(userEmail);
        repository.store(obavestenje);
    }
}
