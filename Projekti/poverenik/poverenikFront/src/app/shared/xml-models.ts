

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


export {

    zalbaNaOdluku,
    zalbaNaOdlukuSpec,
    zalbaNaCutanje,
    zalbaNaCutanjeSpec
};
