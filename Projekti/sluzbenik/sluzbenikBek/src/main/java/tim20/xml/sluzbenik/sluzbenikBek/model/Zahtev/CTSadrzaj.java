
package tim20.xml.sluzbenik.sluzbenikBek.model.Zahtev;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for CTSadrzaj complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTSadrzaj"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Naslov" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Telo"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Paragraf"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Zakon" type="{http://www.ftn.uns.ac.rs/zahtev}CTZakon"/&gt;
 *                             &lt;element name="SluzbeniGlasnik" type="{http://www.ftn.uns.ac.rs/zahtev}CTSluzbeniGlasnik"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="IzboriZahteva" type="{http://www.ftn.uns.ac.rs/zahtev}CTIzboriZahteva"/&gt;
 *                   &lt;element name="Informacije"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="PodaciOZahtevu" type="{http://www.ftn.uns.ac.rs/zahtev}CTPodaciOZahtevu"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
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
@XmlType(name = "CTSadrzaj", namespace = "http://www.ftn.uns.ac.rs/zahtev", propOrder = {
    "naslov",
    "telo"
})
public class CTSadrzaj {

    @XmlElement(name = "Naslov", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
    protected String naslov;
    @XmlElement(name = "Telo", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
    protected Telo telo;

    /**
     * Gets the value of the naslov property.
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getNaslov() {
        return naslov;
    }

    /**
     * Sets the value of the naslov property.
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setNaslov(String value) {
        this.naslov = value;
    }

    /**
     * Gets the value of the telo property.
     *
     * @return
     *     possible object is
     *     {@link Telo }
     *
     */
    public Telo getTelo() {
        return telo;
    }

    /**
     * Sets the value of the telo property.
     *
     * @param value
     *     allowed object is
     *     {@link Telo }
     *
     */
    public void setTelo(Telo value) {
        this.telo = value;
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
     *         &lt;element name="Paragraf"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Zakon" type="{http://www.ftn.uns.ac.rs/zahtev}CTZakon"/&gt;
     *                   &lt;element name="SluzbeniGlasnik" type="{http://www.ftn.uns.ac.rs/zahtev}CTSluzbeniGlasnik"/&gt;
     *                 &lt;/sequence&gt;
     *               &lt;/restriction&gt;
     *             &lt;/complexContent&gt;
     *           &lt;/complexType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="IzboriZahteva" type="{http://www.ftn.uns.ac.rs/zahtev}CTIzboriZahteva"/&gt;
     *         &lt;element name="Informacije"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;minLength value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="PodaciOZahtevu" type="{http://www.ftn.uns.ac.rs/zahtev}CTPodaciOZahtevu"/&gt;
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
        "paragraf",
        "izboriZahteva",
        "informacije",
        "podaciOZahtevu"
    })
    public static class Telo {

        @XmlElement(name = "Paragraf", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
        protected Paragraf paragraf;
        @XmlElement(name = "IzboriZahteva", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
        protected CTIzboriZahteva izboriZahteva;
        @XmlElement(name = "Informacije", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
        protected String informacije;
        @XmlElement(name = "PodaciOZahtevu", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
        protected CTPodaciOZahtevu podaciOZahtevu;

        /**
         * Gets the value of the paragraf property.
         *
         * @return
         *     possible object is
         *     {@link Paragraf }
         *
         */
        public Paragraf getParagraf() {
            return paragraf;
        }

        /**
         * Sets the value of the paragraf property.
         *
         * @param value
         *     allowed object is
         *     {@link Paragraf }
         *
         */
        public void setParagraf(Paragraf value) {
            this.paragraf = value;
        }

        /**
         * Gets the value of the izboriZahteva property.
         * 
         * @return
         *     possible object is
         *     {@link CTIzboriZahteva }
         *     
         */
        public CTIzboriZahteva getIzboriZahteva() {
            return izboriZahteva;
        }

        /**
         * Sets the value of the izboriZahteva property.
         * 
         * @param value
         *     allowed object is
         *     {@link CTIzboriZahteva }
         *     
         */
        public void setIzboriZahteva(CTIzboriZahteva value) {
            this.izboriZahteva = value;
        }

        /**
         * Gets the value of the informacije property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInformacije() {
            return informacije;
        }

        /**
         * Sets the value of the informacije property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInformacije(String value) {
            this.informacije = value;
        }

        /**
         * Gets the value of the podaciOZahtevu property.
         * 
         * @return
         *     possible object is
         *     {@link CTPodaciOZahtevu }
         *     
         */
        public CTPodaciOZahtevu getPodaciOZahtevu() {
            return podaciOZahtevu;
        }

        /**
         * Sets the value of the podaciOZahtevu property.
         * 
         * @param value
         *     allowed object is
         *     {@link CTPodaciOZahtevu }
         *     
         */
        public void setPodaciOZahtevu(CTPodaciOZahtevu value) {
            this.podaciOZahtevu = value;
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
         *         &lt;element name="Zakon" type="{http://www.ftn.uns.ac.rs/zahtev}CTZakon"/&gt;
         *         &lt;element name="SluzbeniGlasnik" type="{http://www.ftn.uns.ac.rs/zahtev}CTSluzbeniGlasnik"/&gt;
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
            "zakon",
            "sluzbeniGlasnik"
        })
        public static class Paragraf {

            @XmlElement(name = "Zakon", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
            protected CTZakon zakon;
            @XmlElement(name = "SluzbeniGlasnik", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
            protected CTSluzbeniGlasnik sluzbeniGlasnik;

            /**
             * Gets the value of the zakon property.
             * 
             * @return
             *     possible object is
             *     {@link CTZakon }
             *     
             */
            public CTZakon getZakon() {
                return zakon;
            }

            /**
             * Sets the value of the zakon property.
             * 
             * @param value
             *     allowed object is
             *     {@link CTZakon }
             *     
             */
            public void setZakon(CTZakon value) {
                this.zakon = value;
            }

            /**
             * Gets the value of the sluzbeniGlasnik property.
             * 
             * @return
             *     possible object is
             *     {@link CTSluzbeniGlasnik }
             *     
             */
            public CTSluzbeniGlasnik getSluzbeniGlasnik() {
                return sluzbeniGlasnik;
            }

            /**
             * Sets the value of the sluzbeniGlasnik property.
             * 
             * @param value
             *     allowed object is
             *     {@link CTSluzbeniGlasnik }
             *     
             */
            public void setSluzbeniGlasnik(CTSluzbeniGlasnik value) {
                this.sluzbeniGlasnik = value;
            }

        }

    }

}
