package com.kook.ch07Project;

import java.awt.*;
import java.awt.event.*;
//���� �⺻�� GUI��Ű�� Ŭ����

//�͸� Ŭ������ ������� �ʰ� Ŭ������ ����� ���
public class Ex07_18 {

	public static void main(String[] args) {
		Button b = new Button("Start");
		b.addActionListener(new EventHandler());
		//�Ķ���ͷ� ActionListenner�� ������(EventHandler) ��ü

	}

}

class EventHandler implements ActionListener {
	//ActionListener�� �������̽��� �����ҽ� �߻�޼��带 ����
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("ActionEvent occurred!!");
	}
	
}
