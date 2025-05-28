# Dockerfile
FROM eclipse-temurin:17-jdk-alpine

ARG JAR_FILE=build/libs/test-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]