package com.kook.ch04Project;

import java.util.Scanner;

public class Ex04_06 {

	public static void main(String[] args) {
		System.out.print("���� ���� �Է�.>");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		
		switch(month){ //switch�� ���ǽ����� month���� ���
			case 3:
			case 4:
			case 5:
				System.out.println("���� ������ �� �Դϴ�.");
			break; //break�� ������ switch�� ����
			
			case 6: case 7: case 8: //�̷������� ���ٿ� �ۼ��� ����, ��Ÿ�� default������ ó��
				System.out.println("���� ������ ���� �Դϴ�.");
				break;
			case 9: case 10: case 11:
				System.out.println("���� ������ ���� �Դϴ�.");
				break;
			default:
				System.out.println("���� ������ �ܿ� �Դϴ�.");
			//1,2,12(��) => �ܿ�
		}
	}
}