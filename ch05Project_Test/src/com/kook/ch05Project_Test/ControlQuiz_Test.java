package com.kook.ch05Project_Test;

public class ControlQuiz_Test {

	public static void main(String[] args) {
	//1
		int x = 50;
	//2
		int y = 50;
	//3
		if(x==y) {
			System.out.println("1");
		}
		if(x > y) {
			System.out.println("2");			
		}
		else {
			System.out.println("3");			
		}
		//4
		int time = 20;
		
		String result = " ";
		String result1 = " ";
		
		result = (time < 18) ? "Good day" : "Good Evening";
		result1 = (time > 18) ? "Good day" : "Good Evening";
		
		System.out.println("4��(result) : " + result);
		System.out.println("4��(result1) : " + result1);
		//5
		int day = 4;
		
		switch(day) {
			case 1:
				System.out.println(1);
			case 2:
				System.out.println(3);
			default :
				System.out.println("��Ÿ");
			break;
		}
		//6
		int i = 1;
		
		while(i < 6) {
			System.out.println("6�� : " + i);
			i++;
		}
		//7
		i = 1;
		
		do {
			System.out.println("7�� : " + i);
			i++;
		} while(i < 6);
		 
		//8
		for(int j=0; j < 5; j++) {
			System.out.println("8�� : " + "YES");
		}
		//9
		String[] cars = {"Volvo", "BMW", "Ford"};
		
		for(String car : cars) {
			System.out.println("9�� : " + car);
		}
		//10
		for(int i1=0; i1 <= 10; i1++) {
		
		if(i1==5) {
			break;
		}
		System.out.println("10�� : " + i1);
		}
		}
	}
/*
	1. int���� x ���� �� �ʱⰪ : 50
	2. int���� y ���� �� �ʱⰪ : 50
	3. ���ǹ� if�� ����Ͽ� x,y�� �����, ũ�� �񱳿� ��Ÿ�� ��(if~else , if ~ else)
		�� ���� ���� ������ "1","2","3" ���
	4. int ���� time�� 20 ���ǿ�����(���׿�����)�� �̿��� time�� 18���� ������ Good day��,
	�ƴϸ� Good Evening�� �����Ͽ� result������ ���� , result ���
	5. int day = 4;
		day�� ���ǽ����� �ϴ� switch���� �����
		case ���� 1�� 2�� ����� ������ case�Ͻ� ����� case���� ����ϰ� switch�� ����
		��Ÿ�� ��Ÿ�� ���
	6. int i = 1;
		i�� 6���� �����ø� �ݺ��ϴ� while���� ����(�ݺ��� ����� i�� ���)
		���� ���� ���� �ʵ��� i�� �����Ͽ� �ݺ� ó��
	7. i������ �ٽ� 1�� ���� 6���� do while������ ����
	8. �⺻ for������ yes�� 5�� ��� �Ͻÿ�.
	9."Volvo", "BMW", "Ford"�� ��ҷ� ���� �迭 cars�� ����
		enhanced for���� �̿��Ͽ� cars�� ���Ҹ� ���
	10.�ݺ� ���� i�� 0���� �����Ͽ� 1�� �����ϸ� 10ȸ �ݺ� �ϴٰ� i�� 5�� �Ǹ� for�� �ߴ�
*/