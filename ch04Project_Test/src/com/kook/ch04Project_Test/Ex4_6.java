package com.kook.ch04Project_Test;

import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
		//switch���� ����� ���� ������ ���
		System.out.println("���� (��) �Է�");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt(); //ȭ���� ���� �Է¹��� ���ڸ� month(����)�� ����
		
		switch(month) {
			case 3: case 4: case 5: //�ü������� �̷��� ���ٷ� ���°� �����Ѵ�����
				System.out.println("���� ���� : ��");
			break;
			
			case 6: case 7: case 8:
				System.out.println("���� ���� : ����");
			break;
			
			case 9: case 10: case 11:
				System.out.println("���� ���� : ����");
			break;
			
			default :
				System.out.println("���� ���� : �ܿ�");
		}	
	}
}