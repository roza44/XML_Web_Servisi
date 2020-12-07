
package model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="Donosilac_Odluke" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="Broj" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="Godina" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
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
    "donosilacOdluke",
    "broj",
    "godina"
})
@XmlRootElement(name = "Resenje", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku")
public class Resenje {

    @XmlElement(name = "Donosilac_Odluke", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected String donosilacOdluke;
    @XmlElement(name = "Broj", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku")
    protected int broj;
    @XmlElement(name = "Godina", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku")
    protected int godina;

    /**
     * Gets the value of the donosilacOdluke property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDonosilacOdluke() {
        return donosilacOdluke;
    }

    /**
     * Sets the value of the donosilacOdluke property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDonosilacOdluke(String value) {
        this.donosilacOdluke = value;
    }

    /**
     * Gets the value of the broj property.
     * 
     */
    public int getBroj() {
        return broj;
    }

    /**
     * Sets the value of the broj property.
     * 
     */
    public void setBroj(int value) {
        this.broj = value;
    }

    /**
     * Gets the value of the godina property.
     * 
     */
    public int getGodina() {
        return godina;
    }

    /**
     * Sets the value of the godina property.
     * 
     */
    public void setGodina(int value) {
        this.godina = value;
    }

}
