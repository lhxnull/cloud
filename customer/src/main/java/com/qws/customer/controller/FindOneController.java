package com.qws.customer.controller;


import com.qws.producer.feign.ProducerFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class FindOneController {


    private  final  ProducerFeign  producerFeign;

    @Autowired
    public FindOneController(ProducerFeign producerFeign) {
        this.producerFeign = producerFeign;
    }

    @GetMapping(value = "/hi/{id}")
    public String sayHi(@PathVariable("id") Integer  id) {
        return producerFeign.sayHiFromClientOne(id);
    }

}
