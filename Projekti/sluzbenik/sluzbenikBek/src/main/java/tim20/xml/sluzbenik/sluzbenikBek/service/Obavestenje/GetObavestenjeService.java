package tim20.xml.sluzbenik.sluzbenikBek.service.Obavestenje;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import tim20.xml.sluzbenik.sluzbenikBek.model.Obavestenje.Obavestenje;
import tim20.xml.sluzbenik.sluzbenikBek.repository.repositories.ObavestenjeRepository;

@RequiredArgsConstructor
@Service
public class GetObavestenjeService implements GetObavestenjeUseCase{

    private final ObavestenjeRepository repository;

    @Override
    public Obavestenje get(String id) {
        repository.
    }
}
