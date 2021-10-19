package com.yedam.java.ch0401;

import java.util.Scanner;

public class dd {
	public static void main(String[] args) {
		/*
		 * Scanner scanner = new Scanner(System.in); 
		 * double weight scanner.nextDouble(); double height = scanner.nextDouble();
		 * 
		 * // double bmi = weight / (height * height); if (bmi >= 30) {
		 * System.out.println("비만입니다"); } else if (bmi >= 25) {
		 * System.out.println("과체중입니다"); } else if (bmi >= 18.5) {
		 * System.out.println("정상입니다"); } else { System.out.println("저체중입니다");
		 */

		int num = (int) (Math.random() * 6) + 1;
		// (int)Math.random() * 갯수 + 시작숫자; 공식
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
		System.out.println("=====================");
		int random = (int) (Math.random() * 6) + 1;
		switch (random) {
		case 1:
			System.out.println("1번이나왔습니다");
			break;
		case 2:
			System.out.println("2번이나왔습니다");
			break;
		case 3:
			System.out.println("3번이나왔습니다");
			break;
		case 4:
			System.out.println("4번이나왔습니다");
			break;
		case 5:
			System.out.println("5번이나왔습니다");
			break;
		default:
		case 6:
			System.out.println("6번이나왔습니다");
			break;

			

			/*char time = (char) (Math.random() * 4) + 8;
			System.out.println("현재시각 : " + time + "시");
			switch (time) {
			case 8:
				System.out.println("출근합니다");
			case 9:
				System.out.println("회의를 합니다");
			case 10:
				System.out.println("업무를 봅니다");
			default:
				System.out.println("외근을 나갑니다");*/
			} 

			char grade = 'B';
			switch (grade) {
			case 'A':
			case 'a':
				System.out.println("우수 회원입니다");
				break;
			case 'B':
			case 'b':
				System.out.println("일반 회원입니다");
				break;
			default:
				System.out.println("손님입니다");
			}
			String position = "과장";
			switch(position) {
			case "부장":
			System.out.println("700만원");
			break;
			case "과장":
				System.out.println("500만원");
				break;
			default:
				System.out.println("300만원");
				break;

		//문제4) 구구단 출력하되 입력받은 단의 6번째 값을 출력하도록 구현하세
				
			
			}	int gugu = (int) (Math.random() * 6) + 1;
				switch (gugu) {
				case 1:
					System.out.println("2 X 1 =2");
					
				case 2:
					System.out.println("2 X 2 =4");
					
				case 3:
					System.out.println("2 X 3 = 6 ");
					
				case 4:
					System.out.println("2 X 4 = 8 ");
					
				case 5:
					System.out.println("2 X 5 = 10 ");
					
				default:
				case 6:
					System.out.println("2 X 6 =12 ");
					break;
				}
				
				
				//문제 5 다음과 같은 점수 범위에 따라 등급을 구분하여 입력받은 점수에 대한 등급을 출력하세요
				//단 점수 범위는 0 ~ 100점이고
	             int score1 = scanner.nextInt();
				switch (score1/10) {
				case 10:
				case 9:
					System.out.println("A등급입니다");
					break;
				case 8:
					System.out.println("B등급입니다");
					break;
				case 7:
					System.out.println("C등급입니다");
					break;
				case 6:
					System.out.println("D등급입니다");
					break;
				default :
					System.out.println("E등급입니다");
					break;
				
				}
		}
	}
