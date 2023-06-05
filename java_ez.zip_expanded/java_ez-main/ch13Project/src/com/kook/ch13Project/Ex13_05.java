package com.kook.ch13Project;
//��.��

import javax.swing.JOptionPane;

public class Ex13_05 {
	//main������� �ٸ� ������� ������ I/O ���ŷ�� ó�� ���� ����
	public static void main(String[] args) {
		//main�����忡�� �ٸ� �����带 ������
		Runnable r = new Thread5_1();
		Thread th1 = new Thread(r);
		//���ٷ� �ۼ��Ҷ� ���� ex) -> new Thread(new Thread5_1);
		
		th1.start(); 
		/* th1�� ���డ���� �����·� ������.(runnable����), 
		   ������ window os���� cpu�� �Ҵ����ָ� run()�޼��带 ����
	    */
		
		//main������ ó��
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ض�");
		//�Է� I/O���ŷ�Ǵ� �ð����� �ٸ� ������ th1�� �����Ѵ�.
		System.out.println("�Է��� ����? : " + input + " �̴�.");
	}

}

class Thread5_1 implements Runnable {
	@Override
	public void run() { //������ ó���Ҷ��� public void run() �� �޼ҵ� �ϳ��ۿ� ���ٰ� �� 
		for(int i=10; i > 0; i--) {
			System.out.println(i);
			try {
				Thread.sleep(1000); //sleep(�и�������)�� �и������� ���� ������ ����, 1�ʰ� �ð�����
			}
			catch (Exception e) {
				//e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
	}
}