package tim20.xml.poverenik.poverenikBek.dto;

import tim20.xml.poverenik.poverenikBek.model.Example;

public class ExampleDTO {
    private Long id;
    private String exampleName;
    private String exampleSurname;

    public ExampleDTO(Example example) {
        this.id = example.getId();
        this.exampleName = example.getExampleName();
        this.exampleSurname = example.getExampleSurname();
    }

    public Long getId() {
        return id;
    }

    public String getExampleName() {
        return exampleName;
    }

    public void setExampleName(String exampleName) {
        this.exampleName = exampleName;
    }

    public String getExampleSurname() {
        return exampleSurname;
    }

    public void setExampleSurname(String exampleSurname) {
        this.exampleSurname = exampleSurname;
    }
}
