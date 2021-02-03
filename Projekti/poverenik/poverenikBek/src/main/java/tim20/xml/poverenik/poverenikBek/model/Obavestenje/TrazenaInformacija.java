
package tim20.xml.poverenik.poverenikBek.model.Obavestenje;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Godina_zahteva"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="-2147483648"/&gt;
 *               &lt;totalDigits value="4"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Opis_informacije"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "godinaZahteva",
    "opisInformacije"
})
@XmlRootElement(name = "Trazena_informacija", namespace = "http://www.ftn.uns.ac.rs/obavestenje")
public class TrazenaInformacija {

    @XmlElement(name = "Godina_zahteva", namespace = "http://www.ftn.uns.ac.rs/obavestenje")
    protected int godinaZahteva;
    @XmlElement(name = "Opis_informacije", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected String opisInformacije;

    /**
     * Gets the value of the godinaZahteva property.
     * 
     */
    public int getGodinaZahteva() {
        return godinaZahteva;
    }

    /**
     * Sets the value of the godinaZahteva property.
     * 
     */
    public void setGodinaZahteva(int value) {
        this.godinaZahteva = value;
    }

    /**
     * Gets the value of the opisInformacije property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpisInformacije() {
        return opisInformacije;
    }

    /**
     * Sets the value of the opisInformacije property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpisInformacije(String value) {
        this.opisInformacije = value;
    }

}
