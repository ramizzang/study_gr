package com.garam.study;

import java.util.Arrays;

public class PrintArrays {
	public static void main(String[] args) {
		//�迭�� �ʱ�ȭ �� ��� Ȯ���غ���
		
		//1.�迭�� �ʱ�ȭ 
		
		//1-1)�� ��ҿ� ���� ���� ����.
		int[] s1 = new int[5]; //���̰� 5�� int�� �迭�� ����		
		s1[0]=50; 
		s1[1]=60;
		s1[2]=70;
		s1[3]=80;
		s1[4]=90;
		
		//1-2)for���� �̿��� �ʱ�ȭ
		int[] s2 = new int[5]; 	
		for(int i=0; i < s2.length; i++)
			s2[i]=i*10+50;
//		for���� �̿��� �ʱ�ȭ�� �Ҷ��� �����Ϸ��� ���� ������ ��Ģ�� �־�� ����.
		
		//1-3)�ڹٿ��� �����ϴ� ���		
//		int[] score=new int[] {10,20,30,40,50}; //�迭�� ������ �ʱ�ȭ�� ���� ����
		int[] score= {10,20,30,40,50}; //new int[] ���������ϴ�_���帹�� ���
		
		//2.�迭�� ���
		//���� ������ �迭 score�� ����� �� Ȯ���Ѵ� ����	
		
		//2-1)for���� ����� ���	
		//�迭�� ��Ҹ� ������� �ϳ��� ���
		for(int j=0; j<score.length; j++ ) {
			System.out.print(score[j]+" "); //������ 10,20,30,40,50
		}
		System.out.println();		
		
		//2-2)Arrays.toString(�迭�̸�) �޼��带 ����� ���
		//�迭�� ��Ҹ� [���1, ���2, ���3,....]�� ������ ���ڿ��� ��ȯ
		System.out.println(Arrays.toString(score)); //������ : [10, 20, 30, 40, 50]
		
		
		//�迭�� ���� �ٷ� ����Ѵٸ�? -> 'Ÿ��@�ּ�'�� �������� ��µ�
		System.out.println(score); //������ : [I@5a1c0542
		
		//but char Ÿ�� �迭�� ����_println�޼����� ��� char�迭�϶��� ����
		char[] ch= {'a','b','c'}; //���̰� 3�� char Ÿ�� �迭 ���� �� �ʱ�ȭ
		System.out.println(ch); // ������ : abc
						
	}

}
