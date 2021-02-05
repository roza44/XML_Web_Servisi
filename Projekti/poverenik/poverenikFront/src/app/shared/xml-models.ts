

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
            <tipovi:Mesto> </tipovi:Mesto>
            <tipovi:Postanski_broj> </tipovi:Postanski_broj>
            <tipovi:Ulica> </tipovi:Ulica>
            <tipovi:Broj> </tipovi:Broj>
        </tipovi:Adresa>
        <tipovi:Naziv property="pred:nazivZalioca"></tipovi:Naziv>
    </zlbo:Zalilac>
    <zlbo:Resenje>
        <zlbo:Donosilac_Odluke property="pred:donosilacOdluke"></zlbo:Donosilac_Odluke>
        <zlbo:Broj property="pred:brojResenja"></zlbo:Broj>
        <zlbo:Godina property="pred:godinaResenja"></zlbo:Godina>
    </zlbo:Resenje>
    <zlbo:Datum_Zahteva></zlbo:Datum_Zahteva>
    <zlbo:Osnov_Zalbe></zlbo:Osnov_Zalbe>
    <zlbo:Podnosilac>
        <zlbo:Ime property="pred:imePodnosilacaZalbe"></zlbo:Ime>
        <zlbo:Prezime property="pred:prezimePodnosilacaZalbe"></zlbo:Prezime>
    </zlbo:Podnosilac>
    <zlbo:Adresa>
        <tipovi:Mesto></tipovi:Mesto>
        <tipovi:Postanski_broj></tipovi:Postanski_broj>
        <tipovi:Ulica></tipovi:Ulica>
        <tipovi:Broj></tipovi:Broj>
    </zlbo:Adresa>
    <zlbo:Datum_Zalbe property="pred:datumZalbe"></zlbo:Datum_Zalbe>
    <zlbo:Kontakt></zlbo:Kontakt>
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
                    asker: Xonomy.askInt
                }
            ]
        }
    }
};


export {

    zalbaNaOdluku,
    zalbaNaOdlukuSpec

};
