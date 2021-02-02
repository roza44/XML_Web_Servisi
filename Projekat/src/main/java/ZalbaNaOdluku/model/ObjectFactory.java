
package ZalbaNaOdluku.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rs.ac.uns.ftn.zalbanaodluku package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rs.ac.uns.ftn.zalbanaodluku
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link TPravnoLice }
     * 
     */
    public TPravnoLice createTPravnoLice() {
        return new TPravnoLice();
    }

    /**
     * Create an instance of {@link TFizickoLice }
     * 
     */
    public TFizickoLice createTFizickoLice() {
        return new TFizickoLice();
    }

    /**
     * Create an instance of {@link Zalba }
     * 
     */
    public Zalba createZalba() {
        return new Zalba();
    }

    /**
     * Create an instance of {@link Resenje }
     * 
     */
    public Resenje createResenje() {
        return new Resenje();
    }

    /**
     * Create an instance of {@link Podnosilac }
     * 
     */
    public Podnosilac createPodnosilac() {
        return new Podnosilac();
    }

    /**
     * Create an instance of {@link Adresa }
     * 
     */
    public Adresa createAdresa() {
        return new Adresa();
    }

    /**
     * Create an instance of {@link TPravnoLice.Naziv }
     * 
     */
    public TPravnoLice.Naziv createTPravnoLiceNaziv() {
        return new TPravnoLice.Naziv();
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

}
