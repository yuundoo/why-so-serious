package com.yedam.java.ch01;

public class MainExample5 {
	public static void main(String[] args) {
		Shape coin = new Circle(10);
		coin.draw();
		System.out.println("코인의 면적은 " + coin.getArea());
	}
}
