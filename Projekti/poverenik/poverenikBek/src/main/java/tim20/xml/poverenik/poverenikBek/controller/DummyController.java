package tim20.xml.poverenik.poverenikBek.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tim20.xml.poverenik.poverenikBek.dto.DummyDTO;
import tim20.xml.poverenik.poverenikBek.helper.mapper.DTOMapper;
import tim20.xml.poverenik.poverenikBek.model.Dummy;
import tim20.xml.poverenik.poverenikBek.service.DummyService;

import java.util.Collection;
import java.util.List;

@RestController
@RequestMapping(value = "/api/dummies", produces = MediaType.APPLICATION_XML_VALUE)
public class DummyController {
    private final DummyService dummyService;
    private final DTOMapper<Dummy, DummyDTO> dummyMapper;

    @Autowired
    public DummyController(DummyService dummyService, DTOMapper<Dummy, DummyDTO> dummyMapper) {
        this.dummyService = dummyService;
        this.dummyMapper = dummyMapper;
    }

    @GetMapping("")
    public ResponseEntity<List<DummyDTO>> getDummies() {
        Collection<Dummy> allDummies = dummyService.getAllDummies();
        List<DummyDTO> dummyDTOS = dummyMapper.toDTO(allDummies);
        return ResponseEntity.ok(dummyDTOS);
    }
}
