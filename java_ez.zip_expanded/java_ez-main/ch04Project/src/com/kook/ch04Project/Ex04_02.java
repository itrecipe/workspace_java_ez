package com.kook.ch04Project;

public class Ex04_02 {

	public static void main(String[] args) {
	
		int x = 0;
		System.out.printf("x=%d �� ��, ���� ����%n", x);
		
		if(x==0) { 
			System.out.println("x==0");
		}
		if(x!=0) { 
			System.out.println("x!=0");
		}
		if(!(x==0)) { 
			System.out.println("!(x==0)");
		}
		if(!(x!=0)) { //x�� 0�Ͻÿ� !false�� �Ǿ� ��Ͼ����� ��
			System.out.println("!(x!=0)");
		}
		
		x = 1;
		System.out.printf("x=%d �� ��, ���� ����%n", x);
		
		if(x==0) { 
			System.out.println("x==0");
		}
		if(x!=0) {
			System.out.println("x!=0");
		}
		if(!(x==0)) {
			System.out.println("!(x==0)");
		}
		if(!(x!=0)) {
			System.out.println("!(x!=0)");
		}
	}
}