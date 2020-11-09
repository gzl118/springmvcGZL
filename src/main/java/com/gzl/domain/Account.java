package com.gzl.domain;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class Account implements Serializable {
    private String uname;

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPwd() {
        return Pwd;
    }

    public void setPwd(String pwd) {
        Pwd = pwd;
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }

    public Map<String, User> getMap() {
        return map;
    }

    public void setMap(Map<String, User> map) {
        this.map = map;
    }

    @Override
    public String toString() {
        return "Account{" +
                "uname='" + uname + '\'' +
                ", Pwd='" + Pwd + '\'' +
                ", user=" + user +
                ", list=" + list +
                ", map=" + map +
                '}';
    }

    private String Pwd;

    private User user;
    private List<User> list;
    private Map<String, User> map;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
