package com.kook.ch03Project;

public class Ex03_06 {

	public static void main(String[] args) {
		int a = 10;
		int b = 4;
		
		System.out.printf("%d + %d = %d%n", a, b, a + b); //int + int = int
		System.out.printf("%d - %d = %d%n", a, b, a - b); //int - int = int
		System.out.printf("%d * %d = %d%n", a, b, a * b); //int * int = int
		System.out.printf("%d / %d = %d%n", a, b, a / b); //int / int = int
		
		System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b);
		// int b�� float�� ����ȯ , ���� 4�� float�� 4.000000���� ��ȯ
		// int / float = float
		
		// �� �������� �����̳����� ����� ��ȯ
	}
}