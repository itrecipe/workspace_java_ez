package com.kook.ch07Project;

public class Child2 extends Parent2 {
	//��ӹ��� ��������� ���ԵǾ� ����
	void method() {
		System.out.println("x = " + x ); //��ӹ��� x
		System.out.println("this.x = " + this.x); //��ӹ��� x
		System.out.println("super.x = " + super.x); //�θ� x
	}
}
