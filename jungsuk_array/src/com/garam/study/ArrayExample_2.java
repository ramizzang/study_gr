package com.garam.study;

public class ArrayExample_2 {

	public static void main(String[] args) {
		//자바의 정석 배열
		
		//배열 선언과 생성
//		int[] score; //배열 score 선언, score는 참조변수
//		score = new int[5]; //배열의 생성 (int타입 변수 5개 묶음 이라고 생각하자!)
		
		//위 두개를 하나로 묶으면
		int[] score = new int[5]; //배열의 선언과 생성을 동시에
		score[3] = 100;
		
		//생성된 요소들
		System.out.println(score[0]); //실행결과 0
		System.out.println(score[1]); //실행결과 0
		System.out.println(score[2]); //실행결과 0
		System.out.println(score[3]); //실행결과 100, 위에 100이 저장된걸 알 수 있음
		System.out.println(score[4]); //실행결과 0
				
		int value = score[3];
		System.out.println(value); //실행결과 100, score[3]에 100이 저장된걸 알 수 있음
		
	}

}
