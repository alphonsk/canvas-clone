package com.george.canvas.repositories;

import com.george.canvas.model.Course;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface CourseRepository extends CrudRepository<Course, Integer> {

}
