package tim20.xml.poverenik.poverenikBek.service.Resenje;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.Resenje.Resenje;
import tim20.xml.poverenik.poverenikBek.repository.repositories.ResenjeRepository;

import javax.xml.bind.JAXBException;
import java.util.List;

@RequiredArgsConstructor
@Service
public class GetAllResenjeService implements GetAllResenjeUseCase{

    private final ResenjeRepository repository;

    @Override
    public List<Resenje> getAll() throws XMLDBException, JAXBException {
        return repository.getAll();
    }
}
