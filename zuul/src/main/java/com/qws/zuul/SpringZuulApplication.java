package com.qws.zuul;

import com.qws.zuul.filter.ZuulFiliter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * @author qiwenshuai
 * @description
 * @since 18-7-9 14:59 by jdk 1.8
 */
@SpringBootApplication
@EnableZuulProxy
public class SpringZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringZuulApplication.class, args);
    }


    @Bean
    public ZuulFiliter zuulFiliter() {
        return new ZuulFiliter();
    }
}
