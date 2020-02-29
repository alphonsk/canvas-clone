package com.george.canvas.controller;

import com.george.canvas.model.Course;
import com.george.canvas.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("admin")
public class AdminController {

    @Autowired
    private CourseService courseService;

//    @GetMapping("index")
//    public String index(){
//        return "admin/index";
//    }

    @GetMapping("index")
    public String index(Model model){
        List<Course> courses = courseService.getAll();
        model.addAttribute("courses", courses);
        return "admin/index";
    }
}
