
package com.george.canvas.services;

import java.util.List;
import java.util.Optional;

import com.george.canvas.model.Student;
import com.george.canvas.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepository;
	
	
	public List<Student> getAll() {
		return (List<Student>) studentRepository.findAll();
	}

	
	public Optional<Student> getOne(Integer Id) {
		return studentRepository.findById(Id);
	}

	public void addNew(Student student) {
		studentRepository.save(student);
	}
	
	public void update(Student student) {
		studentRepository.save(student);
	}
	
	public void delete(Integer Id) {
		studentRepository.deleteById(Id);
	}

}
