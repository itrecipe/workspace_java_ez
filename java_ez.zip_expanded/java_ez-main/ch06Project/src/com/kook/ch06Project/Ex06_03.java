package com.kook.ch06Project;

public class Ex06_03 {

	public static void main(String[] args) {
		//Ŭ��������(static����)�� Ŭ������,���������� ����
		System.out.println("Card.width = " + Card.width);
		System.out.println("Card.height = " + Card.height);
		//�ν��Ͻ� ������ ��ü�� ������ ��ü.���������� ����
		Card c1 = new  Card();
		//�⺻ �����ڴ� Ŭ������ �����ڰ� �ϳ��� ������ �����Ͻ� �ڹٰ� ����
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		//Ŭ�������� ��ü.Ŭ������ ������ ���ٵ� ����(����:�ǰ�x)
		System.out.println("c1�� " + c1.kind + "," + c1.number
				+ " �̸�, ũ��� (" + c1.width + "," + c1.height + ")" );
				
		System.out.println("c2�� " + c2.kind + "," + c2.number
				+ " �̸�, ũ��� (" + c2.width + "," + c2.height + ")" );
		
		System.out.println("c1�� width�� height�� ���� 50, 80���� �����Ѵ�.");
		
		//����:�ǰ�o
		c1.width = 50;
		c2.height = 80;
		
		//width,height�� �������� ����ϴ� Ŭ������ �����̹Ƿ� c2�� �����ϴ��� ����� �� ���
		System.out.println("c1�� " + c1.kind + "," + c1.number
				+ " �̸�, ũ��� (" + c1.width + "," + c1.height + ")" );
		
		System.out.println("c2�� " + c2.kind + "," + c2.number
				+ " �̸�, ũ��� (" + c2.width + "," + c2.height + ")" );

		//���� ����� Ŭ������ ������ Ŭ������.������ ����Ұ�.
		Card.width = 51;
		Card.height = 81;
		
	}
}
