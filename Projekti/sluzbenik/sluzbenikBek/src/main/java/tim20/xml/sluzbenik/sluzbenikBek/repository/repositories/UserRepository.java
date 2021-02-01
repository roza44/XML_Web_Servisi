package tim20.xml.sluzbenik.sluzbenikBek.repository.repositories;

import java.util.Optional;

public interface UserRepository<T> {
    Optional<T> findByEmail(String email);
    void save(T t);
    long count();
}
