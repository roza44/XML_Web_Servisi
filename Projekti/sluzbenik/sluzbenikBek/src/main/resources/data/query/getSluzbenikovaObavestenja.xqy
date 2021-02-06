xquery version "3.1";
declare namespace ob = "http://www.ftn.uns.ac.rs/obavestenje";
for $x in collection("/db/sample/Obavestenje")
where $x//ob:Obavestenje[@author="%s"]
return $x