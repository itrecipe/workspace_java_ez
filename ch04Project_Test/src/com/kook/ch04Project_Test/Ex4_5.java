package com.kook.ch04Project_Test;

import java.util.Scanner;

public class Ex4_5 {

	public static void main(String[] args) {
		int score = 0;
		char grade = ' ', opt = '0';
		
		System.out.println("점수 입력!");
		
		Scanner scanner = new Scanner(System.in);
		score = scanner.nextInt();
		
		System.out.printf("당신의 점수는 %d 이다.%n", score);
		
		if (score >= 90) {
			grade = 'A';
			if(score >= 98) {
				opt = '+';
			} else if (score < 94) {
				opt = '-';
			}
		} else if (score >= 80) {
			grade = 'B';
			if(score >= 88) {
				opt = '+';
			} else if(score < 84) {
				opt = '-';
			}
		} else {
			grade = 'C';
		}
		
		System.out.printf("니 학점은 %c%c이다. %n", grade, opt);
	}
}