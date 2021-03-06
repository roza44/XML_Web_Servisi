package tim20.xml.sluzbenik.sluzbenikBek.service.ZalbaNaOdluku;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.ZalbaNaOdluku.Zalba;
import tim20.xml.sluzbenik.sluzbenikBek.repository.repositories.ZalbaNaOdlukuRepository;


import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;


@RequiredArgsConstructor
@Service
public class StoreZalbaNaOdlukuService implements StoreZalbaNaOdlukuUseCase {

    private final ZalbaNaOdlukuRepository repository;

    @Override
    public void store(Zalba zalba) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        repository.store(zalba);
    }
}
