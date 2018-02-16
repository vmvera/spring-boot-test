FROM openjdk:8-jdk-alpine
COPY ./target/rest-api-0.0.1-SNAPSHOT.jar /usr/src/work/
WORKDIR /usr/src/work
EXPOSE 8080
CMD ["java", "-jar", "rest-api-0.0.1-SNAPSHOT.jar"]
