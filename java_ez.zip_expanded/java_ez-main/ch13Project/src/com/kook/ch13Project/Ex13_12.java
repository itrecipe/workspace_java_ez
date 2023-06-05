package com.kook.ch13Project;
//��.��

//����ȭ ó���� ���� ���� ���
public class Ex13_12 {

	public static void main(String[] args) {
		
		Runnable r = new Runnable12();
		//thread2���� run�޼��带 ����
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);

//		new Thread(r).start(); ->�̷��� ��ü ������ ����
//		new Thread(r).start();
		
		th1.start();
		th2.start();
		
	}

}

class Runnable12 implements Runnable {
	Account acc = new Account();
	
	@Override
	public void run() {
		while(acc.getBalence() > 0) {
			int money = (int)(Math.random() * 3 + 1) * 100;
			//��� �ݾ��� 100, 200, 300�� �߻���Ų��.
			acc.withdraw(money);
			System.out.println("balance : " + acc.getBalence()); //����� �ܾ�
		}
	}	
}

class Account { //���� ó�� Ŭ�����μ� �������� ����ϴ� �ڿ� ��ü�� ����Ѵ�.(th1�� th2�� �������� ����ϴ� �ڿ�(�Ӱ迵���̶�� �ǹ�))
	private int balance = 1000; //�ܾ�
	
	public int getBalence() {
		return balance;
	}
	/* - ����ȭ�� ó�� ���� �ʴ� �޼���� th1�� th2�� ���ÿ� ó���� �� �ִ�.
	   - �ܾ� ó���� �ȵ� ���¿��� �ٸ� �����尡 ���
	*/
	public void withdraw(int money) { //���ó�� money�� ��� �ݾ�
		if(balance >= money) {
			try {
				Thread.sleep(1000);
				balance -= money;
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}