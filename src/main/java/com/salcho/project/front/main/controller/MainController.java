package com.salcho.project.front.main.controller;


import com.salcho.project.front.main.dao.MainDAO;
import com.salcho.project.front.main.dto.MainDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class MainController {

   @Autowired
   private MainDAO mainDAO;

    @GetMapping("")
    public ModelAndView index(ModelAndView model) {
        String path = "";
        MainDTO menu = mainDAO.get(path);
        model.addObject("menu",menu);
        model.setViewName("content/front/index.html");
        return model;
    }
}
