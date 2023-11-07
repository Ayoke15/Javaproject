FROM maven:3.8.4-openjdk-11 as build
WORKDIR /app-server
COPY pom.xml .
COPY src src
RUN mvn clean install -Dmaven.compiler.source=11 -Dmaven.compiler.target=11
FROM amazoncorretto:11-alpine-jdk
COPY --from=build /app-server/target/*.jar app.jar
CMD ["java", "-jar","app.jar"]

