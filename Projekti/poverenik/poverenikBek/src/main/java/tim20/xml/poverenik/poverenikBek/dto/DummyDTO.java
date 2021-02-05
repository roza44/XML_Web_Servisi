package tim20.xml.poverenik.poverenikBek.dto;

import tim20.xml.poverenik.poverenikBek.model.Dummy;

import java.util.List;
import java.util.stream.Collectors;

public class DummyDTO {
    private Long id;
    private String dummyName;
    private String dummySurname;

    private List<ExampleDTO> examples;

    public DummyDTO(Dummy dummy) {
        this.id = dummy.getId();
        this.dummyName = dummy.getDummyName();
        this.dummySurname = dummy.getDummySurname();
        this.examples = dummy.getExamples()
                .stream()
                .map(ExampleDTO::new)
                .collect(Collectors.toList());
    }

    public Long getId() {
        return id;
    }

    public String getDummyName() {
        return dummyName;
    }

    public void setDummyName(String dummyName) {
        this.dummyName = dummyName;
    }

    public String getDummySurname() {
        return dummySurname;
    }

    public void setDummySurname(String dummySurname) {
        this.dummySurname = dummySurname;
    }

    public List<ExampleDTO> getExamples() {
        return examples;
    }

    public void setExamples(List<ExampleDTO> examples) {
        this.examples = examples;
    }
}
