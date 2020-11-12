package com.gzl.domain;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    private Integer sex;

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", sex=" + sex +
                '}';
    }
}
