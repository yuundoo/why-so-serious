package com.yeda.java.ch02_02;

public class Tire {
	//필드
	int maxRotation; //최대회전수
	int accumlatedRotation;//누적회전수
	String location;
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	//메소드
	
	public boolean roll() {
		accumlatedRotation++;
		if(accumlatedRotation < maxRotation) {
			System.out.println(location + "Tire 수명 : " 
		+ (maxRotation-accumlatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "Tire펑크");
			return false;
		}
	}
}
