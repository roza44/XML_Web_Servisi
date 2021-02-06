xquery version "3.1";
declare namespace ob = "http://www.ftn.uns.ac.rs/obavestenje";
for $x in collection("/db/sample/Obavestenje")
where $x//ob:Obavestenje[@for-who="%s"]
return $x