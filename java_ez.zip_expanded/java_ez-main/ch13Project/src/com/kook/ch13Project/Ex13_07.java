package com.kook.ch13Project;
//���󽺷���� ���������带 ó���Ҷ� ���, ���� ��ǥ���� ���� �ڵ����� ����� �ִ�.

//mainŬ������ Ex13_07�� ������ Ŭ������ ����
public class Ex13_07 implements Runnable { //Runnable�� ������ ������ Ŭ����
	static boolean autoSave = false; 
	/*���⼭ static���� �ۼ��� ������ ���θ޼��尡 static�̱� ������
	  static -> static���� �ٷ� ȣ���Ͽ� ����Ϸ��� �̷��� ������Ѵ�.
	  ȣ���, ����޼ҵ��� �����ϰ� ȣ���ϸ� �ȴ�.
	 */
	
	@Override //���� ������� run()�μ� ���ν����尡 ����Ǹ� �ڵ����� ����ȴ�.
	public void run() {
		while(true) {
			try {
				Thread.sleep(3000);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			
			if(autoSave) {
				autoSave();
			}
		}
	}
	
	public void autoSave() {
		System.out.println("�۾� ���� autoSave");
	}
	
	public static void main(String[] args) {
		//main�޼���� JVM���� main������� ����� �ش�.(�⺻����)
		Runnable r = new Ex13_07();
		Thread t = new Thread(r); //Runnable��ü�� ����Ϸ��� ��ü r�� �־��ָ��
		//�����ۼ��� : Thread t = new Thread(new new Ex13_07());
		t.setDaemon(true); //������ t�� ���� �������� daemon������� ��� (true�� �������)
		t.start(); //�� ������ start() �ۼ�
		//���⼭ ���� �������� �Ϲ� ������� main������		
		//�Ʒ� �κ��� main�����尡 ����
		for(int i=1; i <= 10; i++) {
			try {
				Thread.sleep(1000);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
			System.out.println(i);
			
			if(i == 5) {
				autoSave = true;
			}
			System.out.println("���α׷� ����!");
		}

	}

}
