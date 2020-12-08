package zahtev;

import ZalbaNaOdluku.model.Zalba;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class Main {
    private static final String SCHEMA_URL = "./../Dokumenti/XML Seme/zalbanaodlukucir.xsd";
    private static final String IN_URL = "./../Dokumenti/XML Dokumenti/Ulaz/ZalbaNaOdluku1.xml";
    private static final String OUT_URL = "./../Dokumenti/XML Dokumenti/Izlaz/ZalbaNaOdluku1.xml";

    public static void main(String[] args) throws JAXBException, SAXException, FileNotFoundException {

        JAXBContext context = JAXBContext.newInstance(Zalba.class);
        Unmarshaller um = context.createUnmarshaller();

        //Setup schema validator
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema employeeSchema = sf.newSchema(new File(SCHEMA_URL));
        um.setSchema(employeeSchema);

        Zalba zalba = (Zalba) um.unmarshal(new InputStreamReader(
                new FileInputStream(IN_URL), StandardCharsets.UTF_8));

        System.out.println("\nISPIS ZALBE:\n");
        System.out.println(zalba);

        Marshaller m = context.createMarshaller();

        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(zalba, new File(OUT_URL));

        System.out.println("\nFAJL USPESNO SACUVAN!\n");

    }
}
