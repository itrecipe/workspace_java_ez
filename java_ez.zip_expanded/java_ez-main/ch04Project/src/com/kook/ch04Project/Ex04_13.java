package com.kook.ch04Project;

public class Ex04_13 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(sum <= 100) {	//sum�� 100���� Ŀ���� �ݺ� �ߴ�
			System.out.printf("%d - %d%n", i, sum);
			sum += i++;
		}
	}
}