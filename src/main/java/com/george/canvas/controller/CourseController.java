package com.george.canvas.controller;

import java.util.List;
import java.util.Optional;

import com.george.canvas.model.Course;
import com.george.canvas.model.Course;
import com.george.canvas.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
 

@Controller
@RequestMapping("/courses")
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/getAll")
	public String getAll(Model model) {
		List<Course> courses = courseService.getAll();
		model.addAttribute("courses", courses);
		
		String username = "Kindson";
		model.addAttribute("username", username);
		
//		return "courses";
		return "redirect:/admin/index";
	}
	
	@RequestMapping("/getOne")
	@ResponseBody
	public Optional<Course> getOne(Integer Id) {
		return courseService.getOne(Id);
	}
	
	@PostMapping("/addNew")
	public String addNew(Course course) {
		courseService.addNew(course);
//		return "redirect:/courses/getAll";
		return "redirect:/admin/index";
	}
	
	
	@RequestMapping(value="/update", method = {RequestMethod.PUT, RequestMethod.GET})
	public String update(Course course) {
		courseService.update(course);
//		return "redirect:/courses/getAll";
		return "redirect:/admin/index";
	}
	
	
	@RequestMapping(value="/delete", method = {RequestMethod.DELETE, RequestMethod.GET})
	public String delete(Integer Id) {
		courseService.delete(Id);
//		return "redirect:/courses/getAll";
		return "redirect:/admin/index";
	}
	
	
	
	
	
	
	

}
