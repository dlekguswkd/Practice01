package com.javaex.practice;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
		
		// 직사각형의 둘레와 면적을 구하는 프로그램을 작성하세요.(가로 세로 변수 double형으로 작성)
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("가로를 입력하세요: ");			//width는 가로
		double width = sc.nextDouble();
		
		System.out.print("세로를 입력하세요: ");		//length는 세로
		double length = sc.nextDouble();
		
		System.out.println("사각형의 넓이는 " + width*length);
		System.out.println("사각형의 둘레는 " + (width*2+length*2));
		
		
		sc.close();

		/*
		double width;
		double height;
		
		double area;
		double perimeter;
		
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("가로를 입력하세요: ");
		width = sc.nextDouble();
		
		System.out.print("세로를 입력하세요: ");
		height = sc.nextDouble();
		
		area = width  * height;
		perimeter = width*2 + height*2;
		
		System.out.println("사각형의 넓이는 " + area );
		System.out.println("사각형의 둘레는 " + perimeter );
		 */
	}

}
