package Zahtev;

import Zahtev.model.Zahtev;
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
    private static final String SCHEMA_URL = "./../Dokumenti/XML Seme/zahtevcir.xsd";
    private static final String IN_URL = "./../Dokumenti/XML Dokumenti/Ulaz/Zahtev1.xml";
    private static final String OUT_URL = "./../Dokumenti/XML Dokumenti/Izlaz/Zahtev1.xml";

    public static void main(String[] args) throws JAXBException, FileNotFoundException, SAXException {

        JAXBContext context = JAXBContext.newInstance(Zahtev.class);
        Unmarshaller unmarshaller = context.createUnmarshaller();

        SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
        Schema schema = schemaFactory.newSchema(new File(SCHEMA_URL));
        unmarshaller.setSchema(schema);

        Zahtev zahtev = (Zahtev) unmarshaller.unmarshal(new InputStreamReader(
                new FileInputStream(IN_URL), StandardCharsets.UTF_8
        ));

        System.out.println("\nISPIS ZAHTEVA\n");
        zahtev.getPrimalac().getOrgan().setNaziv("NEKI NOVI NAZIV ORGANA");
        System.out.println(zahtev);

        Marshaller marshaller = context.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
        marshaller.marshal(zahtev, new File(OUT_URL));

        System.out.println("\nFAJL USPESNO SACUVAN\n");
    }
}
