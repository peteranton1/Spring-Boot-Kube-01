FROM openjdk:17-jdk-slim-buster

WORKDIR /opt/app
ARG JAR_FILE=./build/libs/Spring-Boot-Kube-01-1.0.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java","-jar","app.jar"]
