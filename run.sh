#!/bin/sh
cd shellscript/for_jenkins/
echo "--------- Please run 2 time for project ---------"
echo "Step 1: for build images and create container."
echo "Step 2: for copy .war to container."
if [[ "$(docker images tomcat  | grep tomcat  2> /dev/null)" != "" ]]; then
    echo "exist."
    ./toTomcat.sh
else
    echo "Don't exist."
    ./docker.sh
fi
