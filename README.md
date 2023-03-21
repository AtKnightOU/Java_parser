# Java_parser

### Alleen de software uitvoeren
Download  alleen de directory 
*DetectDP_HHS*.


Als gewerkt wordt onder:
1. Linux   
   pas dan de file *startProcessJavaFiles.sh* aan.
   
   Wijzig alleen  *JAVA=/home/ed/bin/java*.
2. Windows
\
   pas dan de file *startProcessJavaFiles.bat* aan.
   \
   Wijzig indien nodig of gewenst, zoals in de code is aangegeven:
   
   a. "JAVA=C:\Program Files\Common Files\Oracle\Java\javapath\java"
   
   b. "BATDIR=C:\Users\Eigenaar\Desktop\DetectDP_HHS"
   
   c. en eventueel "UITVOERDIR=%BATDIR%"
   
De file *DetectionDP.log* bevat behalve de beschrijving van de herkende design patterns
ook de redenen waarom classes geen deel uitmaken van een design pattern.

***


## Software aanpassen


Er wordt gebruikt gemaakt van:

| Software | Versie | url                                                   |
|----------|--------|-------------------------------------------------------|
| jflex    | 1.9    |https://www.jflex.de/                                  |
| cup      |CUP v0.11a beta 20060608 | http://www2.cs.tum.edu/projects/cup/ |


Deze software is alleen noodzakelijk als de grammatica van Java en/of semantische acties 
worden aangepast.
\
Deze software is geen onderdeel van de repository, maar kan gemakkelijk worden gedownload en ge&iuml;nstalleerd.

De grammatica van Java is gebaseerd op java12.cup.                                  
Zie: https://github.com/joewalnes/idea-community/tree/master/tools/lexer/jflex-1.4/examples/java
\
De grammatica is aangepast en opgenomen in de code.
\
Zie *src/main/cup/java12.cup*.

### Doelen van software en samenwerking
Het bleek onder Windows niet mogelijk om de uitvoer van de parser door *ParserController* 
\
m.b.v. een redirect naar een file te schrijven.
\
In plaats daarvan wordt de uitvoer van de parser gelezen door *ReadStdin* en geschreven in een file.

*src/main/java/TransformOutputParser.java* maakt na het parsen de uitvoer van *ReadStdin*
geschikt voor *Detection_Design_Patterns*. 
\
Zie onder.


De code in deze repository werkt samen met de code in 
\
*https://github.com/AtKnightOU/Detection_Design_Patterns*.
\
Deze software leest de definties van design patterns die
beschreven zijn in *templates.xml*.
\
Tevens worden de gegevens van de classes en interfaces van de Java sources
gelezen in *inputSystem.xml*.

De  classes van de herkende design patterns worden op het scherm getoond.
\
De file *DetectionDP.log* bevat behalve deze beschrijving ook de
\
redenen waarom classes geen deel uitmaken van een design pattern.

