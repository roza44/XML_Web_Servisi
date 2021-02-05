package tim20.xml.poverenik.poverenikBek.security.api;

import tim20.xml.poverenik.poverenikBek.model.user.User;

public interface TokenService {
    String getToken(User user);

    long getExpiresIn();
}
