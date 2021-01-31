package tim20.xml.sluzbenik.sluzbenikBek.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import tim20.xml.sluzbenik.sluzbenikBek.model.Gradjanin;
import tim20.xml.sluzbenik.sluzbenikBek.model.Sluzbenik;
import tim20.xml.sluzbenik.sluzbenikBek.repository.api.UserRepository;

import java.util.Optional;

@Service
public class CustomUserDetailsService implements UserDetailsService {
    private final UserRepository<Gradjanin> gradjaninRepository;
    private final UserRepository<Sluzbenik> sluzbenikrepository;

    @Autowired
    public CustomUserDetailsService(UserRepository<Gradjanin> gradjaninRepository, UserRepository<Sluzbenik> sluzbenikrepository) {
        this.gradjaninRepository = gradjaninRepository;
        this.sluzbenikrepository = sluzbenikrepository;
    }

    @Override
    public UserDetails loadUserByUsername(String email) {
        Optional<Gradjanin> gradjaninOptional = gradjaninRepository.findByEmail(email);

        if (gradjaninOptional.isPresent()) {
            return gradjaninOptional.get();
        } else {
            Sluzbenik sluzbenik = sluzbenikrepository.findByEmail(email)
                    .orElseThrow(() -> new UsernameNotFoundException(String.format("No user found with email '%s'.", email)));
            return sluzbenik;
        }
    }
}
