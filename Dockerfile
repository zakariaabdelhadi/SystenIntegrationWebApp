#base  docker image openjdk:17
FROM ubuntu:20.04
MAINTAINER docker@thb.de
RUN apt-get update
RUN apt-get install openjdk-17-jre-headless -y
# Gradle
#
#ADD ./build/libs/<Achtung Namen ihres Jars hier eintragen!>.jar /service.jar
# Maven
ADD StudentenApp-0.0.1-SNAPSHOT.jar /studenten-app-image.jar
ENTRYPOINT java -jar /studenten-app-image.jar
EXPOSE 8080
