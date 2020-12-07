
package Obavestenje.model;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the model package. 
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
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Obavestenje }
     * 
     */
    public Obavestenje createObavestenje() {
        return new Obavestenje();
    }

    /**
     * Create an instance of {@link Organ }
     * 
     */
    public Organ createOrgan() {
        return new Organ();
    }

    /**
     * Create an instance of {@link TrazenaInformacija }
     * 
     */
    public TrazenaInformacija createTrazenaInformacija() {
        return new TrazenaInformacija();
    }

    /**
     * Create an instance of {@link Uvid }
     * 
     */
    public Uvid createUvid() {
        return new Uvid();
    }

    /**
     * Create an instance of {@link Adresa }
     * 
     */
    public Adresa createAdresa() {
        return new Adresa();
    }

    /**
     * Create an instance of {@link Troskovi }
     * 
     */
    public Troskovi createTroskovi() {
        return new Troskovi();
    }

    /**
     * Create an instance of {@link Uplata }
     * 
     */
    public Uplata createUplata() {
        return new Uplata();
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

}
