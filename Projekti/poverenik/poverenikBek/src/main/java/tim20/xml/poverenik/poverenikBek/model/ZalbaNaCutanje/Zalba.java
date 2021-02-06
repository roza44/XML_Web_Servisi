
package tim20.xml.poverenik.poverenikBek.model.ZalbaNaCutanje;

import tim20.xml.poverenik.poverenikBek.model.Tipovi.TFizickoLice;
import tim20.xml.poverenik.poverenikBek.model.Tipovi.TPravnoLice;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
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
 *         &lt;element name="Poverenik" type="{http://tipovi}TPravno_lice"/&gt;
 *         &lt;element name="Naziv_organa"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://tipovi&gt;TNaziv"&gt;
 *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Razlog_zalbe"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.ftn.uns.ac.rs/zalbacutanje&gt;TRazlogZalbe"&gt;
 *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Trazene_informacije_o_zahtevu"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Datum_podnosenja"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *                           &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="Podaci_o_zahtevu_i_informacijama"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;simpleContent&gt;
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *                           &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                         &lt;/extension&gt;
 *                       &lt;/simpleContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Kopija_zahteva" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="Kopija_odgovora_na_zahtev" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="Datum_podnosenja_zalbe"&gt;
 *           &lt;complexType&gt;
 *             &lt;simpleContent&gt;
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
 *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *               &lt;/extension&gt;
 *             &lt;/simpleContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Podnosilac_zalbe"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://tipovi}TFizicko_lice"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Ostali_kontakt_podaci" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
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
    "poverenik",
    "nazivOrgana",
    "razlogZalbe",
    "trazeneInformacijeOZahtevu",
    "kopijaZahteva",
    "kopijaOdgovoraNaZahtev",
    "datumPodnosenjaZalbe",
    "podnosilacZalbe"
})
@XmlRootElement(name = "Zalba", namespace = "http://www.ftn.uns.ac.rs/zalbacutanje")
public class Zalba {

    @XmlElement(name = "Poverenik", namespace = "http://www.ftn.uns.ac.rs/zalbacutanje", required = true)
    protected TPravnoLice poverenik;
    @XmlElement(name = "Naziv_organa", namespace = "http://www.ftn.uns.ac.rs/zalbacutanje", required = true)
    protected Zalba.NazivOrgana nazivOrgana;
    @XmlElement(name = "Razlog_zalbe", namespace = "http://www.ftn.uns.ac.rs/zalbacutanje", required = true)
    protected Zalba.RazlogZalbe razlogZalbe;
    @XmlElement(name = "Trazene_informacije_o_zahtevu", namespace = "http://www.ftn.uns.ac.rs/zalbacutanje", required = true)
    protected Zalba.TrazeneInformacijeOZahtevu trazeneInformacijeOZahtevu;
    @XmlElement(name = "Kopija_zahteva", namespace = "http://www.ftn.uns.ac.rs/zalbacutanje")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object kopijaZahteva;
    @XmlElement(name = "Kopija_odgovora_na_zahtev", namespace = "http://www.ftn.uns.ac.rs/zalbacutanje")
    @XmlIDREF
    @XmlSchemaType(name = "IDREF")
    protected Object kopijaOdgovoraNaZahtev;
    @XmlElement(name = "Datum_podnosenja_zalbe", namespace = "http://www.ftn.uns.ac.rs/zalbacutanje", required = true)
    protected Zalba.DatumPodnosenjaZalbe datumPodnosenjaZalbe;
    @XmlElement(name = "Podnosilac_zalbe", namespace = "http://www.ftn.uns.ac.rs/zalbacutanje", required = true)
    protected Zalba.PodnosilacZalbe podnosilacZalbe;
    @XmlAttribute(name = "vocab")
    protected String vocab;
    @XmlAttribute(name = "about")
    protected String about;
    @XmlAttribute(name = "author")
    protected String author;

    /**
     * Gets the value of the poverenik property.
     * 
     * @return
     *     possible object is
     *     {@link TPravnoLice }
     *     
     */
    public TPravnoLice getPoverenik() {
        return poverenik;
    }

