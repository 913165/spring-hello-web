# Building and Pushing Docker Image for Spring Boot Application

This guide explains how to build a Docker image for a Spring Boot application and push it to Docker Hub.

## Prerequisites

- Docker installed on your machine
- Spring Boot application with Maven build configured

## Steps

### 1. Dockerfile Configuration

Create a `Dockerfile` in the root directory of your Spring Boot project with the following content:

```Dockerfile
# Use OpenJDK 11 as the base image
FROM openjdk:11-jre-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the Spring Boot application JAR file into the container
COPY target/spring-hello-web-0.0.1-SNAPSHOT.jar /app/spring-hello-web.jar

# Expose the port that the Spring Boot application uses
EXPOSE 8080

# Command to run the Spring Boot application when the container starts
CMD ["java", "-jar", "spring-hello-web.jar"]
```

### 2. Build Docker Image

docker build -t tinumistry/spring-hello-web .

### 3. Push Docker Image to Docker Hub

docker push tinumistry/spring-hello-web


