package com.kook.ch08Projcet;

public class Ex08_01 {

	public static void main(String[] args) {
		System.out.println(1);
		try {
			//���ܰ� �߻��ϴ� ���忡�� �ش� ���ܸ� catch������ ������
			//���ܹ߻��� ������ catch����� ��ġ�� �ʰ� ���� ���α׷����� ����
			System.out.println(2);
			System.out.println(3);
		}
		catch(Exception e) {
			System.out.println(4);
		}
		System.out.println(5);

	}

}
