#! /bin/bash

JAVA=/home/ed/bin/java
# Als java tot het pad behoort dan is JAVA=java voldoende.

BATDIR=`pwd`
# Directory waarin deze shellscript zich bevindt.

UITVOERDIR=`pwd`
# Directory waarnaar en waarvan de uitvoer wordt gelezen.

A="-a"
# A="-a" betekent: alleen de fields/attributen in een class worden vertaald
#        naar een associatie tussen classes.
#        Dit is een wens van De HHS.

F="-f0"
# F="-f0" betekent: alleen van de herkende design patterns worden de
#         de classes in de Java sources getoond.
#         Dit is de default waarde van F. F="" en F=" " hebben hetzelfde effect.
# F="-f1" betekent: zie F="-f0"  Bovendien worden van de classes,
#         waarvan in fase 1 is vastgesteld dat zij mogelijk tot een design
#         pattern behoren, de reden aangegeven als zij toch geen deel uitmaken
#         van het design pattern.

# ONDERSTAANDE CODE NIET WIJZIGEN

JARDIR=jars
UITVOER=uitvoer.txt
JAVACUPJAR=${BATDIR}/${JARDIR}/java-cup-11b-20160615.jar
TRANSFORMJAR=${BATDIR}/${JARDIR}/TransformOutputParser.jar

OUT=out
# Directory met *class-files			       

${JAVA} -cp ${JAVACUPJAR}:${BATDIR}/${OUT} ParserController ${A} | ${JAVA} -cp ${BATDIR}/${OUT} ReadStdin ${UITVOER}

echo "Parsing is voltooid."

${JAVA} -jar ${TRANSFORMJAR} ${UITVOER}

echo "Invoer voor het zoekproces is gereed."

${JAVA} -jar ${BATDIR}/${JARDIR}/DP_detection_in_sources.jar ${F}

echo "Klaar!!"

