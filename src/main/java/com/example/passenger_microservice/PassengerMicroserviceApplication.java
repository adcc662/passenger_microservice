package com.example.passenger_microservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PassengerMicroserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(PassengerMicroserviceApplication.class, args);
    }

}
