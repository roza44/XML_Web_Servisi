package tim20.xml.sluzbenik.sluzbenikBek.helper.mapper;

import org.springframework.stereotype.Component;
import tim20.xml.sluzbenik.sluzbenikBek.dto.DummyDTO;
import tim20.xml.sluzbenik.sluzbenikBek.model.Dummy;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class DummyMapper implements DTOMapper<Dummy, DummyDTO> {
    @Override
    public DummyDTO toDTO(Dummy dummy) {
        return new DummyDTO(dummy);
    }

    @Override
    public List<DummyDTO> toDTO(Collection<Dummy> dummies) {
        return dummies
                .stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }
}
