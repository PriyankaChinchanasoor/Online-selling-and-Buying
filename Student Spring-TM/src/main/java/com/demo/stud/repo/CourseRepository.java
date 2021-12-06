package com.demo.stud.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.stud.entity.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>{
	
	

}
