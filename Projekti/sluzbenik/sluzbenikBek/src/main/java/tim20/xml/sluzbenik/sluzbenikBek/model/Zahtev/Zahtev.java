
package tim20.xml.sluzbenik.sluzbenikBek.model.Zahtev;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="Primalac"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="Organ"&gt;
 *                     &lt;complexType&gt;
 *                       &lt;complexContent&gt;
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                           &lt;sequence&gt;
 *                             &lt;element name="Naziv"&gt;
 *                               &lt;complexType&gt;
 *                                 &lt;simpleContent&gt;
 *                                   &lt;extension base="&lt;http://tipovi&gt;TNaziv"&gt;
 *                                     &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *                                   &lt;/extension&gt;
 *                                 &lt;/simpleContent&gt;
 *                               &lt;/complexType&gt;
 *                             &lt;/element&gt;
 *                             &lt;element name="AdresaOrgana" type="{http://www.ftn.uns.ac.rs/zahtev}CTAdresa"/&gt;
 *                           &lt;/sequence&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/complexContent&gt;
 *                     &lt;/complexType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="Sadrzaj" type="{http://www.ftn.uns.ac.rs/zahtev}CTSadrzaj"/&gt;
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
    "primalac",
    "sadrzaj"
})
@XmlRootElement(name = "Zahtev", namespace = "http://www.ftn.uns.ac.rs/zahtev")
public class Zahtev {

    @XmlElement(name = "Primalac", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
    protected Primalac primalac;
    @XmlElement(name = "Sadrzaj", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
    protected CTSadrzaj sadrzaj;
    @XmlAttribute(name = "vocab")
    protected String vocab;
    @XmlAttribute(name = "about")
    protected String about;

    /**
     * Gets the value of the primalac property.
     *
     * @return
     *     possible object is
     *     {@link Primalac }
     *
     */
    public Primalac getPrimalac() {
        return primalac;
    }

    /**
     * Sets the value of the primalac property.
     *
     * @param value
     *     allowed object is
     *     {@link Primalac }
     *
     */
    public void setPrimalac(Primalac value) {
        this.primalac = value;
    }

    /**
     * Gets the value of the sadrzaj property.
     *
     * @return
     *     possible object is
     *     {@link CTSadrzaj }
     *
     */
    public CTSadrzaj getSadrzaj() {
        return sadrzaj;
    }

    /**
     * Sets the value of the sadrzaj property.
     *
     * @param value
     *     allowed object is
     *     {@link CTSadrzaj }
     *
     */
    public void setSadrzaj(CTSadrzaj value) {
        this.sadrzaj = value;
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
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="Organ"&gt;
     *           &lt;complexType&gt;
     *             &lt;complexContent&gt;
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *                 &lt;sequence&gt;
     *                   &lt;element name="Naziv"&gt;
     *                     &lt;complexType&gt;
     *                       &lt;simpleContent&gt;
     *                         &lt;extension base="&lt;http://tipovi&gt;TNaziv"&gt;
     *                           &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
     *                         &lt;/extension&gt;
     *                       &lt;/simpleContent&gt;
     *                     &lt;/complexType&gt;
     *                   &lt;/element&gt;
     *                   &lt;element name="AdresaOrgana" type="{http://www.ftn.uns.ac.rs/zahtev}CTAdresa"/&gt;
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
    @XmlType(name = "", propOrder = {
        "organ"
    })
    public static class Primalac {

        @XmlElement(name = "Organ", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
        protected Organ organ;

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
         * <p>Java class for anonymous complex type.
         *
         * <p>The following schema fragment specifies the expected content contained within this class.
         *
         * <pre>
         * &lt;complexType&gt;
         *   &lt;complexContent&gt;
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
         *       &lt;sequence&gt;
         *         &lt;element name="Naziv"&gt;
         *           &lt;complexType&gt;
         *             &lt;simpleContent&gt;
         *               &lt;extension base="&lt;http://tipovi&gt;TNaziv"&gt;
         *                 &lt;attribute name="property" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
         *               &lt;/extension&gt;
         *             &lt;/simpleContent&gt;
         *           &lt;/complexType&gt;
         *         &lt;/element&gt;
         *         &lt;element name="AdresaOrgana" type="{http://www.ftn.uns.ac.rs/zahtev}CTAdresa"/&gt;
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
            "naziv",
            "adresaOrgana"
        })
        public static class Organ {

            @XmlElement(name = "Naziv", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
            protected Naziv naziv;
            @XmlElement(name = "AdresaOrgana", namespace = "http://www.ftn.uns.ac.rs/zahtev", required = true)
            protected CTAdresa adresaOrgana;

            /**
             * Gets the value of the naziv property.
             *
             * @return
             *     possible object is
             *     {@link Naziv }
             *
             */
            public Naziv getNaziv() {
                return naziv;
            }

            /**
             * Sets the value of the naziv property.
             *
             * @param value
             *     allowed object is
             *     {@link Naziv }
             *
             */
            public void setNaziv(Naziv value) {
                this.naziv = value;
            }

            /**
             * Gets the value of the adresaOrgana property.
             * 
             * @return
             *     possible object is
             *     {@link CTAdresa }
             *     
             */
            public CTAdresa getAdresaOrgana() {
                return adresaOrgana;
            }

            /**
             * Sets the value of the adresaOrgana property.
             * 
             * @param value
             *     allowed object is
             *     {@link CTAdresa }
             *     
             */
            public void setAdresaOrgana(CTAdresa value) {
                this.adresaOrgana = value;
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
            public static class Naziv {

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

}
