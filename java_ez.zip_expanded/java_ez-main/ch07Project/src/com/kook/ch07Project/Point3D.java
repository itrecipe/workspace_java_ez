package com.kook.ch07Project;

public class Point3D extends Point {
	int z;
	public Point3D(int x, int y, int z){
		//����Ŭ������ �����ڰ� �⺻���� �ƴϸ� �� ��������� ����Ŭ���� �����ڸ� ȣ��
		//Point�� �⺻�� �����ڰ� �����Ƿ� �ڵ� ȣ��Ǵ� super()�� ����ϸ� ������
		super(x,y); //����Ŭ���� �����ڸ� ex)super(x,y); <- �̷������� ���
		this.z = z;
	}
}
