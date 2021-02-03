package tim20.xml.poverenik.poverenikBek.repository.util;

import java.util.HashMap;
import java.util.LinkedHashMap;

import javax.xml.bind.annotation.XmlTransient;

import com.sun.xml.bind.marshaller.NamespacePrefixMapper;

@XmlTransient
public class NPMapper extends NamespacePrefixMapper {

    private HashMap<String, String> mappings;

    public NPMapper() {

        // Inicijalizacija mape prefiksa
        mappings = new LinkedHashMap<String, String>();
        setDefaultMappings();
    }

    protected void setDefaultMappings() {

        clear();

        // Za default namespace prefiks postaviti na ""
        addMapping("http://www.w3.org/2001/XMLSchema" , "xs");
        addMapping("http://examples/predicate/", "pred");
        addMapping("http://www.w3.org/2001/XMLSchema-instance", "xsi");
        addMapping("http://www.ftn.uns.ac.rs/zahtev", "");
        addMapping("http://www.ftn.uns.ac.rs/obavestenje", "ob");
        addMapping("http://www.ftn.uns.ac.rs/ZalbaNaOdluku", "zlbo");
        addMapping("http://www.ftn.uns.ac.rs/zalbacutanje", "zlbc");
        addMapping("http://www.ftn.uns.ac.rs/resenje", "r");
        addMapping("http://tipovi", "tipovi");
    }

    public void addMapping(String uri, String prefix){
        mappings.put(uri, prefix);
    }

    public String getMapping(String uri){
        return (String)mappings.get(uri);
    }
    public HashMap<String, String> getMappings(){
        return mappings;
    }
    public void clear(){
        mappings.clear();
    }

    public String getPreferredPrefix(String namespaceURI, String suggestion, boolean requirePrefix) {
        String preferredPrefix = getMapping(namespaceURI);
        if(preferredPrefix != null)
            return preferredPrefix;
        return suggestion;
    }

}