package com.qws.producer.dao;

import com.qws.producer.entity.User;

/**
 * @author qiwenshuai
 * @description
 * @since 18-7-17 18:03 by jdk 1.8
 */

public interface UserDao {

     User  selectById(Integer  id);
}
