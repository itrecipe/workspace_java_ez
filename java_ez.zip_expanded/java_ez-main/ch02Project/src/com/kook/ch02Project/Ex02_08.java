package com.kook.ch02Project;

public class Ex02_08 {

	public static void main(String[] args) {

	int x = 10 , y = 5; //���������� ���� ��� ���ٿ� �ۼ�
	//int x =10;
	//int y = 5;
	
	System.out.println("x="+x);
	System.out.println("y="+y);
	
	int tmp = x;
	x = y; //���� x�� y�� ����
	y = tmp;
	//x,y���� ��ȯ
	System.out.println("x="+x);
	System.out.println("y="+y);
	}
}