package com.kook.ch13Project;

public class Ex13_01 {

	public static void main(String[] args) {
		ThreadEx1_1 t1 = new ThreadEx1_1(); //Thread�� ����� Ŭ������ ��ü
		
		Runnable r = new ThreadEx1_2();
		Thread t2 = new Thread(r);
		//Thread t2 = new Thread(new ThreadEx1_2()); <- �̷��� ������ ǥ���� ����
		
		//thread�� ���� ��Ű���� start()�޼���� ȣ��
		t1.start();
		t2.start();
		//start()�޼��尡 ȣ��Ǹ� ������� ���� �����°� ��
	}

}

//thread�� ����Ϸ��� Thread�� ����ϰų� Runnable�������̽��� ������ Ŭ���������� ��밡��

class ThreadEx1_1 extends Thread {
	/* public class Thread extends Object implements Runnable
      -java.lang�� �ִ� �⺻ Ŭ������ import �ʿ� ����
	*/
	
	@Override
	public void run() {
		//run�޼���� �ش� �����尡 �ؾ��� ���� ������
		for(int i=0; i < 5; i++) {
			System.out.println("t1�� �̸� : " + getName());
		//String getName() ThreadŬ�������� ��� ���� �޼���� ��������� ��ȯ (��, �ν��Ͻ� �޼���)
		}
	}
}
	
class ThreadEx1_2 implements Runnable {
	/* @FunctionalInterface, public interface Runnable
	   -java.lang�� �ִ� �������̽��μ� import �ʿ����
	   @FunctionalInterface ������̼��� �߻�޼��尡 �ƴϸ� �������̽��� ��Ÿ��
	*/
	@Override
	public void run() {
		for(int i = 0; i < 5 ; i++) {
		//getName()�޼���� Runnable �������̽����� �����Ƿ� ������ �� ��� ���Ұ�
		//���� ������� ������� Thread.currentThread()�� �˾Ƴ� (static�޼���)
		System.out.println("���� ������� thread : " + Thread.currentThread().getName());
		}
	}
}