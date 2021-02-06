package tim20.xml.sluzbenik.sluzbenikBek.controller;

import lombok.RequiredArgsConstructor;
import org.apache.commons.io.FileUtils;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.service.transformer.TransformZahtevUseCase;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

@RestController
@RequestMapping(value = "/api/transform")
@RequiredArgsConstructor
public class TransformerController {
    private final TransformZahtevUseCase transformZahtevService;

    @PostMapping(value = "/zahtev/pdf")
    public ResponseEntity<InputStreamResource> transformZahtevToPdf() throws IOException, SAXException, TransformerException, XMLDBException, JAXBException {
        String documentId = "1.xml";
        File file = transformZahtevService.transformToPdf(documentId);

        byte[] bytes = FileUtils.readFileToByteArray(file);
        ByteArrayInputStream bais = new ByteArrayInputStream(bytes);

        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Type", "application/xml; charset=utf-8");
        headers.add(HttpHeaders.CONTENT_DISPOSITION, "attachment; filename=zahtev.pdf");

        return ResponseEntity.ok().headers(headers).body(new InputStreamResource(bais));
    }
}
