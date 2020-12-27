#!/bin/sh
cd shellscript/for_jenkins/
./docker.sh &
cd ..
cd shellscript/for_jenkins/
./toTomca.sh
