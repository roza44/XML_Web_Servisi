package tim20.xml.sluzbenik.sluzbenikBek.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.xml.sax.SAXException;
import org.xmldb.api.base.XMLDBException;
import tim20.xml.sluzbenik.sluzbenikBek.model.Obavestenje.Obavestenje;
import tim20.xml.sluzbenik.sluzbenikBek.service.Obavestenje.GetObavestenjeUseCase;
import tim20.xml.sluzbenik.sluzbenikBek.service.Obavestenje.StoreObavestenjeUseCase;

import javax.xml.bind.JAXBException;
import javax.xml.transform.TransformerException;
import java.io.IOException;

@RestController
@RequestMapping(value = "/api/obavestenje", produces = MediaType.APPLICATION_XML_VALUE)
@RequiredArgsConstructor
public class ObavestenjeController {

    @Autowired
    private final StoreObavestenjeUseCase storeService;

    @Autowired
    private final GetObavestenjeUseCase getService;

    @PostMapping(consumes = MediaType.APPLICATION_XML_VALUE)
    public void store(@RequestBody Obavestenje obavestenje) throws JAXBException, TransformerException, IOException, SAXException, XMLDBException {
        storeService.store(obavestenje);
    }

    @GetMapping("/{id}")
    public Obavestenje get(@PathVariable("id") String id){
        return getService.get(id);
    }
}
