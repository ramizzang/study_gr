package com.garam.study;

import java.util.Arrays;

public class ArrayCopy {

	public static void main(String[] args) {
		// 배열의 복사
		// 배열은 한번 생성하면 실행하는 동안 그 길이를 바꿀 수 없음!!! -> 왜냐면 배열은 연속적임 그래서 더 추가할 빈 공간이 있다고 보장 할
		// 수 없음!
		// 배열의 길이를 변경하고 싶다면. 1. 더 큰배열을 새로 생성 2. 기존 배열을 새로운 배열에 복사.

		// 1. for문을 이용한 배열의 복사
		
		int[] arr = { 1, 2, 3, 4, 5 }; // 길이가 5인 int형 배열 생성 및 초기화

		// 얘를 복사하고 싶어
		// 1-1) 기존 배열보다 길이가 긴 배열 생성
		int[] tmp = new int[arr.length * 2]; // 기존 배열보다 길이가 2배인 배열 생성
		System.out.println(Arrays.toString(tmp)); // 배열 tmp의 각 요소는 int의 기본값인 0으로 초기화 됨
		
		// 1-2) for문을 이용해서 배열 arr의 모든 요소에 저장된 값을 배열 tmp에 복사
		for(int i=0; i<arr.length; i++) {
			tmp[i]=arr[i];
		}
		
		// 1-3) 참조변수 arr에 참조변수 tmp의 값을 저장.
		arr=tmp; //tmp의 주소를 arr한테 준다고 생각!!!!!!!!
		
		System.out.println(Arrays.toString(arr)); 
		
		// 실행결과 : [1, 2, 3, 4, 5, 0, 0, 0, 0, 0] 바뀜!!!!!!! 배열이 복사되고 길이가 늘어남!!!!!!
		
		// 2. System.arraycopy()를 이용한 배열의 복사 (더 효율적)	
		//지정된 범위의 값들을 한 번에 통째로 복사! -> 각 요소들이 연속적인 배열의 특성때문에 가능!
		
		//내가 책보고 이해한 내용
		
		int[] num= {1,2,3}; // 길이가 3인 배열 (요소가3개)
		int[] num2= {4,5,6,7,8}; // 길이가 5인 배열 (요소가 5개)
		
		//이렇게 배열이 두개 있을때 만약 배열 num의 첫번째 두번째 요소를(1,2) num2 4,5,6 위치로 복사하고 싶어!
		System.arraycopy(num, 0, num2, 0, 2); // (배열1, 배열1-요소num, 배열2, 배열2-요소num, 데이터개수) ,배열1 -> 복사할것 배열2-> 붙여넣기 당하는거
		System.out.println(Arrays.toString(num2)); // 실행결과 [1, 2, 6, 7, 8]
		
		//일단 이렇게 이해하고 넘어가자!!!!!!!!
		
		
	
		
		
	}

}
