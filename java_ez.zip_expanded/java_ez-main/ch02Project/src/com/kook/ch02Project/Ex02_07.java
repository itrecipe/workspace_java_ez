package com.kook.ch02Project;

public class Ex02_07 {

	public static void main(String[] args) {

		String name = "JA" + "VA"; //+�� ���ڿ� ���� ������
		String str = name + 8.0;
		//name�� String�� �����̸� ����� ���� "Java"
		//8.0�� �Ҽ��� �ִ� ���� �ڹٿ��� �Ҽ��� ���ڴ� �⺻�� double�� �̹Ƿ� 8����Ʈ ���ͷ�
		//name + 8.0�� ���ڿ� + ���ڴ� ���ڿ� + ���ڿ�
		
		System.out.println(name);
		System.out.println(str);
		System.out.println(7 + " ");
		System.out.println(" " + 7);
		System.out.println(7 + " ");
		System.out.println("" + 7);
		System.out.println("" + "");
		System.out.println(7 + 7 + "");
		System.out.println("" + 7 + 7);
	}
}