package com.javaex.practice;

public class Ex17 {
	/*
	 다음 코드의 오류가 나는 부분을 찾은 후 이유를 작성하세요.
	 (코드를 작성해서 오류가 없도록 변경해 보세요.)
	 public static void main(String[] args) {
		
		int x, y
		
		x = 10
		y = 20
		
		sum = x + y
		
		System.out.println("합은 " + sum);
		
		틀린 이유는 ; 누락됨, 모든 문장마다 ; 넣어주기
		sum = x + y 에서 sum도 변수 키워드 필요, int 넣어주기 


	 */

	public static void main(String[] args) {
		
		int x, y;
		
		x = 10;
		y = 20;
		
	    int sum = x + y;
		
		System.out.println("합은 " + sum);

	}

}
