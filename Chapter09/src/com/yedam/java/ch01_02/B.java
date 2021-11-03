package com.yedam.java.ch01_02;

public class B {
	//바깥 필드와 메소드에서 사용제한 
	X field1 = new X();
	Y field2 = new Y();
	
	//정적 필드
	
	//static X field3 = new X();
	static Y field4 = new Y();
	
	void method1() {
		X var1 = new X();
		Y var2 = new Y();
		
		//정적메소드
		static void method2() {
			//X var1 = new X();
			Y var2 = new Y();
		}
	}
	
	
	//인스턴스 멤버 클래스
	class X{}
	
	static class Y{
		
	}
}
