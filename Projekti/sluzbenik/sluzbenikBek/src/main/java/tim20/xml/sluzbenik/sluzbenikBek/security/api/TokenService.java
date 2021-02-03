package tim20.xml.sluzbenik.sluzbenikBek.security.api;

import tim20.xml.sluzbenik.sluzbenikBek.model.user.User;

public interface TokenService {
    String getToken(User user);

    long getExpiresIn();
}
