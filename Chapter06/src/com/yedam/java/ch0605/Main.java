package com.yedam.java.ch0605;

import java.util.Calendar;

public class Main {
	String message;
	
	void println() {
		System.out.println(this.message);
	}
	public static void main(String[] args) {
		Car myCar = new Car("포르쉐");
		Car yourCar = new Car("벤츠");
		
		myCar.run();
		yourCar.run();
		
		double result1 = 10*10*Calculator.pi;
		int result2 = Calculator.plus(10, 5);
		int result3 = Calculator.minus(10, 5);
		
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
		
		Main main = new Main();
		main.message = "정적 메소드 선인 시 주의할 점입니다.";
		main.println();
		
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("같은 singleton 객체 입니다.");
			
		}else {
			System.out.println("다른 singleton 객체 입니다.");
		}
		Person p1 = new Person("123456-1234567", "홍길동");
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		p1.nation = "USA";
		p1.ssn = "987654-9876541";
		p1.name = "김자바";
		
		System.out.println("지구의 반지름 : " + EARTH_RADIUS + "km");
		System.out.println("지구의 표면적 : " + EARTH_AREA + "km^2"); 
	}

}
