package tim20.xml.sluzbenik.sluzbenikBek.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tim20.xml.sluzbenik.sluzbenikBek.model.user.User;
import tim20.xml.sluzbenik.sluzbenikBek.security.api.TokenService;

@Component
public class JWTTokenService implements TokenService {
    private final TokenUtils tokenUtils;

    @Autowired
    public JWTTokenService(TokenUtils tokenUtils) {
        this.tokenUtils = tokenUtils;
    }

    @Override
    public String getToken(User user) {
        return tokenUtils.generateToken(user.getEmail());
    }

    @Override
    public long getExpiresIn() {
        return tokenUtils.getExpiredIn();
    }
}
