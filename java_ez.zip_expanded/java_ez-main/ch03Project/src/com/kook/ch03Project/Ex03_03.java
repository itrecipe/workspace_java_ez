package com.kook.ch03Project;

public class Ex03_03 {

	public static void main(String[] args) {
		int i=5 , j=5;
		
		System.out.println(i++); //���� ���� ������ : ��ó�� �� ���� 
		System.out.println(++j); //���� ���� ������ : ��ó�� �� ����
		
		System.out.println("i = " + i + " , j = " + j); 
		//���⼭ i���� 1�� ������ ������ ��ó�� �� ������ �Ǿ��� ����, �� ó���� ���� �� ���� �� ���̴�.

		i = 5;
		j = 5;
		
		System.out.println(i--); //���� ���� ������ : ��ó�� �� ���� 
		System.out.println(--j); //���� ���� ������ : ��ó�� �� ����
		
		System.out.println("i = " + i + " , j = " + j);
		
	}
}
