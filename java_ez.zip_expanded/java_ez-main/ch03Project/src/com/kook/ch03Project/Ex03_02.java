package com.kook.ch03Project;

public class Ex03_02 {

	public static void main(String[] args) {
		int i=5 , j=0;
		
		j = i++; //�������� ������ : ��ó�� �� ����
		System.out.println("j = i++; ���� ��, i=" + i +", j=" + j);
		
		i=5; //��� �񱳸� ���� i�� j���� �ٽ� 5�� 0���� �ʱ�ȭ
		j=0;
		
		j = ++i; //�������� ������ : ������ �� ó��
		System.out.println("j = ++i; ���� ��, i=" + i + ", j=" + j);

	}
}
