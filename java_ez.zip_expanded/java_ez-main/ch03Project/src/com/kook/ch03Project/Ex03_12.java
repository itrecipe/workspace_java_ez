package com.kook.ch03Project;

public class Ex03_12 {
	public static void main(String[] args) {
		int x = 10;
		int y = 8;

		System.out.printf("%d�� %d�� ������, %n", x, y);
		System.out.printf("���� %d�̰�, �������� %d�Դϴ�.%n", x / y , x % y);
		// int / int�� int�̹Ƿ� ���� ���ϰ�,
		// int % int�� �������� ����
		
		// �ڹ������� - Ex03_13����
		System.out.println(-10 % 8);
		System.out.println(10 % -8);
		System.out.println(-10 % -8);
		//������ ���� ������ ���ǳ� ���õ�.
	}
}