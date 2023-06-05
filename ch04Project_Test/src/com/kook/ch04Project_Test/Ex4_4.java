package com.kook.ch04Project_Test;

import java.util.Scanner;

public class Ex4_4 {

	public static void main(String[] args) {
		int score = 0; //점수를 저장하기 위한 변수
		char grade = ' '; //학점을 저장하기 위한 변수, 공백으로 초기화
		
		System.out.println("점수 입력!");
		
		Scanner scanner = new Scanner(System.in); //스캐너 클래스 객체생성
		score = scanner.nextInt(); //화면을 통해 입력받은 숫자를 score에 저장
		
		if(score >= 90) {
			grade = 'A';
		} else if (score >= 80) {
			grade = 'B';
		} else if (score >= 70) {
			grade = 'C';
		} else {
			grade = 'D';
		}
		System.out.println("니 학점은? " + grade + " 이다");
	}
}