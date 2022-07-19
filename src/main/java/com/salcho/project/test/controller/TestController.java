package com.salcho.project.test.controller;


import com.salcho.project.test.dao.TestDAO;
import com.salcho.project.test.dto.TestDTO;
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
    private TestDAO testDAO;

    @GetMapping("")
    public ModelAndView happy(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("content/test/test.html");
        List<TestDTO> test = testDAO.get();
        mav.addObject("test",test);
        return mav;
    }
}
