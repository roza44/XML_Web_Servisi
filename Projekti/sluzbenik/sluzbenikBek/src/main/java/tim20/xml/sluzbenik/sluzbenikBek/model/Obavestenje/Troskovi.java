
package tim20.xml.sluzbenik.sluzbenikBek.model.Obavestenje;

import javax.xml.bind.annotation.*;
import java.math.BigDecimal;


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
 *         &lt;element name="A4_Cena" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="A3_Cena" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="CD_Cena" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Disketa_Cena" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="DVD_Cena" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Audio_Kaseta_Cena" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="Video_Kaseta_Cena" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
 *         &lt;element name="EDokumenta_Cena" type="{http://www.w3.org/2001/XMLSchema}decimal"/&gt;
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
    "a4Cena",
    "a3Cena",
    "cdCena",
    "disketaCena",
    "dvdCena",
    "audioKasetaCena",
    "videoKasetaCena",
    "eDokumentaCena"
})
@XmlRootElement(name = "Troskovi", namespace = "http://www.ftn.uns.ac.rs/obavestenje")
public class Troskovi {

    @XmlElement(name = "A4_Cena", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected BigDecimal a4Cena;
    @XmlElement(name = "A3_Cena", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected BigDecimal a3Cena;
    @XmlElement(name = "CD_Cena", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected BigDecimal cdCena;
    @XmlElement(name = "Disketa_Cena", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected BigDecimal disketaCena;
    @XmlElement(name = "DVD_Cena", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected BigDecimal dvdCena;
    @XmlElement(name = "Audio_Kaseta_Cena", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected BigDecimal audioKasetaCena;
    @XmlElement(name = "Video_Kaseta_Cena", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected BigDecimal videoKasetaCena;
    @XmlElement(name = "EDokumenta_Cena", namespace = "http://www.ftn.uns.ac.rs/obavestenje", required = true)
    protected BigDecimal eDokumentaCena;

    /**
     * Gets the value of the a4Cena property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getA4Cena() {
        return a4Cena;
    }

    /**
     * Sets the value of the a4Cena property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setA4Cena(BigDecimal value) {
        this.a4Cena = value;
    }

    /**
     * Gets the value of the a3Cena property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getA3Cena() {
        return a3Cena;
    }

    /**
     * Sets the value of the a3Cena property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setA3Cena(BigDecimal value) {
        this.a3Cena = value;
    }

    /**
     * Gets the value of the cdCena property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getCDCena() {
        return cdCena;
    }

    /**
     * Sets the value of the cdCena property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setCDCena(BigDecimal value) {
        this.cdCena = value;
    }

    /**
     * Gets the value of the disketaCena property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDisketaCena() {
        return disketaCena;
    }

    /**
     * Sets the value of the disketaCena property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDisketaCena(BigDecimal value) {
        this.disketaCena = value;
    }

    /**
     * Gets the value of the dvdCena property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getDVDCena() {
        return dvdCena;
    }

    /**
     * Sets the value of the dvdCena property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setDVDCena(BigDecimal value) {
        this.dvdCena = value;
    }

    /**
     * Gets the value of the audioKasetaCena property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAudioKasetaCena() {
        return audioKasetaCena;
    }

    /**
     * Sets the value of the audioKasetaCena property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAudioKasetaCena(BigDecimal value) {
        this.audioKasetaCena = value;
    }

    /**
     * Gets the value of the videoKasetaCena property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getVideoKasetaCena() {
        return videoKasetaCena;
    }

    /**
     * Sets the value of the videoKasetaCena property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setVideoKasetaCena(BigDecimal value) {
        this.videoKasetaCena = value;
    }

    /**
     * Gets the value of the eDokumentaCena property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEDokumentaCena() {
        return eDokumentaCena;
    }

    /**
     * Sets the value of the eDokumentaCena property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEDokumentaCena(BigDecimal value) {
        this.eDokumentaCena = value;
    }

}
