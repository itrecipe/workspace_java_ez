package com.kook.ch07Project;
//���ܿ���-���翡 ���� ����
public interface InterfaceInherit extends Moveable, Attackable {
	//�������̽��� ����� Ŭ������ ���� ����̳� ���� ��Ӱ���
	//����� �߻�޼��� 2���� ���� �������̽�
}

interface Moveable {
	//�߻�޼���
	/*public abstract ������*/ void move(int x, int y);
}

interface Attackable {
	void attack();
}
