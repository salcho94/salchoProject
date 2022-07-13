package com.salcho.project.test.controller;


import com.salcho.project.good.dao.TestDAO;
import com.salcho.project.good.dto.TestDTO;
import com.salcho.project.test.dao.HappyDAO;
import com.salcho.project.test.dto.HappyDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/happy")
public class HappyController {

    @Autowired
    private HappyDAO happyDAO;

    @GetMapping("")
    public  String happy(){
        List<HappyDTO> happy = happyDAO.getlist();

        return  happy.get(0).getTitle();
    }
}
