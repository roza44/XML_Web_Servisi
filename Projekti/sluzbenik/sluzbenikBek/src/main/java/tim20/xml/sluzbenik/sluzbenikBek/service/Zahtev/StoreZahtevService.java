package tim20.xml.sluzbenik.sluzbenikBek.service.Zahtev;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Zahtev.Zahtev;
import tim20.xml.sluzbenik.sluzbenikBek.model.user.User;
import tim20.xml.sluzbenik.sluzbenikBek.repository.repositories.ZahtevRepository;
import tim20.xml.sluzbenik.sluzbenikBek.security.api.AuthenticationService;


import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RequiredArgsConstructor
@Service
public class StoreZahtevService implements StoreZahtevUseCase{

    private final AuthenticationService authService;
    private final ZahtevRepository repository;

    @Override
    public void store(Zahtev zahtev) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        User user = authService.getAuthenticated();
        zahtev.setAuthor(user.getEmail());
        repository.store(zahtev);
    }
}
