FROM openjdk



# Copy Spring Boot application JAR file into container
COPY target/demo2.jar /app/demo2.jar

# Set working directory
WORKDIR /app

# Run Spring Boot application
CMD ["java", "-jar", "demo2.jar"]
