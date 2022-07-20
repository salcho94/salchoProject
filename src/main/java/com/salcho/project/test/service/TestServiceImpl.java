package com.salcho.project.test.service;

import com.salcho.project.test.dao.TestDAO;
import com.salcho.project.test.dto.TestDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("TestService")
public class TestServiceImpl implements TestService{

    @Autowired
    private TestDAO testDAO;

    public List<TestDTO> get(){
      return  testDAO.get();
    }
}
