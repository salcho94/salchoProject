package com.salcho.project.front.introduce.controller;

import com.salcho.project.front.main.dao.MainDAO;
import com.salcho.project.front.main.dto.MainDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/introduce")
public class IntroduceController {

    @Autowired
    private MainDAO mainDAO;

    @GetMapping("")
    public ModelAndView introduce(ModelAndView model) {
        MainDTO menu = mainDAO.get("introduce");
        model.addObject("menu",menu);
        model.setViewName("content/front/introduce/introduce.html");
        return model;
    }
}
