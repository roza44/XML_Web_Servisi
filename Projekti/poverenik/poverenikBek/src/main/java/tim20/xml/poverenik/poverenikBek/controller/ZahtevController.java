package tim20.xml.poverenik.poverenikBek.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.dto.ZahtevList;
import tim20.xml.poverenik.poverenikBek.model.Zahtev.Zahtev;
import tim20.xml.poverenik.poverenikBek.service.Zahtev.GetAllZahtevUseCase;
import tim20.xml.poverenik.poverenikBek.service.Zahtev.GetZahtevUseCase;
import tim20.xml.poverenik.poverenikBek.service.Zahtev.StoreZahtevUseCase;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RestController
@RequestMapping(value = "/api/zahtev", produces = MediaType.APPLICATION_XML_VALUE)
@RequiredArgsConstructor
public class ZahtevController {

    @Autowired
    private final StoreZahtevUseCase service;
//    private final GetZahtevUseCase getService;
    private final GetAllZahtevUseCase getAllService;

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public void store(@RequestBody Zahtev zahtev) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        service.store(zahtev);
    }
    //    @GetMapping("/{id}")
//    public Zahtev get(@PathVariable("id") String id) throws XMLDBException, JAXBException {
//        return getService.get(id);
//    }

    @GetMapping
    public ZahtevList getAll() throws XMLDBException, JAXBException {
        ZahtevList obavestenja = new ZahtevList();
        obavestenja.setZahtev(getAllService.getAll());
        return obavestenja;
    }
}
