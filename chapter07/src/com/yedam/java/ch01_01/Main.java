package com.yedam.java.ch01_01;

public class Main {

	public static void main(String[] args) {
		
	DmbPhone dmb = new DmbPhone("자바폰","검정",10);
	
	System.out.println("모델 : " + dmb.model);
	System.out.println("컬러 : " + dmb.color);
	
	System.out.println("채널 : " + dmb.channel);
	
	dmb.powerOn();
	dmb.bell();
	dmb.sendvoice("여보세요");
	dmb.receiveVoice("안녕하세요");
	dmb.sendvoice("반갑습니다");
	dmb.hangUp();
	
	
	
	dmb.turnOnDmb();
	dmb.changeChannelDmb(12);
	dmb.turnOffDmb();
	System.out.println();
	
	Student student = new Student("홍길동", "1234556-234676",1);
	System.out.println("name : " + student.name);
	System.out.println("ssn : " + student.ssn);
	System.out.println("studentNo : " + student.stidentNo);
	
	int r = 10;
	Calculator cal = new Calculator();
	System.out.println("원면적 : " + cal.areaCircle(r));
	Computer com = new Computer();
	System.out.println("원면적 : " + com.areaCircle(r));
	System.out.println();
	
	SupersonicAirplane sa = new SupersonicAirplane();
	sa.takeOff();
	sa.fly();
	sa.flymode = SupersonicAirplane.SUPERSONIC;
	sa.fly();
	sa.flymode = SupersonicAirplane.NORMAL;
	sa.fly();
	sa.land();
	System.out.println();
	
	
	}
}
