
package tim20.xml.poverenik.poverenikBek.model.Tipovi;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for TPravno_lice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPravno_lice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://tipovi}TLice"&gt;
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
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
//@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(namespace = "http://tipovi", propOrder = {
    "naziv",
        "adresa"
})
@XmlRootElement
public class TPravnoLice
    extends TLice
{

    @XmlElement(name = "Naziv", namespace = "http://tipovi", required = true)
    protected TPravnoLice.Naziv naziv;

    /**
     * Gets the value of the naziv property.
     * 
     * @return
     *     possible object is
     *     {@link TPravnoLice.Naziv }
     *     
     */
    public TPravnoLice.Naziv getNaziv() {
        return naziv;
    }

    /**
     * Sets the value of the naziv property.
     * 
     * @param value
     *     allowed object is
     *     {@link TPravnoLice.Naziv }
     *     
     */
    public void setNaziv(TPravnoLice.Naziv value) {
        this.naziv = value;
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
