package com.kook.ch05Project;

import java.util.Scanner;

public class Ex05_10 {

	public static void main(String[] args) {
		//String 2���� �迭
		String[][] words = {
				//3�� * 2�� , words[3][2] 
				{"chair","����"},
				{"computer","��ǻ��"},
				{"integer","����"}
		}; //�����̶� �� ;���� ������ �ݾ� �����.
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < words.length; i++) {
			//��� ������ ���� ���߱�
			System.out.printf("Q%d. %s�� ����?", i + 1, words[i][0]);
			String tmp = scanner.nextLine(); //������� ���� ���� �Է� : ex) "����"
			
			if(tmp.equals(words[i][1])) {
				System.out.printf("����! %n%n");
			} else {
				System.out.printf("Ʋ�Ƚ� ������ %s �Դϴ�. %n%n", words[i][1]);
			}
		}	
		System.out.println("for�� Ż��");
	}
}