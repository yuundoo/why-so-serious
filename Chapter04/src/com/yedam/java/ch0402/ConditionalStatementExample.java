package com.yedam.java.ch0402;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		for(int i=1; i<=10; i++) { 
			System.out.println(i);
		}
      
		
	  int sum = 0;
	  for(int i=1; i<=100; i++) {
		  System.out.println(i);
		  sum += i;
	  }
	  System.out.println(sum);
	  int i = 0;
	  for(; i<=100;) {
		  sum +=1;
		  i++; 
	  }
	  System.out.println(sum);
	  
	  
	 // for(int i = 0, j = 100; i<=50 && j>50 ; i++,j--) {}
	  for(int x =2; x<=9; x++) {
		  System.out.println("*** " + x + "단 ***");
		  for(int y=1; y<=9; y++) {
			  System.out.println(x + "X" + y + "=" + x*y);
		  }
	  }
	  
	  String tree = "";
	  for(int k=1; k<5; k++) {
		tree += "*";
		System.out.println(tree);
		//i =1;
		//실행문 실행
		//증감연산식 : i++ -> i =2;
		//i<=5 -> 2 <= 5 -> TRUE
		//실핼문 실행
		//증감 연산식 : i++ -> i = 3;
		//i <= 5 -> 3 <= 5 -> TRUE
		//실행문 실행
		// ...
		//i=6;
		//i <= 5 -> 6 <= 5 -> FALSE
		//for 문이 종료
	
	  }
	}

}
