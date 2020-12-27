#!/bin/sh
cd shellscript/for_jenkins/
./docker.sh &
echo "--------- Please run 2 time for project ---------"
echo "Step 1: for build images and create container."
echo "Step 2: for copy .war to container."
cd ..
cd ..
cd shellscript/for_jenkins/
./toTomcat.sh
