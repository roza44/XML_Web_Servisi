package tim20.xml.poverenik.poverenikBek.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaOdluku.Zalba;
import tim20.xml.poverenik.poverenikBek.service.ZalbaNaOdluku.StoreZalbaNaOdlukuUseCase;

import javax.xml.bind.JAXBException;

@RestController
@RequestMapping(value = "/api/zalbaNaOdluku", produces = MediaType.APPLICATION_XML_VALUE)
@RequiredArgsConstructor
public class ZalbaNaOdlukuController {

    @Autowired
    private final StoreZalbaNaOdlukuUseCase service;

    @PostMapping("")
    public void store(@RequestBody Zalba zalba) throws XMLDBException, JAXBException {
        service.store(zalba);
    }

}
