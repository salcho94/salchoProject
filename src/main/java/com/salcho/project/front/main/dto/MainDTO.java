package com.salcho.project.front.main.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class MainDTO {
    private String title;
    private String path;
    private String description;
    private String menu;
}
