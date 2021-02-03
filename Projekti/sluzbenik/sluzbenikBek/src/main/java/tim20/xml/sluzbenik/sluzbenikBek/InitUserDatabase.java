package tim20.xml.sluzbenik.sluzbenikBek;

import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.user.Authority;
import tim20.xml.sluzbenik.sluzbenikBek.model.user.User;
import tim20.xml.sluzbenik.sluzbenikBek.model.user.UserType;
import tim20.xml.sluzbenik.sluzbenikBek.repository.util.DatabaseManager;

import javax.xml.bind.JAXBException;
import java.util.List;

public class InitUserDatabase {
    private static final List<User> data = List.of(
            new User(
                    1L,
                    "Dragan",
                    "Draganic",
                    "sluzbenik1@gmail.com",
                    "$2y$12$l70Hm1zsnvBSncHlI4zsce5RXMORuhf5SWqoWmETxPLJkhNIYxOve",
                    UserType.POVERENIK,
                    List.of(new Authority(1L, "ROLE_SLUZBENIK"))
            ),
            new User(
                    2L,
                    "Bojan",
                    "Bojanic",
                    "sluzbenik2@gmail.com",
                    "$2y$12$l70Hm1zsnvBSncHlI4zsce5RXMORuhf5SWqoWmETxPLJkhNIYxOve",
                    UserType.POVERENIK,
                    List.of(new Authority(1L, "ROLE_SLUZBENIK"))
            ),
            new User(
                    3L,
                    "Slobodan",
                    "Slobodanic",
                    "gradjanin1@gmail.com",
                    "$2y$12$l70Hm1zsnvBSncHlI4zsce5RXMORuhf5SWqoWmETxPLJkhNIYxOve",
                    UserType.GRADJANIN,
                    List.of(new Authority(2L, "ROLE_GRADJANIN"))
            ),
            new User(
                    4L,
                    "Dusan",
                    "Dusanovic",
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
