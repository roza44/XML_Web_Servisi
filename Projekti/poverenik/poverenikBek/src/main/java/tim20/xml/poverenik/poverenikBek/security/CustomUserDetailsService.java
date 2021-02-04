package tim20.xml.poverenik.poverenikBek.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.user.User;
import tim20.xml.poverenik.poverenikBek.repository.repositories.UserRepository;

import javax.xml.bind.JAXBException;
import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository userRepository;

    @Autowired
    public CustomUserDetailsService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public UserDetails loadUserByUsername(String email) {
        Optional<User> byEmail = Optional.empty();

        try {
            byEmail = userRepository.findByEmail(email);
        } catch (XMLDBException | JAXBException e) {
            e.printStackTrace();
            throw new UsernameNotFoundException(String.format("No user found with email '%s'.", email), e);
        }

        return byEmail
                .orElseThrow(() -> new UsernameNotFoundException(String.format("No user found with email '%s'.", email)));
    }
}
