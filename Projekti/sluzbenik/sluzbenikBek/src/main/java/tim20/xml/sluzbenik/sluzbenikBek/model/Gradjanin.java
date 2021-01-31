package tim20.xml.sluzbenik.sluzbenikBek.model;

import java.util.List;

public class Gradjanin extends User {

    public Gradjanin(Long id, String firstName, String lastName, String email, String password, List<Authority> authorities) {
        super(id, firstName, lastName, email, password, authorities);
    }
}
