package com.kook.ch07Project;

//Parent Ŭ������ ��ӹ��� Ŭ����(child)
public class Child extends Parent {
	int x = 20;
	
	void method() {
		System.out.println("x = " + x); //x�� �ڱ�Ŭ������ x
		System.out.println("this.x = " + this.x);
		//this�� �ڱⰴü�̹Ƿ� x�� �ڱ� Ŭ������ x
		System.out.println("super.x = " + super.x); //x�� �ڱ�Ŭ������ x
		//super��ü�� ����Ŭ���� ��ü�� ��Ÿ���Ƿ� x�� ����Ŭ������ x
	}
	//Ŭ�������� Child�ε� ������ x (�⺻ �����ڸ� ����)
}
