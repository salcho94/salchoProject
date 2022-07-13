package com.salcho.project.test.dto;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class HappyDTO {
    String id;
    String title;
    String address;
    Integer grade;
    String review;
    Double lon;
    Double lat;
}
