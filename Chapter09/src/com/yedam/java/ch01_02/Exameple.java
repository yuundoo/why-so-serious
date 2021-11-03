package com.yedam.java.ch01_02;

public class Exameple {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListenr(new CallListner());
		btn.touch();
		
		btn.setOnClickListenr(new MessageListner());
		btn.touch();
	}

}
