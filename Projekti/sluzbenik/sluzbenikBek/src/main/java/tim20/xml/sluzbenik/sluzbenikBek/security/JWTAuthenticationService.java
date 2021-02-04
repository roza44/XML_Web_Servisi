package tim20.xml.sluzbenik.sluzbenikBek.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;
import tim20.xml.sluzbenik.sluzbenikBek.model.user.User;
import tim20.xml.sluzbenik.sluzbenikBek.security.api.AuthenticationService;

@Component
public class JWTAuthenticationService implements AuthenticationService {
    private final AuthenticationManager authenticationManager;

    @Autowired
    public JWTAuthenticationService(AuthenticationManager authenticationManager) {
        this.authenticationManager = authenticationManager;
    }


    @Override
    public User authenticate(String email, String password) {
        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(email, password)
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        return getPrincipal(authentication);
    }

    @Override
    public User getAuthenticated() {
        Authentication currentUser = SecurityContextHolder.getContext().getAuthentication();
        return getPrincipal(currentUser);
    }

    private User getPrincipal(Authentication authentication) {
        return (User) authentication.getPrincipal();
    }
}
