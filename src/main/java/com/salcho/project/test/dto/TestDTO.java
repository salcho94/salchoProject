package com.salcho.project.test.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class TestDTO {
    String name;
    String title;
    String content;
}
