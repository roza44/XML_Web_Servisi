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
import tim20.xml.sluzbenik.sluzbenikBek.model.ZalbaNaCutanje.Zalba;
import tim20.xml.sluzbenik.sluzbenikBek.service.ZalbaNaCutanje.StoreZalbaNaCutanjeUseCase;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RestController
@RequestMapping(value = "/api/zalbaNaCutanje", produces = MediaType.APPLICATION_XML_VALUE)
@RequiredArgsConstructor
public class ZalbaNaCutanjeController {

    @Autowired
    private final StoreZalbaNaCutanjeUseCase service;

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public void store(@RequestBody Zalba zalba) throws JAXBException, TransformerException, IOException, SAXException, XMLDBException {
        service.store(zalba);
    }
}
