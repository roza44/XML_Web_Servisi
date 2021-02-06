package tim20.xml.poverenik.poverenikBek.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.dto.ZahtevList;
import tim20.xml.poverenik.poverenikBek.dto.ZalbaNaCutanjeList;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaCutanje.Zalba;
import tim20.xml.poverenik.poverenikBek.service.ZalbaNaCutanje.GetAllZalbaNaCutanjeUseCase;
import tim20.xml.poverenik.poverenikBek.service.ZalbaNaCutanje.GetZalbaNaCutanjeUseCase;
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
//    private final GetZalbaNaCutanjeUseCase getService;
    private final GetAllZalbaNaCutanjeUseCase getAllService;

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public void store(@RequestBody Zalba zalba) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        service.store(zalba);
    }

//    @GetMapping("/{id}")
//    public Zalba get(@PathVariable("id") String id) throws XMLDBException, JAXBException {
//        return getService.get(id);
//    }

    @GetMapping
    public ZalbaNaCutanjeList getAll() throws XMLDBException, JAXBException {
        ZalbaNaCutanjeList zalbe = new ZalbaNaCutanjeList();
        zalbe.setZalba(getAllService.getAll());
        return zalbe;
    }
}
