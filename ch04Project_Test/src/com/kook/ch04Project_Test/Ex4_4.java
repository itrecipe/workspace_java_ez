package com.kook.ch04Project_Test;

import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		int score = 0; //������ �����ϱ� ���� ����
		char grade = ' '; //������ �����ϱ� ���� ����, �������� �ʱ�ȭ
		
		System.out.println("���� �Է�!");
		
		Scanner scanner = new Scanner(System.in); //��ĳ�� Ŭ���� ��ü����
		score = scanner.nextInt(); //ȭ���� ���� �Է¹��� ���ڸ� score�� ����
		
		if(score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("�� ������? " + grade + " �̴�");
	}
}