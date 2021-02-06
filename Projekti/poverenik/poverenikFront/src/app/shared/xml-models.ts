

declare const Xonomy: any;

const zalbaNaOdluku:string = 

`<?xml version="1.0" encoding="UTF-8"?>
<zlbo:Zalba xmlns:tipovi="http://tipovi"
    xmlns:zlbo="http://www.ftn.uns.ac.rs/ZalbaNaOdluku"
    xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
    xsi:schemaLocation="http://www.ftn.uns.ac.rs/ZalbaNaOdluku file:/E:/Faks/7.%20semestar/XML%20i%20veb%20servisi/XML_Web_Servisi/Dokumenti/XML%20Seme/zalbanaodlukucir.xsd"
    xmlns:pred="http://examples/predicate/"
    vocab="http://examples/predicate/"
    about="http://ZalbaNaOdluku/1">
    <zlbo:Zalilac xsi:type="tipovi:TPravno_lice">
        <tipovi:Adresa>
            <tipovi:Mesto>Unesite mesto</tipovi:Mesto>
            <tipovi:Postanski_broj>Unesite postanski izmedju 11000 i 40000</tipovi:Postanski_broj>
            <tipovi:Ulica>Unesite naziv ulice</tipovi:Ulica>
            <tipovi:Broj>Unesite broj</tipovi:Broj>
        </tipovi:Adresa>
        <tipovi:Naziv property="pred:nazivZalioca">Unesite naziv zalioca</tipovi:Naziv>
    </zlbo:Zalilac>
    <zlbo:Resenje>
        <zlbo:Donosilac_Odluke property="pred:donosilacOdluke">Ime i prezime donosioca</zlbo:Donosilac_Odluke>
        <zlbo:Broj property="pred:brojResenja">Unesite broj resenja</zlbo:Broj>
        <zlbo:Godina property="pred:godinaResenja">Unesite godinu resenja</zlbo:Godina>
    </zlbo:Resenje>
    <zlbo:Datum_Zahteva>Unesite datum zahteva</zlbo:Datum_Zahteva>
    <zlbo:Osnov_Zalbe>Unesite osnov zalbe</zlbo:Osnov_Zalbe>
    <zlbo:Podnosilac>
        <zlbo:Ime property="pred:imePodnosilacaZalbe">Unesite ime podnosioca zalbe</zlbo:Ime>
        <zlbo:Prezime property="pred:prezimePodnosilacaZalbe">Unesite prezime podnosioca zalbe</zlbo:Prezime>
    </zlbo:Podnosilac>
    <zlbo:Adresa>
        <tipovi:Mesto>Unesite naziv mesta</tipovi:Mesto>
        <tipovi:Postanski_broj>Unesite postanski izmedju 11000 i 40000</tipovi:Postanski_broj>
        <tipovi:Ulica>Unesite naziv ulice</tipovi:Ulica>
        <tipovi:Broj>Unesite broj</tipovi:Broj>
    </zlbo:Adresa>
    <zlbo:Datum_Zalbe property="pred:datumZalbe">Unesite datum zalbe</zlbo:Datum_Zalbe>
    <zlbo:Kontakt>Ovde unesite dodatni kontakt</zlbo:Kontakt>
</zlbo:Zalba>`;

const zalbaNaOdlukuSpec = {

    onchange: function(){
        console.log("I been changed now!")
    },
    validate: function(obj){
        console.log("I be validatin' now!")
    },
        
    elements: {
        "tipovi:Mesto": {
            menu: [
                {
                    asker: Xonomy.askString
                }
            ]
        },
        "tipovi:Postanski_broj": {
            menu: [
                {
                    asker: Xonomy.askString
                }
            ]
        }
    }
};


const zalbaNaCutanje: string = 

`<?xml version="1.0" encoding="UTF-8"?>
<zlbc:Zalba xmlns:tipovi="http://tipovi"
 xmlns:zlbc="http://www.ftn.uns.ac.rs/zalbacutanje"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xsi:schemaLocation="http://www.ftn.uns.ac.rs/zalbacutanje file:/E:/Faks/7.%20semestar/XML%20i%20veb%20servisi/XML_Web_Servisi/Dokumenti/XML%20Seme/zalbacutanjecir.xsd"
 xmlns:pred="http://examples/predicate/"
 vocab="http://examples/predicate/"
 about="http://ZalbaNaCutanje/1">
    <zlbc:Poverenik>
        <tipovi:Adresa>
            <tipovi:Mesto>Unesite Mesto</tipovi:Mesto>
            <tipovi:Postanski_broj>Unesite postanski izmedju 11000 i 40000</tipovi:Postanski_broj>
            <tipovi:Ulica>Unesite naziv ulice</tipovi:Ulica>
            <tipovi:Broj>Unesite broj</tipovi:Broj>
        </tipovi:Adresa>
        <tipovi:Naziv>Unesite Naziv</tipovi:Naziv>
    </zlbc:Poverenik>
    <zlbc:Naziv_organa property="pred:nazivOrgana">Unesite Naziv organa vlasti</zlbc:Naziv_organa>
    <zlbc:Razlog_zalbe property="pred:razlogZalbe">Organ vlasti nije postupio u zakonskom roku</zlbc:Razlog_zalbe>
    <zlbc:Trazene_informacije_o_zahtevu>
        <zlbc:Datum_podnosenja property="pred:datumZahteva">Unesite datum podnosenja zalbe YYYY-MM-DD</zlbc:Datum_podnosenja>
        <zlbc:Podaci_o_zahtevu_i_informacijama property="pred:tekstZahteva" >Unesite podatke o zahtevu i informacijama</zlbc:Podaci_o_zahtevu_i_informacijama>
    </zlbc:Trazene_informacije_o_zahtevu>
    <zlbc:Datum_podnosenja_zalbe property="pred:datumZalbe">Unesite datum podnosenja zalbe YYYY-MM-DD</zlbc:Datum_podnosenja_zalbe>
    <zlbc:Podnosilac_zalbe>
        <tipovi:Adresa>
            <tipovi:Mesto>Unesite Mesto</tipovi:Mesto>
            <tipovi:Postanski_broj>Unesite postanski izmedju 11000 i 40000</tipovi:Postanski_broj>
            <tipovi:Ulica>Unesite naziv ulice</tipovi:Ulica>
            <tipovi:Broj>Unesite broj</tipovi:Broj>
        </tipovi:Adresa>
        <tipovi:Ime property="pred:imeGradjanina">Ime Gradjanina</tipovi:Ime>
        <tipovi:Prezime property="pred:prezimeGradjanina">Prezime Gradjanina</tipovi:Prezime>
        <zlbc:Ostali_kontakt_podaci>Dodatni kontakt podaci</zlbc:Ostali_kontakt_podaci>
    </zlbc:Podnosilac_zalbe>
</zlbc:Zalba>`;


