#base  docker image openjdk:17
FROM ubuntu:20.04
#FROM openjdk:17
MAINTAINER docker@thb.de
RUN apt-get update
RUN apt-get install openjdk-17-jre-headless -y
# Gradle
#
#ADD ./build/libs/<Achtung Namen ihres Jars hier eintragen!>.jar /service.jar
# Maven
#WORKDIR /applications
ADD ./target/StudentenApp-0.0.1-SNAPSHOT.jar /service.jar
ENTRYPOINT java -jar /service.jar
EXPOSE 8080

