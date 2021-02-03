
package tim20.xml.poverenik.poverenikBek.model.ZalbaNaCutanje;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TRazlogZalbe.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="TRazlogZalbe"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="Organ vlasti nije postupio u zakonskom roku"/&gt;
 *     &lt;enumeration value="Organ vlasti nije postupio u celosti u zakonskom roku"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "TRazlogZalbe", namespace = "http://www.ftn.uns.ac.rs/zalbacutanje")
@XmlEnum
public enum TRazlogZalbe {

    @XmlEnumValue("Organ vlasti nije postupio u zakonskom roku")
    ORGAN_VLASTI_NIJE_POSTUPIO_U_ZAKONSKOM_ROKU("Organ vlasti nije postupio u zakonskom roku"),
    @XmlEnumValue("Organ vlasti nije postupio u celosti u zakonskom roku")
    ORGAN_VLASTI_NIJE_POSTUPIO_U_CELOSTI_U_ZAKONSKOM_ROKU("Organ vlasti nije postupio u celosti u zakonskom roku");
    private final String value;

    TRazlogZalbe(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TRazlogZalbe fromValue(String v) {
        for (TRazlogZalbe c: TRazlogZalbe.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
