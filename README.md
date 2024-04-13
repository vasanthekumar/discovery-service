# Eureka Server Application

This is a simple Eureka server application build with Spring Boot. It acts as s service registry for microservices in a distributed system. 

## Overview

The Eureka server allows microservices to register themselves and discover other services in the system. It provides a central repository of service metadata (such as host,port and health status) that clients can query to locate services dynamically.

## Requirements
- Java 17 or higher
- Maven 3.9.4

## Dependencies

The Eureka server application relies on Config Server.Make Sure before starting the Eureka server config server needs to be up and running.  
Note : If you are not running the config server on port 8191 please configure below property in bootstrap properties file accordingly.
 spring.cloud.config.uri= http://localhost:<Your config server port>

## Running the Application

To run the Eureka server application locally, follow these steps:

1. Clone this repository to your local machine:
   https://github.com/vasanthekumar/discovery-service.git
2. Navigate to the project directory:
    cd discovery-service
3. Build the application using Maven
   mvn clean install
4. Run the application:
   java -jar demo-discovery-0.0.1-SNAPSHOT.jar
5. Access the Eureka server dashboard in your web browser:
   http://localhost:8761/

## Configuration

The Eureka server application can be configured using properties in the cloud config server.
 https://github.com/vasanthekumar/cloud-country-service-config-store/blob/main/discovery-service/discovery.properties
 ~`server.port`: The port number on which the Eureaka server listens for incoming requests.
 ~`eureka.client.register-with-eureka`: Indicates whether the server should register itself with itself.
 ~`eureka.client.fetch-registry`: Indicates whether the server should fetch the registry information from itself.
 ~ Other Eureka-specific properties for configuring instance metadata etc.

