package com.kook.ch13Project;
//��.��
public class Ex13_03 {
	static long startTime = 0;
	
	public static void main(String[] args) {
		//main������� �ٸ� ������ 1�� �߰��Ͽ� ����
		Thread3_1 th1 = new Thread3_1();
		th1.start();
		startTime = System.currentTimeMillis();
		for(int i=0; i < 300; i++) {
			String str = new String("-");
			System.out.print(str);
		}
		
		System.out.println("�ҿ�ð�1 : " + (System.currentTimeMillis() - startTime));
		//�ҿ�ð� 1�� main�����尡 �ݺ��� ó���ϴµ� �ɸ��ð�
	}

}

class Thread3_1 extends Thread {
	@Override
	public void run() {
		for(int i = 0; i < 300; i++) {
			String str = new String("|");
			System.out.print(str);
		}
		System.out.println("time2 : " + (System.currentTimeMillis() - Ex13_03.startTime));
		//time2�� th1�����尡 �ݺ��� ó���ϴµ� �ɸ��ð�
	}
}