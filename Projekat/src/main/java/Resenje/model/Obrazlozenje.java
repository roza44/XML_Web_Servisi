
package Resenje.model;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element name="Datum_zalbe" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Datum_prosledjivanja_zalbe" type="{http://www.w3.org/2001/XMLSchema}date"/&gt;
 *         &lt;element name="Razlog" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/&gt;
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
    "datumZalbe",
    "datumProsledjivanjaZalbe",
    "razlog"
})
@XmlRootElement(name = "Obrazlozenje", namespace = "http://www.ftn.uns.ac.rs/resenje")
public class Obrazlozenje {

    @XmlElement(name = "Datum_zalbe", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumZalbe;
    @XmlElement(name = "Datum_prosledjivanja_zalbe", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar datumProsledjivanjaZalbe;
    @XmlElement(name = "Razlog", namespace = "http://www.ftn.uns.ac.rs/resenje", required = true)
    protected List<String> razlog;

    /**
     * Gets the value of the datumZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumZalbe() {
        return datumZalbe;
    }

    /**
     * Sets the value of the datumZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumZalbe(XMLGregorianCalendar value) {
        this.datumZalbe = value;
    }

    /**
     * Gets the value of the datumProsledjivanjaZalbe property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDatumProsledjivanjaZalbe() {
        return datumProsledjivanjaZalbe;
    }

    /**
     * Sets the value of the datumProsledjivanjaZalbe property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDatumProsledjivanjaZalbe(XMLGregorianCalendar value) {
        this.datumProsledjivanjaZalbe = value;
    }

    /**
     * Gets the value of the razlog property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the razlog property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRazlog().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getRazlog() {
        if (razlog == null) {
            razlog = new ArrayList<String>();
        }
        return this.razlog;
    }

    @Override
    public String toString() {
        return "Obrazlozenje: " + "\n" +
                "\t" + "datumZalbe=" + datumZalbe +",\n" +
                "\t" + " datumProsledjivanjaZalbe=" + datumProsledjivanjaZalbe +",\n" +
                "\t" + " razlog=" + razlog;
    }
}
