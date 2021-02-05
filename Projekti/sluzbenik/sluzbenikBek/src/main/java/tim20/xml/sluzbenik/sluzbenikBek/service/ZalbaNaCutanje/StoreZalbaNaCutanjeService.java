package tim20.xml.sluzbenik.sluzbenikBek.service.ZalbaNaCutanje;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.ZalbaNaCutanje.Zalba;
import tim20.xml.sluzbenik.sluzbenikBek.repository.repositories.ZalbaNaCutanjeRepository;


import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RequiredArgsConstructor
@Service
public class StoreZalbaNaCutanjeService implements StoreZalbaNaCutanjeUseCase{

    private final ZalbaNaCutanjeRepository repository;

    @Override
    public void store(Zalba zalba) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        repository.store(zalba);
    }
}
