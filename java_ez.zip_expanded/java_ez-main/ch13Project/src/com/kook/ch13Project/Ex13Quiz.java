package com.kook.ch13Project;

//1
public class Ex13Quiz extends Thread {
	//Thread�� Runnable�������̽��� ������ Ŭ������ java.lang�� �ִ� �⺻ Ŭ����
	
	//2
	@Override
	public void run() {
		System.out.println("Ex13QuizClassŬ������ ������");
		
	}
	public static void main(String[] args) {
		//3
		Ex13Quiz th1 = new Ex13Quiz();
		//6
		Thread th2 = new Thread(new RunThread());
		//Ex13Quiz ��������� �ۼ��� �����ڰ� �����Ƿ� �⺻ �����ڸ� ���
		//public Ex13Quiz() { super();}�� ���
		th1.start(); //������� Runnable���°� ��(���� ������ �����°� �Ǿ� �ִٰ� cpu�Ҵ�� run()�� ������)
		th2.start();

		/* ���� �ڵ�(���ٿ� �ۼ�����)
		Thread th2 = new Thread(new RunThread());
		th2.start();
		*/
		//8
		try {
			//���罺������ main������� th1�� th2������ ����ñ��� ����
			th1.join();
			th2.join();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}			
		//9
		
		/*
		- �̷��� �����ϴ� ����� �ִ�.
		new Thread(th1).start();
		new Thread(th2).start();
		*/
		
		//�����带 �ٽ� ����Ϸ��� ���� �����ؾ� ��밡��
		th1 = new Ex13Quiz();
		th2 = new Thread(new RunThread());
		//th2 = new Ex13Quiz();
		th1.start();
		th2.start();
		//10
		//�����ڵ�
		/* isAlive()�� �����尡 ��밡���� �������� �ƴ��� ��ȯ(���� �����̸� false)
		   isAlive()�� ���ν����� ������ ������Ų��.
		 */
		
		while(true) {
			if(th1.isAlive() || th2.isAlive()) {
				System.out.println("������ th1�� th2 ������");
			}
			else {
				break;
			}
		}
		
		System.out.println("main�������� ����� ������ ����");
		/*
		try {
			while(th1.isAlive() || th2.isAlive()) {
				Thread.sleep(500);
				th1.interrupt();
				th2.interrupt();
		        System.out.println("interrupt() called");
		        th1.join( 500 );
		        th2.join( 500 );
				
			}
			System.out.println( "th1 : isAlive = " + th1.isAlive() );
			System.out.println( "th2 : isAlive = " + th2.isAlive() );
		    System.out.println( "th1 : isInterrupted = " + th1.isInterrupted());
		    System.out.println( "th2 : isInterrupted = " + th2.isInterrupted());
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
  		*/
		//7
		System.out.println("7�� : main�� ������ ��");
	}
}

//4
class RunThread implements Runnable {
	//5
	
	//Runnable�������̽��� �߻�޼��� ����(������)
	@Override
	public void run() {
		System.out.println("5�� : RunThread�� thread");
	}
}

/* 1.Ex13QuizŬ������ ThreadŬ������ ����� Ŭ������ ����
   2.run()�޼��带 override�ϴµ� ������ Ex13QuizŬ������ ���������� ���
   3.Ex13Quiz�� ������ ��ü th1�� �����ϰ� start����
   4.Runnable�� ������ Ŭ���� RunThread�� ����
   5.run()�޼���� RunThread�� thread���� ���
   6.���ν����忡�� RunThread�� ������ ��ü th2���� �� start
   7.main�������� ������ ���� main�� ������������ ���
   8.start���� main������� th1�� th2�� ����ɶ����� ����ϵ��� ����
   9.main������ ������ �� ������ �ٽ� th1�� th2�� �����ϰ� start
   10.th1�� th2�� ����ñ��� main������� ������� �ʵ��� ó��(isAlive()���)
*/