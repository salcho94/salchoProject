package com.salcho.project.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
public class MainController {

    @GetMapping("/")
    public ModelAndView index(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("content/index.html");
        return mav;
    }
}
