//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.5.1 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2020.12.08 at 12:02:29 AM CET 
//


package Zahtev.model;

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
 * &lt;complexType name="CTIzboriZahteva">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Izbor" type="{http://www.ftn.uns.ac.rs/zahtev}CTIzbor" maxOccurs="3" minOccurs="3"/>
 *         &lt;element name="IzboriDostave" type="{http://www.ftn.uns.ac.rs/zahtev}CTIzboriDostave"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTIzboriZahteva", propOrder = {
    "izbor",
    "izboriDostave"
})
public class CTIzboriZahteva {

    @XmlElement(name = "Izbor", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
    protected List<CTIzbor> izbor;
    @XmlElement(name = "IzboriDostave", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
    protected CTIzboriDostave izboriDostave;

    @Override
    public String toString() {
        return "IzboriZahteva, size = " + izbor.size() + "\n" +
                "\t\t\t\tIzboriDostave, size = " + izboriDostave.getIzbor().size();
//        return "CTIzboriZahteva{" +
//                "izbor=" + izbor +
//                ", izboriDostave=" + izboriDostave +
//                '}';
    }

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