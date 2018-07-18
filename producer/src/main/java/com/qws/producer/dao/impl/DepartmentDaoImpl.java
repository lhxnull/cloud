package com.qws.producer.dao.impl;

import com.qws.producer.dao.DepartmentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author qiwenshuai
 * @description
 * @since 18-7-18 19:02 by jdk 1.8
 */
@Repository
public class DepartmentDaoImpl implements DepartmentDao {

    private final   JdbcTemplate jdbcTemplate;

    @Autowired
    public DepartmentDaoImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public void updateById() {
        String sql ="update qws_department a set a.department='哈哈测试1' where a.id =1";
        this.jdbcTemplate.update(sql);
    }

    @Override
    public void updateBy2Id() {
        String sql ="update qws_department a set a.department='哈哈测试2' where a.id =2";
        this.jdbcTemplate.update(sql);
    }
}
