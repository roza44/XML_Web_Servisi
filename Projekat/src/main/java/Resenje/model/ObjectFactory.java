
package Resenje.model;

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
     * Create an instance of {@link Poverenik }
     * 
     */
    public Poverenik createPoverenik() {
        return new Poverenik();
    }

    /**
     * Create an instance of {@link OsnovaResenja }
     * 
     */
    public OsnovaResenja createOsnovaResenja() {
        return new OsnovaResenja();
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
     * Create an instance of {@link Adresa }
     * 
     */
    public Adresa createAdresa() {
        return new Adresa();
    }

}
