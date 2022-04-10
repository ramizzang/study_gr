package com.garam.study;

public class ArrayExample_01 {

	public static void main(String[] args) {
		//자바의 정석 배열
		
		//배열의 길이 - 배열이름.length(배열의 길이를 알려준다, 배열의 길이는 상수)
		
		int[] arr=new int[5]; //길이가 5인 int 배열 arr 생성
		System.out.println("arr.length="+arr.length);
		
//		for(int i=0;i<10;i++) { // index 범위를 벗어나서 에러남
		
		for(int i=0;i<arr.length;i++) { // index범위를 벗어나지 않아서 에러x
			System.out.println("arr["+i+"]="+arr[i]);
		}
		
	} // main end

} // class end
