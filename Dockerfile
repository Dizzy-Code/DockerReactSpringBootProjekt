# Start mit einem schlanken Java-Basisimage
FROM eclipse-temurin:17-jdk-alpine

# Arbeitsverzeichnis in Container
WORKDIR /app

# Kopiere das JAR ins Image
COPY target/backend-0.0.1-SNAPSHOT.jar app.jar

# Startbefehl
ENTRYPOINT ["java", "-jar", "app.jar"]
