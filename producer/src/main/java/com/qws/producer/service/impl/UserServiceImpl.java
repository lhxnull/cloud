package com.qws.producer.service.impl;

import com.qws.producer.dao.UserDao;
import com.qws.producer.entity.User;
import com.qws.producer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qiwenshuai
 * @description
 * @since 18-7-17 18:19 by jdk 1.8
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;
    @Override
    public User selectById(Integer id) {
        return userDao.selectById(id);
    }
}
