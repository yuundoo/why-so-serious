package com.yedam.java.ch05;

public class MainExample4 {
	public static void main(String[] args) {
		Calculator ca = new Adder();
		ca.run();
		System.out.println();
		Calculator ca1 = new Subtracter();
		ca1.run();
		System.out.println();
			}
}
