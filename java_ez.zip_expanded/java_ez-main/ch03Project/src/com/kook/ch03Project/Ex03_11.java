package com.kook.ch03Project;

public class Ex03_11 {

	public static void main(String[] args) {
		//�ڹ������� ����
		//double pi = 3.141592;
		//double shortPi = Math.round(pi * 1000) / 1000.0;
		
		//System.out.println(shortPi);
		
		//���� ���� ����
		double pi = 3.141592;
		double tem1 = Math.round(pi * 1000);
		//��ȣ���� double * int --> double�� 3141.592
		//MathŬ������ �Ҽ��� ù�ڸ����� �ݿø��ϴ� round(3141.592)�� 3142L�� ��ȯ
		//�Ҽ��� ��° �ڸ��� ���� pi�� double shortPi�� ����� ���� 1000.0���� ����
		double shortPi = tem1 / 1000.0; 
		//�ڹٿ��� ex) 1000.0 �̷������� ������ double���� �����. �ݴ�� �Ҽ��� ���°��� int��
		
		System.out.println(shortPi);
	}
}