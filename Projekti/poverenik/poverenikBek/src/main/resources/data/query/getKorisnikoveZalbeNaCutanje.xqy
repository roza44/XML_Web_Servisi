xquery version "3.1";
declare namespace zlbc = "http://www.ftn.uns.ac.rs/zalbacutanje";
for $x in collection("/db/sample/ZalbaNaCutanje")
where $x//zlbc:Zalba[@author="%s"]
return $x