package com.kook.ch07Project;

public class Point3D2 extends Point2 {
	
	int z;
	
	Point3D2(int x, int y, int z) {
		//����Ŭ������ ��������� �⺻ �������� Point2()�� �����Ƿ�
		//�ڵ����� ȣ��Ǵ� super()�� ȣ��Ǿ ���� �߻� ����
	
		//super(x, y); //���������δ� �̷��� ȣ���ϴ°� ����
		
		//�Ʒ� this�ڵ�ó�� ��� �ص���
		this.x = x;
		this.y = y;
		this.z = z;
	}
}
