package tim20.xml.sluzbenik.sluzbenikBek.helper.mapper;

import java.util.Collection;
import java.util.List;

public interface DTOMapper<T, DTO> {
    DTO toDTO(T t);

    List<DTO> toDTO(Collection<T> t);
}
