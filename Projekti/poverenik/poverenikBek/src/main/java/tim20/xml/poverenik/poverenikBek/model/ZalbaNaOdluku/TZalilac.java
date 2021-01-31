
package tim20.xml.poverenik.poverenikBek.model.ZalbaNaOdluku;

import javax.xml.bind.annotation.*;


/**
 * <p>Java class for TZalilac complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TZalilac"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element ref="{http://www.ftn.uns.ac.rs/ZalbaNaOdluku}Adresa"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TZalilac", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", propOrder = {
    "adresa"
})
@XmlSeeAlso({
    TFizickoLice.class,
    TPravnoLice.class
})
public abstract class TZalilac {

    @XmlElement(name = "Adresa", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected Adresa adresa;

    /**
     * Gets the value of the adresa property.
     * 
     * @return
     *     possible object is
     *     {@link Adresa }
     *     
     */
    public Adresa getAdresa() {
        return adresa;
    }

    /**
     * Sets the value of the adresa property.
     * 
     * @param value
     *     allowed object is
     *     {@link Adresa }
     *     
     */
    public void setAdresa(Adresa value) {
        this.adresa = value;
    }

}
