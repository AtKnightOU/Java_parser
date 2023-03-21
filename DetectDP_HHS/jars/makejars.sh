#!/bin/bash

jar -c -f TransformOutputParser.jar  -e TransformOutputParser -C ../../out TransformOutputParser.class

# -----------------------------------------------
# Om onbekende reden is de door Netbeans gegenereerde jar niet bruikbaar.
# CommandLine argumenten worden niet "gezien".
# Hieronder wordt een bruikbare jar gemaakt.
# -----------------------------------------------

currentDir=`pwd`
cd /home/ed/NetBeansProjects/DP_detection_in_sources/build/classes

jar --create --file tmp.jar --main-class dp_detection_in_sources.DP_detection_in_sources *

mv tmp.jar $currentDir/DP_detection_in_sources.jar

cd $currentDir

# -----------------------------------------------
