package com.kook.ch04Project;

import java.util.Scanner;

public class Ex04_18 {

	public static void main(String[] args) {
		//break,continueȰ��
		int menu = 0;
		int num = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("�޴� (1~3)�� ���� (����:0)>");
			
			String tmp = scanner.nextLine();
			menu = Integer.parseInt(tmp);
			
			if(menu==0) {
				System.out.println("���α׷� ����!");
				break; //�ݺ��� while�� ��������
			} else if(!(1 <= menu && menu <= 3)) {
				System.out.println("�޴��� �߸� ������. (���� : 0)");
				continue; //���� �ݺ��� ����,for������ loop ���� ����̶� ����.
			}
			System.out.println("������ �޴��� "+ menu + "�� �̴�.");
		}
		System.out.println("�ݺ��� Ż��!");
	}
}