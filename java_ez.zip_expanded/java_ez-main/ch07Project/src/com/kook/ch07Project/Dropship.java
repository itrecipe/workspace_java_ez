package com.kook.ch07Project;

public class Dropship extends Unit {

	@Override
	void move(int x, int y) {
		System.out.println("Dropship[x=" + x + ",y=" + y + "]");
	}
	
	void load() {
		//���߿� �ۼ�
		//�� �����ε� �ϼ��� �޼���� ����
	}
	
	void unload() {
		System.out.println("ȭ���� ������");
	}
}
