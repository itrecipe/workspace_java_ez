package com.kook.ch02Project;

public class Ex02_12 {

	public static void main(String[] args) {
		
		String str = "3"; //���� 3�� ���ڿ��� ó��
		
		char c0 = str.charAt(0);
		//charAt(���ι�ȣ)�� ���ڿ����� ���ι�ȣ�� ����Ű�� ���ڸ� ��ȯ
		System.out.println(c0);
		
		int c1 = c0 - '0'; //���� - ���ڴ� int�� ��ȯ
		
		char c2 = (char)c1; //int c1�� char�� ����ȯ(�������ȯ���� ���� ����ȯ)
		
		int c3 = c2; //char���� int�� ����ȯ�� �ϸ� Ȯ�� ����ȯ���� ĳ���� ����
		
		System.out.println(c1);
		
		System.out.println(str.charAt(0) - '0'); //int���� ��ȯ 3
		System.out.println('3' - '0' + 1); //3 + 1 = 4
		System.out.println(Integer.parseInt("3") + 1);
		//java.lang.Integer.parseInt(������ String) (��),(��) ������ ��ȯ
		System.out.println("3" + 1); //���ڿ� + ���ڴ� ���ڿ��� ���� 31
		System.out.println(3 + '0'); //���� + ���ڴ� ������ �ڵ��� int�� ��ȯ�Ͽ� ��� '0'�� 48
	}
}
