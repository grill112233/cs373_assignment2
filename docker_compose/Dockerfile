#FROM tomcat:8.0-jre8 
FROM tomcat:8.5.45-jdk13-openjdk-oracle
LABEL maintainer="jarunchai"
#RUN apt-get update
EXPOSE 8080
USER root
COPY tomcat-users.xml /usr/local/tomcat/conf/
COPY context.xml /usr/local/tomcat/webapps/META-INF/
CMD ["catalina.sh", "run"]