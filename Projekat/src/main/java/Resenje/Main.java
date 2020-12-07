package Resenje;

import Resenje.model.Resenje;
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

    private static final String SCHEMA_URL = "./../Dokumenti/XML Seme/resenje.xsd";
    private static final String IN_URL = "./../Dokumenti/XML Dokumenti/Ulaz/Resenje1.xml";
    private static final String OUT_URL = "./../Dokumenti/XML Dokumenti/Izlaz/Resenje1.xml";

    public static void main(String[] args) throws JAXBException, FileNotFoundException, SAXException {

        JAXBContext context = JAXBContext.newInstance(Resenje.class);
        Unmarshaller um = context.createUnmarshaller();

        //Setup schema validator
        SchemaFactory sf = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema employeeSchema = sf.newSchema(new File(SCHEMA_URL));
        um.setSchema(employeeSchema);

        Resenje resenje = (Resenje) um.unmarshal(new InputStreamReader(
                new FileInputStream(IN_URL), StandardCharsets.UTF_8));

        System.out.println("\nISPIS RESENJA:\n");
        System.out.println(resenje);

        Marshaller m = context.createMarshaller();

        m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        m.marshal(resenje, new File(OUT_URL));

        System.out.println("\nFAJL USPESNO SACUVAN!\n");
    }
}
