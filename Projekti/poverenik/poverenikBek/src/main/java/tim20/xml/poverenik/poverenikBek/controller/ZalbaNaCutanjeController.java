package tim20.xml.poverenik.poverenikBek.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.dto.ZalbaNaCutanjeList;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaCutanje.Zalba;
import tim20.xml.poverenik.poverenikBek.service.ZalbaNaCutanje.GetAllZalbaNaCutanjeUseCase;
import tim20.xml.poverenik.poverenikBek.service.ZalbaNaCutanje.GetKorisnikoveZalbeNaCutanjeUseCase;
import tim20.xml.poverenik.poverenikBek.service.ZalbaNaCutanje.StoreZalbaNaCutanjeUseCase;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RestController
@RequestMapping(value = "/api/zalbaNaCutanje", produces = MediaType.APPLICATION_XML_VALUE)
@RequiredArgsConstructor
public class ZalbaNaCutanjeController {

    @Autowired
    private final StoreZalbaNaCutanjeUseCase service;
    private final GetKorisnikoveZalbeNaCutanjeUseCase getService;
    private final GetAllZalbaNaCutanjeUseCase getAllService;

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public void store(@RequestBody Zalba zalba) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        service.store(zalba);
    }

    @GetMapping("/user")
    public ZalbaNaCutanjeList get() throws XMLDBException, JAXBException, IOException {
        ZalbaNaCutanjeList zalbe = new ZalbaNaCutanjeList();
        zalbe.setZalba(getService.get());
        return zalbe;
    }

    @GetMapping
    public ZalbaNaCutanjeList getAll() throws XMLDBException, JAXBException {
        ZalbaNaCutanjeList zalbe = new ZalbaNaCutanjeList();
        zalbe.setZalba(getAllService.getAll());
        return zalbe;
    }
}
