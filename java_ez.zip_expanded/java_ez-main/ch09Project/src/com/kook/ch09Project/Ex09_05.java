package com.kook.ch09Project;

public class Ex09_05 {
	
	//Ŭ���� ��ü�� ������� ���� �ľ��ҽÿ��� toString()���� ������
	public static void main(String[] args) {
		
		Card2 c1 = new Card2(); //���ھ��� ������ ȣ��
		Card2 c2 = new Card2("DIAMOND", 25); //2���� ���ڷ� ������ ȣ��
		
		//Card2�� �������� toString()�� ���
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		//print���ȿ� ����ϴ� ��ü�� ������ �ڵ����� toString()�� �پ ��µ�
		System.out.println(c1);
		System.out.println(c2);

	}
}

class Card2 {
	//����ϴ� ���� ������ �����Ƿ� Object�� 11�� �޼��带 ���
	String kind;
	int number;
	
	Card2() { //�⺻�� �޼��� 
		this("SPADE", 1);
	}
	
	Card2(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
	//Object�� toString()�� Override���� ����������� ���
	@Override
	public String toString() {
		return "kind : " + kind + ", number : " + number;
	}
}