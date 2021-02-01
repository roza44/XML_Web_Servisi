package tim20.xml.sluzbenik.sluzbenikBek.service.authentication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import tim20.xml.sluzbenik.sluzbenikBek.core.exception.EmailTakenException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Authority;
import tim20.xml.sluzbenik.sluzbenikBek.model.Gradjanin;
import tim20.xml.sluzbenik.sluzbenikBek.model.Sluzbenik;
import tim20.xml.sluzbenik.sluzbenikBek.repository.repositories.UserRepository;

import java.util.List;
import java.util.Optional;

@Service
public class RegisterService implements RegisterGradjaninUseCase {
    private final UserRepository<Gradjanin> gradjaninRepository;
    private final UserRepository<Sluzbenik> sluzbenikRepository;
    private final PasswordEncoder passwordEncoder;

    @Autowired
    public RegisterService(UserRepository<Gradjanin> gradjaninRepository, UserRepository<Sluzbenik> sluzbenikRepository, PasswordEncoder passwordEncoder) {
        this.gradjaninRepository = gradjaninRepository;
        this.sluzbenikRepository = sluzbenikRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public void addGradjanin(RegisterGradjaninCommand command) throws EmailTakenException {
        Optional<Gradjanin> gradjaninOptional = gradjaninRepository.findByEmail(command.getEmail());
        if (gradjaninOptional.isPresent())
            throw new EmailTakenException(command.getEmail());

        Optional<Sluzbenik> sluzbenikOptional = sluzbenikRepository.findByEmail(command.getEmail());
        if (sluzbenikOptional.isPresent())
            throw new EmailTakenException(command.getEmail());

        long count = gradjaninRepository.count() + sluzbenikRepository.count();

        Gradjanin gradjanin = new Gradjanin(
                count + 1,
                command.getFirstName(),
                command.getLastName(),
                command.getEmail(),
                passwordEncoder.encode(command.getPassword()),
                List.of(new Authority(1L, "ROLE_GRADJANIN"))
        );

        gradjaninRepository.save(gradjanin);
    }
}
