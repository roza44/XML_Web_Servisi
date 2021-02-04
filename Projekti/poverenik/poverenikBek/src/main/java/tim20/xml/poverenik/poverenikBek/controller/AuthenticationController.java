package tim20.xml.poverenik.poverenikBek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tim20.xml.poverenik.poverenikBek.core.exception.EmailTakenException;
import tim20.xml.poverenik.poverenikBek.request.LoginRequest;
import tim20.xml.poverenik.poverenikBek.request.RegisterRequest;
import tim20.xml.poverenik.poverenikBek.service.authentication.LoginUseCase;
import tim20.xml.poverenik.poverenikBek.service.authentication.RegisterGradjaninUseCase;

@RestController
@RequestMapping(value = "/api/auth", consumes = MediaType.APPLICATION_XML_VALUE,produces = MediaType.APPLICATION_XML_VALUE)
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


        LoginUseCase.LoginDTO loginDTO = loginUseCase.login(command);
        HttpHeaders responseHeaders = new HttpHeaders();

//        responseHeaders.set("Access-Control-Allow-Origin", "*" );
        responseHeaders.set("Authorization", "Bearer " + loginDTO.getToken());
        responseHeaders.set("Expires-In", String.valueOf(loginDTO.getExpiresIn()));
        responseHeaders.set("Access-Control-Expose-Headers", "Authorization, Expires-In");
        responseHeaders.set("Access-Control-Allow-Headers", "Authorization, X-PINGOTHER, Origin, X-Requested-With, Content-Type, Accept, X-Custom-header");

        return ResponseEntity.ok().headers(responseHeaders).body(loginDTO);
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
