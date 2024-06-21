package com.javaex.practice;

public class Ex15 {
	
	//아래 프로그램의 결과를 코드작성전에 먼저 예상해보고 코드를 작성해 확인해 보세요

	public static void main(String[] args) {
		
		System.out.println( 12 / 5-3);				// /먼저 -> 12/5 -> 2-3 -> -1
		System.out.println( 5 + 19 % 3 );			// %먼저 -> 19%3 -> 5+1 -> 6
		System.out.println( 2 + 2 / 2 );			// /먼저 -> 2/2 -> 2+1 -> 3
		System.out.println( 29 % 3 + 29 / 3 );		// %, /, +순서대로 -> 2 + 9 -> 11
		System.out.println( 29 % 3 + 18.0 / 4 );	// %, /, +순서대로 -> 2 + 4.5 -> 6.5
		System.out.println( (14 + 7/2) / 4 );		// ()먼저 -> /먼저 -> 14 + 3 -> 17 / 4 -> 4
		System.out.println( (14 + 7/2.0) / 5 );		// ()먼저 -> /먼저 -> 14 + 3.5 -> 17.5 / 5 -> 3.5

	}

}
