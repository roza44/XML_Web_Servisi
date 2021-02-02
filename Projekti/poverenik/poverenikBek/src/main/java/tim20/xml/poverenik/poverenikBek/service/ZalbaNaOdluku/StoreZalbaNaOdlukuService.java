package tim20.xml.poverenik.poverenikBek.service.ZalbaNaOdluku;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaOdluku.Zalba;
import tim20.xml.poverenik.poverenikBek.repository.repositories.ZalbaNaOdlukuRepository;

import javax.xml.bind.JAXBException;


@RequiredArgsConstructor
@Service
public class StoreZalbaNaOdlukuService implements StoreZalbaNaOdlukuUseCase {

    private final ZalbaNaOdlukuRepository repository;

    @Override
    public void store(Zalba zalba) throws XMLDBException, JAXBException {
        repository.store(zalba);
    }
}