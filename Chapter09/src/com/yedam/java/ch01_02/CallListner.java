package com.yedam.java.ch01_02;

import com.yedam.java.ch01_02.Button.OnClickListner;

public class CallListner implements OnClickListner {

	@Override
	public void onClick() {
		System.out.println("전화를 겁니다");
	}

}
