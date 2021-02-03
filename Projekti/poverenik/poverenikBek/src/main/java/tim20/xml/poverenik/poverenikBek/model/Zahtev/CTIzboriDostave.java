
package tim20.xml.poverenik.poverenikBek.model.Zahtev;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTIzboriDostave complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTIzboriDostave"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Izbor" type="{http://www.ftn.uns.ac.rs/zahtev}CTIzbor" maxOccurs="4" minOccurs="4"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTIzboriDostave", namespace = "http://www.ftn.uns.ac.rs/zahtev", propOrder = {
    "izbor"
})
public class CTIzboriDostave {

    @XmlElement(name = "Izbor", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
    protected List<CTIzbor> izbor;

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

}
