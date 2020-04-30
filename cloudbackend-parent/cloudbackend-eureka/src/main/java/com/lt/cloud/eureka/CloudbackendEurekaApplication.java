package com.lt.cloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class CloudbackendEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(CloudbackendEurekaApplication.class, args);
    }

}
