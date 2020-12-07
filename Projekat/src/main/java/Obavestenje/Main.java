package Obavestenje;

import Obavestenje.model.Obavestenje;
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

    private static final String SCHEMA_URL = "./../Dokumenti/XML Seme/obavestenjecir.xsd";
    private static final String IN_URL = "./../Dokumenti/XML Dokumenti/Ulaz/Obavestenje1.xml";
    private static final String OUT_URL = "./../Dokumenti/XML Dokumenti/Izlaz/Obavestenje1.xml";

    public static void main(String[] args) throws JAXBException, FileNotFoundException, SAXException {

        JAXBContext context = JAXBContext.newInstance(Obavestenje.class);
        Unmarshaller um = context.createUnmarshaller();

        //Setup schema validator
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema employeeSchema = sf.newSchema(new File(SCHEMA_URL));
        um.setSchema(employeeSchema);

        Obavestenje obavestenje = (Obavestenje) um.unmarshal(new InputStreamReader(
                new FileInputStream(IN_URL), StandardCharsets.UTF_8));

        System.out.println("\nISPIS ZALBE:\n");
        System.out.println(obavestenje);

        Marshaller m = context.createMarshaller();

        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(obavestenje, new File(OUT_URL));

        System.out.println("\nFAJL USPESNO SACUVAN!\n");
    }
}
