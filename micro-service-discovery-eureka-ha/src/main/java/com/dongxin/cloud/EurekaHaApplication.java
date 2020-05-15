package com.dongxin.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author DongXin
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaHaApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaHaApplication.class, args);
    }

}