package com.gzl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/gzl")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String SayHello() {
        System.out.println("Hello GZL");
        return "success";
    }

    @RequestMapping(path = "/testRequestMapping", method = {RequestMethod.GET}, params = {"uname=aaa"})
    public String TestRequestMapping() {
        System.out.println("TestRequestMapping");
        return "success";
    }
}
