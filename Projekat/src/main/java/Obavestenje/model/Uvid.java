
package Obavestenje.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Satnica" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="Satnica_od" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="Satnica_do" type="{http://www.w3.org/2001/XMLSchema}time"/&gt;
 *         &lt;element name="Broj_kancelarije"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int"&gt;
 *               &lt;minInclusive value="1"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/obavestenje}Adresa"/&gt;
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
    "datum",
    "satnica",
    "satnicaOd",
    "satnicaDo",
    "brojKancelarije",
    "adresa"
})
@XmlRootElement(name = "Uvid", namespace = "http://www.ftn.uns.ac.rs/obavestenje")
public class Uvid {

    @XmlElement(name = "Datum", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(name = "Satnica", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar satnica;
    @XmlElement(name = "Satnica_od", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar satnicaOd;
    @XmlElement(name = "Satnica_do", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar satnicaDo;
    @XmlElement(name = "Broj_kancelarije", namespace = "http://www.ftn.uns.ac.rs/obavestenje")
    protected int brojKancelarije;
    @XmlElement(name = "Adresa", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected Adresa adresa;

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatum(XMLGregorianCalendar value) {
        this.datum = value;
    }

    /**
     * Gets the value of the satnica property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSatnica() {
        return satnica;
    }

    /**
     * Sets the value of the satnica property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSatnica(XMLGregorianCalendar value) {
        this.satnica = value;
    }

    /**
     * Gets the value of the satnicaOd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSatnicaOd() {
        return satnicaOd;
    }

    /**
     * Sets the value of the satnicaOd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSatnicaOd(XMLGregorianCalendar value) {
        this.satnicaOd = value;
    }

    /**
     * Gets the value of the satnicaDo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSatnicaDo() {
        return satnicaDo;
    }

    /**
     * Sets the value of the satnicaDo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSatnicaDo(XMLGregorianCalendar value) {
        this.satnicaDo = value;
    }

    /**
     * Gets the value of the brojKancelarije property.
     * 
     */
    public int getBrojKancelarije() {
        return brojKancelarije;
    }

    /**
     * Sets the value of the brojKancelarije property.
     * 
     */
    public void setBrojKancelarije(int value) {
        this.brojKancelarije = value;
    }

    /**
     * Gets the value of the adresa property.
     * 
     * @return
     *     possible object is
     *     {@link Adresa }
     *     
     */
    public Adresa getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adresa }
     *     
     */
    public void setAdresa(Adresa value) {
        this.adresa = value;
    }

    @Override
    public String toString() {
        return "Uvid:" + "\n" +
                "\t" + "datum=" + datum +",\n" +
                "\t" + " satnica=" + satnica +",\n" +
                "\t" + " satnicaOd=" + satnicaOd +",\n" +
                "\t" + " satnicaDo=" + satnicaDo +",\n" +
                "\t" + " brojKancelarije=" + brojKancelarije +",\n" +
                "\t" + " adresa=" + adresa;
    }
}
