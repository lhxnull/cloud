package com.qws.erueak;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author qiwenshuai
 * @description
 * @since 18-7-9 14:05 by jdk 1.8
 */
@SpringBootApplication
@EnableEurekaServer
public class SpringErueakApplication {
        public static void main(String[] args) {
            SpringApplication.run(SpringErueakApplication.class, args);
        }

}
