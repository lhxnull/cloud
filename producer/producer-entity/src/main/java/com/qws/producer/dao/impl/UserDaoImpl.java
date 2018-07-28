package com.qws.producer.dao.impl;

import com.qws.producer.dao.UserDao;
import com.qws.producer.entity.User;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author qiwenshuai
 * @description
 * @since 18-7-17 18:04 by jdk 1.8
 */
@Repository
public class UserDaoImpl implements UserDao {

    private final  JdbcTemplate jdbcTemplate;

    public UserDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public User selectById(Integer id) {
        String sql ="select *  from qws_user  where id = ?";
        return  jdbcTemplate.queryForObject(sql,new Object[]{id} ,new BeanPropertyRowMapper<>(User.class));
    }
}
