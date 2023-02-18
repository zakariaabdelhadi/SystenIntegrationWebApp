#base  docker image openjdk:17
#FROM ubuntu:20.04
#FROM openjdk:17
#MAINTAINER docker@thb.de
#RUN apt-get update
#RUN apt-get install openjdk-17-jre-headless -y
# Gradle
#
#ADD ./build/libs/<Achtung Namen ihres Jars hier eintragen!>.jar /service.jar
# Maven


#COPY target/StudentenApp-0.0.1-SNAPSHOT.jar studenten-app-image.jar
#CMD  ["java","-jar", "studenten-app-image.jar"]
#EXPOSE 8080

FROM openjdk:17 AS maven_build

COPY pom.xml /tmp/

COPY src /tmp/src/

WORKDIR /tmp/


#pull base image

FROM eclipse-temurin:11

#maintainer 
MAINTAINER dstar55@yahoo.com
#expose port 8080
EXPOSE 8080

#default command

#copy hello world to docker image from builder image

COPY --from=maven_build /tmp/target/StudentenApp-0.0.1-SNAPSHOT.jar /data/StudentenApp-0.0.1-SNAPSHOT.jar
CMD java -jar /data/StudentenApp-0.0.1-SNAPSHOT.jar

