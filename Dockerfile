# Use Maven image to build the Spring Boot application
FROM maven:3.8.4-openjdk-17-slim AS build

# Set the working directory inside the container
WORKDIR /build

# Copy the Maven project files into the container
COPY . /build

# Build the Spring Boot application
RUN mvn clean package

# Use OpenJDK 17 as the base image
FROM adoptopenjdk/openjdk17:alpine-jre

# Set the working directory inside the container
WORKDIR /app

# Copy the built Spring Boot application JAR file into the container from the build stage
COPY --from=build /build/target/spring-hello-web-0.0.1-SNAPSHOT.jar /app/spring-hello-web.jar

# Expose the port that the Spring Boot application uses
EXPOSE 8080

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "spring-hello-web.jar"]
