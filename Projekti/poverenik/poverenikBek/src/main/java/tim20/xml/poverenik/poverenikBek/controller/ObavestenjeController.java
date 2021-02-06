package tim20.xml.poverenik.poverenikBek.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.poverenik.poverenikBek.dto.ObavestenjeList;
import tim20.xml.poverenik.poverenikBek.model.Obavestenje.Obavestenje;
import tim20.xml.poverenik.poverenikBek.service.Obavestenje.GetAllObavestenjaUseCase;
import tim20.xml.poverenik.poverenikBek.service.Obavestenje.GetObavestenjeUseCase;
import tim20.xml.poverenik.poverenikBek.service.Obavestenje.StoreObavestenjeUseCase;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RestController
@RequestMapping(value = "/api/obavestenje", produces = MediaType.APPLICATION_XML_VALUE)
@RequiredArgsConstructor
public class ObavestenjeController {

    @Autowired
    private final StoreObavestenjeUseCase service;

    @Autowired
    private final GetObavestenjeUseCase getService;

    private final GetAllObavestenjaUseCase getAllService;

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public void store(@RequestBody Obavestenje obavestenje) throws XMLDBException, JAXBException, TransformerException, IOException, SAXException {
        service.store(obavestenje);
    }

    @GetMapping("/{id}")
    public Obavestenje get(@PathVariable("id") String id) throws XMLDBException, JAXBException {
        return getService.get(id);
    }



    @GetMapping
    public ObavestenjeList getAll() throws XMLDBException, JAXBException {
        ObavestenjeList obavestenja = new ObavestenjeList();
        obavestenja.setObavestenje(getAllService.getAll());
        return obavestenja;
    }
}
