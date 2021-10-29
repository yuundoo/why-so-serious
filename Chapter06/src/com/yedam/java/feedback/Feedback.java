package com.yedam.java.feedback;

import java.util.Scanner;

public class Feedback {

	public static void main(String[] args) {
		// 문제 다음은 키보드로부터 학생 수와 각 학생들의 점수를 입력받아서
		// 최고 점수 및 평균 점수를 구하는 프로그램입니다.
		// 실행결과를 보고 알맞게 작성해보세요.
		// 1) 메뉴는 다음과같이 구성하세요
		// 2) 입력한 상품 수만큼 가격을 입력박을 수 있도록 구현하세요
		// 3) 제품별 가격을 출력하세요. 출력예시, "상품명 : 가격"

		boolean run = true;
		int studentNum = 0;
		// int[] scores = null;
		Product[] products = null;
		Scanner scanner = new Scanner(System.in);

		while (run) {

			System.out.println("===============================================");
			System.out.println("1.상품수 | 2. 가격입력 | 3. 가격리스트 | 4.분석 | 5.종료");
			System.out.println("===============================================");
			System.out.println("선택 >");
			int selectNo = scanner.nextInt();

			switch (selectNo) {
			case 1:
				System.out.println("상품수>");
				int student = scanner.nextInt();
				products = new Product[student];
				break;
			case 2:
				for (int i = 0; i < products.length; i++) {
					System.out.println("상품명 >");
					String name = scanner.next();
					System.out.println("가격 >");
					int price = scanner.nextInt();

					Product product = new Product(name, price);
					products[i] = product;
				}
				break;
			case 3:
				for (int i = 0; i < products.length; i++) {
					Product product = products[i];
					System.out.printf("%s : %d\n",product.getName(), product.getPrice());

				}
				break;
			case 4:
				int max = 0;
				int index = 0;
				for (int i = 0; i < products.length; i++) {
					Product product = products[i];
					if (product.getPrice() > max) {
						max = product.getPrice();
						index = i;
					}
				}
				    int sum = 0;
				    for(Product product : products) {
				    	if(product.getPrice()== max) {
				    		continue;
				    }
				    	sum+= product.getPrice();				   
				    } 
					//Product product = products[index];
					//System.out.println("최고 가격을 가진 제품은 " + products.getName() + "입니다");
					System.out.println("최고 가격을 가진 제품은 " + products[index].getName() + "입니다");
					System.out.println("최고 가격을 제외한 제품들의 합은" + sum + "입니다");
					break;
				
			case 5:
				run = false;
				System.out.println("프로그램종료");
				break;
			}
		}
	}
}

