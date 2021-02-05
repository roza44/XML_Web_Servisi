

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


export {

    zalbaNaOdluku,
    zalbaNaOdlukuSpec

};
