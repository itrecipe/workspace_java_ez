package com.kook.ch13Project;

import javax.swing.JOptionPane; //�׷��� ó��
//��.��
public class Ex13_04 {
	//main�����常 ���
	public static void main(String[] args) {
		
		String input = JOptionPane.showInputDialog("�ƹ����̳� �Է��ض�");
		//��ȭâ�� �����ϴ� GUIâ, Ȯ�� ��ư�� Ŭ���ؾ߸� �۾����� --��������� I/O���ŷ(������ ������)
		System.out.println("�Է��� ����? : " + input + " �̴�.");
		
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