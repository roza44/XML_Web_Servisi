
package tim20.xml.sluzbenik.sluzbenikBek.model.user;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for UserType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="UserType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="GRADJANIN"/&gt;
 *     &lt;enumeration value="POVERENIK"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "UserType", namespace = "http://www.ftn.uns.ac.rs/user")
@XmlEnum
public enum UserType {

    GRADJANIN,
    POVERENIK;

    public String value() {
        return name();
    }

    public static UserType fromValue(String v) {
        return valueOf(v);
    }

}
