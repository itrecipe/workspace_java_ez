package com.kook.ch04Project;

import java.util.Scanner;

public class Ex04_15 {

	public static void main(String[] args) {
		int input = 0, answer = 0;
		
		answer = (int)(Math.random() * 100) + 1;
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.print("1�� 100������ ������ �Է�.>");
			input = scanner.nextInt(); //�Է�ó��
			
		if(input > answer) {
			System.out.println("�� ���� ���� �ٽýõ�");
			
		} else if(input < answer) {
			System.out.println("�� ū ���� �ٽýõ�");
		}
	} while(input!=answer); // ; ->����ڿ� �����ݷ� �ʼ�!
		System.out.println("����!");
	}
}
