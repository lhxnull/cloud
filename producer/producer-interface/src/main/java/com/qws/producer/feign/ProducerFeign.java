package com.qws.producer.feign;

import com.qws.producer.feign.fallback.ProducerFeignFallBack;
import com.qws.producer.feign.feignconfig.FeignConfiguration;
import feign.Param;
import feign.RequestLine;
import org.springframework.cloud.netflix.feign.FeignClient;


/**
 * value是服务名称 如果实现自定义的configuration
 *在使用FeignClient时，Spring会按name创建不同的ApplicationContext，
 *通过不同的Context来隔离FeignClient的配置信息，在使用配置类时，
 *不能把配置类放到Spring App Component scan的路径下，
 *否则，配置类会对所有FeignClient生效.
 */

@FeignClient(name = "producer",path = "/api",fallbackFactory=ProducerFeignFallBack.class,configuration = FeignConfiguration.class)
public interface ProducerFeign {

    /**
     * 类似于GetMapping,@param替换了 @PathVariable
     * */
    @RequestLine("GET /findOne/{id}")
    String sayHiFromClientOne( @Param("id") Integer id);

}
