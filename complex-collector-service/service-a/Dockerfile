FROM maven:3.8.5-openjdk-17 as builder

COPY src /usr/src/app/src
COPY pom.xml /usr/src/app

RUN mvn -f /usr/src/app/pom.xml clean package

FROM openjdk:17.0.2-jdk-slim

COPY --from=builder /usr/src/app/target/service-a-0.0.1-SNAPSHOT.jar /app.jar
COPY otel/opentelemetry-javaagent.jar /opentelemetry-javaagent.jar

ENTRYPOINT java -jar -javaagent:opentelemetry-javaagent.jar -Dotel.service.name=service-a app.jar 