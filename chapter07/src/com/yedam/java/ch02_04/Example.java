package com.yedam.java.ch02_04;

public class Example {
	public static void method1(Parent parent) {
		Child child = (Child) parent;
		System.out.println("method1 - Child로 변환 성공");
	}
	public static void method2(Parent parent) {
		if(parent instanceof Child) {
			Child child = (Child)parent;
			System.out.println("method2 - Child로 변환 성공");
		}else {
			System.out.println("method2 - Child로 변환되지 않음");
		}
	}

	public static void main(String[] args) {
		Parent parent = new Child();
		
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		//parent.field2 = "data2";
		//parent.method3();
		
		Child child = (Child) parent;
		child.field2 = "data2";
		child.method3();
		
		System.out.println();
		method1(parent);
		parent = new Children();
		method2(parent);
	}

}
