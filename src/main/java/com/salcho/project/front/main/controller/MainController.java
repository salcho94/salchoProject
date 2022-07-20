package com.salcho.project.front.main.controller;


import com.salcho.project.front.main.dao.MainDAO;
import com.salcho.project.front.main.dto.MainDTO;
import com.salcho.project.front.main.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.awt.*;
import java.awt.List;
import java.util.*;


@RestController
public class MainController {

   @Autowired
   private MainService MainService;

    @GetMapping("")
    public ModelAndView index(ModelAndView model) {
        MainDTO menu = MainService.get("");
        ArrayList<Integer> main = new ArrayList<>();
        Set<Integer> dogImg = new HashSet<>();
        while (dogImg.size() < 12) {
            Double d = Math.random() * 300 + 1;
            dogImg.add(d.intValue());
        }
        ArrayList<Integer> list = new ArrayList<>(dogImg);

        model.addObject("dogImg",list);
        model.addObject("menu",menu);
        model.setViewName("content/front/index.html");
        return model;
    }
}
