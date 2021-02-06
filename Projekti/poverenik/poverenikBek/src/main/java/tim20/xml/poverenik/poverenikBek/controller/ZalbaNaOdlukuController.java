package tim20.xml.poverenik.poverenikBek.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.dto.ZalbaNaOdlukuList;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaOdluku.Zalba;
import tim20.xml.poverenik.poverenikBek.service.ZalbaNaOdluku.GetAllZalbaNaOdlukuUseCase;
import tim20.xml.poverenik.poverenikBek.service.ZalbaNaOdluku.GetKorisnikoveZalbeNaOdlukuUseCase;
import tim20.xml.poverenik.poverenikBek.service.ZalbaNaOdluku.StoreZalbaNaOdlukuUseCase;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RestController
@RequestMapping(value = "/api/zalbaNaOdluku", produces = MediaType.APPLICATION_XML_VALUE)
@RequiredArgsConstructor
public class ZalbaNaOdlukuController {

    @Autowired
    private final StoreZalbaNaOdlukuUseCase service;
    private final GetKorisnikoveZalbeNaOdlukuUseCase getService;
    private final GetAllZalbaNaOdlukuUseCase getAllService;

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public void store(@RequestBody Zalba zalba) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        service.store(zalba);
    }

    @GetMapping("/user")
    public ZalbaNaOdlukuList get() throws XMLDBException, JAXBException, IOException {
        ZalbaNaOdlukuList zalbe = new ZalbaNaOdlukuList();
        zalbe.setZalba(getService.get());
        return zalbe;
    }

    @GetMapping
    public ZalbaNaOdlukuList getAll() throws XMLDBException, JAXBException {
        ZalbaNaOdlukuList zalbe = new ZalbaNaOdlukuList();
        zalbe.setZalba(getAllService.getAll());
        return zalbe;
    }

}
