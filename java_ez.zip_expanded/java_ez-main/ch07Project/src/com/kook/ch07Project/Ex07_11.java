package com.kook.ch07Project;

public class Ex07_11 {

	public static void main(String[] args) {
		ChildEx0711 c = new ChildEx0711();
		c.method1(); //�������̽��� default�޼��尡 �浹���� Ŭ�������� �������� �޼��带 �����
		c.method2(); //���� ParentEx0711�� �������̽��� �޼��尡 �浹�� ������ �޼��带 �����
		
		//static(Ŭ������)�޼���� �������̽������� ����
		MyInterface.staticMethod();
		MyInterface2.staticMethod();
		
		//���� �߻� �޼��� ȣ��
		c.absMethod1();
	}
}

//���� Ŭ���� ����
class ParentEx0711 { 
	public void method2() {
		System.out.println("method2() in ParentEx0711");
	}
}

class ChildEx0711 extends ParentEx0711 implements MyInterface,MyInterface2 {
	//������ �������̽��� default�޼��尣�� �浹(MyInterface,MyInterface2�� mothod1)
	@Override // �浹�޼��� ������
	public void method1() {
		System.out.println("method1() in ChildEx0711"); //�������̵�
	}
	
	//����� �޼��� method2�� �������̽��� default �޼��� method2�� �浹��
	//������ �޼��� ����
	
	//�߻�޼��� ����
	@Override //���� : �߻�޼��� ������ Override ���ִ°� ����
	public void absMethod1() {
		System.out.println("�߻�޼��� ����");
	}
}

interface MyInterface {
	//�߻�޼��尡 ���� �������̽�
	//�������̽��� �޼���� public(���� ����)
	//default�޼���� static�޼��带 JDK1.8���� �߰��� ������ �������̽� ������ ���� ��
	//�߻�޼��带 �߰��ϸ� �̸� ������ ��� Ŭ������ �߻�޼��带 �����ؾ��ϴ� �������� �ִ�.
	/*public*/ default void method1() { //�Ϲ� �ν��Ͻ� �޼��带 �������̽��ȿ� ����� default�� ����ؾ���
		System.out.println("method1() in MyInterface");
	}
	default void method2() { //�������̽��� �ִ� �Ϲ� �ν��Ͻ��� �޼���
		System.out.println("method2() in MyInterface");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
	public abstract void absMethod1();
}
	
interface MyInterface2 {
	default void method2() {
		System.out.println("method2() in MyInterface");
	}
	static void staticMethod() {
		System.out.println("staticMethod() in MyInterface");
	}
}