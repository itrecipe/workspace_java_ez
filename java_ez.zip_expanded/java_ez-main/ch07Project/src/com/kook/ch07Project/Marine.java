package com.kook.ch07Project;
//���ܺ�������(����������)
public class Marine extends Unit {
	//�߻�Ŭ������ ����� Ŭ������ �߻�Ŭ������ ��� �߻�޼��带 ����(������)�ؾ� �Ѵ�.
	//���� �ϳ��� ���ҽ� ��������, �߻�Ŭ������ ����ؾ���
	//��Ŭ������ Ŭ���� ������ ���(SuperClass)�� ����ϸ� �ڵ����� ��Ͼ��� �ڵ尡 ���� �߻�޼��尡 ������.
	//������ ���� �߻�޼��� ������ �����Ȱ����� ó��
	@Override
	void move(int x, int y) {
		System.out.println("Marine[x=" + x + ",y" + y + "]");
	}
	
	void stimPack() {
		System.out.println("stimPack���");
	}
}