
package tim20.xml.poverenik.poverenikBek.model.Resenje;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for RazlogResenjaType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="RazlogResenjaType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="protiv resenja"/&gt;
 *     &lt;enumeration value="zbog nepostupanja"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "RazlogResenjaType", namespace = "http://www.ftn.uns.ac.rs/resenje")
@XmlEnum
public enum RazlogResenjaType {

    @XmlEnumValue("protiv resenja")
    PROTIV_RESENJA("protiv resenja"),
    @XmlEnumValue("zbog nepostupanja")
    ZBOG_NEPOSTUPANJA("zbog nepostupanja");
    private final String value;

    RazlogResenjaType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static RazlogResenjaType fromValue(String v) {
        for (RazlogResenjaType c: RazlogResenjaType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
