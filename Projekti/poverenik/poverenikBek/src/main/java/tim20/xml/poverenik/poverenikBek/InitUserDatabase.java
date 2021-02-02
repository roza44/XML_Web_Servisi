package tim20.xml.poverenik.poverenikBek;

import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.user.Authority;
import tim20.xml.poverenik.poverenikBek.model.user.User;
import tim20.xml.poverenik.poverenikBek.model.user.UserType;
import tim20.xml.poverenik.poverenikBek.repository.util.DatabaseManager;

import javax.xml.bind.JAXBException;
import java.util.List;

public class InitUserDatabase {
    private static final List<User> data = List.of(
            new User(
                    1L,
                    "Poverenik 1 ime",
                    "Poverenik 1 prezime",
                    "poverenik1@gmail.com",
                    "$2y$12$l70Hm1zsnvBSncHlI4zsce5RXMORuhf5SWqoWmETxPLJkhNIYxOve",
                    UserType.POVERENIK,
                    List.of(new Authority(1L, "ROLE_POVERENIK"))
            ),
            new User(
                    2L,
                    "Poverenik 2 ime",
                    "Poverenik 2 prezime",
                    "poverenik2@gmail.com",
                    "$2y$12$l70Hm1zsnvBSncHlI4zsce5RXMORuhf5SWqoWmETxPLJkhNIYxOve",
                    UserType.POVERENIK,
                    List.of(new Authority(1L, "ROLE_POVERENIK"))
            ),
            new User(
                    3L,
                    "Gradjanin 1 ime",
                    "Gradjanin 1 prezime",
                    "gradjanin1@gmail.com",
                    "$2y$12$l70Hm1zsnvBSncHlI4zsce5RXMORuhf5SWqoWmETxPLJkhNIYxOve",
                    UserType.GRADJANIN,
                    List.of(new Authority(2L, "ROLE_GRADJANIN"))
            ),
            new User(
                    4L,
                    "Gradjanin 2 ime",
                    "Gradjanin 2 prezime",
                    "gradjanin2@gmail.com",
                    "$2y$12$l70Hm1zsnvBSncHlI4zsce5RXMORuhf5SWqoWmETxPLJkhNIYxOve",
                    UserType.GRADJANIN,
                    List.of(new Authority(2L, "ROLE_GRADJANIN"))
            )
    );

    private static final String COLLECTION_ID ="/db/sample/user";

    public static void main(String[] args) throws XMLDBException, JAXBException {
        for (User user : data) {
            DatabaseManager.<User>store(user, COLLECTION_ID, user.getEmail() + ".xml");
        }
    }
}
