package com.kook.ch03Project;

public class Ex03_09 {

	public static void main(String[] args) {
		int a = 1_000_000; //100�� , JDK 1.7���ʹ� ū ���� �б� ������ _(�����) ���
		int b = 2_000_000; //200��

		long c = a * b;	//a * b = 2,000,000,000,000
		
		System.out.println(c); //����� �����÷ο� �� �� : -1454759936 ��µ�.
		//������ int * int -> int�ε� 2,000,000,000,000�� int��(�� 21�� ����) ������ ���.

		long c1 = (long) a* b ; //long * long -> long
		System.out.println(c1);
	}
}