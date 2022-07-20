package com.salcho.project.test.controller;


import com.salcho.project.front.main.dao.MainDAO;
import com.salcho.project.front.main.dto.MainDTO;
import com.salcho.project.test.dao.TestDAO;
import com.salcho.project.test.dto.TestDTO;
import com.salcho.project.test.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService TestService;

    @Autowired
    private MainDAO mainDAO;

    @GetMapping("")
    public ModelAndView happy(){
        ModelAndView model = new ModelAndView();
        MainDTO menu = mainDAO.get("");
        model.addObject("menu",menu);

        List<TestDTO> test = TestService.get();
        model.addObject("test",test);

        model.setViewName("content/test/test.html");
        return model;
    }
}
