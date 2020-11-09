package com.gzl.controller;

import com.gzl.domain.Account;
import com.gzl.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    public String SaveUser(User user) {
        System.out.println(user);
        return "success";
    }
}
