# XML_Web_Servisi

# Uputstvo za pokretanje

## 1. Baze
Za portal službenika neophodno je preuzeti server Apache TomEE plus i u njegov webapps folder ubaciti instance exist baze (exist.war) i fuseki baze (fuseki.war).
Takođe je neophodno u conf/server.xml fajlu podesiti da server radi na portu 8181.

Za portal poverenika neophodno je preuzeti server Apache TomEE plus i u njegov webapps folder ubaciti instance exist baze (exist.war) i fuseki baze (fuseki.war).
Takođe je neophodno u conf/server.xml fajlu podesiti da server radi na portu 8180.

Nakon toga, oba servera je neophodno pokrenuti pokretanjem fajla startup.bat unutar bin foldera.


## 2. Spring Boot aplikacije
Spring Boot aplikacija portala službenika radi na portu 8080. Može se bildovati preko Maven alata ili pokrenuti kroz razvojno okruženje.

Spring Boot aplikacija portala poverenika radi na portu 8081. Može se bildovati preko Maven alata ili pokrenuti kroz razvojno okruženje.


## 1. Angular aplikacije
Angular aplikacija portala službenika radi na portu 4200. Pre pokretanja, neophodno je instalirati sve zavisnosti komandom npm install. Aplikacija se zatim može pokrenuti komandom ng serve.

Angular aplikacija portala poverenika radi na portu 4201. Pre pokretanja, neophodno je instalirati sve zavisnosti komandom npm install. Aplikacija se zatim može pokrenuti komandom ng serve.


## Autori

* Vukašin Jokić [GitHub](https://github.com/vujko)
* Jovan Bodroža [GitHub](https://github.com/roza44/)
* Nemanja Jevtić [GitHub](https://github.com/njevtic22)
* Luka Nikolić [GitHub](https://github.com/lukanikolic98)
