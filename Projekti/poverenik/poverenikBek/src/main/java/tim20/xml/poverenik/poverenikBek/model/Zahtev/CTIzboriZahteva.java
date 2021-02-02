
package tim20.xml.poverenik.poverenikBek.model.Zahtev;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTIzboriZahteva complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTIzboriZahteva"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Izbor" type="{http://www.ftn.uns.ac.rs/zahtev}CTIzbor" maxOccurs="3" minOccurs="3"/&gt;
 *         &lt;element name="IzboriDostave" type="{http://www.ftn.uns.ac.rs/zahtev}CTIzboriDostave"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTIzboriZahteva", namespace = "http://www.ftn.uns.ac.rs/zahtev", propOrder = {
    "izbor",
    "izboriDostave"
})
public class CTIzboriZahteva {

    @XmlElement(name = "Izbor", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
    protected List<CTIzbor> izbor;
    @XmlElement(name = "IzboriDostave", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
    protected CTIzboriDostave izboriDostave;

    /**
     * Gets the value of the izbor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the izbor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIzbor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CTIzbor }
     * 
     * 
     */
    public List<CTIzbor> getIzbor() {
        if (izbor == null) {
            izbor = new ArrayList<CTIzbor>();
        }
        return this.izbor;
    }

    /**
     * Gets the value of the izboriDostave property.
     * 
     * @return
     *     possible object is
     *     {@link CTIzboriDostave }
     *     
     */
    public CTIzboriDostave getIzboriDostave() {
        return izboriDostave;
    }

    /**
     * Sets the value of the izboriDostave property.
     * 
     * @param value
     *     allowed object is
     *     {@link CTIzboriDostave }
     *     
     */
    public void setIzboriDostave(CTIzboriDostave value) {
        this.izboriDostave = value;
    }

}
