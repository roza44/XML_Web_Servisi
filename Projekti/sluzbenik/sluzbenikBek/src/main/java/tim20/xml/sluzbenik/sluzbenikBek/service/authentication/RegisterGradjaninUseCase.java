package tim20.xml.sluzbenik.sluzbenikBek.service.authentication;

import tim20.xml.sluzbenik.sluzbenikBek.core.exception.EmailTakenException;
import tim20.xml.sluzbenik.sluzbenikBek.validation.SelfValidating;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

public interface RegisterGradjaninUseCase {
    void addGradjanin(RegisterGradjaninCommand command) throws EmailTakenException;

    class RegisterGradjaninCommand extends SelfValidating<RegisterGradjaninCommand> {
        @NotBlank
        private String firstName;

        @NotBlank
        private String lastName;

        @Email
        @NotBlank
        private String email;

        @NotBlank
        private String password;

        public RegisterGradjaninCommand(String firstName, String lastName, String email, String password) {
            this.firstName = firstName;
            this.lastName = lastName;
            this.email = email;
            this.password = password;
            this.validateSelf();
        }

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getEmail() {
            return email;
        }

        public String getPassword() {
            return password;
        }
    }
}

