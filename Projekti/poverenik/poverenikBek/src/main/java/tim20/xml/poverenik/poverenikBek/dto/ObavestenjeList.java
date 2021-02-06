package tim20.xml.poverenik.poverenikBek.dto;

import tim20.xml.poverenik.poverenikBek.model.Obavestenje.Obavestenje;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "obavestenje"
})
@XmlRootElement(name = "Obavestenje_lista")
public class ObavestenjeList {

    @XmlElement(name = "Obavestenje")
    protected List<Obavestenje> obavestenje;

    public List<Obavestenje> getObavestenje() {
        if (obavestenje == null) {
            obavestenje = new ArrayList<Obavestenje>();
        }
        return obavestenje;
    }

    public void setObavestenje(List<Obavestenje> obavestenje) {
        this.obavestenje = obavestenje;
    }
}
