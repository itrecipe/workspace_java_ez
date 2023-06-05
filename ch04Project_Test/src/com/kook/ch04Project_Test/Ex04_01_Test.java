package com.kook.ch04Project_Test;

public class Ex04_01_Test {

	public static void main(String[] args) {
		int score = 80;
		
		if(score < 60) {
			System.out.println("합격!");
		} 
		else {
			System.out.println("불합격");
		}
		if(score < 80) {
			System.out.println("동점!");
		}
		
		System.out.println("if문 결과와는 상관없는 실행문!");
	}

}
