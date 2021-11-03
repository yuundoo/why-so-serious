package com.yedam.java.ch04.string;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Main {

	public static void main(String[] args)  {
		//byte배열 -> 문자열
		/*
		byte[] byte1 = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		String str1 = new String(byte1);
		System.out.println(str1);
		
		String str2 = new String(byte1, 6, 4);
		System.out.println(str2);
		
		byte[] byte2 = new byte[100];
		System.out.println("입력 >>");
		//배열에 읽은 바이트를 저장하고 읽은 바이트 수를 리턴
		int readByteNo = System.in.read(byte2);
		
		String str3 = new String(byte2, 0, readByteNo-2);
		System.out.println(str3);
		System.out.println();
		*/
		//chatAt()
		String ssn = "010624-123012";
		char gender = ssn.charAt(7);
		
		switch(gender) {
		case '1':
		case '3':
			System.out.println("남자 입니다");
			break;
		case '2':
		case '4':
			System.out.println("여자 입니다");
			break;
		}
		System.out.println();
		
		//getBytes();
		String str = "안녕하세요";
		byte[] bytesX = str.getBytes();
		System.out.println("bytesX.length : " + bytesX.length);
		String strX = new String(bytesX);
		System.out.println("bytesX -> strX " + strX);
		
		//인코딩, 디코딩 : 사람이 입력한 문자나 기호들을 컴퓨터가 이용할 수 있는 신호로 만드는 것
		try {
		 byte[] byteY = str.getBytes("EUC-KR");
		 System.out.println("byteY.length : " + byteY.length);
		 String strY = new String(byteY, "EUC-KR");
		 System.out.println("byteY -> strY : " + strY);
		 
		 
		 byte[] byteZ = str.getBytes("EUC-KR");
		 System.out.println("byteZ.length : " + byteZ.length);
		 String strZ = new String(byteZ, "EUC-KR");
		 System.out.println("byteZ -> strZ : " + strZ);
		 System.out.println();
		 
	} catch (UnsupportedEncodingException e) {
		e.printStackTrace();
	}
		//indexOf('문자' || "문자열") <-> charAt()
		
		String subject = "자바 프로그래밍";
		int location = subject.indexOf("프로그래밍");
		System.out.println(location);
		
		if(subject.indexOf("한국")!= -1) {
			System.out.println("한국와 관련된 책이군요");
		}else {
			System.out.println("한국와 관련이 없는 책이군요");
		}
		
		//length() : 배열.length처럼 길이를 가져오는 메소드
		
		String koreanssn = "7306241230123";
		int length = koreanssn.length();
		if(length == 13) {
			System.out.println("주민번호 자리가 맞습니다");
		}else {
			System.out.println("주민번호 자리가 틀립니다");
		}
		//replace() : 문자열 대치
		String oldStr = "자바는 객체 지향 언어입니다 자바는 풍부한 API를 지원합니다";
		String newStr = oldStr.replace("자바", "JAVA");
		System.out.println(oldStr);
		System.out.println(newStr);
		
		//substring() : 추출
		String first = koreanssn.substring(0,6);//0번부터 (6-1)번째까지 문자열
		String second = koreanssn.substring(6); // 6번 부터 마지막까지 문자열 가지고오겠다
		System.out.println(first);
		System.out.println(second);
		System.out.println();
		
		//trim() - 공백삭제
		String tell1 = "              02";
		String tell2 = "123             ";
		String tell3 = "     1234       ";
		
		System.out.println(tell1 + tell2 + tell3);
		System.out.println(tell1.trim() + tell2.trim() + tell3.trim());
		System.out.println();
		
		// - 알파벳 대문자로 변경 : toUpperCase()
		// - 알바벳 소문자로 변경 : toLowerCase()
		// - 대소문자 구분없이 내용 비교 : equalsIgnoreCase()
		String str4 = "Java Programming";
		String str5 = "JAVA PROGRAMMING";
		
		System.out.println(str4.equals(str5));
		
		String lowerStr4 = str4.toLowerCase();
		String lowerStr5 = str5.toLowerCase();
		System.out.println(lowerStr4.equals(lowerStr5));
		System.out.println(str.equalsIgnoreCase(str5));
		
		System.out.println();
		//valueOf()
		
		String strVar3 = String.valueOf(10);
		String strVar4 = String.valueOf(10.5);
		String strVar5 = String.valueOf(true);
		
		System.out.println(strVar3);
		System.out.println(strVar4);
		System.out.println(strVar5);
		
		
}
}


