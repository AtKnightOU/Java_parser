echo off

REM Wijzig onderstaande drie set statements
REM =======================================

REM Als Java.exe in het PATH voorkomt, is SET "Java=java"
REM waarschijnlijk toereikend.
set "JAVA=C:\Program Files\Common Files\Oracle\Java\javapath\java"

REM Leg vast waar de map DetectDP_HHS zich bevindt.
REM Gebruik geen spatie(s) in de naam van het pad.
REM De naam DetectDP_HHS mag veranderd worden.
set "BATDIR=C:\Users\Eigenaar\Desktop\DetectDP_HHS"

REM Runtime worden twee files gecreeerd.
REM Hieronder wordt vastgelegd in welke map deze files worden geschreven.
REM Gebruik geen spatie(s) in de naam van het pad.
set "UITVOERDIR=%BATDIR%"

set "A=-a"
rem "A=-a" betekent: alleen de fields/attributen in een class worden vertaald 
rem        naar een associatie tussen classes. 
rem        Dit is een wens van De HHS.
rem "A=  " betekent dat fields/attributen, parameters en locale variabelen 
rem        worden vertaald naar een associatietussen classes.
 
set "F=-f0"
rem "F=-f0" betekent: alleen van de herkende design patterns worden de 
rem         classes in de Java sources getoond.
rem         Dit is de default waarde van F. set "F= " heeft dus hetzelfde effect.
rem "F=-f1" betekent:  zie "F=f0" Bovendien worden van de classes,  
rem         waarvan in fase 1 is vastgesteld dat zij mogelijk tot een design pattern behoren,  
rem         de reden aangegeven als zij toch geen deel uitmaken van het design pattern.


REM Onderstaande code mag niet worden gewijzigd!
REM ============================================

set "JARDIR=jars"
set "UITVOER=uitvoer.txt"
set "JAVACUPJAR=%BATDIR%\%JARDIR%\java-cup-11b-20160615.jar"
set "TRANSFORMJAR=%BATDIR%\%JARDIR%\TransformOutputParser.jar"
set "OUT=out"

echo "Even geduld."

"%JAVA%" -cp  %JAVACUPJAR%;%BATDIR%\%OUT% ParserController %A% | "%JAVA%" -cp  %BATDIR%\%OUT% ReadStdin %UITVOERDIR%\%UITVOER%

echo "Parsing is voltooid."

"%JAVA%" -jar %TRANSFORMJAR% %UITVOER%

echo "Invoer voor het zoekproces is gereed." 

"%JAVA%" -jar  %BATDIR%\%JARDIR%\DP_detection_in_sources.jar %F%

echo "Klaar!!"

pause

