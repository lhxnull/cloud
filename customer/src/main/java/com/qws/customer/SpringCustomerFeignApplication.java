package com.qws.customer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
// 开启hystrix断路由
@EnableCircuitBreaker
//多种注册中心
@EnableDiscoveryClient
//如果指定了 ComponentScan扫描其他 package 则需要重复指定本包
@ComponentScan(basePackages = {"com.datasource.config","com.qws.customer","com.qws.producer.feign.fallback"})
//扫描feignClients
@EnableFeignClients(value = {"com.qws.producer.feign"})
public class SpringCustomerFeignApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCustomerFeignApplication.class,args);

    }
}
