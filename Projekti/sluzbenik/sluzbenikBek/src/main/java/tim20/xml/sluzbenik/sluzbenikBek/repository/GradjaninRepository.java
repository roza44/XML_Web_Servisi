package tim20.xml.sluzbenik.sluzbenikBek.repository;

import org.springframework.stereotype.Repository;
import tim20.xml.sluzbenik.sluzbenikBek.model.Authority;
import tim20.xml.sluzbenik.sluzbenikBek.model.Gradjanin;
import tim20.xml.sluzbenik.sluzbenikBek.repository.api.UserRepository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class GradjaninRepository implements UserRepository<Gradjanin> {
    // Password is 123
    private final Map<Long, Gradjanin> data = new HashMap<>(
            Map.ofEntries(
                    Map.entry(
                            1L, new Gradjanin(
                                    1L,
                                    "Gradjanin 1 ime",
                                    "Gradjanin 1 prezime",
                                    "gradjanin1@gmail.com",
                                    "$2y$12$l70Hm1zsnvBSncHlI4zsce5RXMORuhf5SWqoWmETxPLJkhNIYxOve",
                                    List.of(new Authority(1L, "ROLE_GRADJANIN"))
                            )
                    ),
                    Map.entry(
                            2L, new Gradjanin(
                                    2L,
                                    "Gradjanin 2 ime",
                                    "Gradjanin 2 prezime",
                                    "gradjanin2@gmail.com",
                                    "$2y$12$l70Hm1zsnvBSncHlI4zsce5RXMORuhf5SWqoWmETxPLJkhNIYxOve",
                                    List.of(new Authority(1L, "ROLE_GRADJANIN"))
                            )
                    )
            )
    );

    @Override
    public Optional<Gradjanin> findByEmail(String email) {
        for (Gradjanin gradjanin : data.values()) {
            if (gradjanin.getEmail().equals(email))
                return Optional.of(gradjanin);
        }
        return Optional.empty();
    }

    @Override
    public void save(Gradjanin gradjanin) {
        data.put(gradjanin.getId(), gradjanin);
    }

    @Override
    public long count() {
        return data.size();
    }
}
