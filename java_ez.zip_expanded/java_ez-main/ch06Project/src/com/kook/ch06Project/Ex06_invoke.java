package com.kook.ch06Project;
//���ܿ���-���翡 ���� ����
public class Ex06_invoke {

	public static void main(String[] args) {
		
		TestClass tc = new TestClass();
		tc.instanceMethod2(); //�ٸ� Ŭ������ �ν��Ͻ� �޼���� ��ü ���� �� ��밡��
		
		TestClass.staticMethod2(); //�ٸ� Ŭ������ Ŭ���� �޼���� Ŭ������.�޼�������� ��밡��
		
	}
}

class TestClass{
	//���� Ŭ�������� �޼��� ȣ��
	
	int iv; //�ν��Ͻ� ����
	static int sv; //Ŭ���� ����
	
	void instanceMethod() { //�ν��Ͻ� �޼���
		//�ν��Ͻ� �޼��� �ȿ����� ���� Ŭ������ �ν��Ͻ� ������ Ŭ���� ���� ��� ���������� ����
		iv = 10;
		sv = 20;
	}
	static void staticMethod() { //Ŭ���� �޼���
		//iv = 20; Ŭ���� �޼��� �ȿ��� �ν��Ͻ� ������ �̸����� ����x
		TestClass tc = new TestClass();
		tc.iv = 20;
		sv = 30;
	}
	void instanceMethod2() { //�ν��Ͻ� �޼���
		instanceMethod(); 
		//�ν��Ͻ� �޼��� �ȿ��� ���� Ŭ������ �ν��Ͻ� �޼��� ȣ���� ���� �޼�������� ȣ��
		staticMethod();
		//�ν��Ͻ� �޼��� �ȿ��� ���� Ŭ������ Ŭ���� �޼��� ȣ���� ���� �޼�������� ȣ��
	}
	static void staticMethod2() { //Ŭ���� �޼���
		//instanceMethod(); Ŭ���� �޼��峻���� ����Ŭ���� �ν��Ͻ��޼���� �޼�������� ȣ��x
		TestClass tc = new TestClass();
		tc.instanceMethod(); //��ü�� �����ؼ� ����ϴ°��� ����
		staticMethod();
		//Ŭ���� �ȿ��� ����Ŭ������ Ŭ���� �޼��� ȣ���� �޼�������� ȣ�� ����
	}
}