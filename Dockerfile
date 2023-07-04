# Use a base image suitable for running Java applications
FROM adoptopenjdk:11-jre-hotspot
# Set the working directory inside the container
WORKDIR /app
COPY target/azureDemo-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
