
package tim20.xml.poverenik.poverenikBek.model.Zahtev;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for CTIzbor complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="CTIzbor"&gt;
 *   &lt;simpleContent&gt;
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema&gt;string"&gt;
 *       &lt;attribute name="Broj" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" /&gt;
 *       &lt;attribute name="Odabran" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" /&gt;
 *       &lt;attribute name="Nacin" type="{http://www.w3.org/2001/XMLSchema}string" /&gt;
 *     &lt;/extension&gt;
 *   &lt;/simpleContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CTIzbor", namespace = "http://www.ftn.uns.ac.rs/zahtev", propOrder = {
    "value"
})
public class CTIzbor {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Broj", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger broj;
    @XmlAttribute(name = "Odabran", required = true)
    protected boolean odabran;
    @XmlAttribute(name = "Nacin")
    protected String nacin;

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
     * Gets the value of the broj property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getBroj() {
        return broj;
    }

    /**
     * Sets the value of the broj property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setBroj(BigInteger value) {
        this.broj = value;
    }

    /**
     * Gets the value of the odabran property.
     * 
     */
    public boolean isOdabran() {
        return odabran;
    }

    /**
     * Sets the value of the odabran property.
     * 
     */
    public void setOdabran(boolean value) {
        this.odabran = value;
    }

    /**
     * Gets the value of the nacin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNacin() {
        return nacin;
    }

    /**
     * Sets the value of the nacin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNacin(String value) {
        this.nacin = value;
    }

}
