package com.kook.ch04Project;

public class Ex04_08 {

	public static void main(String[] args) {
		for (int i = 1; i <=3; i++) {
			//�ʱ�ȭ�δ� ��Į������ ����
			//���ǽ��� true/false����ȯ�ϴ� �񱳿����̳� �� ������ ���
			//�������� �����ÿ��� ++ , ���ҽ� --
			System.out.println("Hello");
		}
		//ex04_09����-112p
		for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
			for(int i=1; i<=5; i++) {
				System.out.print(i);	
		}
		
		//ex04_10����-112p
		int sum = 0; //���踦 ���� ����
		
		for(int i=1; i <= 5; i++) { //int i = 1�� ���� ������ {}�ȿ����� ���
			sum += i; //sum = sum + i;
			System.out.printf("1���� %2d ���� ��: %2d%n", i, sum);
		}
	}
}
