package com.gzl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/gzl")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String SayHello() {
        System.out.println("Hello GZL");
        return "success";
    }
}
