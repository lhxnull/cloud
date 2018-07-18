package com.qws.producer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;


/**
 * @author qiwenshuai
 * @description
 * @since 18-7-17 15:31 by jdk 1.8
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.datasource.config","com.qws.producer"})
@EnableDiscoveryClient
public class SpringProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProducerApplication.class, args);
    }
}