    /**
     * Sets the value of the poverenik property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPravnoLice }
     *     
     */
    public void setPoverenik(TPravnoLice value) {
        this.poverenik = value;
    }

    /**
     * Gets the value of the nazivOrgana property.
     * 
     * @return
     *     possible object is
     *     {@link Zalba.NazivOrgana }
     *     
     */
    public Zalba.NazivOrgana getNazivOrgana() {
        return nazivOrgana;
    }

    /**
     * Sets the value of the nazivOrgana property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zalba.NazivOrgana }
     *     
     */
    public void setNazivOrgana(Zalba.NazivOrgana value) {
        this.nazivOrgana = value;
    }

    /**
     * Gets the value of the razlogZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link Zalba.RazlogZalbe }
     *     
     */
    public Zalba.RazlogZalbe getRazlogZalbe() {
        return razlogZalbe;
    }

    /**
     * Sets the value of the razlogZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zalba.RazlogZalbe }
     *     
     */
    public void setRazlogZalbe(Zalba.RazlogZalbe value) {
        this.razlogZalbe = value;
    }

    /**
     * Gets the value of the trazeneInformacijeOZahtevu property.
     * 
     * @return
     *     possible object is
     *     {@link Zalba.TrazeneInformacijeOZahtevu }
     *     
     */
    public Zalba.TrazeneInformacijeOZahtevu getTrazeneInformacijeOZahtevu() {
        return trazeneInformacijeOZahtevu;
    }

    /**
     * Sets the value of the trazeneInformacijeOZahtevu property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zalba.TrazeneInformacijeOZahtevu }
     *     
     */
    public void setTrazeneInformacijeOZahtevu(Zalba.TrazeneInformacijeOZahtevu value) {
        this.trazeneInformacijeOZahtevu = value;
    }

    /**
     * Gets the value of the kopijaZahteva property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getKopijaZahteva() {
        return kopijaZahteva;
    }

    /**
     * Sets the value of the kopijaZahteva property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setKopijaZahteva(Object value) {
        this.kopijaZahteva = value;
    }

    /**
     * Gets the value of the kopijaOdgovoraNaZahtev property.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getKopijaOdgovoraNaZahtev() {
        return kopijaOdgovoraNaZahtev;
    }

    /**
     * Sets the value of the kopijaOdgovoraNaZahtev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setKopijaOdgovoraNaZahtev(Object value) {
        this.kopijaOdgovoraNaZahtev = value;
    }

    /**
     * Gets the value of the datumPodnosenjaZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link Zalba.DatumPodnosenjaZalbe }
     *     
     */
    public Zalba.DatumPodnosenjaZalbe getDatumPodnosenjaZalbe() {
        return datumPodnosenjaZalbe;
    }

    /**
     * Sets the value of the datumPodnosenjaZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zalba.DatumPodnosenjaZalbe }
     *     
     */
    public void setDatumPodnosenjaZalbe(Zalba.DatumPodnosenjaZalbe value) {
        this.datumPodnosenjaZalbe = value;
    }

    /**
     * Gets the value of the podnosilacZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link Zalba.PodnosilacZalbe }
     *     
     */
    public Zalba.PodnosilacZalbe getPodnosilacZalbe() {
        return podnosilacZalbe;
    }

