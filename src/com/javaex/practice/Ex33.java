package com.javaex.practice;

import java.util.Scanner;

public class Ex33 {

	public static void main(String[] args) {
		
		// 사용자로부터 구의 반지름을 입력받아 구의 부피를 계산하는 프로그램을 작성하세요.
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("반지름:  ");		//radius은 반지름
		
		double radius = sc.nextDouble();
		double pie = 3.14;
		
		System.out.println("구의부피는: " + ((double)4*pie*radius/(double)3*radius*radius) + " 입니다.");
		
	
	
		sc.close();
		
		/*
		double radius;
		double volume;
		Scanner sc = new Scanner(System.in);
		
		//반지름 입력
		System.out.print("반지름:  ");
		radius = sc.nextDouble();
		
		//구의 부피 계산
		volume = (double)4/(double)3 * 3.14 *(radius*radius*radius);
		
		//구의 부피 출력
		System.out.println("구의부피는: " + volume + " 입니다." );
		
		 */

	}

}
