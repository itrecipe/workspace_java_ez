package com.kook.ch09Project;
//��.��
public class Ex09_01 {

	public static void main(String[] args) {
		Value v1 = new Value(10);
		Value v2 = new Value(10);
		//v1�� v2�� �ּҰ� �ٸ�(����� �ν��Ͻ����� 10���� ������)
		
		//equals�޼���� Object�� �޼����̹Ƿ� �ּҸ� ���Ѵ�.
		if(v1.equals(v2)) {
			System.out.println("v1�� v2�� ����");
		} 
		else {
			System.out.println("v1�� v2�� �ٸ���");
			
		}
	}
}

class Value { //����� ���� �����Ƿ� extends Object�� ������ ����
	int value;
	//������
	Value() { //�޼������ Ŭ������� ������ ��������
		super(); //super�� Object�� ������
	}
	
	//������
	Value(int value) {
		this.value = value;
	}
}