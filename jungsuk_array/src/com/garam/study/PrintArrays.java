package com.garam.study;

import java.util.Arrays;

public class PrintArrays {
	public static void main(String[] args) {
		//배열의 초기화 및 출력 확인해보기
		
		//1.배열의 초기화 
		
		//1-1)각 요소에 직접 값을 저장.
		int[] s1 = new int[5]; //길이가 5인 int형 배열을 생성		
		s1[0]=50; 
		s1[1]=60;
		s1[2]=70;
		s1[3]=80;
		s1[4]=90;
		
		//1-2)for문을 이용한 초기화
		int[] s2 = new int[5]; 	
		for(int i=0; i < s2.length; i++)
			s2[i]=i*10+50;
//		for문을 이용한 초기화를 할때는 저장하려는 값에 일정한 규칙이 있어야 가능.
		
		//1-3)자바에서 제공하는 방법		
//		int[] score=new int[] {10,20,30,40,50}; //배열의 생성과 초기화를 동시 진행
		int[] score= {10,20,30,40,50}; //new int[] 생략가능하다_가장많이 사용
		
		//2.배열의 출력
		//위에 생성한 배열 score에 저장된 값 확인한다 하자	
		
		//2-1)for문을 사용한 출력	
		//배열의 요소를 순서대로 하나씩 출력
		for(int j=0; j<score.length; j++ ) {
			System.out.print(score[j]+" "); //실행결과 10,20,30,40,50
		}
		System.out.println();		
		
		//2-2)Arrays.toString(배열이름) 메서드를 사용한 출력
		//배열의 요소를 [요소1, 요소2, 요소3,....]의 형식의 문자열로 반환
		System.out.println(Arrays.toString(score)); //실행결과 : [10, 20, 30, 40, 50]
		
		
		//배열의 값을 바로 출력한다면? -> '타입@주소'의 형식으로 출력됨
		System.out.println(score); //실행결과 : [I@5a1c0542
		
		//but char 타입 배열은 예외_println메서드의 기능 char배열일때만 동작
		char[] ch= {'a','b','c'}; //길이가 3인 char 타입 배열 생성 및 초기화
		System.out.println(ch); // 실행결과 : abc
						
	}

}
