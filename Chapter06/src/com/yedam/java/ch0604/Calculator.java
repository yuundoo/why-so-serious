package com.yedam.java.ch0604;

public class Calculator {
	//전원 을 켠다.
	//리턴타입 메소드이름() {}
	void powerOn() {
		System.out.println("전원을 켭니다");
	}
	//전원 을 끈다.
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	// 더하기
	int plus(int x, int y) {
		int result = x + y;
		return result;
	}
	// 나누기
	double divide( int x, int y) {
		//double result = (double)x / (double)y;
		//return result;
		return (double) x / (double) y;
	}
	//평균
	double avg(int x, int y) {
		//int sum = x+y;
		int sum = plus(x,y);
		double avg = (double) sum /2;
		return avg;
	}
	void execute() {
		double result = avg(7,10);
		println("result : " + result);
	}
	void println(String message) {
		System.out.println(message);
	}
	
	//정사각형 넓이 
	double areaRectangle(double width) {
		return width * width;
	}
	//직사각형 넓이
	double areaRectangle(double width, double height) {
		return width * height;
	}
	boolean login(String id, String password) {
		if(id.equals("hong")&& password.equals("12345")) {
			return false;
		}else {
			return false;
		}
		void logout("로그아웃되었습니다") ;
	}
}
