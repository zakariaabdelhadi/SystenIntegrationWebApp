#base  docker image openjdk:17
#FROM ubuntu:20.04
FROM openjdk:17
#MAINTAINER docker@thb.de
WORKDIR /applications

#RUN apt-get update
#RUN apt-get install openjdk-17-jre-headless -y
# Gradle
#
#ADD ./build/libs/<Achtung Namen ihres Jars hier eintragen!>.jar /service.jar
# Maven
WORKDIR /applications

COPY  target/StudentenApp-0.0.1-SNAPSHOT.jar /applications/studenten-app-image.jar
ENTRYPOINT java -jar /studenten-app-image.jar
EXPOSE 8080
