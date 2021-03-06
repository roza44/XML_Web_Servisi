package tim20.xml.poverenik.poverenikBek.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import tim20.xml.poverenik.poverenikBek.model.user.User;
import tim20.xml.poverenik.poverenikBek.security.api.TokenService;

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
