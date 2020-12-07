
package Resenje.model;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Clan" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="Stav" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="Tacka" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/&gt;
 *         &lt;element name="Naziv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Broj_glasnika"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[1-9]\d*<!---->/\d*"/&gt;
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
    "clan",
    "stav",
    "tacka",
    "naziv",
    "brojGlasnika"
})
@XmlRootElement(name = "Zakon", namespace = "http://www.ftn.uns.ac.rs/resenje")
public class Zakon {

    @XmlElement(name = "Clan", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger clan;
    @XmlElement(name = "Stav", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger stav;
    @XmlElement(name = "Tacka", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger tacka;
    @XmlElement(name = "Naziv", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected String naziv;
    @XmlElement(name = "Broj_glasnika", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected String brojGlasnika;

    /**
     * Gets the value of the clan property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getClan() {
        return clan;
    }

    /**
     * Sets the value of the clan property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setClan(BigInteger value) {
        this.clan = value;
    }

    /**
     * Gets the value of the stav property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStav() {
        return stav;
    }

    /**
     * Sets the value of the stav property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStav(BigInteger value) {
        this.stav = value;
    }

    /**
     * Gets the value of the tacka property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTacka() {
        return tacka;
    }

    /**
     * Sets the value of the tacka property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTacka(BigInteger value) {
        this.tacka = value;
    }

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
     * Gets the value of the brojGlasnika property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojGlasnika() {
        return brojGlasnika;
    }

    /**
     * Sets the value of the brojGlasnika property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojGlasnika(String value) {
        this.brojGlasnika = value;
    }

    @Override
    public String toString() {
        return "Zakon:" + "\n" +
                "\t" + "clan=" + clan +",\n" +
                "\t" + " stav=" + stav +",\n" +
                "\t" + " tacka=" + tacka +",\n" +
                "\t" + " naziv='" + naziv + '\'' +",\n" +
                "\t" + " brojGlasnika='" + brojGlasnika + '\'';
    }
}
