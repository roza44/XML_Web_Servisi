
package Resenje.model;

import java.util.ArrayList;
import java.util.List;
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
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/resenje}Zakon" maxOccurs="unbounded" minOccurs="0"/&gt;
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
    "zakon"
})
@XmlRootElement(name = "Osnova_resenja", namespace = "http://www.ftn.uns.ac.rs/resenje")
public class OsnovaResenja {

    @XmlElement(name = "Zakon", namespace = "http://www.ftn.uns.ac.rs/resenje")
    protected List<Zakon> zakon;

    /**
     * Gets the value of the zakon property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the zakon property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getZakon().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Zakon }
     * 
     * 
     */
    public List<Zakon> getZakon() {
        if (zakon == null) {
            zakon = new ArrayList<Zakon>();
        }
        return this.zakon;
    }

    @Override
    public String toString() {
        return "OsnovaResenja:" +"\n" +
                "\t" + "zakon=" + zakon;
    }
}
