package com.kook.ch07Project;
//���ܺ�������(����������)
public class Ex07_16 {

	public static void main(String[] args) {
		OuterEx0716 out = new OuterEx0716();
		OuterEx0716.Inner inner = out.new Inner();
		//�ܺ�Ŭ������ ���� Ŭ���� ���� (��������)�� �ܺ�Ŭ������.����Ŭ������
		inner.method();
	}
}

class OuterEx0716{
	//��������� ������ this�� ���
	int value = 10;
	
	class Inner {
		int value = 10;
		void method() {
			int value = 30; //Inner����Ŭ������ ���ú��� value
			System.out.println("value : " + value); //���ú����� 30
			System.out.println("this.value : " + this.value); //���ΰ�ü ������ : 10
			//this�� �ڽ��� Ŭ������ ��ü(�޼��忡 �ڵ� ����� ���� ��ü = �ش� �޼ҵ� �ȿ����� ����Ѵٴ� �ǹ�)
			System.out.println("OuterEx0716.this.value : " + OuterEx0716.this.value);
			//�ܺ�Ŭ������ ���� 10;
		}
	}
}