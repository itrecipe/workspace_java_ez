package com.kook.ch02Project;

public class Ex02_09 {

	public static void main(String[] args) {
		
		String url = "www.codechobo.com";
		float f1 = .10f; //0.10, 1.0E-1
		float f2 = 1e1f; //10.0, 1.0E1, 1.0E+1
		float f3 = 3.14e3f; //3140.0
		double d = 1.23456789; //�ڹٿ��� �Ҽ��� ���ͷ��� �⺻�� double��
		
		System.out.printf("f1=%f, %e, %g%n", f1, f1, f1);
		System.out.printf("f2=%f, %e, %g%n", f2, f2, f2);
		System.out.printf("f3=%f, %e, %g%n", f3, f3, f3);
		System.out.printf("d=%f%n", d); //f�� �Ҽ��� 6�ڸ� ǥ���ϴµ� �ݿø�
		System.out.printf("d=%14.10f%n", d); //��ü 14�ڸ� �� �Ҽ��� 10�ڸ�
		//�����κ��ڸ��� ������ ����ΰ� �Ҽ��������� ����ִ� �ڸ��� 0���� ä��
		//d= 1.2345678900
		System.out.printf("[12345678901234567890]%n"); //��¿���ũ�� ���� �����ϸ� �� �״�� ���
		System.out.printf("[%s]%n", url); //����ũ�� �����Ƿ� �״�� ���
		System.out.printf("[%20s]%n", url); //����ũ�⸦ 20���� �ָ� ������ ���� ä��(��������)
		System.out.printf("[%-20s]%n", url); //���� ����
		System.out.printf("[%.8s]%n", url);	//�������� 8���ڸ� ���
	}
}