package com.yedam.java.example1;

public class GOLD extends Customer{
	
	double saleRatio;// 할인율
	
	public GOLD(String customerName, int customerID) {
		super(customerName, customerID);
		this.customerGrade = "GOLD";
		this.saleRatio = 0.1;
		this.bonusRatio = 0.02;
		System.out.println("GOLD(String, int) 생성자 호출");
	}
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}

}
