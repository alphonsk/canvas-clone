package com.george.canvas.controller;

import com.george.canvas.model.Student;
import com.george.canvas.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("profile")
public class ProfileController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/index")
    public String index(){
        return "profile/index";
    }






}
