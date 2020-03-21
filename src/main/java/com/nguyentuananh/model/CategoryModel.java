package com.nguyentuananh.model;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.nio.file.FileStore;

@Data
@Builder
@Setter
@Getter
public class  CategoryModel {
    private Integer id;
    private String name;

}
