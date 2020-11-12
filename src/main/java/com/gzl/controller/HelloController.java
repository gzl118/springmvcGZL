package com.gzl.controller;

import com.gzl.domain.User;
import com.gzl.exception.SysException;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/gzl")
public class HelloController {

    @RequestMapping(path = "/hello")
    public String SayHello() {
        System.out.println("Hello GZL");
        return "success";
    }

    @RequestMapping(path = "/testRequestMapping", method = {RequestMethod.GET})
    public String TestRequestMapping(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("TestRequestMapping");
        System.out.println(request);
        String uname = request.getParameter("uname");
        System.out.println(uname);
        HttpSession session = request.getSession();
        System.out.println(session);
        ServletContext servletContext = session.getServletContext();
        System.out.println(servletContext);
        System.out.println(response);
        return "success";
    }

    @RequestMapping(value = "testRequestParam")
    public String testRequestParam(@RequestParam(value = "uname") String username) {
        System.out.println("testRequestParam被执行");
        System.out.println(username);
        return "success";
    }

    @RequestMapping(value = "testPathVariable/{id}")
    public String testPathVariable(@PathVariable(name = "id") String name) {
        System.out.println("testPathVariable被执行");
        System.out.println(name);
        return "success";
    }

    @RequestMapping(value = "testRequestHeader")
    public String testRequestHeader(@RequestHeader("Accept") String name) {
        System.out.println("testRequestHeader被执行");
        System.out.println(name);
        return "success";
    }

    @RequestMapping(value = "testCookieValue")
    public String testCookieValue(@CookieValue("JSESSIONID") String name) {
        System.out.println("testCookieValue被执行");
        System.out.println(name);
        return "success";
    }

    @RequestMapping(path = "/testVoid", method = {RequestMethod.GET})
    public void TestVoid(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("TestVoid被执行");
//        request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
//        response.sendRedirect(request.getContextPath() + "/params.jsp");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");
        response.getWriter().print("你好啊");
    }

    @RequestMapping(value = "testModelAndView")
    public ModelAndView testModelAndView() {
        System.out.println("testCookieValue被执行");
        ModelAndView mv = new ModelAndView();
        User user = new User();
        user.setAge(256);
        user.setSex(12);
        mv.addObject("user", user);
        mv.setViewName("success");
        return mv;
    }

    @RequestMapping(value = "testForwardAndRedirect")
    public String testForwardAndRedirect() throws SysException {
        System.out.println("testForwardAndRedirect被执行");
//        return "forward:/WEB-INF/pages/success.jsp";
//        return "redirect:/params.jsp";
//        return "forward:/params.jsp";
        try {
            int a = 10 / 0;
        } catch (Exception e) {
            e.printStackTrace();
            throw new SysException("不能被0除");
        }
        return "redirect:redirectSuccess";
    }

    @RequestMapping("/redirectSuccess")
    public String redirectSuccess() {
        return "success";
    }

    @RequestMapping("/testAjax")
    @ResponseBody
    public User testAjax(User body) throws SysException {

        System.out.println("testAjax被执行");
        System.out.println(body);
        body.setSex(1111);
        body.setAge(212212);
        return body;
    }
}
