package com.kook.ch05Project;

import java.util.Arrays; //java.lang�� �ƴѰ��� import ����� ��.

public class Ex05_04 {

	public static void main(String[] args) {
		//shuffle(�� ���� -0��°�� ���Ƿ� ����� ���ι�ȣ�� ���� ��ȯ)
		int[] numArr = {0,1,2,3,4,5,6,7,8,9};
		System.out.println(Arrays.toString(numArr));
		
		//100ȸ ����
		for(int i=0; i < 100; i++) {
			//0�� ��ҿ� ��ȯ�� ������ ���ι�ȣ
			int n = (int)(Math.random() * 10);
			int tmp = numArr[0]; 
			//�ӽ÷� ���� ������ ���� tmp , 0�� ��Ұ� ��ȯ�ϸ� ������Ƿ� �ӽ÷� tmp������ ����
			numArr[0] = numArr[n];
			numArr[n] = tmp;
		}
		System.out.println(Arrays.toString(numArr));
	}
}
