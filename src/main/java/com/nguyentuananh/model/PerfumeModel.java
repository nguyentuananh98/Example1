package com.nguyentuananh.model;


import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class PerfumeModel {
    private Integer id;
    private String name;
    private double price;
}
