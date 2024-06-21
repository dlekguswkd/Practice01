package com.javaex.practice;

public class Ex24 {
	
	/*
	 다음의 코드는 화씨 온도를 섭씨 온도로 변환하는 프로그램이다.
	 결과값이 0이 나오는 이유는 무엇이며 정상인 결과가 나오도록 수정하세요.
	 

	public static void main(String[] args) {
		
		double f = 80.0;
		System.out.println(5/9*(f-32.0));  // ()먼저 -> 80.0-32.0 -> 48.0, 
											// 5/9*48.0 -> 앞에서부터 -> 5/9 -> 0 (정수/정수-> 정수)
											// 0*48.0 -> 0
											// double 넣어서 정수가 아닌 실수로 나오게끔 해줘야한다

	}
	 */
	
	public static void main(String[] args) {
		
		double f = 80.0;
		System.out.println((double)5/9*(f-32.0));  
		
	}
}
