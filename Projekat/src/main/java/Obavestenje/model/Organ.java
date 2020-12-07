
package Obavestenje.model;

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
 *         &lt;element name="Naziv"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sediste"&gt;
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
    "naziv",
    "sediste"
})
@XmlRootElement(name = "Organ", namespace = "http://www.ftn.uns.ac.rs/obavestenje")
public class Organ {

    @XmlElement(name = "Naziv", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected String naziv;
    @XmlElement(name = "Sediste", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected String sediste;

    /**
     * Gets the value of the naziv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Sets the value of the naziv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaziv(String value) {
        this.naziv = value;
    }

    /**
     * Gets the value of the sediste property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSediste() {
        return sediste;
    }

    /**
     * Sets the value of the sediste property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSediste(String value) {
        this.sediste = value;
    }

    @Override
    public String toString() {
        return "Organ:" + "\n" +
                "\t" + "naziv='" + naziv + '\'' +",\n" +
                "\t" +" sediste='" + sediste + '\'';
    }
}
