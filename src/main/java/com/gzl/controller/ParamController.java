package com.gzl.controller;

import com.gzl.domain.Account;
import com.gzl.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.Map;

@Controller
@RequestMapping("/param")
public class ParamController {
    @RequestMapping(path = "/testParam")
    public String TestParam(String uname) {
        System.out.println("testParam:" + uname);
        return "success";
    }

    @RequestMapping(path = "/saveAccount")
    public String SaveAccount(Account account) {
        System.out.println(account);
        return "success";
    }

    @RequestMapping(path = "/saveUser")
    public String SaveUser(@ModelAttribute("abc") User user) {
        System.out.println(user);
        return "success";
    }

    @RequestMapping(value = "testRequestBody")
    public String testRequestBody(@RequestBody String body) {
        System.out.println("testRequestBody被执行");
        System.out.println(body);
        return "success";
    }

    @ModelAttribute
    public void showUser(Integer age, Map<String, User> map) {
        System.out.println("执行showUser");
        User user = new User();
        user.setAge(age);
        user.setSex(5);
        map.put("abc", user);
    }
}
