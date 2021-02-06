xquery version "3.1";
declare namespace zlbo = "http://www.ftn.uns.ac.rs/ZalbaNaOdluku";
for $x in collection("/db/sample/ZalbaNaOdluku")
where $x//zlbo:Zalba[@author="%s"]
return $x