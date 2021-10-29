package com.yedam.java.example1;

public class VIP extends Customer {
	//필드
	private int agentID;//VIP 고객 담당 상담원 아이디
	private double saleRatio;//할인율
	
	//생성자
	public VIP() {
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
		System.out.println("VIP() 생성자 호출");
	}
	//메소드
	public VIP(String customerName, int customerID) {
		super(customerName, customerID);
	}
	public int getAgentID() {
		return agentID;
	}
	
	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * saleRatio);
	}
	
	public String showVIPInfo() {
		return super.showCustomerInfo() + "담당 상담원 아이디는 " + agentID + "입니다";
	}
}
