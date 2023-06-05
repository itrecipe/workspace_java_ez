package com.kook.ch05Project;

public class ControlQuiz {

	public static void main(String[] args) {
		//����-��������

		//1. int���� x ���� �� �ʱⰪ : 50
		int x = 50;
		
		//2. int���� y ���� �� �ʱⰪ : 50
		int y = 50;
		
		/* 3. ���ǹ� if�� ����Ͽ� x,y�� �����, ũ�� �񱳿� ��Ÿ(�ƴѰ�)�� 
		 * ��(if ~ else if, if ~ else) �� ���� ��� ������ "1","2","3" ���*/
			
		if (x == y) {
			System.out.println("1");
		} else if(x > y) {
			System.out.println("2");		
		} else {
			System.out.println("3");
		}
		
		/*
		 * 4. int ���� time�� 20 ���ǿ�����(���׿�����)�� �̿��� time�� 
		 * 18���� ������ Good day��, �ƴϸ� Good Evening�� �����Ͽ� 
		 * result������ ���� , result ���
		 */
		
		int time = 20;
		String result = (time < 18) ? "Good day" : "Good evening" ;
		System.out.println("result �� ��� : " + result);
		
		/*
		 * 5. int day = 4; day�� ���ǽ����� �ϴ� switch���� ����� case ���� 1�� 2�� ����� 
		 * ������ case�Ͻ� ����� case���� ����ϰ� switch�� ���� ��Ÿ�� ��Ÿ�� ���
		 */
		
		int day = 4;
		switch(day) {
			case 1:
				System.out.println(1);
			case 2:
				System.out.println(2);
				break;
			default:
				System.out.println("��Ÿ");
		}
		/*
		 * 6. int i = 1; i�� 6���� �����ø� �ݺ��ϴ� while���� ����(�ݺ��� ����� i�� ���) 
		 * ���� ���� ���� �ʵ��� i�� �����Ͽ� �ݺ� ó��
		 */
		
		int i = 1; //i�� �����Ϸ��� �������� �����.
		
		while(i < 6) { 
			System.out.println(i);
			i++;
			
		}
		
		// 7. i ������ �ٽ� 1�� ���� 6���� do while������ ����
		
		do {
			System.out.println(i);
			i++;
		}while(i < 6);
		
		
		// 8. �⺻ for������ yes�� 5�� ��� �Ͻÿ�.
		for(int j = 0; j < 5; j++) { //���� i��
			System.out.println("YES");
		}
		
		/*
		 * 9."Volvo", "BMW", "Ford"�� ��ҷ� ���� �迭 cars�� ���� 
		 * enhanced for���� �̿��Ͽ� cars�� ���Ҹ� ���
		 */
		
		
		String[] cars = {"Volvo", "BMW", "Ford"};
		for(String str:cars) { //���ο� for��
			System.out.println(str);
			
		}
		
		//10.�ݺ� ���� i�� 0���� �����Ͽ� 1�� �����ϸ� 10ȸ �ݺ� �ϴٰ� i�� 5�� �Ǹ� for�� �ߴ�
		
		for(i = 0; i < 20; i++) { //int i�� �ƴϰ� i�� ������ �̸� ����� i�� ���
			if(i == 5) {
				break; //break�� �ִ� for���� ����
			}
			System.out.println(i);
		}
		for(i = 0; i < 10; i++) {
			if(i == 4) {
				continue; //���� for���� ���� �ݺ��� ����(���� ������ �������� ����)
			}
			System.out.println(i);
		 }
	   }
	}
/*
1. int���� x ���� �� �ʱⰪ : 50
2. int���� y ���� �� �ʱⰪ : 50
3. ���ǹ� if�� ����Ͽ� x,y�� �����, ũ�� �񱳿� ��Ÿ�� ��(if~else , if ~ else)
	�� ���� ��� ������ "1","2","3" ���
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