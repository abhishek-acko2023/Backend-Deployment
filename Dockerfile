# Build stage
FROM maven:3.8.3-openjdk-17
COPY . .
RUN mvn clean package -DskipTests

# Package stage
FROM openjdk:17-jdk-slim
COPY /target/backend-deployment-0.0.1-SNAPSHOT.jar backend-deployment-0.0.1-SNAPSHOT.jar

# ENV PORT
EXPOSE 8080

ENTRYPOINT ["java","-jar","backend-deployment-0.0.1-SNAPSHOT.jar"]