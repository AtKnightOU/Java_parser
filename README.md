# Java_parser

### Als je alleen de software wilt uitvoeren,
download dan alleen de directory 
*DetectDP_HHS*.
\

Als je werkt onder:
1. Linux   
   pas dan de file *startProcessJavaFiles.sh* aan.
   
   Wijzig alleen  *JAVA=/home/ed/bin/java*
2. Windows
   pas dan de file *startProcessJavaFiles.bat* aan.
   \
   Wijzig indien nodig of gewenst, zoals in de code is aangegeven:
   
   a. "JAVA=C:\Program Files\Common Files\Oracle\Java\javapath\java"
   
   b. "BATDIR=C:\Users\Eigenaar\Desktop\DetectDP_HHS"
   
   c. en eventueel "UITVOERDIR=%BATDIR%"
   
De file *DetectionDP.log* bevat behalve de beschrijving van de herkende design patterns
ook de redenen waarom classes geen deel uitmaken van een design pattern.

***


## Als je de software wilt aanpassen


Er wordt gebruikt gemaakt van:

| Software | Versie | url                                                   |
|----------|--------|-------------------------------------------------------|

| jflex    | 1.9    |https://www.jflex.de/                                  |
| cup      |CUP v0.11a beta 20060608 | http://www2.cs.tum.edu/projects/cup/ |


Deze software is alleen noodzakelijk als de grammatica van Java en/of semantische acties worden aangepast.

De grammatica van Java is gebaseerd op java12.cup.                                  
Zie: https://github.com/joewalnes/idea-community/tree/master/tools/lexer/jflex-1.4/examples/java
\
De grammatica is aangepast en opgenomen in de code.

De code in deze repository werkt samen met de code in 
\
*https://github.com/AtKnightOU/Detection_Design_Patterns*.
\
Wordt vervolgd.
