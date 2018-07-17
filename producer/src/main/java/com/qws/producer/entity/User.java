package com.qws.producer.entity;

import java.io.Serializable;

/**
 * @author qiwenshuai
 * @description
 * @since 18-7-17 17:40 by jdk 1.8
 */
public class User implements Serializable {


    private static final long serialVersionUID = 1931300694098077506L;


    private Integer  id ;

    private String name;

    private String sex;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
