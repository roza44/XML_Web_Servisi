
package tim20.xml.poverenik.poverenikBek.model.Resenje;


import tim20.xml.poverenik.poverenikBek.model.Tipovi.TImePrezime;

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
 *         &lt;element name="Odluka_resenja"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Br_resenja"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.ftn.uns.ac.rs/resenje&gt;BrResenjaType"&gt;
 *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Datum_resenja"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/resenje}Uvod"/&gt;
 *         &lt;element name="Ishod" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/resenje}Obrazlozenje"/&gt;
 *         &lt;element name="Poverenik" type="{http://tipovi}TImePrezime"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="vocab" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *       &lt;attribute name="about" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
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
    protected Resenje.OdlukaResenja odlukaResenja;
    @XmlElement(name = "Br_resenja", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected Resenje.BrResenja brResenja;
    @XmlElement(name = "Datum_resenja", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected Resenje.DatumResenja datumResenja;
    @XmlElement(name = "Uvod", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected Uvod uvod;
    @XmlElement(name = "Ishod", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected String ishod;
    @XmlElement(name = "Obrazlozenje", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected Obrazlozenje obrazlozenje;
    @XmlElement(name = "Poverenik", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected TImePrezime poverenik;
    @XmlAttribute(name = "vocab")
    protected String vocab;
    @XmlAttribute(name = "about")
    protected String about;

    /**
     * Gets the value of the odlukaResenja property.
     * 
     * @return
     *     possible object is
     *     {@link Resenje.OdlukaResenja }
     *     
     */
    public Resenje.OdlukaResenja getOdlukaResenja() {
        return odlukaResenja;
    }

    /**
     * Sets the value of the odlukaResenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resenje.OdlukaResenja }
     *     
     */
    public void setOdlukaResenja(Resenje.OdlukaResenja value) {
        this.odlukaResenja = value;
    }

    /**
     * Gets the value of the brResenja property.
     * 
     * @return
     *     possible object is
     *     {@link Resenje.BrResenja }
     *     
     */
    public Resenje.BrResenja getBrResenja() {
        return brResenja;
    }

    /**
     * Sets the value of the brResenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resenje.BrResenja }
     *     
     */
    public void setBrResenja(Resenje.BrResenja value) {
        this.brResenja = value;
    }

    /**
     * Gets the value of the datumResenja property.
     * 
     * @return
     *     possible object is
     *     {@link Resenje.DatumResenja }
     *     
     */
    public Resenje.DatumResenja getDatumResenja() {
        return datumResenja;
    }

    /**
     * Sets the value of the datumResenja property.
     * 
     * @param value
     *     allowed object is
     *     {@link Resenje.DatumResenja }
     *     
     */
    public void setDatumResenja(Resenje.DatumResenja value) {
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
     *     {@link TImePrezime }
     *     
     */
    public TImePrezime getPoverenik() {
        return poverenik;
    }

    /**
     * Sets the value of the poverenik property.
     * 
     * @param value
     *     allowed object is
     *     {@link TImePrezime }
     *     
     */
    public void setPoverenik(TImePrezime value) {
        this.poverenik = value;
    }

    /**
     * Gets the value of the vocab property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVocab() {
        return vocab;
    }

    /**
     * Sets the value of the vocab property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVocab(String value) {
        this.vocab = value;
    }

    /**
     * Gets the value of the about property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAbout() {
        return about;
    }

    /**
     * Sets the value of the about property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAbout(String value) {
        this.about = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.ftn.uns.ac.rs/resenje&gt;BrResenjaType"&gt;
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
    public static class BrResenja {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "property")
        protected String property;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
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
    public static class DatumResenja {

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


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;simpleContent&gt;
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
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
    public static class OdlukaResenja {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "property")
        protected String property;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
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
