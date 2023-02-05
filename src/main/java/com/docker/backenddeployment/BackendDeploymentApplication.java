package com.docker.backenddeployment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BackendDeploymentApplication {

	public static void main(String[] args) {
		SpringApplication.run(BackendDeploymentApplication.class, args);
		System.out.println("Server is Running!");
	}

}
