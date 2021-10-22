package com.yedam.java.ch0603;

public class Car {
	//필드
	String company;
	String model;
	String color;
	int maxspeed;
	int speed;
	
	//생성자
	Car(){
		
	}
	Car(String model) {
		//this.model = model;
		this(model, "은색", 250);
	}
	Car(String model, String color){
		//this.model= model;
		//this.color = color;
		this(model, color, 250);
		
	}
	
	Car(String model, String color, int maxspeed){
		this.model = model;
		this.color = color;
		this.maxspeed = maxspeed;
				
	}
	//메소드
}
