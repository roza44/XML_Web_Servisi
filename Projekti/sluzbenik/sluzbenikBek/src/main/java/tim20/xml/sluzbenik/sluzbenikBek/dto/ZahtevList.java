package tim20.xml.sluzbenik.sluzbenikBek.dto;


import tim20.xml.sluzbenik.sluzbenikBek.model.Zahtev.Zahtev;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "zahtev"
})
@XmlRootElement(name = "Zahtev_lista")
public class ZahtevList {

    @XmlElement(name = "Zahtev")
    protected List<Zahtev> zahtev;

    public List<Zahtev> getZahtev() {
        if (zahtev == null) {
            zahtev = new ArrayList<Zahtev>();
        }
        return zahtev;
    }

    public void setZahtev(List<Zahtev> zahtev) {
        this.zahtev = zahtev;
    }

}
