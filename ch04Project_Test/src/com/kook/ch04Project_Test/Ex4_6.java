package com.kook.ch04Project_Test;

import java.util.Scanner;

public class Ex4_6 {

	public static void main(String[] args) {
		//switch문은 경우의 수가 많을때 사용
		System.out.println("현재 (월) 입력");
		
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt(); //화면을 통해 입력받은 숫자를 month(변수)에 저장
		
		switch(month) {
			case 3: case 4: case 5: //궁성이형이 이렇게 한줄로 쓰는걸 권장한다했음
				System.out.println("현재 계절 : 봄");
			break;
			
			case 6: case 7: case 8:
				System.out.println("현재 계절 : 여름");
			break;
			
			case 9: case 10: case 11:
				System.out.println("현재 계절 : 가을");
			break;
			
			default :
				System.out.println("현재 계절 : 겨울");
		}	
	}
}