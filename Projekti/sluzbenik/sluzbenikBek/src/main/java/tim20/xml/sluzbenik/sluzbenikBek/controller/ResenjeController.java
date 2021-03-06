package tim20.xml.sluzbenik.sluzbenikBek.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Resenje.Resenje;
import tim20.xml.sluzbenik.sluzbenikBek.service.Resenje.StoreResenjeUseCase;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RestController
@RequestMapping(value = "/api/resenje", produces = MediaType.APPLICATION_XML_VALUE)
@RequiredArgsConstructor
public class ResenjeController {

    @Autowired
    private final StoreResenjeUseCase service;

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public void store(@RequestBody Resenje resenje) throws JAXBException, TransformerException, IOException, SAXException, XMLDBException {
        service.store(resenje);
    }
}
