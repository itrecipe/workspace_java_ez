package com.kook.ch13Project;

public class Ex13_08 {

	public static void main(String[] args) {
	// sleep()�޼��� ���
	// cpu�Ҵ�ÿ� run����
	Thread08_01 th1 = new Thread08_01();
	Thread08_02 th2 = new Thread08_02();
	
	th1.start(); //����������� Runnable����
	th2.start(); //����������� Runnable����
	
	//���ν����带 sleep
	try {
		Thread.sleep(2000); //sleep�� ������ �����忡 ����
	}
	catch (Exception e) {
		System.out.print(e.getMessage());
	}
	System.out.print("main������ ����");
	}

}

class Thread08_01 extends Thread {
	//������ th1�� ������ run�޼���
	//cpu�Ҵ�� run����
	@Override
	public void run() {
		for(int i=0; i < 300; i++) //��Ͼ��� ������ �����϶��� {}��� ��������,(��,�鿩����� �ؾ���)
		System.out.print("");
		
		System.out.print("<<th1 ����>>");
	}
}

class Thread08_02 extends Thread {
	//������ th2�� ������ run�޼���
	//cpu�Ҵ�� run����
	@Override
	public void run() {
		for(int i=0; i < 300; i++) //��Ͼ��� ������ �����϶��� {}��� ��������,(��,�鿩����� �ؾ���)
			System.out.print("");
		
		System.out.print("<<th2 ����>>");
	}
}