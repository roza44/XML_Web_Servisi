xquery version "3.1";
declare namespace za = "http://www.ftn.uns.ac.rs/zahtev";
for $x in collection("/db/sample/Zahtev")
where $x//za:Zahtev[@author="%s"]
return $x