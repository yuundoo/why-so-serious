package com.yedam.java.ch06.stringtoken;

import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Main {

	public static void main(String[] args) {
		// -String.split() :
		// StringTokenizer :
		// 010 -123 -1234 : -, 010/ 123 /1234 => 문자열 3개로 분리
	

	String text1 = "홍길동&이수홈, 박연수, 김자바-최영호";
	String[]names = text1.split("&|,|-");
	for(String name:names){
		System.out.println(name);
	}
	String text2 = "홍길동/이수홍/박연수";
	StringTokenizer st = new StringTokenizer(text2, "/");
	// st : 문자열을 담고 있는 스택
	// 홍길동
	// 이수홍
	// 박연수
	int countTokens = st.countTokens();

	for(int i = 0;i<countTokens;i++){

		String token = st.nextToken();
		System.out.println(token + "," + st.countTokens());
	}   st=new StringTokenizer(text2,"/");while(st.hasMoreTokens())
	{
		String token = st.nextToken();
		System.out.println(token);
	}
	// StringBulider : 새로운 문자열을 생성하지 않고 문자열을 변경하는 경우에 사용하며
	// 내부 버퍼를 별도로 가지고 그 안에 문자열을 저장해두고 추가 수정 삭제 작업을 할 수 있다.

	StringBuilder sb = new StringBuilder();
	//문자열을 추가 -> 기존의 값 뒤에 추가되면서 문자열 결합이 이루어짐.
	sb.append("Java");
	sb.append("Program Study");
	System.out.println(sb.toString());
	//index4 위치 앞에 문자열 2를 삽입
	sb.insert(4, "2");
	System.out.println(sb.toString());
	//index4에 문자 6을 대체
	sb.setCharAt(4,'6');
	System.out.println(sb.toString());
	//index6부터 13전까지를 "Book" 문자열로 대체
	sb.replace(6, 13, "Book");
	System.out.println(sb.toString());
	//index4부터 index5 전까지 삭제 
	sb.delete(4, 5);
	System.out.println(sb.toString());
	
	int length = sb.length();
	System.out.println("총 문자수 : " + length);
	
	String result = sb.toString();
	System.out.println(result);
	
	//pattern : 정규표현식으로 문자열을 검증
	String regExp = "(02|010)-\\d{3,4}-\\d{4}";
	String data = "010-123-4567";
	boolean resultData = Pattern.matches(regExp, data);
	if(resultData) {
		System.out.println("정규식과 일치합니다");
	}else {
		System.out.println("정규식과 일치하지않습니다");
	}
	
	regExp = "\\w+@\\w+\\.\\w+(\\.\\w+)?";
	data = "angel@naver.com";
	resultData = Pattern.matches(regExp, data);
	if(resultData) {
		System.out.println("정규식과 일치합니다");
	}else {
		System.out.println("정규식과 일치하지않습니다");
	}


}
}
