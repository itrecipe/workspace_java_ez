package com.kook.ch04Project;

public class Ex04_07 {

	public static void main(String[] args) {
		int num = 0;
		
		for(int i = 1; i <=5; i++) {
			num = (int) (Math.random() * 6) + 1; //1~6������ ������ ������ ����
			System.out.println(num);
		}
	}
}