package com.yedam.java.ch01;

public class MyAdder implements AdderInterface {
	
	@Override
	public int add(int x, int y) {
		return  x + y;
	}

	@Override
	public int add(int n) {
		int a = 0;
		for(int i=1;i<=n;i++) {
			a+=i;
			
		}
		return a;
		
	}

}
