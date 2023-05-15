FROM maven:3.8.5-openjdk-17 AS build
RUN mkdir -p /workspace
WORKDIR /workspace
COPY pom.xml /workspace
COPY src /workspace/src
RUN mvn -B package --file pom.xml -DskipTests

FROM eclipse-temurin:17.0.5_8-jre-focal
WORKDIR /opt
COPY --from=build /workspace/target/*.jar /opt/app.jar

EXPOSE 8080

# Entry with exec
ENTRYPOINT exec java $JAVA_OPTS -jar /opt/app.jar