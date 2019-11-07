package com.kostyawhite.photoapp.discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
public class PhotoAppDiscoveryServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhotoAppDiscoveryServerApplication.class, args);
    }

}
