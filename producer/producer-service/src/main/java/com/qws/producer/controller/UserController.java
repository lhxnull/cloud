package com.qws.producer.controller;

import com.qws.producer.service.DepartmentService;
import com.qws.producer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author qiwenshuai
 * @description
 * @since 18-7-18 18:17 by jdk 1.8
 */
@RestController
public class UserController {

    private final  UserService userService;
    private final DepartmentService departmentService;

    @Autowired
    public UserController(UserService userService, DepartmentService departmentService) {
        this.userService = userService;
        this.departmentService = departmentService;
    }

    @GetMapping("/findOne")
    public Object findOne(){
        return  userService.selectById(1);
    }

    @GetMapping("/test")
    public Object dd(){
        departmentService.updateById();
        return  1;
    }
}
