package com.armanc.ecommeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EcommEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommEurekaApplication.class, args);
    }

}
