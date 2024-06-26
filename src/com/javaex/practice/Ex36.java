package com.javaex.practice;

import java.util.Scanner;

public class Ex36 {

	public static void main(String[] args) {
		
		// 동전별 개수를 입력받아 총금액을 계산하는 프로그램을 작성하세요.
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("500원 개수: ");		//fives는 500원의 개수
		int fives = sc.nextInt();
		
		System.out.print("100원 개수: ");		//ones는 100원의 개수
		int ones = sc.nextInt();
		
		System.out.print("50원 개수: ");		//five는 50원의 개수
		int five = sc.nextInt();
		
		System.out.print("10원 개수: ");		//one는 10원의 개수
		int one = sc.nextInt();
		
		System.out.print("동전의 총합은 " + (fives*500+ones*100+five*50+one*10) + " 원 입니다.");

		sc.close();

		/*
		int coin500;
		int coin100;
		int coin50;
		int coin10;
		int totalCoin;

		Scanner sc = new Scanner(System.in);

		// 동전개수 입력
		System.out.print("500원 개수:  ");
		coin500 = sc.nextInt();

		System.out.print("100원 개수:  ");
		coin100 = sc.nextInt();

		System.out.print("50원 개수:  ");
		coin50 = sc.nextInt();

		System.out.print("10원 개수:  ");
		coin10 = sc.nextInt();

		// 총합 계산
		totalCoin = coin500 * 500 + coin100 * 100 + coin50 * 50 + coin10 * 10;

		System.out.println("동전의 총합은 " + totalCoin + " 원 입니다.");

		 */

	}

}
