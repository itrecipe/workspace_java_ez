package com.kook.ch07Project;

public class Ex07_01 {

	public static void main(String[] args) {
		SmartTv stv = new SmartTv();
		stv.channel = 10; //channel�� ����� �������
		stv.channelUp(); //����� �޼���
		System.out.println(stv.channel);
		
		stv.displayCaption("hello, world"); //�ڽ��� ���� �޼���(������ Tv���� ����)
		stv.caption = true;	//�ڽ��� ���� ��� ����(���󿡴� ����)
		stv.displayCaption("hello, world");
	}
}