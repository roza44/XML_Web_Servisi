package tim20.xml.sluzbenik.sluzbenikBek.model;

public class Example {
    private Long id;
    private String exampleName;
    private String exampleSurname;
    private String examplePassword;


    public Example(String exampleName, String exampleSurname, String examplePassword) {
        this.exampleName = exampleName;
        this.exampleSurname = exampleSurname;
        this.examplePassword = examplePassword;
    }

    public Example(Long id, String exampleName, String exampleSurname, String examplePassword) {
        this(exampleName, exampleSurname, examplePassword);
        this.id = id;
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

    public String getExamplePassword() {
        return examplePassword;
    }

    public void setExamplePassword(String examplePassword) {
        this.examplePassword = examplePassword;
    }
}
