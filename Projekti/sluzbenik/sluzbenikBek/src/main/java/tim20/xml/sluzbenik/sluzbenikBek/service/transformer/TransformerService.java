package tim20.xml.sluzbenik.sluzbenikBek.service.transformer;

import lombok.RequiredArgsConstructor;
import net.sf.saxon.TransformerFactoryImpl;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.MimeConstants;
import org.springframework.stereotype.Service;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.repository.repositories.ZahtevRepository;

import javax.xml.bind.JAXBException;
import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;

import org.apache.fop.apps.FopFactory;

@Service
@RequiredArgsConstructor
public class TransformerService implements TransformZahtevUseCase {

    private final ZahtevRepository zahtevRepository;


    private final String resources = "./src/main/resources";
    private final String transformationsPath = resources + "/transformations";
    private final String fopXconf = resources + "/fop.xconf";
    private final String XSL_FILE = transformationsPath + File.separator + "zahtevToPdf.xsl";
    private final String OUTPUT_FILE = transformationsPath + File.separator + "zahtevIzlaz.pdf";

    @Override
    public File transformToPdf(String documentId) throws IOException, SAXException, TransformerException, XMLDBException, JAXBException {
        FopFactory fopFactory = FopFactory.newInstance(new File(fopXconf));
        TransformerFactory transformerFactory = new TransformerFactoryImpl();

        String inputString = zahtevRepository.retrieveRaw(documentId);

        // Point to the XSL-FO file
        File xslFile = new File(XSL_FILE);

        // Create transformation source
        StreamSource transformSource = new StreamSource(xslFile);

        // Initialize the transformation subject
        StreamSource source = new StreamSource(new StringReader(inputString));

        // Initialize user agent needed for the transformation
        FOUserAgent userAgent = fopFactory.newFOUserAgent();

        // Create the output stream to store the results
        ByteArrayOutputStream outStream = new ByteArrayOutputStream();

        // Initialize the XSL-FO transformer object
        Transformer xslFoTransformer = transformerFactory.newTransformer(transformSource);

        // Construct FOP instance with desired output format
        Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, userAgent, outStream);

        // Resulting SAX events
        Result res = new SAXResult(fop.getDefaultHandler());

        // Start XSLT transformation and FOP processing
        xslFoTransformer.transform(source, res);

        // Generate PDF file
        File pdfFile = new File(OUTPUT_FILE);
        pdfFile.createNewFile();

        OutputStream out = new BufferedOutputStream(new FileOutputStream(pdfFile));
        out.write(outStream.toByteArray());
        out.close();

        return pdfFile;
    }
}
