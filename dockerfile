# Use the official Maven image as the builder
FROM maven:3.8.3-openjdk-17 AS builder

# Set the working directory in the container
WORKDIR /app

# Copy the project's pom.xml file to the container
COPY pom.xml .

# Download the project dependencies
RUN mvn dependency:go-offline

# Copy the entire project to the container
COPY . .

# Build the project
RUN mvn package -DskipTests

# Use OpenJDK as the base image for the runtime
FROM openjdk:17-jdk-alpine

# Set the working directory in the container
WORKDIR /app

# Copy the built JAR file from the builder stage to the runtime container
COPY --from=builder /app/target/NEX-0.0.1-SNAPSHOT.jar ./app.jar

# Expose the port that the Spring Boot application listens on
EXPOSE 8080

# Command to run the Spring Boot application
CMD ["java", "-jar", "app.jar"]
