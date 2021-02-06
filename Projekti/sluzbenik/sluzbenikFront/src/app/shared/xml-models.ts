

declare const Xonomy: any;

const zahtev: string =
    `<?xml version="1.0" encoding="UTF-8"?>
<za:Zahtev xmlns:vc="http://www.w3.org/2007/XMLSchema-versioning"
    xmlns:tipovi="http://tipovi"
    xmlns:za="http://www.ftn.uns.ac.rs/zahtev"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    vocab="http://examples/predicate/"
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

const obavestenje:string = 

`<?xml version="1.0" encoding="UTF-8"?>
<ob:Obavestenje xmlns:tipovi="http://tipovi"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.ftn.uns.ac.rs/obavestenje file:/E:/Faks/7.%20semestar/XML%20i%20veb%20servisi/XML_Web_Servisi/Dokumenti/XML%20Seme/obavestenjecir.xsd"
    xmlns:pred="http://examples/predicate/"
    xmlns:ob="http://www.ftn.uns.ac.rs/obavestenje"
    
    vocab="http://examples/predicate/"
    about="http://Obavestenje/1">
    <ob:Organ>
        <tipovi:Adresa>
            <tipovi:Mesto>Unesite mesto</tipovi:Mesto>
            <tipovi:Postanski_broj>Unesite postanski broj izmedju 11000 i 40000</tipovi:Postanski_broj>
            <tipovi:Ulica>Unesirte naziv ulice</tipovi:Ulica>
            <tipovi:Broj>Unesite broj</tipovi:Broj>
        </tipovi:Adresa>
        <tipovi:Naziv>Unesite naziv organa vlasti</tipovi:Naziv>
    </ob:Organ>
    <ob:Datum property="pred:datumObavestenja">Unesite datum u formatu YYYY-MM-DD</ob:Datum>
    <ob:Broj_predmeta>Unesite broj predmeta</ob:Broj_predmeta>
    <ob:Podnosioc_zahteva xsi:type="tipovi:TFizicko_lice">
        <tipovi:Adresa>
            <tipovi:Mesto>Unesite naziv mesta</tipovi:Mesto>
            <tipovi:Postanski_broj>Unesite postanski broj izmedju 11000 i 40000</tipovi:Postanski_broj>
            <tipovi:Ulica>Unesirte naziv ulice</tipovi:Ulica>
            <tipovi:Broj>Unesite broj</tipovi:Broj>
        </tipovi:Adresa>
        <tipovi:Ime  property="pred:imePodnosioca">Ime Podnosioca</tipovi:Ime>
        <tipovi:Prezime  property="pred:prezimePodnosioca">Prezime Podnosioca</tipovi:Prezime>
    </ob:Podnosioc_zahteva>
    <ob:Trazena_informacija>
        <ob:Godina_zahteva>Unesite godinu zahteva</ob:Godina_zahteva>
        <ob:Opis_informacije>Unesite opis informacije</ob:Opis_informacije>
    </ob:Trazena_informacija>
    <ob:Uvid>
        <ob:Datum property="pred:datumUvida">Unesite datum u formatu YYYY-MM-DD</ob:Datum>
        <ob:Satnica>01:01:01.001</ob:Satnica>
        <ob:Satnica_od>01:01:01.001</ob:Satnica_od>
        <ob:Satnica_do>01:01:01.001</ob:Satnica_do>
        <ob:Broj_kancelarije>Unesite broj kancelarije</ob:Broj_kancelarije>
        <ob:Adresa>
            <tipovi:Mesto>Mesto2</tipovi:Mesto>
            <tipovi:Postanski_broj>Unesite postanski broj izmedju 11000 i 40000</tipovi:Postanski_broj>
            <tipovi:Ulica>Unesite naziv ulice</tipovi:Ulica>
            <tipovi:Broj>Unesite broj</tipovi:Broj>
        </ob:Adresa>
    </ob:Uvid>
    <ob:Troskovi>
        <ob:A4_Cena>3.0</ob:A4_Cena>
        <ob:A3_Cena>6.0</ob:A3_Cena>
        <ob:CD_Cena>35.0</ob:CD_Cena>
        <ob:Disketa_Cena>20.0</ob:Disketa_Cena>
        <ob:DVD_Cena>40.0</ob:DVD_Cena>
        <ob:Audio_Kaseta_Cena>150.0</ob:Audio_Kaseta_Cena>
        <ob:Video_Kaseta_Cena>300.0</ob:Video_Kaseta_Cena>
        <ob:EDokumenta_Cena>30.0</ob:EDokumenta_Cena>
    </ob:Troskovi>
    <ob:Uplata>
        <ob:Ukupni_troskovi>0</ob:Ukupni_troskovi>
        <ob:Ziro_racun>000-0000000000000-00</ob:Ziro_racun>
        <ob:Broj_modela>00</ob:Broj_modela>
    </ob:Uplata>
    <ob:Dostavljeno>Imenovanom</ob:Dostavljeno>
</ob:Obavestenje>`

export {
    zahtev,
    zahtevSpec,
    obavestenje

};
