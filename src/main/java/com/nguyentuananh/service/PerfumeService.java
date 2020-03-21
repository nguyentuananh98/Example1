package com.nguyentuananh.service;
import com.nguyentuananh.model.PerfumeModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PerfumeService {
    static List< PerfumeModel > list = new ArrayList<>();

    static {
        list.add(
          PerfumeModel.builder().id(1).name("Rose").price(1000).build()
        );
        list.add(
                PerfumeModel.builder().id(2).name("Pink").price(2000).build()
        );
    }
    public List< PerfumeModel > finAll(){return list;}
    public PerfumeModel findById(Long id){
        PerfumeModel perfumeModel = null;
        for(int i =0;i<list.size();i++){
            if(list.get(i).getId() == id.longValue()){
                perfumeModel = list.get(i);
            }
        }
        return perfumeModel;
    }
}
