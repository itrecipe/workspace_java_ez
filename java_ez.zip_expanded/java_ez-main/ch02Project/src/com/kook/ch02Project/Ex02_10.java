package com.kook.ch02Project;

import java.util.Scanner; //Scanner�� ����ϱ� ���� �߰�

public class Ex02_10 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		//ScannerŬ������ java.lang ��Ű���� �ִ� Ŭ������ �ƴϹǷ� import�Ѵ�.
		//System�̳� StringŬ������ �ڹ��� �⺻ ��Ű���� java.lang�� �־� import���ص� ��.
		System.out.print("���ڸ� ������ �ϳ� �Է��ϼ���.>");
		String input = scanner.nextLine(); //�Է� �����¿��� �Է��� ������ EnterŰ�� �Է��Ͽ� ���µ� ���� ��ȯ(��ȯ�� ���� String(������)�̴�.)
		int num = Integer.parseInt(input);
		
		System.out.println("�Է³��� : "+input);
		System.out.printf("num = %d%n", num);
		
	}
}
