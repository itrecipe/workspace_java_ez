package com.kook.ch04Project;

public class Ex04_16 {

	public static void main(String[] args) {
		int sum = 0;
		int i = 0;
		
		while(true) {
			if(sum > 100)
				break; 
				//�ڽ��� ���� �ݺ����� ����(break���� for,while,do while,switch�� ���� ��밡��)
			++i;
			sum += i;
		}
		
		System.out.println("i=" + i);
		System.out.println("sum=" + sum);

	}
}
