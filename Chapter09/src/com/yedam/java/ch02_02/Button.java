package com.yedam.java.ch02_02;

public class Button {
	//필드 선언
	OnClickListner listner;
	
	void setOnClickListner(OnClickListner listener) {
		this.listner = listener;
	}
	
	void touch() {
		listner.onClick();
	}
	
	
	//중첩 인터페이스
	static interface OnClickListner() {
		void onClick();
	}
}
