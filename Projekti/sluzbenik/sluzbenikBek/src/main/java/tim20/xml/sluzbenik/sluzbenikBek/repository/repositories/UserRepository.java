package tim20.xml.sluzbenik.sluzbenikBek.repository.repositories;

import org.springframework.stereotype.Repository;
import tim20.xml.sluzbenik.sluzbenikBek.model.Authority;
import tim20.xml.sluzbenik.sluzbenikBek.model.User;
import tim20.xml.sluzbenik.sluzbenikBek.model.UserType;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserRepository {
    private final Map<Long, User> data = new HashMap<>(
            Map.ofEntries(
                    Map.entry(
                            1L, new User(
                                    1L,
                                    "Sluzbenik 1 ime",
                                    "Sluzbenik 1 prezime",
                                    "sluzbenik1@gmail.com",
                                    "$2y$12$l70Hm1zsnvBSncHlI4zsce5RXMORuhf5SWqoWmETxPLJkhNIYxOve",
                                    UserType.SLUZBENIK,
                                    List.of(new Authority(1L, "ROLE_SLUZBENIK"))
                            )
                    ),
                    Map.entry(
                            2L, new User(
                                    2L,
                                    "Sluzbenik 2 ime",
                                    "Sluzbenik 2 prezime",
                                    "sluzbenik2@gmail.com",
                                    "$2y$12$l70Hm1zsnvBSncHlI4zsce5RXMORuhf5SWqoWmETxPLJkhNIYxOve",
                                    UserType.SLUZBENIK,
                                    List.of(new Authority(1L, "ROLE_SLUZBENIK"))
                            )
                    ),
                    Map.entry(
                            3L, new User(
                                    3L,
                                    "Gradjanin 1 ime",
                                    "Gradjanin 1 prezime",
                                    "gradjanin1@gmail.com",
                                    "$2y$12$l70Hm1zsnvBSncHlI4zsce5RXMORuhf5SWqoWmETxPLJkhNIYxOve",
                                    UserType.GRADJANIN,
                                    List.of(new Authority(2L, "ROLE_GRADJANIN"))
                            )
                    ),
                    Map.entry(
                            4L, new User(
                                    4L,
                                    "Gradjanin 2 ime",
                                    "Gradjanin 2 prezime",
                                    "gradjanin2@gmail.com",
                                    "$2y$12$l70Hm1zsnvBSncHlI4zsce5RXMORuhf5SWqoWmETxPLJkhNIYxOve",
                                    UserType.GRADJANIN,
                                    List.of(new Authority(2L, "ROLE_GRADJANIN"))
                            )
                    )
            )
    );

    public Optional<User> findByEmail(String email) {
        for (User user : data.values()) {
            if (user.getEmail().equals(email))
                return Optional.of(user);
        }
        return Optional.empty();
    }

    public void save(User user) {
        data.put(user.getId(), user);
    }

    public long count() {
        return data.size();
    }
}
