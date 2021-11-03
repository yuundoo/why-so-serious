package com.yedam.java.ch02_02;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	Button.OnClickListner listener = new Button.OnClickListner() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다");
			
		}
	};
	
	Window(){
		btn1.setOnClickListner(listener);
		
		btn2.setOnClickListner(new Button.OnClickListner() {
			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다");
			}
		});
	}
}
