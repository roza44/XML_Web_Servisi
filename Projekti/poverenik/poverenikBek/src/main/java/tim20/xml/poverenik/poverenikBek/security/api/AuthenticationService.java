package tim20.xml.poverenik.poverenikBek.security.api;

import tim20.xml.poverenik.poverenikBek.model.User;

public interface AuthenticationService {
    User authenticate(String email, String password);
    User getAuthenticated();
}
