package tim20.xml.sluzbenik.sluzbenikBek.service.authentication;

import tim20.xml.sluzbenik.sluzbenikBek.model.Authority;
import tim20.xml.sluzbenik.sluzbenikBek.validation.SelfValidating;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public interface LoginUseCase {
    LoginDTO login(LoginCommand command);

    class LoginCommand extends SelfValidating<LoginCommand> {
        @Email
        @NotBlank
        private String email;

        @NotBlank
        private String password;

        public LoginCommand(String email, String password) {
            this.email = email;
            this.password = password;
            this.validateSelf();
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }
    }

    class LoginDTO {
        private String token;
        private List<String> roles;
        private long expiresIn;

        public LoginDTO(String token, Collection<Authority> authorities, long expiresIn) {
            this.token = token;
            this.roles = mapRoles(authorities);
            this.expiresIn = expiresIn;
        }

        private List<String> mapRoles(Collection<Authority> authorities) {
            return authorities
                    .stream()
                    .map(Authority::getName)
                    .collect(Collectors.toList());
        }

        public String getToken() {
            return token;
        }

        public List<String> getRoles() {
            return roles;
        }

        public long getExpiresIn() {
            return expiresIn;
        }
    }
}
