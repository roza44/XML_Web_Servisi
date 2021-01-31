package tim20.xml.sluzbenik.sluzbenikBek.repository;

import org.springframework.stereotype.Repository;
import tim20.xml.sluzbenik.sluzbenikBek.model.Dummy;
import tim20.xml.sluzbenik.sluzbenikBek.model.Example;

import java.util.Collection;
import java.util.List;
import java.util.Map;

@Repository
public class DummyRepository {
    private Map<Long, Dummy> data = Map.ofEntries(
            Map.entry(1L, new Dummy(
                            1L,
                            "Dummy Name 1",
                            "Dummy Surname 1",
                            "Dummy password 2",
                            List.of(
                                    new Example(
                                            1L,
                                            "Example name 1",
                                            "Example surname 1",
                                            "Example password 1"
                                    ),
                                    new Example(
                                            2L,
                                            "Example name 2",
                                            "Example surname 2",
                                            "Example password 2"
                                    )
                            )
                    )
            ),
            Map.entry(2L, new Dummy(
                            2L,
                            "Dummy Name 2",
                            "Dummy Surname 2",
                            "Dummy password 2",
                            List.of(
                                    new Example(
                                            3L,
                                            "Example name 3",
                                            "Example surname 3",
                                            "Example password 3"
                                    ),
                                    new Example(
                                            4L,
                                            "Example name 4",
                                            "Example surname 4",
                                            "Example password 4"
                                    )
                            )
                    )
            )
    );

    public Collection<Dummy> getAllDummies() {
        return data.values();
    }
}
