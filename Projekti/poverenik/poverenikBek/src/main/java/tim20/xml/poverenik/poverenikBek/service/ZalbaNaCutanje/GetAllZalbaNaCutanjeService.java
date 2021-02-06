package tim20.xml.poverenik.poverenikBek.service.ZalbaNaCutanje;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaCutanje.Zalba;
import tim20.xml.poverenik.poverenikBek.repository.repositories.ZahtevRepository;
import tim20.xml.poverenik.poverenikBek.repository.repositories.ZalbaNaCutanjeRepository;

import javax.xml.bind.JAXBException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class GetAllZalbaNaCutanjeService implements GetAllZalbaNaCutanjeUseCase{

    private final ZalbaNaCutanjeRepository repository;
    @Override
    public List<Zalba> getAll() throws XMLDBException, JAXBException {
        return repository.getAll();
    }
}
