# syntax=docker/dockerfile:1

FROM adoptopenjdk/openjdk11:ubi
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} Java_Rest_Service.jar
ENTRYPOINT ["java", "-jar", "/Java_Rest_Service.jar"]