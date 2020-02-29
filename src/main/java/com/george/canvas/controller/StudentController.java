package com.george.canvas.controller;

import java.util.List;
import java.util.Optional;

import com.george.canvas.model.Student;
import com.george.canvas.services.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@RequestMapping("/getall")
	public String getAll(Model model) {
		List<Student> students = studentService.getAll();
		model.addAttribute("students", students);
		
		String username = "Kindson";
		model.addAttribute("username", username);
		
		return "students";
	}
	
	@RequestMapping("/getOne")
	@ResponseBody
	public Optional<Student> getOne(Integer Id) {
		return studentService.getOne(Id);
	}
	
	@PostMapping("/addNew")
	public String addNew(Student student) {
		studentService.addNew(student);
		return "redirect:/students/getAll";
	}
	
	
	@RequestMapping(value="/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Student student) {
		studentService.update(student);
		return "redirect:/students/getAll";		
	}
	
	
	@RequestMapping(value="/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer Id) {
		studentService.delete(Id);
		return "redirect:/students/getAll";		
	}
	
	
	
	
	
	
	

}
