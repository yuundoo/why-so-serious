package com.yedam.java.example1;

public class VIPCustomer  {
	
	Customer customer = new Customer();
	//필드	
	private int customerID;//고객 아이디
	private String customerName;//고객 이름
	private String customerGrade;//등급
	private int bonusPoint;//포인트
	private double bonusRatio;//포인트 적립 비율
	
	private int agentID;//VIP 고객 담당 상담원 아이디
	private double saleRatio;//할인율
	
	//생성자
	public VIPCustomer() {
		this.customerGrade = "VIP";
		this.bonusRatio = 0.05;
		this.saleRatio = 0.1;
	}
	//고객등급 VIP
	//보너스 적립 5%
	//할인율 10%
	
	//메소드
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
			return price - (int)(price * saleRatio);
		
	}
		public String showCustomerInfo() {
			return customerName + "님의 등급은 " + customerGrade
					+ "이며, 보너스 포인트는 " + bonusPoint + "입니다";
			
	//calcPrice
	//showCustomerInfo
}
}
