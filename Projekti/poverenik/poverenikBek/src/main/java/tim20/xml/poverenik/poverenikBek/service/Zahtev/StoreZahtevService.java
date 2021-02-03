package tim20.xml.poverenik.poverenikBek.service.Zahtev;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.Zahtev.Zahtev;
import tim20.xml.poverenik.poverenikBek.repository.repositories.ZahtevRepository;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
@RequiredArgsConstructor
@Service
public class StoreZahtevService implements StoreZahtevUseCase{

    private final ZahtevRepository repository;

    @Override
    public void store(Zahtev zahtev) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        repository.store(zahtev);
    }
}
