
package tim20.xml.poverenik.poverenikBek.model.ZalbaNaOdluku;

import tim20.xml.poverenik.poverenikBek.model.Tipovi.TAdresa;
import tim20.xml.poverenik.poverenikBek.model.Tipovi.TFizickoLice;
import tim20.xml.poverenik.poverenikBek.model.Tipovi.TLice;
import tim20.xml.poverenik.poverenikBek.model.Tipovi.TPravnoLice;

import javax.xml.bind.annotation.*;
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
 *         &lt;element name="Zalilac" type="{http://tipovi}TLice"/&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/ZalbaNaOdluku}Resenje"/&gt;
 *         &lt;element name="Datum_Zahteva"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Osnov_Zalbe"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/ZalbaNaOdluku}Podnosilac"/&gt;
 *         &lt;element name="Adresa" type="{http://tipovi}TAdresa"/&gt;
 *         &lt;element name="Datum_Zalbe"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Kontakt"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    "zalilac",
    "resenje",
    "datumZahteva",
    "osnovZalbe",
    "podnosilac",
    "adresa",
    "datumZalbe",
    "kontakt"
})
@XmlRootElement(name = "Zalba", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku")
public class Zalba {

    @XmlElement(name = "Zalilac", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected TPravnoLice zalilac;
    @XmlElement(name = "Resenje", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected Resenje resenje;
    @XmlElement(name = "Datum_Zahteva", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected Zalba.DatumZahteva datumZahteva;
    @XmlElement(name = "Osnov_Zalbe", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected Zalba.OsnovZalbe osnovZalbe;
    @XmlElement(name = "Podnosilac", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected Podnosilac podnosilac;
    @XmlElement(name = "Adresa", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected TAdresa adresa;
    @XmlElement(name = "Datum_Zalbe", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected Zalba.DatumZalbe datumZalbe;
    @XmlElement(name = "Kontakt", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected Zalba.Kontakt kontakt;
    @XmlAttribute(name = "vocab")
    protected String vocab;
    @XmlAttribute(name = "about")
    protected String about;

    /**
     * Gets the value of the zalilac property.
     * 
     * @return
     *     possible object is
     *     {@link TLice }
     *     
     */
    public TPravnoLice getZalilac() {
        return zalilac;
    }

    /**
     * Sets the value of the zalilac property.
     * 
     * @param value
     *     allowed object is
     *     {@link TLice }
     *     
     */
    public void setZalilac(TPravnoLice value) {
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
     *     {@link Zalba.DatumZahteva }
     *     
     */
    public Zalba.DatumZahteva getDatumZahteva() {
        return datumZahteva;
    }

    /**
     * Sets the value of the datumZahteva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zalba.DatumZahteva }
     *     
     */
    public void setDatumZahteva(Zalba.DatumZahteva value) {
        this.datumZahteva = value;
    }

    /**
     * Gets the value of the osnovZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link Zalba.OsnovZalbe }
     *     
     */
    public Zalba.OsnovZalbe getOsnovZalbe() {
        return osnovZalbe;
    }

    /**
     * Sets the value of the osnovZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zalba.OsnovZalbe }
     *     
     */
    public void setOsnovZalbe(Zalba.OsnovZalbe value) {
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
     * Gets the value of the datumZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link Zalba.DatumZalbe }
     *     
     */
    public Zalba.DatumZalbe getDatumZalbe() {
        return datumZalbe;
    }

    /**
     * Sets the value of the datumZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zalba.DatumZalbe }
     *     
     */
    public void setDatumZalbe(Zalba.DatumZalbe value) {
        this.datumZalbe = value;
    }

    /**
     * Gets the value of the kontakt property.
     * 
     * @return
     *     possible object is
     *     {@link Zalba.Kontakt }
     *     
     */
    public Zalba.Kontakt getKontakt() {
        return kontakt;
    }

    /**
     * Sets the value of the kontakt property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zalba.Kontakt }
     *     
     */
    public void setKontakt(Zalba.Kontakt value) {
        this.kontakt = value;
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
    public static class DatumZahteva {

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
    public static class DatumZalbe {

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
    public static class Kontakt {

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
    public static class OsnovZalbe {

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
