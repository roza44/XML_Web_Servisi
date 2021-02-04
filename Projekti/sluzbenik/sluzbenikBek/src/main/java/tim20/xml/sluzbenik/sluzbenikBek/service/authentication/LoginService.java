package tim20.xml.sluzbenik.sluzbenikBek.service.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tim20.xml.sluzbenik.sluzbenikBek.model.user.User;
import tim20.xml.sluzbenik.sluzbenikBek.security.api.AuthenticationService;
import tim20.xml.sluzbenik.sluzbenikBek.security.api.TokenService;

@Service
public class LoginService implements LoginUseCase {
    private final AuthenticationService authenticationService;
    private final TokenService tokenService;

    @Autowired
    public LoginService(AuthenticationService authenticationService, TokenService tokenService) {
        this.authenticationService = authenticationService;
        this.tokenService = tokenService;
    }

    @Override
    public LoginDTO login(LoginCommand command) {
        User user = authenticationService.authenticate(command.getEmail(), command.getPassword());

        String token = tokenService.getToken(user);
        long expiresIn = tokenService.getExpiresIn();

        return new LoginDTO(token, user.getAuthorities(), expiresIn);
    }
}
