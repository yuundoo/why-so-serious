package com.yedam.java.ch04;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int lotto[] = new int[6];
		//문제4) 로또 번호를 구하는 프로그램을 작성하세요.
		for(int i=0;i<6;i++) {
			lotto[i] = (int)(Math.random()*45)+1;
		
			for(int j=0;j<i;j++) {
				if(lotto[i]==lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("로또 번호 : ");
		for(int i=0; i<6;i++) {
			System.out.println(lotto[i] + " ");
		}
			
	}

}
