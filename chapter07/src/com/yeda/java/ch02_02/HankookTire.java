package com.yeda.java.ch02_02;

public class HankookTire extends Tire {
	public HankookTire(String location, int maxRotation) {
		super(location,maxRotation);
	}
	@Override
	public boolean roll() {
		accumlatedRotation++;
		if(accumlatedRotation < maxRotation) {
			System.out.println(location + "Hankook 수명 : " 
		+ (maxRotation-accumlatedRotation) + "회");
			return true;
		}else {
			System.out.println("***" + location + "HankookTire펑크");
			return false;
		}
	}
}


