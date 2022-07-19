package com.salcho.project.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

    @GetMapping("")
    public ModelAndView index(ModelAndView model){
        model.setViewName("content/admin/index.html");
        return model;
    }
}
