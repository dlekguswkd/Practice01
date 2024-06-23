package com.javaex.practice;

public class Ex35 {

	public static void main(String[] args) {
		
		// long형 변수를 사용하여 빛이 1년동안 진행하는 거리를 계산하여 출력하세요.
		// (단 빛의 속도는 300000 km/s 로 계산한다)
		
		long light = 300000 ;		//light는 빛의 속도
		
		System.out.println("빛이 1년 동안 가는 거리는 " + (light*365*86400) + " km 입니다.");

		// 하루는 86400초
	}

}
