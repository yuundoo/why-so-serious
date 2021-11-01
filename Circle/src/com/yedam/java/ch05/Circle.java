package com.yedam.java.ch05;

public class Circle {
	private int radius;
	public Circle(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
		
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public static void main(String[] args) {
		NamedCircle w = new NamedCircle(5, "Waffle");
		w.show();
		
	}
}


	

