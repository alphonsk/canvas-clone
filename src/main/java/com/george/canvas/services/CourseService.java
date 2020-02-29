package com.george.canvas.services;

import java.util.List;
import java.util.Optional;

import com.george.canvas.model.Course;
import com.george.canvas.repositories.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;
	
	
	public List<Course> getAll() {
		return (List<Course>) courseRepository.findAll();
	}

	
	public Optional<Course> getOne(Integer Id) {
		return courseRepository.findById(Id);
	}

	public void addNew(Course course) {
		courseRepository.save(course);
	}
	
	public void update(Course course) {
		courseRepository.save(course);
	}
	
	public void delete(Integer Id) {
		courseRepository.deleteById(Id);
	}

}
