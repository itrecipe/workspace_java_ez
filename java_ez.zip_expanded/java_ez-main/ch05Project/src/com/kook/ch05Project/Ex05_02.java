package com.kook.ch05Project;

public class Ex05_02 {

	public static void main(String[] args) {
		int sum = 0; 
		//main�޼��� �ȿ� �ִ� �����μ� ���� ����(��������)��� �� main�޼��� �ȿ����� ��� �� �۵�����
		//���� ������ �⺻���� ���� ����� �ʱⰪ�� �����
		float average = 0f;
		
		int[] score = {100, 88, 100, 100, 90};
		//�迭 ����� ���ÿ� ���ͷ��� �ʱ�ȭ 
		//int[] score = {100, 88, 100, 100, 90};
		//int[] score = new int[5]; score = {100, 88, 100, 100, 100, 90};
		
		for (int i=0; i < score.length; i++) {
			sum += score[i];
		}
		average = sum / (float)score.length; //int / float = float
		
		System.out.println("���� : " + sum);
		System.out.println("��� : " + average);
	}
}
