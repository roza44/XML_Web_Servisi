package tim20.xml.sluzbenik.sluzbenikBek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tim20.xml.sluzbenik.sluzbenikBek.core.exception.EmailTakenException;
import tim20.xml.sluzbenik.sluzbenikBek.request.LoginRequest;
import tim20.xml.sluzbenik.sluzbenikBek.request.RegisterRequest;
import tim20.xml.sluzbenik.sluzbenikBek.service.authentication.LoginUseCase;
import tim20.xml.sluzbenik.sluzbenikBek.service.authentication.RegisterGradjaninUseCase;

@RestController
@RequestMapping(value = "/api/auth", produces = MediaType.APPLICATION_XML_VALUE)
public class AuthenticationController {
    private final LoginUseCase loginUseCase;
    private final RegisterGradjaninUseCase registerGradjaninUseCase;

    @Autowired
    public AuthenticationController(LoginUseCase loginUseCase, RegisterGradjaninUseCase registerGradjaninUseCase) {
        this.loginUseCase = loginUseCase;
        this.registerGradjaninUseCase = registerGradjaninUseCase;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginUseCase.LoginDTO> login(@RequestBody LoginRequest request) {
        LoginUseCase.LoginCommand command =
                new LoginUseCase.LoginCommand(request.getEmail(), request.getPassword());
        return ResponseEntity.ok(loginUseCase.login(command));
    }

    @PostMapping("/register")
    public ResponseEntity<Void> register(@RequestBody RegisterRequest request) throws EmailTakenException {
        RegisterGradjaninUseCase.RegisterGradjaninCommand command =
                new RegisterGradjaninUseCase.RegisterGradjaninCommand(
                        request.getFirstName(),
                        request.getLastName(),
                        request.getEmail(),
                        request.getPassword()
                );

        registerGradjaninUseCase.addGradjanin(command);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }
}
