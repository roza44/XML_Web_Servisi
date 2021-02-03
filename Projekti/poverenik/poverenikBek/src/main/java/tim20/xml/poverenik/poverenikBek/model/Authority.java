package tim20.xml.poverenik.poverenikBek.model;

import org.springframework.security.core.GrantedAuthority;

public class Authority implements GrantedAuthority {
    private Long id;
    private String name;

    public Authority(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
