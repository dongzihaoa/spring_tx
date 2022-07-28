package com.dzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController {

    @RequestMapping("login")
    public ModelAndView login() {

        System.out.println("登录");

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("username","dzh");
        modelAndView.setViewName("/login");

        return modelAndView;
    }

}