    /**
     * Sets the value of the podnosilacZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link Zalba.PodnosilacZalbe }
     *     
     */
    public void setPodnosilacZalbe(Zalba.PodnosilacZalbe value) {
        this.podnosilacZalbe = value;
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

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String value){
        this.author = value;
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
    public static class DatumPodnosenjaZalbe {

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
     *     &lt;extension base="&lt;http://tipovi&gt;TNaziv"&gt;
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
    public static class NazivOrgana {

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
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://tipovi}TFizicko_lice"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Ostali_kontakt_podaci" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/extension&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ostaliKontaktPodaci"
    })
    public static class PodnosilacZalbe
        extends TFizickoLice
    {

        @XmlElement(name = "Ostali_kontakt_podaci", namespace = "http://www.ftn.uns.ac.rs/zalbacutanje", required = true)
        protected String ostaliKontaktPodaci;

        /**
         * Gets the value of the ostaliKontaktPodaci property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOstaliKontaktPodaci() {
            return ostaliKontaktPodaci;
        }

        /**
         * Sets the value of the ostaliKontaktPodaci property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOstaliKontaktPodaci(String value) {
            this.ostaliKontaktPodaci = value;
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
     *     &lt;extension base="&lt;http://www.ftn.uns.ac.rs/zalbacutanje&gt;TRazlogZalbe"&gt;
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
    public static class RazlogZalbe {

        @XmlValue
        protected TRazlogZalbe value;
        @XmlAttribute(name = "property")
        protected String property;

        /**
         * Gets the value of the value property.
         * 
         * @return
         *     possible object is
         *     {@link TRazlogZalbe }
         *     
         */
        public TRazlogZalbe getValue() {
            return value;
        }

        /**
         * Sets the value of the value property.
         * 
         * @param value
         *     allowed object is
         *     {@link TRazlogZalbe }
         *     
         */
        public void setValue(TRazlogZalbe value) {
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Datum_podnosenja"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;date"&gt;
     *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="Podaci_o_zahtevu_i_informacijama"&gt;
     *           &lt;complexType&gt;
     *             &lt;simpleContent&gt;
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
     *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *               &lt;/extension&gt;
     *             &lt;/simpleContent&gt;
     *           &lt;/complexType&gt;
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
        "datumPodnosenja",
        "podaciOZahtevuIInformacijama"
    })
    public static class TrazeneInformacijeOZahtevu {

        @XmlElement(name = "Datum_podnosenja", namespace = "http://www.ftn.uns.ac.rs/zalbacutanje", required = true)
        protected Zalba.TrazeneInformacijeOZahtevu.DatumPodnosenja datumPodnosenja;
        @XmlElement(name = "Podaci_o_zahtevu_i_informacijama", namespace = "http://www.ftn.uns.ac.rs/zalbacutanje", required = true)
        protected Zalba.TrazeneInformacijeOZahtevu.PodaciOZahtevuIInformacijama podaciOZahtevuIInformacijama;

        /**
         * Gets the value of the datumPodnosenja property.
         * 
         * @return
         *     possible object is
         *     {@link Zalba.TrazeneInformacijeOZahtevu.DatumPodnosenja }
         *     
         */
        public Zalba.TrazeneInformacijeOZahtevu.DatumPodnosenja getDatumPodnosenja() {
            return datumPodnosenja;
        }

        /**
         * Sets the value of the datumPodnosenja property.
         * 
         * @param value
         *     allowed object is
         *     {@link Zalba.TrazeneInformacijeOZahtevu.DatumPodnosenja }
         *     
         */
        public void setDatumPodnosenja(Zalba.TrazeneInformacijeOZahtevu.DatumPodnosenja value) {
            this.datumPodnosenja = value;
        }

        /**
         * Gets the value of the podaciOZahtevuIInformacijama property.
         * 
         * @return
         *     possible object is
         *     {@link Zalba.TrazeneInformacijeOZahtevu.PodaciOZahtevuIInformacijama }
         *     
         */
        public Zalba.TrazeneInformacijeOZahtevu.PodaciOZahtevuIInformacijama getPodaciOZahtevuIInformacijama() {
            return podaciOZahtevuIInformacijama;
        }

        /**
         * Sets the value of the podaciOZahtevuIInformacijama property.
         * 
         * @param value
         *     allowed object is
         *     {@link Zalba.TrazeneInformacijeOZahtevu.PodaciOZahtevuIInformacijama }
         *     
         */
        public void setPodaciOZahtevuIInformacijama(Zalba.TrazeneInformacijeOZahtevu.PodaciOZahtevuIInformacijama value) {
            this.podaciOZahtevuIInformacijama = value;
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
        public static class DatumPodnosenja {

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
        public static class PodaciOZahtevuIInformacijama {

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

}
