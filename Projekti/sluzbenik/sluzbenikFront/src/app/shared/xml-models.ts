

declare const Xonomy: any;

const zahtev: string =
    `<?xml version="1.0" encoding="UTF-8"?>
<za:Zahtev xmlns:vc="http://www.w3.org/2007/XMLSchema-versioning"
    xmlns:tipovi="http://tipovi"
    xmlns:za="http://www.ftn.uns.ac.rs/zahtev"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.ftn.uns.ac.rs/zahtev file:./../../../Dokumenti/XML Seme/zahtevcir.xsd">
    <za:Primalac>
        <za:Organ>
            <za:Naziv property="pred:nazivOrgana">Unesite naziv organa</za:Naziv>
            <za:AdresaOrgana>
                <za:Mesto>Unesite mesto organa</za:Mesto>
                <za:Ulica>Unesite ulicu organa</za:Ulica>
                <za:Broj>Unesite broj ulice organa</za:Broj>
            </za:AdresaOrgana>
        </za:Organ>
    </za:Primalac>
    <za:Sadrzaj>
        <za:Naslov>Z A H T E V za pristup informaciji od javnog znacaja</za:Naslov>
        <za:Telo>
            <za:Paragraf>
                <za:Zakon>
                    <za:Clan>Unesite broj clana</za:Clan>
                    <za:Stav>Unesite broj stava</za:Stav>
                    <za:Naziv>Unesite naziv zakona</za:Naziv>
                </za:Zakon>
                <za:SluzbeniGlasnik>
                    <za:Naziv>Sluzbeni glasnik Republike Srbije</za:Naziv>
                    <za:Brojevi>
                        <za:Broj>Unesite broj</za:Broj>
                    </za:Brojevi>
                </za:SluzbeniGlasnik>
            </za:Paragraf>
            <za:IzboriZahteva>
                <za:Izbor Broj="1" Odabran="false">Obavestenje da li poseduje trazenu informaciju</za:Izbor>
                <za:Izbor Broj="2" Odabran="false">Uvid u dokument koji sadrzi trazenu informaciju</za:Izbor>
                <za:Izbor Broj="3" Odabran="false">Kopiju dokumenta koji sadrzi trazenu informaciju</za:Izbor>
                <za:IzboriDostave>
                    <za:Izbor Broj="4" Odabran="false">Postom</za:Izbor>
                    <za:Izbor Broj="5" Odabran="false">Elektronskom postom</za:Izbor>
                    <za:Izbor Broj="6" Odabran="false">Faksom</za:Izbor>
                    <za:Izbor Broj="7" Odabran="false">Na drugi nacin: --unesite nacin--</za:Izbor>
                </za:IzboriDostave>
            </za:IzboriZahteva>
            <za:Informacije>Unesite informacije koje zahtevate</za:Informacije>
            <za:PodaciOZahtevu>
                <za:Mesto  property="pred:mestoZahteva">Unesite mesto zahteva</za:Mesto>
                <za:Datum  property="pred:datumZahteva">Unesite datum zahteva u formatu godina-mesec-dan</za:Datum>
                <za:Trazioc>
                    <za:Ime property="pred:imeTraziocaZahteva">Unesite vase ime</za:Ime>
                    <za:Prezime property="pred:prezimeTraziocaZahteva">Unesite vase prezime</za:Prezime>
                    <za:Adresa>
                        <za:Mesto>Unesite mesto</za:Mesto>
                        <za:Ulica>Unesite ulicu</za:Ulica>
                        <za:Broj>Unesite broj</za:Broj>
                    </za:Adresa>
                    <za:Kontakt>Unesite konktak broj telefona</za:Kontakt>
                </za:Trazioc>
            </za:PodaciOZahtevu>
        </za:Telo>
    </za:Sadrzaj>
</za:Zahtev>`;

const zahtevSpec = {

    onchange: function () {
        console.log("I been changed now!")
    },
    validate: function (obj) {
        console.log("I be validatin' now!")
    },

    elements: {
        "za:Mesto": {
            menu: [
                {
                    asker: Xonomy.askString
                }
            ]
        },
        "za:Naslov": {
            isReadOnly: true
        }
    }
}

export {
    zahtev,
    zahtevSpec

};
