package com.kook.ch07Project;

public class Point {
	int x, y;
	//�����ڴ� ����Ÿ���� ����(void x) �����ڸ��� Ŭ������� �����ؾ���
	//Point�� �����ڰ� �ϳ� ��������� ��������� �⺻�� �����ڴ� ������
	public Point(int x, int y){
		//����Ŭ������ Object�� ������ super();�� �ڵ� ȣ���
		super(); //<-�̷��� ����ص� �ǰ�, �ۼ��� �ص� ���ص� �����ϴ�.
		this.x = x;
		this.y = y;
	}
}