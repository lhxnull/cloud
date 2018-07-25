package com.qws.customer.feign;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


//value是服务名称
@FeignClient(value = "producer")
public interface ProducerFeign {

    @RequestMapping(value = "/findOne",method = RequestMethod.GET)
    String sayHiFromClientOne();

}
