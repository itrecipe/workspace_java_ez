package com.kook.ch03Project;

public class Ex03_14 {

	public static void main(String[] args) {
		//�ڹ������� ����
		String str1 = "abc"; //���� �����ؼ� String �������� ����
		String str2 = new String("abc"); //�����ڸ� �̿��Ͽ� ����
		
		System.out.printf("\"abc\"==\"abc\" ? %b%n", "abc" == "abc");
		// \"�� "�� �ο��ȣ �ȿ��� ����ϵ��� ���ִ� �̽������������� ����(\)��
		//%b ���������ڴ� boolean������ ǥ��
		System.out.printf(" str1==\"abc\" ? %b%n",  str1=="abc");
		//str1 == "abc"�� str1�� ���� �����Ͽ� ���� �����̹Ƿ� ������ ��
		System.out.printf(" str2==\"abc\" ? %b%n",  str2=="abc");
		//str2�� new�� ������ ��ü�̹Ƿ� ==�� �� �ϸ� �ּҷ� �� �Ǿ� false
		System.out.printf("str1.equals(\"abc\") ? %b%n", str1.equals("abc"));
		//equals�޼���� ���� ��
		System.out.printf("str2.equals(\"abc\") ? %b%n", str2.equals("abc"));
		System.out.printf("str2.equals(\"ABC\") ? %b%n", str2.equals("ABC"));
		System.out.printf("str2.equalsIgnoreCase(\"ABC\") ? %b%n",
						   str2.equalsIgnoreCase("abc"));
		//equalsIgnoreCase()�� ��ҹ��ڸ� �������� �ʰ� ��
		
		//���� ���� ����
		System.out.printf("str2.equals(str1) ? %b%n", str2.equals(str1));
		//str2���ʺ����� str1 ���������� equals�� �ϸ� ���� ���Ͽ� true
		System.out.printf("str2 == str1 ? %b%n", str2.equals(str1));
		//���������� �ּҸ� ���ϹǷ� false
	}
}