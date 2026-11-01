# bank-account-mockito


BANKACCOUNT - MOCKITO TESZTELÉS

Projekt leírása:

A projekt célja a korábban elkészített
BankAccount osztály kibővítése
értesítési szolgáltatással.

A program Java nyelven készül,
JUnit 5 és Mockito tesztkeretrendszerrel.


Használt technológiák:

- Java 17
- JUnit 5
- Mockito
- Maven
- Git
- GitHub
- GitHub Actions


Megvalósítandó funkciók:

BankAccount:
- Pénz befizetése
- Pénz felvétele
- Egyenleg lekérdezése

NotificationService:
- Értesítések küldésére szolgáló interfész

BankService:
- Befizetés végrehajtása
- Sikeres befizetés után értesítés küldése
- Dependency Injection alkalmazása

ExchangeRateService:
- Árfolyamokat szolgáltató interfész
- Előre beállított árfolyamértékek tesztelése


Mockito tesztelés:

A tesztek mock objektumokat használnak,
így nincs szükség valódi külső szolgáltatásokra.

A projektben használt Mockito funkciók:

- mock()
- verify()
- when().thenReturn()


Tesztelés:

A projekt Maven segítségével tesztelhető.

Parancs:

mvn clean test

A GitHub Actions segítségével a tesztek
automatikusan is futtathatók.


Projekt állapota:

1.0 - Projekt inicializálása.

A következő lépés a korábbi BankAccount
projekt forráskódjának átvétele.
