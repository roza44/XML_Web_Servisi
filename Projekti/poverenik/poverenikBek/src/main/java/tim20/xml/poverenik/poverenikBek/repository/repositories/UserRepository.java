package tim20.xml.poverenik.poverenikBek.repository.repositories;

import org.springframework.stereotype.Repository;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.user.Authority;
import tim20.xml.poverenik.poverenikBek.model.user.User;
import tim20.xml.poverenik.poverenikBek.model.user.UserType;
import tim20.xml.poverenik.poverenikBek.repository.util.DatabaseManager;

import javax.xml.bind.JAXBException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Repository
public class UserRepository {
    private final String COLLECTION_ID ="/db/sample/user";

    public Optional<User> findByEmail(String email) throws XMLDBException, JAXBException {
        return Optional.ofNullable(retrieve(email));
    }

    public void save(User user) throws XMLDBException, JAXBException {
        store(user);
    }

    public long count() throws XMLDBException, JAXBException {
        return DatabaseManager.count(COLLECTION_ID);
    }

    private void store(User user) throws XMLDBException, JAXBException {
        DatabaseManager.<User>store(user, COLLECTION_ID, user.getEmail() + ".xml");
    }

    private User retrieve(String email) throws XMLDBException, JAXBException {
        return DatabaseManager.<User>retrieve(User.class, COLLECTION_ID, email + ".xml");
    }
}
