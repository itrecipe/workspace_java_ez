package com.kook.ch13Project;
//���ܿ��� - ���翡 ���� ����(�߰�����)
public class Ex13_ThGroup {

	public static void main(String[] args) {
		//������ �����ϴ¹��(�����߿���!)
		//������ �׷� Ȱ��, main�����尡 ����� ������� ������ �׷��� main������ �׷쿡 ���Ѵ�.
		ThreadGroup myGroup = new ThreadGroup("myGroup"); //�׷���� myGroup
		/* �׷��� ��������� ����ϴ� ������ �����ڸ� ȣ���Ͽ� ������ ����
		   �ΰ� ������ ��� ������ �׷��� myGroup���� �����ϴ�.
		*/
		WorkThread workThreadA = new WorkThread(myGroup, "workThreadA");
		WorkThread workThreadB = new WorkThread(myGroup, "workThreadB");
		
		workThreadA.start();
		workThreadB.start();
		
		System.out.println("[ main ������ �׷��� list() �޼ҵ� ��³��� ]");
		ThreadGroup mainGroup = Thread.currentThread().getThreadGroup();
		//main�����尡 �����ִ� ������׷��� �˾Ƴ���.	
		mainGroup.list(); //������׷�� ��������� ��� ���ִ� �޼���
		
		try {
			Thread.sleep(3000);
		}
		catch (InterruptedException e) {
			
		}
		System.out.println("[ myGroup ������ �׷��� interrupt() �޼ҵ� ȣ�� ]");
		myGroup.interrupt(); //run()�� sleep�� �ߴ��ϰ� �̶� ���ܰ� �߻��ϰ� run()����(������ ����)
	}

}

class WorkThread extends Thread {
	public WorkThread(ThreadGroup threadGroup, String threadName) {
		super(threadGroup, threadName);
		//�θ� Ŭ������ Thread�� ������ Thread(ThreadGroup group, String name)�� ���
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000); //sleep�� interrupt()�� ����(����)�Ǹ� ���ܹ߻�
			} catch (Exception e) {
				System.out.println(getName() + " interrupted");
				break;
			}
		}
		System.out.println(getName() + " �����");
	}
}