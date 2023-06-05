package com.kook.ch13Project;
//��.��
public class Ex13_11 {

	public static void main(String[] args) {
		//Thread.yield()�� �����尴ü.join()
		ThreadEx11_1 th1 = new ThreadEx11_1();
		ThreadEx11_2 th2 = new ThreadEx11_2();
		
		//th1�� th2������� �ڽ� �������� run()�� ����(Runnable�� ���ļ� �����)
		th1.start();
		th2.start();
		long startTime = System.currentTimeMillis();
		try {
			/* - join()�� ����ó���� ������Ѵ�.(join�� �ɾ��ָ� ���ܰ� �߻��ϱ� ����)
			   - main������� �ߴܵǸ� th1�� �����Ͽ� ������� main�����尡 �ٽ� �����Ѵ�.
			*/  
			th1.join(); //main�����尡 joinȣ��
			th2.join(); //main�����尡 joinȣ��
			//join()�� ��� �Ϸ�Ǹ� �ٽ� main������ ����
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println("�ҿ�ð� : " + (System.currentTimeMillis() - startTime));
	}
}

class ThreadEx11_1 extends Thread {
	@Override
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print(new String("-")); //�ð��� ���� �����ɸ��� �ϱ����� ��¹��� new String() ���
		}
		System.out.println("th1 ����");
	}
}
class ThreadEx11_2 extends Thread {
	@Override
	public void run() {
		for(int i=0; i < 300; i++) {
			System.out.print(new String("|")); //�ð��� ���� �����ɸ��� �ϱ����� ��¹��� new String() ���
		}
		System.out.println("th2 ����");
	}	
}