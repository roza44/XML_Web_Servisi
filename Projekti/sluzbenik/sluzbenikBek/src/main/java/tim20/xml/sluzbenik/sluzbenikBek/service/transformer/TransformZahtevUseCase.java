package tim20.xml.sluzbenik.sluzbenikBek.service.transformer;

import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.File;
import java.io.IOException;

public interface TransformZahtevUseCase {
    File transformToPdf(String documentId) throws IOException, SAXException, TransformerException, XMLDBException, JAXBException;
}
