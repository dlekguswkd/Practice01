package com.javaex.practice;

import java.util.Scanner;

public class Ex38 {

	public static void main(String[] args) {
		
		// 총급액을 입력하면 백원단위는 할인을 해주고 있습니다. 실제 지불금액을 출력하는 코드를 작성하세요
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("전체금액을 입력해주세요:  ");		// money는 전체금액
		int money = sc.nextInt();
		
		System.out.println("실제지불금액은 " + (money-(money % 1000)) + " 입니다.");
		
		
		sc.close();
		
		/*
		int totalPrice;
		int resultPrice;
		
		Scanner sc = new Scanner(System.in);

		// 전체금액입력
		System.out.print("전체금액을 입력해주세요:  ");
		totalPrice = sc.nextInt();

		// 계산
		resultPrice = totalPrice/1000 * 1000;
		System.out.println("실제지불금액은 " + resultPrice + " 입니다.");

		 */
		
	}

}
