package tim20.xml.sluzbenik.sluzbenikBek.model;

import java.util.List;

public class Dummy {
    private Long id;
    private String dummyName;
    private String dummySurname;
    private String dummyPassword;

    private List<Example> examples;

    public Dummy(String dummyName, String dummySurname, String dummyPassword, List<Example> examples) {
        this.dummyName = dummyName;
        this.dummySurname = dummySurname;
        this.dummyPassword = dummyPassword;
        this.examples = examples;
    }

    public Dummy(Long id, String dummyName, String dummySurname, String dummyPassword, List<Example> examples) {
        this(dummyName, dummySurname, dummyPassword, examples);
        this.id = id;
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

    public String getDummyPassword() {
        return dummyPassword;
    }

    public void setDummyPassword(String dummyPassword) {
        this.dummyPassword = dummyPassword;
    }

    public List<Example> getExamples() {
        return examples;
    }

    public void setExamples(List<Example> examples) {
        this.examples = examples;
    }
}
