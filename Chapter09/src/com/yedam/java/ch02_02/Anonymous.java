package com.yedam.java.ch02_02;

public class Anonymous {
	private int field;
	
	public void method(int arg1, int arg2) {
		int var1 = 0;
		int var2 = 0;
		
		field = 10;
		//arg1 = 20;
		//arg2 = 20;
		//var1 = 30;
		//var2 = 30;
		Calculatable calc = new Calculatable() {

			@Override
			public int sum() {
				int result = field + arg1 + arg2 + var1 + var2; //final 성격을 띄고있어야함
				return result;
			}
			
		};
		System.out.println(calc.sum());
	}
}
