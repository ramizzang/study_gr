package com.garam.study;

public class ArrayExample_01 {

	public static void main(String[] args) {
		//�ڹ��� ���� �迭
		
		//�迭�� ���� - �迭�̸�.length(�迭�� ���̸� �˷��ش�, �迭�� ���̴� ���)
		
		int[] arr=new int[5]; //���̰� 5�� int �迭 arr ����
		System.out.println("arr.length="+arr.length);
		
//		for(int i=0;i<10;i++) { // index ������ ����� ������
		
		for(int i=0;i<arr.length;i++) { // index������ ����� �ʾƼ� ����x
			System.out.println("arr["+i+"]="+arr[i]);
		}
		
	} // main end

} // class end
