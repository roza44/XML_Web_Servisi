
package tim20.xml.poverenik.poverenikBek.model.Tipovi;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the tipovi package. 
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


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: tipovi
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TFizickoLice }
     * 
     */
    public TFizickoLice createTFizickoLice() {
        return new TFizickoLice();
    }

    /**
     * Create an instance of {@link TPravnoLice }
     * 
     */
    public TPravnoLice createTPravnoLice() {
        return new TPravnoLice();
    }

    /**
     * Create an instance of {@link TImePrezime }
     * 
     */
    public TImePrezime createTImePrezime() {
        return new TImePrezime();
    }

    /**
     * Create an instance of {@link TAdresa }
     * 
     */
    public TAdresa createTAdresa() {
        return new TAdresa();
    }

    /**
     * Create an instance of {@link TFizickoLice.Ime }
     * 
     */
    public TFizickoLice.Ime createTFizickoLiceIme() {
        return new TFizickoLice.Ime();
    }

    /**
     * Create an instance of {@link TFizickoLice.Prezime }
     * 
     */
    public TFizickoLice.Prezime createTFizickoLicePrezime() {
        return new TFizickoLice.Prezime();
    }

    /**
     * Create an instance of {@link TPravnoLice.Naziv }
     * 
     */
    public TPravnoLice.Naziv createTPravnoLiceNaziv() {
        return new TPravnoLice.Naziv();
    }

    /**
     * Create an instance of {@link TImePrezime.Ime }
     * 
     */
    public TImePrezime.Ime createTImePrezimeIme() {
        return new TImePrezime.Ime();
    }

    /**
     * Create an instance of {@link TImePrezime.Prezime }
     * 
     */
    public TImePrezime.Prezime createTImePrezimePrezime() {
        return new TImePrezime.Prezime();
    }

}
