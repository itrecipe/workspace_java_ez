package com.kook.ch04Project;

import java.util.Scanner;

public class Ex04_14 {

	public static void main(String[] args) {
		int num = 0 , sum = 0;
		System.out.printf("���� �Է� (��:12345).>");
		
		Scanner scanner = new Scanner(System.in);
		String tmp = scanner.nextLine(); //nextLine()�� ���ڿ� ��ȯ
		num = Integer.parseInt(tmp); 
		//Integer.parseInt(������) -> ���ڿ��� ������ ��ȯ�ϴ� �޼���
		
		while(num!=0) {
			//num�� 10���� ���� �������� sum�� ����
			sum += num%10;
			System.out.printf("sum=%3d num=%d%n", sum, num);
			//num�� 10���� ���� ������ ��ȯ�Ͽ� ���� �ڸ����� �������� ���ϱ�
			num /= 10; //num = num / 10;
		}
		System.out.println("�� �ڸ��� ��:" + sum);
	}
}