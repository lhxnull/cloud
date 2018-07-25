package com.qws.customer.controller;


import com.qws.customer.feign.ProducerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FindOneController {


    @Autowired
    ProducerFeign producerFeign;

    @GetMapping(value = "/hi")
    public String sayHi() {
        return producerFeign.sayHiFromClientOne();
    }

}
