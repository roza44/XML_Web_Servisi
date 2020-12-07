
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
 *         &lt;element name="Odluka_resenja" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Br_resenja"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;pattern value="\d{3}-\d{2}-\d{4}/\d{4}-\d{2}"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Datum_resenja" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/resenje}Uvod"/&gt;
 *         &lt;element name="Ishod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/resenje}Obrazlozenje"/&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/resenje}Poverenik"/&gt;
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
    "odlukaResenja",
    "brResenja",
    "datumResenja",
    "uvod",
    "ishod",
    "obrazlozenje",
    "poverenik"
})
@XmlRootElement(name = "Resenje", namespace = "http://www.ftn.uns.ac.rs/resenje")
public class Resenje {

    @XmlElement(name = "Odluka_resenja", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected String odlukaResenja;
    @XmlElement(name = "Br_resenja", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected String brResenja;
    @XmlElement(name = "Datum_resenja", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumResenja;
    @XmlElement(name = "Uvod", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected Uvod uvod;
    @XmlElement(name = "Ishod", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected String ishod;
    @XmlElement(name = "Obrazlozenje", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected Obrazlozenje obrazlozenje;
    @XmlElement(name = "Poverenik", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected Poverenik poverenik;

    /**
     * Gets the value of the odlukaResenja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOdlukaResenja() {
        return odlukaResenja;
    }

    /**
     * Sets the value of the odlukaResenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOdlukaResenja(String value) {
        this.odlukaResenja = value;
    }

    /**
     * Gets the value of the brResenja property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrResenja() {
        return brResenja;
    }

    /**
     * Sets the value of the brResenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrResenja(String value) {
        this.brResenja = value;
    }

    /**
     * Gets the value of the datumResenja property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumResenja() {
        return datumResenja;
    }

    /**
     * Sets the value of the datumResenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumResenja(XMLGregorianCalendar value) {
        this.datumResenja = value;
    }

    /**
     * Gets the value of the uvod property.
     * 
     * @return
     *     possible object is
     *     {@link Uvod }
     *     
     */
    public Uvod getUvod() {
        return uvod;
    }

    /**
     * Sets the value of the uvod property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uvod }
     *     
     */
    public void setUvod(Uvod value) {
        this.uvod = value;
    }

    /**
     * Gets the value of the ishod property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIshod() {
        return ishod;
    }

    /**
     * Sets the value of the ishod property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIshod(String value) {
        this.ishod = value;
    }

    /**
     * Gets the value of the obrazlozenje property.
     * 
     * @return
     *     possible object is
     *     {@link Obrazlozenje }
     *     
     */
    public Obrazlozenje getObrazlozenje() {
        return obrazlozenje;
    }

    /**
     * Sets the value of the obrazlozenje property.
     * 
     * @param value
     *     allowed object is
     *     {@link Obrazlozenje }
     *     
     */
    public void setObrazlozenje(Obrazlozenje value) {
        this.obrazlozenje = value;
    }

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

    @Override
    public String toString() {
        return "Resenje:" + "\n" +
                "\t" + "odlukaResenja='" + odlukaResenja + '\'' +",\n" +
                "\t" + " brResenja='" + brResenja + '\'' +",\n" +
                "\t" + " datumResenja=" + datumResenja +",\n" +
                "\t" + " uvod=" + uvod +",\n" +
                "\t" + " ishod='" + ishod + '\'' +",\n" +
                "\t" + " obrazlozenje=" + obrazlozenje +",\n" +
                "\t" + " poverenik=" + poverenik;
    }
}