const zalbaNaCutanjeSpec = {

    onchange: function(){
        console.log("I been changed now!")
    },
    validate: function(obj){
        console.log("I be validatin' now!")
    },
        
    elements: {
        "zlbc:Razlog_zalbe": {
            menu: [
                {
                    asker: Xonomy.askPicklist,
                    askerParameter: [
                        {value: "Organ vlasti nije postupio u zakonskom roku"},
                        {value: "Organ vlasti nije postupio u celosti u zakonskom roku"}
                    ]
                }
            ]
        },
    }
};


const resenje:string = 

`<?xml version="1.0" encoding="UTF-8"?>
<r:Resenje xmlns:tipovi="http://tipovi"
 xmlns:r="http://www.ftn.uns.ac.rs/resenje"
 xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
 xsi:schemaLocation="http://www.ftn.uns.ac.rs/resenje file:/E:/Faks/7.%20semestar/XML%20i%20veb%20servisi/XML_Web_Servisi/Dokumenti/XML%20Seme/resenje.xsd"
 xmlns:pred="http://examples/predicate/"
 vocab="http://examples/predicate/"
 about="http://Resenje/1">
    <r:Odluka_resenja  property="pred:odlukaResenja">Odluka_resenja0</r:Odluka_resenja>
    <r:Br_resenja property="pred:brojResenja">000-00-0000/0000-00</r:Br_resenja>
    <r:Datum_resenja property="pred:datumResenja">2006-05-04</r:Datum_resenja>
    <r:Uvod>
        <r:Podnosilac_zalbe>
            <tipovi:Ime property="pred:imePodnosilacaZalbe">Ime0</tipovi:Ime>
            <tipovi:Prezime property="pred:prezimePodnosilacaZalbe">Prezime0</tipovi:Prezime>
        </r:Podnosilac_zalbe>
        <r:Razlog property="pred:razlogResenja">protiv resenja</r:Razlog>
        <r:Organ_vlasti property="pred:organVlasti">Organ_vlasti0</r:Organ_vlasti>
        <r:Datum_zahteva property="pred:datumZahteva">2006-05-04</r:Datum_zahteva>
        <r:Osnova_resenja>
            <r:Zakon>
                <r:Clan>50</r:Clan>
                <r:Stav>50</r:Stav>
                <r:Tacka>50</r:Tacka>
                <r:Naziv property="pred:osnovaResenja">Naziv0</r:Naziv>
                <r:Broj_glasnika>1/</r:Broj_glasnika>
            </r:Zakon>
            <r:Zakon>
                <r:Clan>50</r:Clan>
                <r:Stav>50</r:Stav>
                <r:Tacka>50</r:Tacka>
                <r:Naziv>Naziv1</r:Naziv>
                <r:Broj_glasnika>1/</r:Broj_glasnika>
            </r:Zakon>
        </r:Osnova_resenja>
    </r:Uvod>
    <r:Ishod>Ishod0</r:Ishod>
    <r:Obrazlozenje>
        <r:Datum_zalbe property="pred:datumZalbe">2006-05-04</r:Datum_zalbe>
        <r:Datum_prosledjivanja_zalbe>2006-05-04</r:Datum_prosledjivanja_zalbe>
        <r:Razlog>Razlog1</r:Razlog>
        <r:Razlog>Razlog2</r:Razlog>
    </r:Obrazlozenje>
    <r:Poverenik>
        <tipovi:Ime>Ime1</tipovi:Ime>
        <tipovi:Prezime>Prezime1</tipovi:Prezime>
    </r:Poverenik>
</r:Resenje>`

const resenjeeSpec = {

    onchange: function(){
        console.log("I been changed now!")
    },
    validate: function(obj){
        console.log("I be validatin' now!")
    },
        
    elements: {
        "r:Odluka_resenja": {
            menu: [
                {
                    asker: Xonomy.askString
                }
            ]
        },
    }
};



export {

    zalbaNaOdluku,
    zalbaNaOdlukuSpec,
    zalbaNaCutanje,
    zalbaNaCutanjeSpec,
    resenje,
    resenjeeSpec
};
