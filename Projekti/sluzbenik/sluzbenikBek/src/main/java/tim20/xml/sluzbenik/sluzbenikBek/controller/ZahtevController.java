package tim20.xml.sluzbenik.sluzbenikBek.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.dto.ObavestenjeList;
import tim20.xml.sluzbenik.sluzbenikBek.dto.ZahtevList;
import tim20.xml.sluzbenik.sluzbenikBek.model.Obavestenje.Obavestenje;
import tim20.xml.sluzbenik.sluzbenikBek.model.Zahtev.Zahtev;
import tim20.xml.sluzbenik.sluzbenikBek.service.Zahtev.GetAllZahtevUseCase;
import tim20.xml.sluzbenik.sluzbenikBek.service.Zahtev.GetZahtevUseCase;
import tim20.xml.sluzbenik.sluzbenikBek.service.Zahtev.StoreZahtevUseCase;

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
    public void store(@RequestBody Zahtev zahtev) throws JAXBException, TransformerException, IOException, SAXException, XMLDBException {
        service.store(zahtev);
    }

//    @GetMapping("/{id}")
//    public Zahtev get(@PathVariable("id") String id) throws XMLDBException, JAXBException {
//        return getService.get(id);
//    }

    @GetMapping
    public ZahtevList getAll() throws XMLDBException, JAXBException {
        ZahtevList zahtevi = new ZahtevList();
        zahtevi.setZahtev(getAllService.getAll());
        return zahtevi;
    }
}
