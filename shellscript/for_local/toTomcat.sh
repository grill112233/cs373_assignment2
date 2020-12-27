#!/bin/sh
cd /Users/Mac/.jenkins/workspace/cs373_assignment2/target/
mv assignment2-0.0.1-SNAPSHOT.war myweb.war
docker cp myweb.war tomcat_tomcat-assignment2_1:/usr/local/tomcat/webapps
