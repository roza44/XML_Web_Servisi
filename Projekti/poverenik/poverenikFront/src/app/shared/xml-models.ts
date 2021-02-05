
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
            <tipovi:Mesto>Mesto0</tipovi:Mesto>
            <tipovi:Postanski_broj>25500</tipovi:Postanski_broj>
            <tipovi:Ulica>Ulica0</tipovi:Ulica>
            <tipovi:Broj>50</tipovi:Broj>
        </tipovi:Adresa>
        <tipovi:Naziv property="pred:nazivZalioca">Bodroza DOO</tipovi:Naziv>
    </zlbo:Zalilac>
    <zlbo:Resenje>
        <zlbo:Donosilac_Odluke property="pred:donosilacOdluke">Rade Gojkovic</zlbo:Donosilac_Odluke>
        <zlbo:Broj property="pred:brojResenja">0</zlbo:Broj>
        <zlbo:Godina property="pred:godinaResenja">2020</zlbo:Godina>
    </zlbo:Resenje>
    <zlbo:Datum_Zahteva>2006-05-04</zlbo:Datum_Zahteva>
    <zlbo:Osnov_Zalbe>Osnov_Zalbe0</zlbo:Osnov_Zalbe>
    <zlbo:Podnosilac>
        <zlbo:Ime property="pred:imePodnosilacaZalbe">Radovan</zlbo:Ime>
        <zlbo:Prezime property="pred:prezimePodnosilacaZalbe">Bodroza</zlbo:Prezime>
    </zlbo:Podnosilac>
    <zlbo:Adresa>
        <tipovi:Mesto>Mesto1</tipovi:Mesto>
        <tipovi:Postanski_broj>25500</tipovi:Postanski_broj>
        <tipovi:Ulica>Ulica1</tipovi:Ulica>
        <tipovi:Broj>50</tipovi:Broj>
    </zlbo:Adresa>
    <zlbo:Datum_Zalbe property="pred:datumZalbe"> 2006-05-04</zlbo:Datum_Zalbe>
    <zlbo:Kontakt>bodroza.joca@gmail.com</zlbo:Kontakt>
</zlbo:Zalba>`;


export {

    zalbaNaOdluku

};
