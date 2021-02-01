package tim20.xml.sluzbenik.sluzbenikBek.repository.repositories;

import org.springframework.stereotype.Repository;
import tim20.xml.sluzbenik.sluzbenikBek.model.Authority;
import tim20.xml.sluzbenik.sluzbenikBek.model.Sluzbenik;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class SluzbenikRepository implements UserRepository<Sluzbenik> {
    // Password is 123
    private final Map<Long, Sluzbenik> data = new HashMap<>(
            Map.ofEntries(
                    Map.entry(
                            3L, new Sluzbenik(
                                    3L,
                                    "Sluzbenik 1 ime",
                                    "Sluzbenik 1 prezime",
                                    "sluzbenik1@gmail.com",
                                    "$2y$12$l70Hm1zsnvBSncHlI4zsce5RXMORuhf5SWqoWmETxPLJkhNIYxOve",
                                    List.of(new Authority(2L, "ROLE_SLUZBENIK"))
                            )
                    ),
                    Map.entry(
                            4L, new Sluzbenik(
                                    4L,
                                    "Sluzbenik 2 ime",
                                    "Sluzbenik 2 prezime",
                                    "sluzbenik2@gmail.com",
                                    "$2y$12$l70Hm1zsnvBSncHlI4zsce5RXMORuhf5SWqoWmETxPLJkhNIYxOve",
                                    List.of(new Authority(2L, "ROLE_SLUZBENIK"))
                            )
                    )
            )
    );

    @Override
    public Optional<Sluzbenik> findByEmail(String email) {
        for (Sluzbenik sluzbenik : data.values()) {
            if (sluzbenik.getEmail().equals(email))
                return Optional.of(sluzbenik);
        }
        return Optional.empty();
    }

    @Override
    public void save(Sluzbenik sluzbenik) {
        data.put(sluzbenik.getId(), sluzbenik);
    }


    @Override
    public long count() {
        return data.size();
    }
}
