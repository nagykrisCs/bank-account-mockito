# bank-account-mockito



BANKACCOUNT - MOCKITO TESZTELÉS

Projekt leírása:

A projekt célja a korábban elkészített
BankAccount osztály kibővítése egy
értesítési szolgáltatással.

A program Java nyelven készült,
JUnit 5 és Mockito tesztkeretrendszerrel.

A Mockito segítségével a külső
szolgáltatásokat mock objektumok
helyettesítik a tesztelés során.


Használt technológiák:

- Java 17
- JUnit 5
- Mockito
- Maven
- Git
- GitHub
- GitHub Actions


Megvalósított funkciók:

BankAccount:
- Pénz befizetése
- Pénz felvétele
- Egyenleg lekérdezése
- Hibás műveletek kezelése

NotificationService:
- Értesítési szolgáltatás interfész
- send(String message) metódus

BankService:
- Befizetés végrehajtása
- Sikeres befizetés után értesítés küldése
- Dependency Injection alkalmazása
- Sikertelen befizetés esetén nincs értesítés

ExchangeRateService:
- Árfolyamszolgáltatás interfész
- Árfolyam lekérdezése két pénznem között


Projekt felépítése:

pom.xml
- Maven konfiguráció, JUnit 5 és Mockito függőségek.

src/main/java/BankAccount.java
- A bankszámla működésének megvalósítása.

src/main/java/NotificationService.java
- Az értesítési szolgáltatás interfésze.

src/main/java/BankService.java
- Befizetés és értesítés kezelése.

src/main/java/ExchangeRateService.java
- Az árfolyamszolgáltatás interfésze.

src/test/java/BankServiceTest.java
- Befizetések és értesítések Mockito tesztjei.

src/test/java/ExchangeRateServiceTest.java
- Árfolyamlekérdezés Mockito tesztje.

.github/workflows/tests.yml
- Automatikus tesztfuttatás GitHub Actions segítségével.

README.md
- Projekt dokumentáció.


Mockito használata:

A projekt a következő Mockito funkciókat használja:

mock()
- Mock objektum létrehozása.

verify()
- Metódushívások ellenőrzése.

when().thenReturn()
- Előre meghatározott válasz beállítása.

never()
- Annak ellenőrzése, hogy egy metódus
  nem került meghívásra.


JUnit 5 és Mockito tesztek:

1. A befizetés növeli a számla egyenlegét.
2. Sikeres befizetés után értesítés történik.
3. Sikertelen befizetés után nincs értesítés.
4. A mock árfolyamszolgáltatás a beállított
   árfolyamot adja vissza.

Az értesítések teszteléséhez nem szükséges
valódi külső értesítési szolgáltatás.

Az árfolyamteszt során a mock objektum
395.0 értéket ad vissza EUR/HUF esetén.


Futtatás és tesztelés:

A projekt futtatásához szükséges:

- Java 17 JDK
- Maven

A repository letöltése után a projekt
főkönyvtárában futtassuk a következő parancsot:

mvn clean test

A Maven lefordítja a Java forráskódokat,
majd lefuttatja a JUnit 5 és Mockito teszteket.

Elvárt eredmény:

4 sikeres teszt
0 sikertelen teszt
0 hiba


GitHub Actions:

A projekt automatikus tesztelést használ
GitHub Actions segítségével.

A tesztek minden push és pull request
esetén automatikusan lefutnak.

A tesztelés manuálisan is elindítható
az Actions felületen.

A tesztek eredménye a GitHub
Actions fülén ellenőrizhető.


Dependency Injection:

A BankService az értesítési szolgáltatást
konstruktoron keresztül kapja meg.

Ennek köszönhetően a valódi
NotificationService helyett
Mockito mock objektum használható.

Ez lehetővé teszi a BankService
független egységtesztelését.


Fejlesztési folyamat:

1.0 - Initial Mockito project setup
1.1 - Add BankAccount implementation
1.2 - Configure Maven JUnit 5 and Mockito
1.3 - Add NotificationService interface
1.4 - Implement BankService with dependency injection
1.5 - Add Mockito tests for deposits and notifications
1.6 - Add ExchangeRateService interface
1.7 - Add Mockito exchange rate test
1.8 - Configure GitHub Actions for Mockito tests
1.9 - FINAL: Update README documentation


Összegzés:

A projekt bemutatja a Mockito
tesztkeretrendszer alapvető használatát.

A BankService sikeres befizetés után
értesítést küld, hibás befizetés esetén
pedig nem történik értesítés.

A külső függőségeket mock objektumok
helyettesítik a tesztelés során.

A JUnit 5 tesztek ellenőrzik a működést,
a GitHub Actions pedig automatikusan
futtatja a teszteket.


Projekt állapota:

1.0 - Projekt inicializálása.

A következő lépés a korábbi BankAccount
projekt forráskódjának átvétele.
