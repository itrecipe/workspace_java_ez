package com.kook.ch04Project;

import java.util.Scanner;

public class Ex04_03 {

	public static void main(String[] args) {
		System.out.print("���ڸ� �ϳ� �Է��϶�.>");
		Scanner scanner = new Scanner(System.in);
		int input = scanner.nextInt(); //nextInt()�� �Է°��� ���ڷ� ��ȯ
		//ȭ���� ���� �Է¹��� ���ڸ� input�� ����
		//�Է��ϰ� Enter�� ĥ������ ����ϴٰ� Enterġ�� input������ �Է°� ����
		
		if(input==0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}else { //input!=0�� ���
			//else�� if�� ������ �ƴ� ��� �ٸ� �����̹Ƿ� ���ǽ��� ����ϴ� ()�� ����
			System.out.println("�Է��Ͻ� ���ڴ� 0�� �ƴմϴ�.");
		}
	}
}