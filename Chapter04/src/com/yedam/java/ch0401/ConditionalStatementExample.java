package com.yedam.java.ch0401;

import java.util.Scanner;

public class ConditionalStatementExample {

	public static void main(String[] args) {
		// 기본 IF문
		int score = 93;
		if (score >= 90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		if (score <= 90)
			;
		{
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		System.out.println("================");
		if (score >= 90) {

			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		} else {
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");

			if (score >= 90) {
				System.out.println("점수가 100~90입니다.");
				System.out.println("등급은 A입니다.");
			} else if (score >= 80) {
				System.out.println("점수가 80~89입니다.");
				System.out.println("등급은 B입니다.");
			} else if (score >= 70) {
				System.out.println("점수가 70~79입니다.");
				System.out.println("등급은 C입니다.");
			} else {
				System.out.println("점수가 70미만입니다.");
				System.out.println("등급은 D입니다.");

				System.out.println("====================");

				int num = (int) (Math.random() * 6) + 1;
				//(int)Math.random() * 갯수 + 시작숫자; 공식
				if (num == 1) {
					System.out.println("1번이 나왔습니다.");
				} else if (num == 2) {
					System.out.println("2번이 나왔습니다.");
				} else if (num == 3) {
					System.out.println("3번이 나왔습니다.");
				} else if (num == 4) {
					System.out.println("4번이 나왔습니다.");
				} else if (num == 5) {
					System.out.println("5번이 나왔습니다.");
				} else if (num == 6) {
					System.out.println("6번이 나왔습니다.");
				}
				System.out.println("Quiz==");
				
			    Scanner scanner = new Scanner(System.in);
				//문제 1 두개의 정수가 주어졌을때 두정수의 합이 자연수이면 'Natural Number 를 출력하세요
			    int a = scanner.nextInt();
			    int b = scanner.nextInt();
			    
			    if((a+b) > 0){
			    System.out.println("Natural Number");
			    }
			    
				//문제 2 두개의 정수가 주어졌을때 두 수의 대소관계에 따라 부등호 (> , =, <) 를 출력하도록 구현하세요
			    int x = scanner.nextInt();
			    int y = scanner.nextInt();
			    
			    if(x>y) {
			    	System.out.println(">");
			    }else if (x==y) {
			    	System.out.println("=");
			    }else if(x<y) {
			    	System.out.println("<");
			    }
				//문제 3 체질량 지수인 BMI에 따라 비만도를 네가지를 단계로 구분하여 결과값을 출력하도록 구현하세요
				//BMI = 체중 / (키*키) 저체충(18.5) 정상 (18.5 이상 25 미만) 과체중 (25이상 30미만) 비만(30이상)
			    double weight = scanner.nextDouble();
		
			
				
				
			}
		}

	}
}
