package com.kook.ch13Project;
//��.��(�����ִ� ������ �ִٴ� ������ �˰�, ���� ���ڿ� ������ ������ �ǰ��ϴ� ����)
public class Ex13_10 {
	
	@SuppressWarnings("removal") //"removal"�̶�� ��� ����� ����� �ǹ�
	public static void main(String[] args) {
		// deprecated�� suspend(),resume(),stop()�޼���
		RunImplEx10 r = new RunImplEx10();
		Thread th1 = new Thread(r, "*");
		/* - Thread(Runnable target, String name)
		   - Runnable��ü r�� ������� name�� ����� ������
		*/
		Thread th2 = new Thread(r, "**");
		Thread th3 = new Thread(r, "***");
		
		th1.start();
		th2.start();
		th3.start();
		
		try {
			Thread.sleep(2000); //���ν����� ����
			th1.suspend(); //th1������ ����
			Thread.sleep(2000);
			th2.suspend();//th2������ ����
			Thread.sleep(3000);
			th1.resume(); //�ٽ� runnable(�ٽý���)
			Thread.sleep(3000);
			th1.stop(); //������ ����
			th2.stop(); //������ ����
			Thread.sleep(2000);
			th3.stop();
			
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

class RunImplEx10 implements Runnable {
	@Override
	public void run() {
		while(true) {
			System.out.println(Thread.currentThread().getName()); //currentThread() : ���罺���尡 �������� ���� 
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
}