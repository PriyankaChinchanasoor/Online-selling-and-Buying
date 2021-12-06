package com.demo.stud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.stud.controller.dto.EnrollCourseDto;
import com.demo.stud.service.EnrollCourseService;

@RestController
public class StudentController {
	
	@Autowired
	private EnrollCourseService enrollCourseService;
	
	@PostMapping("/enroll")
	public String enrollCourse(@RequestBody EnrollCourseDto enrollcourseDto) {
		return enrollCourseService.enrollCourse(enrollcourseDto);
	}

}
