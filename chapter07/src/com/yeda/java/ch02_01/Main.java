package com.yeda.java.ch02_01;


public class Main {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
		
		//B b2 = e;
		//C c2 = d;
		
		Child child = new Child();
		child.method1();
		child.method2();
		child.method3();
		System.out.println();
		
		Parents parents = child;
		parents.method1();
		parents.method2();
		//parents.method3();
		System.out.println();
		
		
	}
	

}
