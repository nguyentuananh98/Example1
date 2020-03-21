package com.nguyentuananh.controller;
import com.nguyentuananh.service.CategoryService;
import com.nguyentuananh.service.PerfumeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    PerfumeService perfumeService;
    @Autowired
    CategoryService categoryService;

    @GetMapping(value = {"/home"})
    public ModelAndView home(){
        ModelAndView modelAndView = new ModelAndView("perfume");
        modelAndView.addObject("perfume",perfumeService.finAll());
        return modelAndView;
    }

    @GetMapping(value = {"/category"})
    public ModelAndView category(){
        ModelAndView modelAndView = new ModelAndView("category");
        modelAndView.addObject("categories",categoryService.finAll());
        return modelAndView;
    }

}
