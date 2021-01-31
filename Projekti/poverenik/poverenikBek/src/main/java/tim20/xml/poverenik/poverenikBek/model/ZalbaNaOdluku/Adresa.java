
package tim20.xml.poverenik.poverenikBek.model.ZalbaNaOdluku;

import javax.xml.bind.annotation.*;
import java.math.BigInteger;


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
 *         &lt;element name="Mesto" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Postanski_broj"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="11000"/&gt;
 *               &lt;maxInclusive value="40000"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Ulica" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Broj" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
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
    "mesto",
    "postanskiBroj",
    "ulica",
    "broj"
})
@XmlRootElement(name = "Adresa", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku")
public class Adresa {

    @XmlElement(name = "Mesto", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected String mesto;
    @XmlElement(name = "Postanski_broj", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku")
    protected int postanskiBroj;
    @XmlElement(name = "Ulica", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected String ulica;
    @XmlElement(name = "Broj", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger broj;

    /**
     * Gets the value of the mesto property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMesto() {
        return mesto;
    }

    /**
     * Sets the value of the mesto property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMesto(String value) {
        this.mesto = value;
    }

    /**
     * Gets the value of the postanskiBroj property.
     * 
     */
    public int getPostanskiBroj() {
        return postanskiBroj;
    }

    /**
     * Sets the value of the postanskiBroj property.
     * 
     */
    public void setPostanskiBroj(int value) {
        this.postanskiBroj = value;
    }

    /**
     * Gets the value of the ulica property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUlica() {
        return ulica;
    }

    /**
     * Sets the value of the ulica property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUlica(String value) {
        this.ulica = value;
    }

    /**
     * Gets the value of the broj property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBroj() {
        return broj;
    }

    /**
     * Sets the value of the broj property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBroj(BigInteger value) {
        this.broj = value;
    }

    @Override
    public String toString() {
        return "Adresa:" + "\n" +
                "\t" + "mesto=" + mesto + "\n" +
                "\t" +", postanskiBroj=" + postanskiBroj + "\n" +
                "\t" + ", ulica=" + ulica + "\n" +
                "\t" + ", broj=" + broj + "\n";
    }
}
