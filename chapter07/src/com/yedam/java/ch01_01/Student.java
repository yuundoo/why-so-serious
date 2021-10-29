package com.yedam.java.ch01_01;

public class Student extends People {
	int stidentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn);
		this.stidentNo = studentNo;
	}
}
