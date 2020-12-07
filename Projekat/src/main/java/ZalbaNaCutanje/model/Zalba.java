
package ZalbaNaCutanje.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlIDREF;
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
 *         &lt;element name="Poverenik" type="{http://www.ftn.uns.ac.rs/zalbacutanje}TPravno_lice"/&gt;
 *         &lt;element name="Naziv_organa"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;minLength value="1"/&gt;
 *               &lt;maxLength value="100"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Razlog_zalbe"&gt;
 *           &lt;simpleType&gt;
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *               &lt;enumeration value="Organ vlasti nije postupio u zakonskom roku"/&gt;
 *               &lt;enumeration value="Organ vlasti nije postupio u celosti u zakonskom roku"/&gt;
 *             &lt;/restriction&gt;
 *           &lt;/simpleType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Trazene_informacije_o_zahtevu"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Datum_podnosenja" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *                   &lt;element name="Podaci_o_zahtevu_i_informacijama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Kopija_zahteva" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="Kopija_odgovora_na_zahtev" type="{http://www.w3.org/2001/XMLSchema}IDREF" minOccurs="0"/&gt;
 *         &lt;element name="Datum_podnosenja_zalbe" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Podnosilac_zalbe"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;extension base="{http://www.ftn.uns.ac.rs/zalbacutanje}TFizicko_lice"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Ostali_kontakt_podaci" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/extension&gt;
 *             &lt;/complexContent&gt;
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
    protected String nazivOrgana;
    @XmlElement(name = "Razlog_zalbe", namespace = "http://www.ftn.uns.ac.rs/zalbacutanje", required = true)
    protected String razlogZalbe;
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
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumPodnosenjaZalbe;
    @XmlElement(name = "Podnosilac_zalbe", namespace = "http://www.ftn.uns.ac.rs/zalbacutanje", required = true)
    protected Zalba.PodnosilacZalbe podnosilacZalbe;

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
     *     {@link String }
     *     
     */
    public String getNazivOrgana() {
        return nazivOrgana;
    }

    /**
     * Sets the value of the nazivOrgana property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNazivOrgana(String value) {
        this.nazivOrgana = value;
    }

    /**
     * Gets the value of the razlogZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRazlogZalbe() {
        return razlogZalbe;
    }

    /**
     * Sets the value of the razlogZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRazlogZalbe(String value) {
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
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumPodnosenjaZalbe() {
        return datumPodnosenjaZalbe;
    }

    /**
     * Sets the value of the datumPodnosenjaZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumPodnosenjaZalbe(XMLGregorianCalendar value) {
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
    
    @Override
    public String toString() {
        return "Zalba na cutanje:" + "\n" +
                "\t" + "poverenik=" + poverenik + "\n" +
                "\t" + ", nazivOrgana=" + nazivOrgana + "\n" +
                "\t" + ", razlogZalbe=" + razlogZalbe + "\n" +
                "\t" + ", trazeneInformacijeOZahtevu=" + trazeneInformacijeOZahtevu + "\n" +
                "\t" + ", kopijaZahteva=" + kopijaZahteva + "\n" +
                "\t" + ", kopijaOdgovoraNaZahtev=" + kopijaOdgovoraNaZahtev + "\n" +
                "\t" + ", datumPodnosenjaZalbe=" + datumPodnosenjaZalbe + "\n" +
                "\t" + ", podnosilacZalbe=" + podnosilacZalbe + '\'' + "\n";
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;extension base="{http://www.ftn.uns.ac.rs/zalbacutanje}TFizicko_lice"&gt;
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
        
        @Override
        public String toString() {
            return "PodnosilacZalbe:" + "\n" +
                    "\t" + "ime=" + ime + "\n" +
                    "\t" + ", prezime=" + prezime + "\n" +
                    "\t" + ", adresa=" + adresa + "\n" +
                    "\t" + ", ostaliKontaktPodaci=" + ostaliKontaktPodaci;
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
     *         &lt;element name="Datum_podnosenja" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
     *         &lt;element name="Podaci_o_zahtevu_i_informacijama" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
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
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar datumPodnosenja;
        @XmlElement(name = "Podaci_o_zahtevu_i_informacijama", namespace = "http://www.ftn.uns.ac.rs/zalbacutanje", required = true)
        protected String podaciOZahtevuIInformacijama;

        /**
         * Gets the value of the datumPodnosenja property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDatumPodnosenja() {
            return datumPodnosenja;
        }

        /**
         * Sets the value of the datumPodnosenja property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDatumPodnosenja(XMLGregorianCalendar value) {
            this.datumPodnosenja = value;
        }

        /**
         * Gets the value of the podaciOZahtevuIInformacijama property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPodaciOZahtevuIInformacijama() {
            return podaciOZahtevuIInformacijama;
        }

        /**
         * Sets the value of the podaciOZahtevuIInformacijama property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPodaciOZahtevuIInformacijama(String value) {
            this.podaciOZahtevuIInformacijama = value;
        }
        
        @Override
        public String toString() {
            return "TrazeneInformacijeOZahtevu:" + "\n" +
                    "\t" + "datumPodnosenja=" + datumPodnosenja + "\n" +
                    "\t" + ", podaciOZahtevuIInformacijama=" + podaciOZahtevuIInformacijama + "\n";
        }

    }

}
