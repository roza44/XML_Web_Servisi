package tim20.xml.sluzbenik.sluzbenikBek.request;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "registerRequest")
public class RegisterRequest {

    @XmlElement(name = "firstName", required = true)
    private String firstName;
    @XmlElement(name = "lastName", required = true)
    private String lastName;
    @XmlElement(name = "email", required = true)
    private String email;
    @XmlElement(name = "password", required = true)
    private String password;

    public RegisterRequest() {
    }

    public RegisterRequest(String firstName, String lastName, String email, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
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
