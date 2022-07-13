package com.salcho.project.good.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TestDTO {
    private int id;
    private String name;
    private String email;
}
