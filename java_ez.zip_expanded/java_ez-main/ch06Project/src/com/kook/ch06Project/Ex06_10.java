package com.kook.ch06Project;
//���� ���� ����
public class Ex06_10 {

	public static void main(String[] args) {
		MyMath3 mm = new MyMath3();
		//ȣ�� �� �����ε��� �޼����� �Ķ���Ϳ� ���߾� ȣ��
		System.out.println(mm.add(3,3));
		System.out.println(mm.add(3,3L));
		System.out.println(mm.add(3L,3));
		System.out.println(mm.add(3L,3L));
		
		int[] a = {1,2,3};
		
		System.out.println("===========================");
		System.out.println("��� ���� : " + mm.add(a));
	}
}

class MyMath3{
	int add(int a, int b) { //���� 2�� ���������� �Ѵ� int
		return a + b;
	}

	long add(int a, long b) { //�Ķ���� ���� 2��, b�� ���������� �ٸ�
		return a + b;
	}

	long add(long a, int b) { //�Ķ���� ���� 2��, a�� ���������� �ٸ�
		return a + b;
	}
	long add(long a, long b) { //�Ķ���� ���� 2��, ���������� ��� long
		return a + b;
	}
	
	int add(int[] a) {
		for(int x : a) {
			System.out.println(x);
		}
			return a.length;
	}
}