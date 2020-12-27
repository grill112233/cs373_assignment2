#!/bin/sh
cd shellscript/for_jenkins/

if [[ "$(docker images tomcat  | grep tomcat  2> /dev/null)" != "" ]]; then
    echo "exist."
    ./toTomcat.sh
else
    echo "Don't exist."
    ./docker.sh
fi
