package com.kook.ch13Project;
//��.��
public class Ex13_06 {
	public static void main(String[] args) {
		/* ������ �켱����
		 - main�����尡 �ٸ� �����带 ����(main�����尡 �θ� ������)
		 - main�� �⺻ NORM_PRIORITY�� 5�̴�.
		 - �ڽ� ������� �θ��� �켱������ ����Ѵ�.
		*/
		ThreadEx6_1 th1 = new ThreadEx6_1(); //main�������� �켱���� NORM_PRIORITY�� ���
		ThreadEx6_2 th2 = new ThreadEx6_2(); //main�������� �켱���� NORM_PRIORITY�� ���
		
		//priority������ start()������ �����ϴ�.
		th2.setPriority(7); //�켱������ 3���� ������ �� ���� �����Ƿ� cpu�Ҵ� �ð��� ���� ũ��.
		
		System.out.println("Priortity of th1(-) : " + th1.getPriority());
		System.out.println("Priortity of th2(|) : " + th2.getPriority());
		
		th1.start();
		th2.start(); //�켱������ ���� ���� cpu�� ���� ����ϹǷ� th1���ٴ� ���� �����
		
		System.out.println("main������ ����");
	}
}

class ThreadEx6_1 extends Thread {
	//�����带 ����ϱ� ���ؼ� �����尡 ó���ؾ��� ���� ����ϴ� run()�޼��带 ������ ���ش�.
	@Override
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("-");
			for(int x=0; x < 10000000; x++);
		}
		System.out.println("th1����");
	}
}

class ThreadEx6_2 extends Thread {	
	@Override
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print("|");
			for(int x=0; x < 10000000; x++);
		}
		System.out.println("th2����");
	}
}