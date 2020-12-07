
package Resenje.model;

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
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/resenje}Poverenik" minOccurs="0"/&gt;
 *         &lt;element name="Podnosilac_zalbe"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="[A-Z][A-Z]"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Razlog"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="protiv resenja"/&gt;
 *               &lt;enumeration value="zbog nepostupanja"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Organ_vlasti" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Datum_zahteva" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/resenje}Osnova_resenja"/&gt;
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
    "poverenik",
    "podnosilacZalbe",
    "razlog",
    "organVlasti",
    "datumZahteva",
    "osnovaResenja"
})
@XmlRootElement(name = "Uvod", namespace = "http://www.ftn.uns.ac.rs/resenje")
public class Uvod {

    @XmlElement(name = "Poverenik", namespace = "http://www.ftn.uns.ac.rs/resenje")
    protected Poverenik poverenik;
    @XmlElement(name = "Podnosilac_zalbe", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected String podnosilacZalbe;
    @XmlElement(name = "Razlog", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected String razlog;
    @XmlElement(name = "Organ_vlasti", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected String organVlasti;
    @XmlElement(name = "Datum_zahteva", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZahteva;
    @XmlElement(name = "Osnova_resenja", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected OsnovaResenja osnovaResenja;

    /**
     * Gets the value of the poverenik property.
     * 
     * @return
     *     possible object is
     *     {@link Poverenik }
     *     
     */
    public Poverenik getPoverenik() {
        return poverenik;
    }

    /**
     * Sets the value of the poverenik property.
     * 
     * @param value
     *     allowed object is
     *     {@link Poverenik }
     *     
     */
    public void setPoverenik(Poverenik value) {
        this.poverenik = value;
    }

    /**
     * Gets the value of the podnosilacZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPodnosilacZalbe() {
        return podnosilacZalbe;
    }

    /**
     * Sets the value of the podnosilacZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPodnosilacZalbe(String value) {
        this.podnosilacZalbe = value;
    }

    /**
     * Gets the value of the razlog property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazlog() {
        return razlog;
    }

    /**
     * Sets the value of the razlog property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazlog(String value) {
        this.razlog = value;
    }

    /**
     * Gets the value of the organVlasti property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrganVlasti() {
        return organVlasti;
    }

    /**
     * Sets the value of the organVlasti property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrganVlasti(String value) {
        this.organVlasti = value;
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
     * Gets the value of the osnovaResenja property.
     * 
     * @return
     *     possible object is
     *     {@link OsnovaResenja }
     *     
     */
    public OsnovaResenja getOsnovaResenja() {
        return osnovaResenja;
    }

    /**
     * Sets the value of the osnovaResenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link OsnovaResenja }
     *     
     */
    public void setOsnovaResenja(OsnovaResenja value) {
        this.osnovaResenja = value;
    }

    @Override
    public String toString() {
        return "Uvod:" + "\n" +
                "\t" + "poverenik=" + poverenik +",\n" +
                "\t" + " podnosilacZalbe='" + podnosilacZalbe + '\'' +",\n" +
                "\t" + " razlog='" + razlog + '\'' +",\n" +
                "\t" + " organVlasti='" + organVlasti + '\'' +",\n" +
                "\t" + " datumZahteva=" + datumZahteva +",\n" +
                "\t" + " osnovaResenja=" + osnovaResenja;
    }
}
