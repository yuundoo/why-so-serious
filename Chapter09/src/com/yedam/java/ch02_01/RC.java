package com.yedam.java.ch02_01;

public class RC {
	//필드 초기값으로 대입
	RemoteControl field = new RemoteControl() {

		@Override
		public void turnOn() {
			System.out.println("TV를 켭니다");
		}

		@Override
		public void turnOff() {
			System.out.println("TV를 끕니다");			
		}
		
	};
	
	//로컬 변수값으로 대입
	void method1() {
		RemoteControl localVar = new RemoteControl() {

			@Override
			public void turnOn() {
				System.out.println("Audio 를 켭니다");
			}

			@Override
			public void turnOff() {
				System.out.println("Audio 를 끕니다");				
			}
			
		};
		
		//로컬 변수 사용
		localVar.turnOn();
	}
	//매개변수로 사용
	void method2(RemoteControl rc) {
		rc.turnOn();
		
	}
}
