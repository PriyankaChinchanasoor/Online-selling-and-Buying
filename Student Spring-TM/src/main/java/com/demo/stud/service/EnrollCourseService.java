package com.demo.stud.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.demo.stud.controller.dto.EnrollCourseDto;
import com.demo.stud.entity.Course;
import com.demo.stud.entity.Student;
import com.demo.stud.repo.CourseRepository;
import com.demo.stud.repo.StudentRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@Service
@Transactional
public class EnrollCourseService {
	
	@Autowired
	private StudentRepository studentRepository;
	
	@Autowired
	private CourseRepository courseRepository;
	
	public String enrollCourse(@RequestBody EnrollCourseDto enrollcourseDto) {
		
		Student student=new ObjectMapper().convertValue(enrollcourseDto, Student.class);
		
		Long studentid=studentRepository.save(student).getStudentid();
		
		System.out.println("Student Saved Successfully");
		
		Course course=new Course("Java", "3 months", 20000L, studentid);
		
		long coursenumber = courseRepository.save(course).getCourseNumber();
		
		return "Student Enrolled: "+coursenumber;
	}

}
