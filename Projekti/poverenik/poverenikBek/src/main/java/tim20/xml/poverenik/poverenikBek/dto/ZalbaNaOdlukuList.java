package tim20.xml.poverenik.poverenikBek.dto;

import tim20.xml.poverenik.poverenikBek.model.Zahtev.Zahtev;
import tim20.xml.poverenik.poverenikBek.model.ZalbaNaOdluku.Zalba;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "zalba"
})
@XmlRootElement(name = "ZalbaNaOdluku_lista")
public class ZalbaNaOdlukuList {

    @XmlElement(name = "Zalba")
    protected List<Zalba> zalba;

    public List<Zalba> getZalba() {
        if (zalba == null) {
            zalba = new ArrayList<Zalba>();
        }
        return zalba;
    }

    public void setZalba(List<Zalba> zalba) {
        this.zalba = zalba;
    }

}
