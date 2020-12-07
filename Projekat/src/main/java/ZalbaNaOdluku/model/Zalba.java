
package model;

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
 *         &lt;element name="Zalilac" type="{http://www.ftn.uns.ac.rs/ZalbaNaOdluku}TZalilac"/&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/ZalbaNaOdluku}Resenje"/&gt;
 *         &lt;element name="Datum_Zahteva" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Osnov_Zalbe" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/ZalbaNaOdluku}Podnosilac"/&gt;
 *         &lt;element name="Grad" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/ZalbaNaOdluku}Adresa"/&gt;
 *         &lt;element name="Datum_Zalbe" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Kontakt" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
    "zalilac",
    "resenje",
    "datumZahteva",
    "osnovZalbe",
    "podnosilac",
    "grad",
    "adresa",
    "datumZalbe",
    "kontakt"
})
@XmlRootElement(name = "Zalba", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku")
public class Zalba {

    @XmlElement(name = "Zalilac", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected TZalilac zalilac;
    @XmlElement(name = "Resenje", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected Resenje resenje;
    @XmlElement(name = "Datum_Zahteva", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZahteva;
    @XmlElement(name = "Osnov_Zalbe", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected String osnovZalbe;
    @XmlElement(name = "Podnosilac", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected Podnosilac podnosilac;
    @XmlElement(name = "Grad", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected String grad;
    @XmlElement(name = "Adresa", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected Adresa adresa;
    @XmlElement(name = "Datum_Zalbe", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZalbe;
    @XmlElement(name = "Kontakt", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected String kontakt;

    /**
     * Gets the value of the zalilac property.
     * 
     * @return
     *     possible object is
     *     {@link TZalilac }
     *     
     */
    public TZalilac getZalilac() {
        return zalilac;
    }

    /**
     * Sets the value of the zalilac property.
     * 
     * @param value
     *     allowed object is
     *     {@link TZalilac }
     *     
     */
    public void setZalilac(TZalilac value) {
        this.zalilac = value;
    }

    /**
     * Gets the value of the resenje property.
     * 
     * @return
     *     possible object is
     *     {@link Resenje }
     *     
     */
    public Resenje getResenje() {
        return resenje;
    }

    /**
     * Sets the value of the resenje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resenje }
     *     
     */
    public void setResenje(Resenje value) {
        this.resenje = value;
    }

    /**
     * Gets the value of the datumZahteva property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZahteva() {
        return datumZahteva;
    }

    /**
     * Sets the value of the datumZahteva property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZahteva(XMLGregorianCalendar value) {
        this.datumZahteva = value;
    }

    /**
     * Gets the value of the osnovZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOsnovZalbe() {
        return osnovZalbe;
    }

    /**
     * Sets the value of the osnovZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOsnovZalbe(String value) {
        this.osnovZalbe = value;
    }

    /**
     * Gets the value of the podnosilac property.
     * 
     * @return
     *     possible object is
     *     {@link Podnosilac }
     *     
     */
    public Podnosilac getPodnosilac() {
        return podnosilac;
    }

    /**
     * Sets the value of the podnosilac property.
     * 
     * @param value
     *     allowed object is
     *     {@link Podnosilac }
     *     
     */
    public void setPodnosilac(Podnosilac value) {
        this.podnosilac = value;
    }

    /**
     * Gets the value of the grad property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGrad() {
        return grad;
    }

    /**
     * Sets the value of the grad property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGrad(String value) {
        this.grad = value;
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

    /**
     * Gets the value of the datumZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZalbe() {
        return datumZalbe;
    }

    /**
     * Sets the value of the datumZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZalbe(XMLGregorianCalendar value) {
        this.datumZalbe = value;
    }

    /**
     * Gets the value of the kontakt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKontakt() {
        return kontakt;
    }

    /**
     * Sets the value of the kontakt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKontakt(String value) {
        this.kontakt = value;
    }

}
