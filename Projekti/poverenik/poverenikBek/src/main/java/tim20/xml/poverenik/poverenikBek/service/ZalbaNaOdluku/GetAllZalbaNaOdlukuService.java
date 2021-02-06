package tim20.xml.poverenik.poverenikBek.service.ZalbaNaOdluku;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaOdluku.Zalba;
import tim20.xml.poverenik.poverenikBek.repository.repositories.ZalbaNaOdlukuRepository;

import javax.xml.bind.JAXBException;
import java.util.List;


@RequiredArgsConstructor
@Service
public class GetAllZalbaNaOdlukuService implements GetAllZalbaNaOdlukuUseCase{

    private final ZalbaNaOdlukuRepository repository;

    @Override
    public List<Zalba> getAll() throws XMLDBException, JAXBException {
        return repository.getAll();
    }
}
