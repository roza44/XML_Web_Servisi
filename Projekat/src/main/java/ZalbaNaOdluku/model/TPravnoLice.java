
package ZalbaNaOdluku.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for TPravno_Lice complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TPravno_Lice"&gt;
 *   &lt;complexContent&gt;
 *     &lt;extension base="{http://www.ftn.uns.ac.rs/ZalbaNaOdluku}TZalilac"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Naziv" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/extension&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPravno_Lice", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", propOrder = {
    "naziv"
})
public class TPravnoLice
    extends TZalilac
{

    @XmlElement(name = "Naziv", namespace = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku", required = true)
    protected String naziv;

    /**
     * Gets the value of the naziv property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Sets the value of the naziv property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNaziv(String value) {
        this.naziv = value;
    }

    @Override
    public String toString() {
        return "TPravnoLice:" + "\n" +
                "\t" + "naziv=" + naziv + "\n" +
                "\t" + ", adresa=" + adresa + "\n";
    }
}
