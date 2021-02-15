# Programowanie w jezyku Java Project
Program ma byc zbudowany z nastepujacych klas:

 * TMain, (zdefinowana na zaj)
 * TCzynnosc, (def na zaj)
 * TProces (def na zaj)

 * TBufor, TZachorowania extends TCzynnosc, 
* TPandemia extends TProces. 

1. Nie zmieniamy zawartosci klas TCzynnosc oraz TProces z zajec. 
2. Klasa TZachorowania ma jeden element typu dane: zachorowania (liczba calkowita).
3. Klasa TPandemia ma jeden element typu dane: srednia_zachorowan (liczba rzeczywista). 
4. Element typu dane zachorowania bedziemy wczytywac z pliku. Element typu dane srednia_zachorowan bedziemy obliczac z danych pochodzacych z listy zdefiniowanej w klasie TProces. TBufor sluzy do wczytywania danych z pliku.

`Input:` wczytanie danych w formacie csv ze zbioru danych pochodzacym ze strony internetowej agencji Unii Europejskiej - European Centre for Disease Prevention and Control (https://www.ecdc.europa.eu/en/publications-data/download-todays-data-geographic-distribution-covid-19-cases-worldwide). Prosze wczytac tylko dane pochodzace z Polski. Prosze wczytac te dane w dwoch etapach: (1) wczytanie danych do bufora (listy obiektow zdefiniowanych samodzielnie) oraz (2) przekopiowanie danych z listyobiektow bufora do naszego programu.

`Output:` prosze wypisac na konsoli tylko srednia dzienna liczbe zachorowan.
Na piatke: prosze na wyjsciu utworzyc baze danych z danymi z programu lub dodac obsluge okienkowa do programu.
 

```
dateRep,day,month,year,cases,deaths,countriesAndTerritories,geoId,countryterritoryCode,popData2018,continentExp

30/05/2020,30,5,2020,330,13,Poland,PL,POL,37978548,Europe

```

