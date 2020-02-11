package com.itdr.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * ClassName: Users
 * 日期: 2020/1/13 19:18
 *
 * @author Air张
 * @since JDK 1.8
 */
@Component
public class Users {
    private String uname;
    private Integer age;
    private String psd;
    private Car c;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Car getC() {
        return c;
    }

    public void setC(Car c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "Users{" +
                "uname='" + uname + '\'' +
                ", age=" + age +
                ", psd='" + psd + '\'' +
                ", c=" + c +
                '}';
    }
}
