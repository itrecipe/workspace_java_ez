package com.kook.ch06Project;

public class Ex06_02 {
//���� ���� ����(������ ��¦ �ٸ�)
	public static void main(String[] args) {
		//Tv�� Ex06_01Ŭ���� ���ο� �־ ���� Ŭ������ ���� ��Ű���� �����Ƿ� ���� ����
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		
		//System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		//System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
		
		t1.channel = 7;
		//t2.channel = 8;
		
		System.out.println("t1 �ּ� : " + t1);
		System.out.println("t2 �ּ� : " + t2);
		
		System.out.println("t1�� ä�� " + t1.channel);
		System.out.println("t2�� ä�� " + t2.channel);
		
		t2 = t1; //t2�� ���� �ּҰ� t1�� ���� �ּҷ� ����
		
		//������ �ּҸ� ���� ��ü�� ������.
		System.out.println("t1�� channel���� 7�� �����.");
		System.out.println("t1�� channel���� " + t1.channel + "�Դϴ�.");
		System.out.println("t2�� channel���� " + t2.channel + "�Դϴ�.");
	}
}