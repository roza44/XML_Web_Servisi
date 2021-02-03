
package tim20.xml.sluzbenik.sluzbenikBek.model.ZalbaNaOdluku;

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
     * Create an instance of {@link Resenje }
     * 
     */
    public Resenje createResenje() {
        return new Resenje();
    }

    /**
     * Create an instance of {@link Zalba }
     * 
     */
    public Zalba createZalba() {
        return new Zalba();
    }

    /**
     * Create an instance of {@link Podnosilac }
     * 
     */
    public Podnosilac createPodnosilac() {
        return new Podnosilac();
    }

    /**
     * Create an instance of {@link Resenje.DonosilacOdluke }
     * 
     */
    public Resenje.DonosilacOdluke createResenjeDonosilacOdluke() {
        return new Resenje.DonosilacOdluke();
    }

    /**
     * Create an instance of {@link Resenje.Broj }
     * 
     */
    public Resenje.Broj createResenjeBroj() {
        return new Resenje.Broj();
    }

    /**
     * Create an instance of {@link Resenje.Godina }
     * 
     */
    public Resenje.Godina createResenjeGodina() {
        return new Resenje.Godina();
    }

    /**
     * Create an instance of {@link Zalba.DatumZahteva }
     * 
     */
    public Zalba.DatumZahteva createZalbaDatumZahteva() {
        return new Zalba.DatumZahteva();
    }

    /**
     * Create an instance of {@link Zalba.OsnovZalbe }
     * 
     */
    public Zalba.OsnovZalbe createZalbaOsnovZalbe() {
        return new Zalba.OsnovZalbe();
    }

    /**
     * Create an instance of {@link Podnosilac.Ime }
     * 
     */
    public Podnosilac.Ime createPodnosilacIme() {
        return new Podnosilac.Ime();
    }

    /**
     * Create an instance of {@link Podnosilac.Prezime }
     * 
     */
    public Podnosilac.Prezime createPodnosilacPrezime() {
        return new Podnosilac.Prezime();
    }

    /**
     * Create an instance of {@link Zalba.DatumZalbe }
     * 
     */
    public Zalba.DatumZalbe createZalbaDatumZalbe() {
        return new Zalba.DatumZalbe();
    }

    /**
     * Create an instance of {@link Zalba.Kontakt }
     * 
     */
    public Zalba.Kontakt createZalbaKontakt() {
        return new Zalba.Kontakt();
    }

}
