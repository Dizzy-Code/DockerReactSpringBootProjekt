
## Swagger-UI

http://localhost:8080/swagger-ui/index.html

## Call Endpoint Browser

http://localhost:8080/api/hello

## Docker Image bauen und Container starten

### Projekt bauen /Jar erstellen
Baue das Projekt ohne Tests:
```bash
.\mvnw.cmd clean package -DskipTests
```
danach soll unter target die JAR liegen

### Docker Image bauen
```bash
docker build -t my-backend .
```

### Container starten
Docker muss vorher laufen (Docker Desktop starten)
```bash
docker run -p 8080:8080 my-backend
```

### Testen
Testen kann man über den Browser mit:

http://localhost:8080/api/hello
