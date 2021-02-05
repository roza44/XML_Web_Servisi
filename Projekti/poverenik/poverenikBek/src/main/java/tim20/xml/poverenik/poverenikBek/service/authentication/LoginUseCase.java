package tim20.xml.poverenik.poverenikBek.service.authentication;

import tim20.xml.poverenik.poverenikBek.model.user.Authority;
import tim20.xml.poverenik.poverenikBek.validation.SelfValidating;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Collection;

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

    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlRootElement(name = "LoginDTO")
    class LoginDTO {
        @XmlElement(name = "token", required = true)
        private String token;
        @XmlElement(name = "roles", required = true)
        private String roles;
        @XmlElement(name = "expiresIn", required = true)
        private long expiresIn;

        public LoginDTO() {
        }

        public LoginDTO(String token, Collection<Authority> authorities, long expiresIn) {
            this.token = token;
            this.roles = mapRoles(authorities);
            this.expiresIn = expiresIn;
        }

        private String mapRoles(Collection<Authority> authorities) {
            return authorities.iterator().next().getName();
        }

        public String getToken() {
            return token;
        }

        public String getRoles() {
            return roles;
        }

        public long getExpiresIn() {
            return expiresIn;
        }
    }
}
