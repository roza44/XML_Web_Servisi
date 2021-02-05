
package tim20.xml.sluzbenik.sluzbenikBek.model.Resenje;



import tim20.xml.sluzbenik.sluzbenikBek.model.Tipovi.TImePrezime;

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
 *         &lt;element name="Poverenik" type="{http://tipovi}TImePrezime" minOccurs="0"/&gt;
 *         &lt;element name="Podnosilac_zalbe" type="{http://tipovi}TImePrezime"/&gt;
 *         &lt;element name="Razlog"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.ftn.uns.ac.rs/resenje&gt;RazlogResenjaType"&gt;
 *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Organ_vlasti"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Datum_zahteva"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
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
    protected TImePrezime poverenik;
    @XmlElement(name = "Podnosilac_zalbe", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected TImePrezime podnosilacZalbe;
    @XmlElement(name = "Razlog", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected Razlog razlog;
    @XmlElement(name = "Organ_vlasti", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected OrganVlasti organVlasti;
    @XmlElement(name = "Datum_zahteva", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected DatumZahteva datumZahteva;
    @XmlElement(name = "Osnova_resenja", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected OsnovaResenja osnovaResenja;

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
     * Gets the value of the podnosilacZalbe property.
     *
     * @return
     *     possible object is
     *     {@link TImePrezime }
     *
     */
    public TImePrezime getPodnosilacZalbe() {
        return podnosilacZalbe;
    }

    /**
     * Sets the value of the podnosilacZalbe property.
     *
     * @param value
     *     allowed object is
     *     {@link TImePrezime }
     *
     */
    public void setPodnosilacZalbe(TImePrezime value) {
        this.podnosilacZalbe = value;
    }

    /**
     * Gets the value of the razlog property.
     *
     * @return
     *     possible object is
     *     {@link Razlog }
     *
     */
    public Razlog getRazlog() {
        return razlog;
    }

    /**
     * Sets the value of the razlog property.
     *
     * @param value
     *     allowed object is
     *     {@link Razlog }
     *
     */
    public void setRazlog(Razlog value) {
        this.razlog = value;
    }

    /**
     * Gets the value of the organVlasti property.
     *
     * @return
     *     possible object is
     *     {@link OrganVlasti }
     *
     */
    public OrganVlasti getOrganVlasti() {
        return organVlasti;
    }

    /**
     * Sets the value of the organVlasti property.
     *
     * @param value
     *     allowed object is
     *     {@link OrganVlasti }
     *
     */
    public void setOrganVlasti(OrganVlasti value) {
        this.organVlasti = value;
    }

    /**
     * Gets the value of the datumZahteva property.
     *
     * @return
     *     possible object is
     *     {@link DatumZahteva }
     *
     */
    public DatumZahteva getDatumZahteva() {
        return datumZahteva;
    }

    /**
     * Sets the value of the datumZahteva property.
     *
     * @param value
     *     allowed object is
     *     {@link DatumZahteva }
     *
     */
    public void setDatumZahteva(DatumZahteva value) {
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
    public static class OrganVlasti {

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
     *     &lt;extension base="&lt;http://www.ftn.uns.ac.rs/resenje&gt;RazlogResenjaType"&gt;
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
    public static class Razlog {

        @XmlValue
        protected RazlogResenjaType value;
        @XmlAttribute(name = "property")
        protected String property;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link RazlogResenjaType }
         *     
         */
        public RazlogResenjaType getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link RazlogResenjaType }
         *     
         */
        public void setValue(RazlogResenjaType value) {
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
