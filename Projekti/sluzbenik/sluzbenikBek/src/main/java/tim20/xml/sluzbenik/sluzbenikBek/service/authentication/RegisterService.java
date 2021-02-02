package tim20.xml.sluzbenik.sluzbenikBek.service.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tim20.xml.sluzbenik.sluzbenikBek.core.exception.EmailTakenException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Authority;
import tim20.xml.sluzbenik.sluzbenikBek.model.User;
import tim20.xml.sluzbenik.sluzbenikBek.model.UserType;
import tim20.xml.sluzbenik.sluzbenikBek.repository.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterService implements RegisterGradjaninUseCase {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public RegisterService(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void addGradjanin(RegisterGradjaninCommand command) throws EmailTakenException {
        Optional<User> userOptional = userRepository.findByEmail(command.getEmail());
        if (userOptional.isPresent())
            throw new EmailTakenException(command.getEmail());

        long count = userRepository.count();

        User user = new User(
                count + 1,
                command.getFirstName(),
                command.getLastName(),
                command.getEmail(),
                passwordEncoder.encode(command.getPassword()),
                UserType.GRADJANIN,
                List.of(new Authority(2L, "ROLE_GRADJANIN"))
        );

        userRepository.save(user);
    }
}
