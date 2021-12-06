package com.demo.stud.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Course {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private long courseNumber;
	private String name;
	private String duration;
	private long fees;
	private long studentid;
	public long getCourseNumber() {
		return courseNumber;
	}
	public void setCourseNumber(long courseNumber) {
		this.courseNumber = courseNumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public long getFees() {
		return fees;
	}
	public void setFees(long fees) {
		this.fees = fees;
	}
	public long getStudentid() {
		return studentid;
	}
	public void setStudentid(long studentid) {
		this.studentid = studentid;
	}
	public Course(String name, String duration, long fees, long studentid) {
		super();
		this.name = name;
		this.duration = duration;
		this.fees = fees;
		this.studentid = studentid;
	}
	public Course() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
