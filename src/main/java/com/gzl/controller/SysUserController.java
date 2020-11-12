package com.gzl.controller;

import com.gzl.domain.SysUser;
import com.gzl.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/sysuser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/findall")
    public String FindAll(Model model) {
        System.out.println("controller执行FindAll");
        List<SysUser> sysUsers = sysUserService.FindAll();
        model.addAttribute("list", sysUsers);
        return "list";
    }
}
