package com.kook.ch04Project_Test;

public class Ex04_11_Test {

	public static void main(String[] args) {
		//1~5������ �����
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//���� �ݴ� 5~1 �Ųٷ� ���
		for(int k=5; k>=1; k--) {
			for(int l=1; l<=k; l++) {
				System.out.print("*");
		}
		System.out.println();
	}
  }
}