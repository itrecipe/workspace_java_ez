package com.kook.ch05Project;

import java.util.Arrays;

public class Ex05_01 {

	public static void main(String[] args) {
		int[] iArr1 = new int[10]; //�޸� Ȯ�� �� int �⺻���� 0���� ��Ұ� ä����
		//String str = new String("abc");
		//�ٸ� ���������� new ������ ���°� �ٸ����� �ֽ�
		
		int[] iArr2 = new int[10];
		int[] iArr3 = {100, 95, 80, 70, 60};
		//����� �迭�� ��(���ͷ�)�� �ʱ�ȭ
		//�迭���� ǥ���ϴ� ����� {}�ȿ� ,�� ���е� ���� �־���
		//���ͷ� ������ �ʱ�ȭ �ҽÿ��� ����ÿ� �ٷ� ����� ��.
		
		//����, ����� �ʱ�ȭ ���� ������ ��� ���� �߻�(�Ʒ� ������ �ּ�ó�� �� �����ڵ� ����)
		/* ���� �߻� ���� �ڵ�
		 int[] iArr4;
		 iArr4 = {100,95,80,70,60};
		 �̷��� �� ��� ������ �߻���.
		*/
		
		char[] chArr = {'a', 'b', 'c', 'd'};
		//for���� �̿��� �迭�� �� ��Ұ� ���
		for (int i=0; i < iArr1.length; i++) {
			iArr1[i] = i + 1; //������ ��ҿ� i + 1�� ����
		}
		for (int i=0; i < iArr2.length; i++) {
			iArr2[i] = (int)(Math.random()*10) + 1;
			//1���� 10������ ������ ���� ��ҿ� ����
		}
		//for���� �̿��� ���Ե� ��Ұ��� print������ ���
		for(int i=0; i < iArr1.length; i++) {
			System.out.print(iArr1[i]+",");
		}
		System.out.println(); //�� ����ó���� ���� ���
				
		//Arrays Ŭ������ toString() �޼��带 �̿��Ͽ� �迭 �� ���
		System.out.println(Arrays.toString(iArr2));
		System.out.println(Arrays.toString(iArr3));
		System.out.println(Arrays.toString(chArr));
		//�迭������ �ٷ� ���
		System.out.println(iArr3); //������ -> [I@156643d4
		System.out.println(chArr); //���ڿ� ���·� ��� -> abcd
		//ch�迭�� �ٷ� print�ϸ� , ���� ���ڿ� ���·� ���(print���� ó��)
	}
}