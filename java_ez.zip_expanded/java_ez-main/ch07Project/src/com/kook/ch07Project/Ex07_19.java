package com.kook.ch07Project;

import java.awt.*;
import java.awt.event.*;
//���ܺ�������(����������)

//�͸� Ŭ������ GUI�̺�Ʈ ó��
public class Ex07_19 {

	public static void main(String[] args) {
		Frame frame = new Frame("Title!");
		frame.setSize(500,300);
		frame.setVisible(true);
		
		Button b = new Button("Start");
		frame.add(b);
		
		//System.exit(1);
		
		//addActionListener�޼����� �Ķ���ʹ� �������̽� ActionListener ���� ��ü
		//�͸��� Ŭ������ ��ü ����
		//�������̽� ��ü�� new�����ڷ� ����� �������̽��� �߻�޼��带 ����
		b.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("�͸� Ŭ���� ����");
			}
		});
		
		/* �͸��� Ŭ������ new �������̽�(�߻�Ŭ����)������()	{
			�������̽���(�߻�Ŭ����)�� �߻�޼��带 ����
			�ʿ��� �ڵ� �ۼ�
			}
		*/

	}
}