package tim20.xml.sluzbenik.sluzbenikBek.model;

import java.util.List;

public class Sluzbenik extends User {
    public Sluzbenik(Long id, String firstName, String lastName, String email, String password, List<Authority> authorities) {
        super(id, firstName, lastName, email, password, authorities);
    }
}
