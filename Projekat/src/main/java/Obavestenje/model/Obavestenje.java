
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
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/obavestenje}Organ"/&gt;
 *         &lt;element name="Datum" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Broj_predmeta" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Podnosioc_zahteva" type="{http://www.ftn.uns.ac.rs/obavestenje}TLice"/&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/obavestenje}Trazena_informacija"/&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/obavestenje}Uvid"/&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/obavestenje}Troskovi"/&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/obavestenje}Uplata"/&gt;
 *         &lt;element name="Dostavljeno"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Imenovanom"/&gt;
 *               &lt;enumeration value="Arhivi"/&gt;
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
    "organ",
    "datum",
    "brojPredmeta",
    "podnosiocZahteva",
    "trazenaInformacija",
    "uvid",
    "troskovi",
    "uplata",
    "dostavljeno"
})
@XmlRootElement(name = "Obavestenje", namespace = "http://www.ftn.uns.ac.rs/obavestenje")
public class Obavestenje {

    @XmlElement(name = "Organ", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected Organ organ;
    @XmlElement(name = "Datum", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datum;
    @XmlElement(name = "Broj_predmeta", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected String brojPredmeta;
    @XmlElement(name = "Podnosioc_zahteva", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected TLice podnosiocZahteva;
    @XmlElement(name = "Trazena_informacija", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected TrazenaInformacija trazenaInformacija;
    @XmlElement(name = "Uvid", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected Uvid uvid;
    @XmlElement(name = "Troskovi", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected Troskovi troskovi;
    @XmlElement(name = "Uplata", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected Uplata uplata;
    @XmlElement(name = "Dostavljeno", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected String dostavljeno;

    /**
     * Gets the value of the organ property.
     * 
     * @return
     *     possible object is
     *     {@link Organ }
     *     
     */
    public Organ getOrgan() {
        return organ;
    }

    /**
     * Sets the value of the organ property.
     * 
     * @param value
     *     allowed object is
     *     {@link Organ }
     *     
     */
    public void setOrgan(Organ value) {
        this.organ = value;
    }

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
     * Gets the value of the brojPredmeta property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrojPredmeta() {
        return brojPredmeta;
    }

    /**
     * Sets the value of the brojPredmeta property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrojPredmeta(String value) {
        this.brojPredmeta = value;
    }

    /**
     * Gets the value of the podnosiocZahteva property.
     * 
     * @return
     *     possible object is
     *     {@link TLice }
     *     
     */
    public TLice getPodnosiocZahteva() {
        return podnosiocZahteva;
    }

    /**
     * Sets the value of the podnosiocZahteva property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLice }
     *     
     */
    public void setPodnosiocZahteva(TLice value) {
        this.podnosiocZahteva = value;
    }

    /**
     * Gets the value of the trazenaInformacija property.
     * 
     * @return
     *     possible object is
     *     {@link TrazenaInformacija }
     *     
     */
    public TrazenaInformacija getTrazenaInformacija() {
        return trazenaInformacija;
    }

    /**
     * Sets the value of the trazenaInformacija property.
     * 
     * @param value
     *     allowed object is
     *     {@link TrazenaInformacija }
     *     
     */
    public void setTrazenaInformacija(TrazenaInformacija value) {
        this.trazenaInformacija = value;
    }

    /**
     * Gets the value of the uvid property.
     * 
     * @return
     *     possible object is
     *     {@link Uvid }
     *     
     */
    public Uvid getUvid() {
        return uvid;
    }

    /**
     * Sets the value of the uvid property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uvid }
     *     
     */
    public void setUvid(Uvid value) {
        this.uvid = value;
    }

    /**
     * Gets the value of the troskovi property.
     * 
     * @return
     *     possible object is
     *     {@link Troskovi }
     *     
     */
    public Troskovi getTroskovi() {
        return troskovi;
    }

    /**
     * Sets the value of the troskovi property.
     * 
     * @param value
     *     allowed object is
     *     {@link Troskovi }
     *     
     */
    public void setTroskovi(Troskovi value) {
        this.troskovi = value;
    }

    /**
     * Gets the value of the uplata property.
     * 
     * @return
     *     possible object is
     *     {@link Uplata }
     *     
     */
    public Uplata getUplata() {
        return uplata;
    }

    /**
     * Sets the value of the uplata property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uplata }
     *     
     */
    public void setUplata(Uplata value) {
        this.uplata = value;
    }

    /**
     * Gets the value of the dostavljeno property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDostavljeno() {
        return dostavljeno;
    }

    /**
     * Sets the value of the dostavljeno property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDostavljeno(String value) {
        this.dostavljeno = value;
    }

    @Override
    public String toString() {
        return "Obavestenje: " + "\n" +
                "\t" + "organ=" + organ + ",\n" +
                "\t" + " datum=" + datum +",\n" +
                "\t" + " brojPredmeta='" + brojPredmeta + '\'' +",\n" +
                "\t" + " podnosiocZahteva=" + podnosiocZahteva +",\n" +
                "\t" + " trazenaInformacija=" + trazenaInformacija +",\n" +
                "\t" + " uvid=" + uvid +",\n" +
                "\t" + " troskovi=" + troskovi +",\n" +
                "\t" + " uplata=" + uplata +",\n" +
                "\t" + " dostavljeno='" + dostavljeno + '\'';
    }
}
