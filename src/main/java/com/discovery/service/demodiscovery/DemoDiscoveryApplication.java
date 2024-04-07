package com.discovery.service.demodiscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Main class for the Eureka server application.
 * This class initializes the Eureka server and start it.
 * @author kvasanthakumar
 * @version 0.0.1
 * Date: April 4,2024
 */
@SpringBootApplication
@EnableEurekaServer
public class DemoDiscoveryApplication {

	/**
	 * Main method to start the Eureka server.
	 * @param args Command line arguments
	 */
	public static void main(String[] args) {
		//Start the Eureka server
		SpringApplication.run(DemoDiscoveryApplication.class, args);
	}

}
