package com.demo.stud.controller.dto;

public class EnrollCourseDto {
	
	private String name;
	private long fees;
	private long marks;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getFees() {
		return fees;
	}
	public void setFees(long fees) {
		this.fees = fees;
	}
	public long getMarks() {
		return marks;
	}
	public void setMarks(long marks) {
		this.marks = marks;
	}
	public EnrollCourseDto(String name, long fees, long marks) {
		super();
		this.name = name;
		this.fees = fees;
		this.marks = marks;
	}
	
	

}
