FROM eclipse-temurin:17-jdk

WORKDIR /app

# Copy the already-built jar (from Jenkins)
COPY target/app.jar app.jar

EXPOSE 8181
# , "--spring.profiles.active=local"
ENTRYPOINT ["java", "-jar", "app.jar"]