#! /bin/bash

# Default values or examples of variables are supplied.

JAVA=/home/ed/bin/java
# If java exists in $PATH then JAVA=java is sufficient.

BATDIR=`pwd`
# Directory that contains this shellscript.

UITVOERDIR=`pwd`
# Directory that is used to write to and read from.

A="-a"
# A="-a" means: alleen de fields/attributen in een class worden vertaald
#        naar een associatie tussen classes.
#        Dit is een wens van De HHS.

F="-f0"
# F="-f0" means: only the classnames of the detected design patterns
#         in the Java sources  are shown.
#         "-f0" is the default value of F. F="" en F=" " lead to the same results
# F="-f1" means: See F="-f0". And also, the classes, which were identified in
#         phase 1 and thus may be part of a design pattern, are 
#         the reasons are given if they are nevertheless not part
#         of the design pattern.


# DO NOT CHANGE THE CODE BENEATH.

JARDIR=jars
UITVOER=uitvoer.txt
JAVACUPJAR=${BATDIR}/${JARDIR}/java-cup-11b-20160615.jar
TRANSFORMJAR=${BATDIR}/${JARDIR}/TransformOutputParser.jar

OUT=out
# Directory with *class-files			       

${JAVA} -cp ${JAVACUPJAR}:${BATDIR}/${OUT} ParserController ${A} | ${JAVA} -cp ${BATDIR}/${OUT} ReadStdin ${UITVOER}

echo "Parsing is finished."

${JAVA} -jar ${TRANSFORMJAR} ${UITVOER}

echo "Input file for searching is ready."

${JAVA} -jar ${BATDIR}/${JARDIR}/DP_detection_in_sources.jar ${F}

echo "Finished!!"

