@XmlSchema(
        namespace = "http://www.w3.org/2001/XMLSchema",
        elementFormDefault = javax.xml.bind.annotation.XmlNsForm.QUALIFIED,
        xmlns = {
                @javax.xml.bind.annotation.XmlNs(prefix = "xs", namespaceURI="http://www.w3.org/2001/XMLSchema"),
                @javax.xml.bind.annotation.XmlNs(prefix = "vc", namespaceURI="http://www.w3.org/2007/XMLSchema-versioning"),
                @javax.xml.bind.annotation.XmlNs(prefix = "zah", namespaceURI="http://www.ftn.uns.ac.rs/zahtev"),
                @javax.xml.bind.annotation.XmlNs(prefix="tipovi", namespaceURI="http://tipovi"),
                @javax.xml.bind.annotation.XmlNs(prefix="xsi", namespaceURI="http://www.w3.org/2001/XMLSchema-instance"),
                @javax.xml.bind.annotation.XmlNs(prefix="pred", namespaceURI="http://examples/predicate/"),
        }
)
package tim20.xml.sluzbenik.sluzbenikBek.model.Zahtev;

import javax.xml.bind.annotation.XmlSchema;
