
package tim20.xml.poverenik.poverenikBek.model.Resenje;


import tim20.xml.poverenik.poverenikBek.model.Tipovi.TAdresa;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rs.ac.uns.ftn.resenje package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Adresa_QNAME = new QName("http://www.ftn.uns.ac.rs/resenje", "Adresa");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rs.ac.uns.ftn.resenje
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Resenje }
     * 
     */
    public Resenje createResenje() {
        return new Resenje();
    }

    /**
     * Create an instance of {@link Uvod }
     * 
     */
    public Uvod createUvod() {
        return new Uvod();
    }

    /**
     * Create an instance of {@link Zakon }
     * 
     */
    public Zakon createZakon() {
        return new Zakon();
    }

    /**
     * Create an instance of {@link Obrazlozenje }
     * 
     */
    public Obrazlozenje createObrazlozenje() {
        return new Obrazlozenje();
    }

    /**
     * Create an instance of {@link Resenje.OdlukaResenja }
     * 
     */
    public Resenje.OdlukaResenja createResenjeOdlukaResenja() {
        return new Resenje.OdlukaResenja();
    }

    /**
     * Create an instance of {@link Resenje.BrResenja }
     * 
     */
    public Resenje.BrResenja createResenjeBrResenja() {
        return new Resenje.BrResenja();
    }

    /**
     * Create an instance of {@link Resenje.DatumResenja }
     * 
     */
    public Resenje.DatumResenja createResenjeDatumResenja() {
        return new Resenje.DatumResenja();
    }

    /**
     * Create an instance of {@link Uvod.Razlog }
     * 
     */
    public Uvod.Razlog createUvodRazlog() {
        return new Uvod.Razlog();
    }

    /**
     * Create an instance of {@link Uvod.OrganVlasti }
     * 
     */
    public Uvod.OrganVlasti createUvodOrganVlasti() {
        return new Uvod.OrganVlasti();
    }

    /**
     * Create an instance of {@link Uvod.DatumZahteva }
     * 
     */
    public Uvod.DatumZahteva createUvodDatumZahteva() {
        return new Uvod.DatumZahteva();
    }

    /**
     * Create an instance of {@link OsnovaResenja }
     * 
     */
    public OsnovaResenja createOsnovaResenja() {
        return new OsnovaResenja();
    }

    /**
     * Create an instance of {@link Zakon.Naziv }
     * 
     */
    public Zakon.Naziv createZakonNaziv() {
        return new Zakon.Naziv();
    }

    /**
     * Create an instance of {@link Zakon.BrojGlasnika }
     * 
     */
    public Zakon.BrojGlasnika createZakonBrojGlasnika() {
        return new Zakon.BrojGlasnika();
    }

    /**
     * Create an instance of {@link Obrazlozenje.DatumZalbe }
     * 
     */
    public Obrazlozenje.DatumZalbe createObrazlozenjeDatumZalbe() {
        return new Obrazlozenje.DatumZalbe();
    }

    /**
     * Create an instance of {@link Obrazlozenje.DatumProsledjivanjaZalbe }
     * 
     */
    public Obrazlozenje.DatumProsledjivanjaZalbe createObrazlozenjeDatumProsledjivanjaZalbe() {
        return new Obrazlozenje.DatumProsledjivanjaZalbe();
    }

    /**
     * Create an instance of {@link Obrazlozenje.Razlog }
     * 
     */
    public Obrazlozenje.Razlog createObrazlozenjeRazlog() {
        return new Obrazlozenje.Razlog();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TAdresa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link TAdresa }{@code >}
     */
    @XmlElementDecl(namespace = "http://www.ftn.uns.ac.rs/resenje", name = "Adresa")
    public JAXBElement<TAdresa> createAdresa(TAdresa value) {
        return new JAXBElement<TAdresa>(_Adresa_QNAME, TAdresa.class, null, value);
    }

}
