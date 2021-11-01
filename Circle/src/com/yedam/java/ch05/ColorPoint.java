package com.yedam.java.ch05;

public class ColorPoint extends Point {
	private String color;
	public ColorPoint(int x, int y, String color) {
		super(x,y);
		this.color = color;
	
		
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public void  show() {
		System.out.println(color+ "색의" + "("+getX()+","+getY()+")의 점");
		
	}
	public void setPoint(int x, int y) {
		move(x,y);
	}
	
	
	}
	
		
	

