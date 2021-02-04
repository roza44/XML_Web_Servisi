package tim20.xml.sluzbenik.sluzbenikBek.security.api;

import tim20.xml.sluzbenik.sluzbenikBek.model.user.User;

public interface AuthenticationService {
    User authenticate(String email, String password);
    User getAuthenticated();
}
