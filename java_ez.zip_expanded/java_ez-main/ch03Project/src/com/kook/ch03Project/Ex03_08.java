package com.kook.ch03Project;

public class Ex03_08 {

	public static void main(String[] args) {
		//byte ������ -128 0~127
		byte a = 10;
		byte b = 30;
		
		//byte x = 300;�� byte�� ������ 127�� ��� ���� �߻�
		
		int c = a + b; //byte�� a�� b�� ������ int�� ��ȯ�ǰ� ����� int�� ���
		byte c1 = (byte)c;
		
		System.out.println(c1);
	}
}