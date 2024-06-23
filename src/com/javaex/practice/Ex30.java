package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		
		// 마일을 km로 변환하는 프로그램을 작성하세요.(1마일 = 1.609km 상수로 지정)
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("마일을 입력하세요: ");		//mile은 마일
		
		double mile = sc.nextDouble();
		double one = 1.609; 		  //one은 1마일
		
		System.out.println(mile+"마일은 "+ one*mile+"킬로미터 입니다.");
		
		
		sc.close();

	}

}
