package com.qws.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.JdbcTemplateAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author qiwenshuai
 * @description
 * @since 18-7-17 15:31 by jdk 1.8
 */
@SpringBootApplication
@ComponentScan(basePackages = {"com.datasource.config"})
@SpringBootConfiguration
@EnableDiscoveryClient
@RestController
public class SpringProducerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringProducerApplication.class, args);
    }


    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }


}
