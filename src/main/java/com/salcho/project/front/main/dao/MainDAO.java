package com.salcho.project.front.main.dao;

import com.salcho.project.front.main.dto.MainDTO;
import org.springframework.stereotype.Service;

public interface MainDAO {
    MainDTO get(String path);
}
