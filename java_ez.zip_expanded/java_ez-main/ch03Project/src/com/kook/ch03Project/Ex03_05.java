package com.kook.ch03Project;

public class Ex03_05 {

	public static void main(String[] args) {
		double d = 85.4; //�Ҽ��� �ִ� �Ǽ� ���� �ڹ� �ڵ忡�� �⺻���� double��
		int score = (int) d; 
		
		//���� �������� double -> float -> long -> int 
		//ū ������������ double���� ���� int�� �����Ϸ��� ��������� ����ȯ(casting)�� ��. 
		//�Ǽ����� ������ ��ȯ�ϸ� �Ҽ��� ���ϴ� ������ ����(����)
		 		
		System.out.println("score=" + score);
		System.out.println("d=" + d);

	}
}
