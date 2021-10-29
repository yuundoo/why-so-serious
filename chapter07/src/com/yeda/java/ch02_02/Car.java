package com.yeda.java.ch02_02;

public class Car {
	// 필드
	Tire frontLeftTire = new Tire("앞왼쪽", 6);
	Tire frontRightTire = new Tire("앞오른쪽", 2);
	Tire BackLeftTire = new Tire("앞왼쪽", 6);
	Tire BackRightTire = new Tire("앞왼쪽", 6);
	// 생성자

	// 메소드

	void stop() {
		System.out.println("[자동차가 멈춥니다]");

	}

	int run() {
	System.out.println("[자동차가 달립니다]");
	if(frontLeftTire.roll() == false) {stop(); return1;}
	if(frontRightTire.roll() == false){stop(); return2;}
	if(BackLeftTire.roll() == false)  {stop(); return3;}
	if(BackRightTire.roll() == false) {stop(); return4;}
	return 0;
		}
			
		}

	

