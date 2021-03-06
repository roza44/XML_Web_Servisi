package tim20.xml.sluzbenik.sluzbenikBek.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tim20.xml.sluzbenik.sluzbenikBek.model.Dummy;
import tim20.xml.sluzbenik.sluzbenikBek.repository.repositories.DummyRepository;

import java.util.Collection;

@Service
public class DummyService {
    private final DummyRepository dummiesRepository;

    @Autowired
    public DummyService(DummyRepository dummiesRepository) {
        this.dummiesRepository = dummiesRepository;
    }

    public Collection<Dummy> getAllDummies() {
        return dummiesRepository.getAllDummies();
    }
}
