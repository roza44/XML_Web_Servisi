package tim20.xml.poverenik.poverenikBek.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.dto.ResenjeList;
import tim20.xml.poverenik.poverenikBek.model.Resenje.Resenje;
import tim20.xml.poverenik.poverenikBek.service.Resenje.GetAllResenjeUseCase;
import tim20.xml.poverenik.poverenikBek.service.Resenje.StoreResenjeUseCase;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RestController
@RequestMapping(value = "/api/resenje", produces = MediaType.APPLICATION_XML_VALUE)
@RequiredArgsConstructor
public class ResenjeController {

    @Autowired
    private final StoreResenjeUseCase service;
    private final GetAllResenjeUseCase getAllService;

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public void store(@RequestBody Resenje resenje) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        service.store(resenje);
    }

    @GetMapping
    public ResenjeList getAll() throws XMLDBException, JAXBException {
        ResenjeList resenja = new ResenjeList();
        resenja.setResenje(getAllService.getAll());
        return resenja;
    }




}
