package com.kook.ch07Project;

public class Outer { //extends�� �����Ƿ� ������ Object���
	//����Ŭ������ Ŭ������ ����� �������,����޼���ó�� ó����
	int iv = 0; //�ν��Ͻ� �������
	static int cv = 0; //Ŭ������ �������
	
	void myMethod() { //�ν��Ͻ� ��� �޼���
		int x = 0;
		//�޼��峪 �ʱ�ȭ ��Ͼȿ� �ִ� Ŭ������ ���� Ŭ�����̴�.
		class Localclass {
			
		}
	}
	
	static void mySMethod() { //Ŭ������ ����޼���
		int y = 0;
	}
	
	public Outer() { //������
		super(); //Object ������ ȣ��,���� ����
	}
	//���� Ŭ������ Ŭ������ ����� �������,����޼���,������ó�� ó��
	//���� Ŭ������ ����̹Ƿ� �ν��Ͻ���,Ŭ������ ���� Ŭ������ ������
	
	private class InstanceInner { //�ν��Ͻ��� ���� Ŭ����
		/* ���������ڷδ� ��������� �޼���ó�� 
		public,protected,default(�ƹ��͵����ٴ��ǹ�(�ۼ����ص�����Ǵ°�),private ��밡�� 
		�Ϲ������ڷδ� Ŭ������ ����ϴ� abstract,final��밡��
		*/
	}
	
	static class StaticInner { //Ŭ������ ���� Ŭ����
		
	}
}