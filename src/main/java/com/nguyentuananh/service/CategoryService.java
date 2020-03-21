package com.nguyentuananh.service;


import com.nguyentuananh.model.CategoryModel;
import lombok.Builder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService {
     static List< CategoryModel > listCategory = new ArrayList<>();
     static {
         listCategory.add(
                 CategoryModel.builder().id(1).name("Men's Perfume").build()
         );
         listCategory.add(
                 CategoryModel.builder().id(2).name("Woman's Perfume").build()
         );
     }


    public List< CategoryModel > finAll(){return listCategory;}
    public CategoryModel findById(Long id){
        CategoryModel categoryModel = null;
        for(int i =0;i<listCategory.size();i++){
            if(listCategory.get(i).getId() == id.longValue()){
                categoryModel = listCategory.get(i);
            }
        }
        return categoryModel;
    }
}
