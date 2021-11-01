package com.yedam.java.ch05;

public class NamedCircle extends Circle {
	
	String right;
	
	
	public NamedCircle(int radius, String string) {
		super(radius);
		this.right = string;
		
	}

	public void show() {
		System.out.println(right + "반지름 =" + this.getRadius());
		
	}

}
