package com.cht.springstudy.bean;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * com.cht.springstudy.bean
 *
 * @author chenhaiting
 * @name UserBean
 * @description
 * @date 2018-04-29 16:30
 * <p>
 * <p>
 * Copyright (c) 2018 武汉众汇信资产管理有限公司 版权所有
 */
public class UserBean {

    private String userName;

    private Integer age;

    private double height;

    //使用@DateTimeFormat注解需要在springmvc配置文件中做如下配置：<mvc:annotation-driven/>
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date date;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


    @Override
    public String toString() {
        return "UserBean{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", date=" + date +
                '}';
    }
}
