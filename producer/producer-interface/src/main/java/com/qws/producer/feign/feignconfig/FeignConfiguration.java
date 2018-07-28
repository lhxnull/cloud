package com.qws.producer.feign.feignconfig;

import feign.Contract;
import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignConfiguration {

    /**
     * 使用feign自己的spring--annotation 不使用spring-MVC那一套,具体配置{@link (com.qws.producer.feign.ProducerFeign)}.
     * */
    @Bean
    public Contract feignContract() {
        return new feign.Contract.Default();
    }


    //打印feign的日志,目前feign只对debug有效
    @Bean
    Logger.Level feignLoggerLevel() {
        return Logger.Level.FULL;
    }
}
