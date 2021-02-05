package tim20.xml.sluzbenik.sluzbenikBek.dto;

import tim20.xml.sluzbenik.sluzbenikBek.model.Obavestenje.Obavestenje;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

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
