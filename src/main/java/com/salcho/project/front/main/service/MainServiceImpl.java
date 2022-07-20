package com.salcho.project.front.main.service;

import com.salcho.project.front.main.dao.MainDAO;
import com.salcho.project.front.main.dto.MainDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MainService")
public class MainServiceImpl implements  MainService{

    @Autowired
    private MainDAO mainDao;

    @Override
    public MainDTO get(String path) {
        return mainDao.get(path);
    }
}