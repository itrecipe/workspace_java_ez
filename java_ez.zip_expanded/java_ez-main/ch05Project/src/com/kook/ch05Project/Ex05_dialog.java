package com.kook.ch05Project;

import javax.swing.JOptionPane;

public class Ex05_dialog {

	public static void main(String[] args) {
		//���� ����
		
		// GUI swing ��Ű���� Ŭ������ �̿��� �׷��� ��ȭâ ����
		String input = JOptionPane.showInputDialog("���ڸ� �Է��϶�");
		
		//�Էµ� ���� ��ȯ, �Ķ���ʹ� �ȳ���
		System.out.println(input);
	}
}