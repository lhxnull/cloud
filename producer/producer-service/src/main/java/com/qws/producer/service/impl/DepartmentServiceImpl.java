package com.qws.producer.service.impl;

import com.qws.producer.dao.DepartmentDao;
import com.qws.producer.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author qiwenshuai
 * @description
 * @since 18-7-18 19:11 by jdk 1.8
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentDao departmentDao;
    @Override
    public void updateById() {
        departmentDao.updateById();
        departmentDao.updateBy2Id();
    }

    @Override
    public void updateBy2Id() {
        departmentDao.updateBy2Id();
    }
}
