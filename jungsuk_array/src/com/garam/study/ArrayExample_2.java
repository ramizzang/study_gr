package com.garam.study;

public class ArrayExample_2 {

	public static void main(String[] args) {
		//�ڹ��� ���� �迭
		
		//�迭 ����� ����
//		int[] score; //�迭 score ����, score�� ��������
//		score = new int[5]; //�迭�� ���� (intŸ�� ���� 5�� ���� �̶�� ��������!)
		
		//�� �ΰ��� �ϳ��� ������
		int[] score = new int[5]; //�迭�� ����� ������ ���ÿ�
		score[3] = 100;
		
		//������ ��ҵ�
		System.out.println(score[0]); //������ 0
		System.out.println(score[1]); //������ 0
		System.out.println(score[2]); //������ 0
		System.out.println(score[3]); //������ 100, ���� 100�� ����Ȱ� �� �� ����
		System.out.println(score[4]); //������ 0
				
		int value = score[3];
		System.out.println(value); //������ 100, score[3]�� 100�� ����Ȱ� �� �� ����
		
	}

}
