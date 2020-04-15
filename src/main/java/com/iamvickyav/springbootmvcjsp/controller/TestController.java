package com.iamvickyav.springbootmvcjsp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/test")
public class TestController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String getHomePage(){
        return "home";
    }

    @RequestMapping(value = "/profile",method = RequestMethod.GET)
    ModelAndView getProfilePage(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("profile");
        modelAndView.addObject("title","Mr");
        modelAndView.addObject("name","Dhoni");
        return modelAndView;
    }

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    String getListPage(){
        return "list";
    }
}
