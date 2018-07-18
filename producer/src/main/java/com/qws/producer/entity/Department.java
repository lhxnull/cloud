package com.qws.producer.entity;

import java.io.Serializable;

/**
 * @author qiwenshuai
 * @description
 * @since 18-7-18 18:59 by jdk 1.8
 */
public class Department implements Serializable {


    private static final long serialVersionUID = 3738890983902554270L;
    
    
    private Integer id ;
    
    private String department;


    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
