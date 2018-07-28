package com.qws.producer.controller;

import com.qws.producer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiwenshuai
 * @description
 * @since 18-7-18 18:17 by jdk 1.8
 */
@RestController
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/findOne/{id}")
    public Object findOne( @PathVariable("id") Integer id){
        return  userService.selectById(id);
    }

}
