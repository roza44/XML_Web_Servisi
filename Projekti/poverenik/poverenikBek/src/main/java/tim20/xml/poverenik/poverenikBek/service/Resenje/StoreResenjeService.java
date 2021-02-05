package tim20.xml.poverenik.poverenikBek.service.Resenje;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.Resenje.Resenje;
import tim20.xml.poverenik.poverenikBek.model.Zahtev.Zahtev;
import tim20.xml.poverenik.poverenikBek.repository.repositories.ResenjeRepository;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RequiredArgsConstructor
@Service
public class StoreResenjeService implements StoreResenjeUseCase {

    private final ResenjeRepository repository;

    @Override
    public void store(Resenje resenje) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        repository.store(resenje);
    }
}
