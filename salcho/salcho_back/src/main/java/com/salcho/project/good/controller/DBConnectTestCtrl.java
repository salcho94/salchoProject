package com.salcho.project.good.controller;


import com.salcho.project.good.dao.TestDAO;
import com.salcho.project.good.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DBConnectTestCtrl {

    @Autowired
    private TestDAO testDAO;


    @GetMapping("/hello")
    public String test() {
        return "sucees";
    }
/*
    @GetMapping("/hello")
    public List<TestDTO> test() {
        return testDAO.getTestData();
    }*/
}
