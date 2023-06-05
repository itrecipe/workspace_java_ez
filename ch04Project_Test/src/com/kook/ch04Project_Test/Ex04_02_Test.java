package com.kook.ch04Project_Test;

public class Ex04_02_Test {

	public static void main(String[] args) {
		int x = 1;
		System.out.printf("x=%d일때, 참인것은?%n", x);
		
		if(x==0) {
			System.out.println("x==0");
		}
		if(x!=0) {
			System.out.println("x!=0");
		
		if(!(x==0)) {
			System.out.println("!(x==0)");
		}
		if(!(x!=0)) { //x가 0일시에 !false가 되어 블럭안으로 들어감
			System.out.println("!(x!=0)");
		}
		
		x = 1;
		
		System.out.println();
		System.out.printf("x=%d일때, 참인것은?%n", x);
		
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