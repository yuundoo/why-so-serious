package com.yedam.java.ch01_02;

public class Button {
	OnClickListner listner;
	
	void setOnClickListenr(OnClickListner listener) {
		this.listner = listener;
	}
	void touch() {
		listner.onClick();
	}
	
	static interface OnClickListner{
		void onClick();
	}
}
