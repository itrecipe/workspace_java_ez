package com.kook.ch04Project;

import java.util.Scanner;

public class Ex04_05 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.print("���� �Է�.>");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt(); 
		//Scanner Ŭ������ �ִ� �޼��� next.Int() Ű���� �Է� ���� ������ ��ȯ
		
		System.out.printf("��� ������? %d�Դϴ�.%n", score);
		
		if(score >= 90) {
			grade = 'A';
			//90�� �̻��Ͻø� ó���Ǵ� ���� if������ ��ø if���̶� ��
			//���� if�� �ܵ�, if~else if �Ǵ� if~else if ~else�� ��ø�Ͽ� ��뵵 ����
			
			if (score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		}else if(score >= 80) {
			grade = 'B';
		if (score >= 88) {
			opt = '+';
		} else if (score < 84) {
			opt = '-';
		}
	} else {
		grade = 'C';
	}
	System.out.printf("����� ������? %c%c�Դϴ�.%n",grade ,opt);
}
}
