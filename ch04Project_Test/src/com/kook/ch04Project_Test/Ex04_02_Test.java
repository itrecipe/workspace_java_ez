package com.kook.ch04Project_Test;

public class Ex04_02_Test {

	public static void main(String[] args) {
		int x = 1;
		System.out.printf("x=%d�϶�, ���ΰ���?%n", x);
		
		if(x==0) {
			System.out.println("x==0");
		}
		if(x!=0) {
			System.out.println("x!=0");
		
		if(!(x==0)) {
			System.out.println("!(x==0)");
		}
		if(!(x!=0)) { //x�� 0�Ͻÿ� !false�� �Ǿ� �������� ��
			System.out.println("!(x!=0)");
		}
		
		x = 1;
		
		System.out.println();
		System.out.printf("x=%d�϶�, ���ΰ���?%n", x);
		
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
	}