package com.kook.ch13Project;

import javax.swing.JOptionPane;

public class Ex13_09 {

	public static void main(String[] args) {
		// interrupt���
		ThreadEx9_1 th1 = new ThreadEx9_1();
		th1.start();
		
		//I/O block�� �߻�(�������� �����尡 �����°�(�Ͻ�����) �ȴ�.)
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ض�");
		//�Է�ó���� ����Ǹ� Runnable���°� �ǰ� cpu�� �Ҵ�Ǹ� run
		System.out.println("�Է��� ����" + input + "�̴�.");
		
		th1.interrupt(); 
		/* - th1�������� ������ �Ͻ����� �� �ߴ� ��Ű�� runnable���·� ��ȯ�ϵ��� ��û�Ѵ�.
		     (������ ��������� �ߴܽ�Ű���� ���Ѵ�.)
		   - �����ϰ� �ִ� �������� ���ܸ� �߻����� �ߴ��� ���߰� run�޼��忡�� ������ �κ��� �����ϰ� �����Ѵ�.
		   - ���⼭�� isInterrupted()�� ���ͷ�Ʈ ���¸� �̿��� run�޼��带 ���� ��Ų��.
		*/
		System.out.println("isInterrupted() : " + th1.isInterrupted());
		
		System.out.println("main�޼��� ����");
	}

}

class ThreadEx9_1 extends Thread {
	@Override
	public void run() {
		int i = 10;
		while(i!=0 && isInterrupted()) { //���ͷ�Ʈ�� ȣ�� �ȵ� �����̸� i�� 0�̾ƴ� ���¶�� true
			System.out.println(i--);
			for(long x=0; x < 2500000000L; x++) {
				
			}
		}
		System.out.println("ī��Ʈ ����");
	}
}