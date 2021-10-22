package com.yedam.java.ch0602;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		// 1) 메뉴는 다음과 같이 구성하세요.
				//  1.상품 수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
				// 2) 입력한 상품 수만큼 가격을 입력받을 수 있도록 구현하세요.
				// 3) 각 가격에 해당하는 제품명은 인덱스+1로 합니다. 
				//    예를 들어 배열[0] = 10000 이면 10,000원인 제품은 1번째 제품입니다.
				// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
				// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		boolean run =true;
		int Num = 0;
		int[] prices = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			
			System.out.println("==============================================");
			System.out.println("1.상품 수 | 2.가격입력 | 3.제품별 가격 | 4.분석 | 5.종료");
			System.out.println("==============================================");
			System.out.println("선택 >");
			int selectNo = scanner.nextInt();
			switch(selectNo) {
			case 1:
				System.out.println("상품 수>");
				int marchandise = scanner.nextInt();
				prices = new int[marchandise];
				break;
			case 2:
				for(int i=0;i<prices.length;i++) {
					System.out.println((i+1) + "번째 제품 > ");
					int Thousand = scanner.nextInt();
					prices[i] = Thousand;
				}
					break;		
		
			case 3:
				for(int i=0;i<prices.length;i++) {
					System.out.println((i+1) + "번째 제품 : " + prices[i]);
				}
				break;
				
			case 4:
			int max=0;
			int sum=0;
			for(int i=0;i<prices.length;i++) {
				sum+= prices[i];
				if(prices[i]>max) {
					max=prices[i];
				}

			}
			sum-=max;
			System.out.println("최고 가격을 가진 제품은 " + max + "입니다");
			System.out.println("최고 가격을 제외한 제품들의 합은" + sum + "입니다");
			break;
			case 5:
				run = false;
				System.out.println("프로그램 종료");
				break;
			}
			
		}
		
	}
}
