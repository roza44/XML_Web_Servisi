
package tim20.xml.poverenik.poverenikBek.model.Obavestenje;


import tim20.xml.poverenik.poverenikBek.model.Tipovi.TAdresa;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
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
 *         &lt;element name="Datum"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
 *         &lt;element name="Adresa" type="{http://tipovi}TAdresa"/&gt;
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
    protected Uvid.Datum datum;
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
    protected TAdresa adresa;

    /**
     * Gets the value of the datum property.
     * 
     * @return
     *     possible object is
     *     {@link Uvid.Datum }
     *     
     */
    public Uvid.Datum getDatum() {
        return datum;
    }

    /**
     * Sets the value of the datum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Uvid.Datum }
     *     
     */
    public void setDatum(Uvid.Datum value) {
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
     *     {@link TAdresa }
     *     
     */
    public TAdresa getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link TAdresa }
     *     
     */
    public void setAdresa(TAdresa value) {
        this.adresa = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
     *       &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *     &lt;/extension&gt;
     *   &lt;/simpleContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Datum {

        @XmlValue
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar value;
        @XmlAttribute(name = "property")
        protected String property;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setValue(XMLGregorianCalendar value) {
            this.value = value;
        }

        /**
         * Gets the value of the property property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProperty() {
            return property;
        }

        /**
         * Sets the value of the property property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProperty(String value) {
            this.property = value;
        }

    }

}
