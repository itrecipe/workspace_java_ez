package com.kook.ch06Project;

public class Ex06_07 {

	public static void main(String[] args) {
		// ������ �������� ���ڷ� ����
		Data1 d = new Data1();
		d.x = 10;
		System.out.println("main () x = " + d.x);
		change(d); //Data1�� ��ü d�� ���ڷ� ���
		System.out.println("After change(d)");
		/* ���ڷ� ���޽� �ּҸ� �����Ͽ� �� �ּҿ� ����� ������� ���� �����ϹǷ�
		  ȣ���� �� ��������� ���� */
		System.out.println("main () x = " + d.x);

	}
	static void change(Data1 d) {
		//�Ķ���� ����������(��ü)�� ����ϸ� �ּҸ� ����
		d.x = 1000; //�Ķ���ͷ� ���� ���� Data1�� ��ü d�� ������� x�� ����
		System.out.println("change() : x = " + d.x);
	}
}

class Data1{
	int x;
}