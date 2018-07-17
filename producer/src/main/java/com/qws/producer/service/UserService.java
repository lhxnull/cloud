package com.qws.producer.service;

import com.qws.producer.entity.User;

/**
 * @author qiwenshuai
 * @description
 * @since 18-7-17 18:18 by jdk 1.8
 */
public interface UserService {

    User selectById(Integer  id);
}
