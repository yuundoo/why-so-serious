package com.yedam.java.ch01_02;

public class D {
	// 로컬 클래스에서 사용 제한
	public void mehtod1(int arg) {
		final int localVariable = 1;
		
		class Inner{
			public void mehtod() {
				int result = arg + localVariable;
			}
		}
	}
	
	//자바 8 이후
	
	public void method2(int arg) {
		int localVariable = 1;
		//arg = 100;
		//localVariable = 100;
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	
}
