cd /Users/Mac/Desktop/assignment2
export M2_HOME=/Users/Mac/.jenkins/tools/hudson.tasks.Maven_MavenInstallation/MAVEN3.6.3
export M2=$M2_HOME/bin
export PATH=$M2:$PATH
mvn clean
mvn package
