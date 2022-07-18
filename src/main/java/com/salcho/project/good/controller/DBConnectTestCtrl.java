package com.salcho.project.good.controller;


import com.salcho.project.good.dao.TestDAO;
import com.salcho.project.good.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/home")
public class DBConnectTestCtrl {

    @Autowired
    private TestDAO testDao;

    @GetMapping("/main")
    public ModelAndView goHome(HttpServletRequest request) {
        ModelAndView mav = new ModelAndView();

        mav.setViewName("content/index.html");

        return mav;
    }

    @GetMapping("/content")
    public String content(Model model) {
        model.addAttribute("data","data입니다2");
        return "/content/home";
    }
}
