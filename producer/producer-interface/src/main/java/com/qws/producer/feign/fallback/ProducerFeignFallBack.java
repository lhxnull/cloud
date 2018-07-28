package com.qws.producer.feign.fallback;


import com.qws.producer.feign.ProducerFeign;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class ProducerFeignFallBack implements FallbackFactory<ProducerFeign> {
    @Override
    public ProducerFeign create(Throwable throwable) {
        return id -> {
            System.out.println(throwable.getMessage());
            return "hystrix";
        };
    }
}
