package tim20.xml.poverenik.poverenikBek.dto;


import tim20.xml.poverenik.poverenikBek.model.Resenje.Resenje;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "resenje"
})
@XmlRootElement(name = "Resenje_lista")
public class ResenjeList {

    @XmlElement(name = "Resenje")
    protected List<Resenje> resenje;

    public List<Resenje> getResenje() {
        if (resenje == null) {
            resenje = new ArrayList<Resenje>();
        }
        return resenje;
    }

    public void setResenje(List<Resenje> resenje) {
        this.resenje = resenje;
    }
}
