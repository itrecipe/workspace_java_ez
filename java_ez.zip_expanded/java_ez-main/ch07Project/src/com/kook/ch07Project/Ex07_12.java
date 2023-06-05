package com.kook.ch07Project;
//���ܺ�������(����������)
public class Ex07_12 { //�ܺ� Ŭ������ �Ϲ������ڴ� abstract,final
	//�ν��Ͻ��� ���� Ŭ����
	class InstanceInner {
		int iv = 100;
		//static int cv = 100; //Ŭ������ ��������� instance ���� Ŭ�������� ���Ұ�,1.7������ ����? 
		final static int CONST = 100; //��, ����� �ν��Ͻ� ����Ŭ���������� ��밡��
	}
	
	//Ŭ������ ���� Ŭ����
	static class StaticInner {
		int iv = 200; //�ν��Ͻ����� ��밡��
		static int cv = 200; //static ���� Ŭ�������� static���� ��밡��
		final static int CONST = 100;
	}
	
	void myMethod() {
		class LocalInner { //local ���� Ŭ����
			int iv = 300; //�ν��Ͻ� ��밡��
			//static int cv = 100;
			final static int CONST = 300; //����� ����Ŭ���������� ��밡��	
		}
	}
	
	public static void main(String[] args) {
		//�ڱ� Ŭ�������� ���� Ŭ������ ����� static���� ������ ���� Ŭ���������� ����
		System.out.println(InstanceInner.CONST);
		//System.out.println(InstanceInner.iv); //���ٺҰ�
		System.out.println(StaticInner.cv); //Ŭ�������� �̸� ���� ���ٰ���
		//System.out.println(StaticInner.iv); 
		//Ŭ�������� ���� Ŭ���������� �ν��Ͻ������� Ŭ���������� ���ٺҰ�	
	}
}