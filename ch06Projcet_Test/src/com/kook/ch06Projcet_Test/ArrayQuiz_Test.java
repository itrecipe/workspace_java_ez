package com.kook.ch06Projcet_Test;

import java.util.Arrays;

public class ArrayQuiz_Test {

	public static void main(String[] args) {
		//1. �ʱⰪ "Volvo", "BMW", "Ford"�� ���� �迭 cars�� ����
		String[] cars = {"Volvo", "BMW", "Ford"};
		//2. cars�迭�� 2��° �� ���
		String rs = cars[1];
		System.out.println("Result �� : " + rs);
	
		//3. cars�� ��� Volvo�� Opel�� ������ �� ����� ��Ұ� ���
		
		//4. cars�迭�� ���Ұ��� ���
		System.out.println("cars�迭�� ���Ұ��� : " + cars.length);
		
		//5. cars�迭�� ��Ҹ� for������ ���(�⺻ for��, enhanced for��)
			//�⺻ for
		for(int i=0; i < cars.length; i++) {
			System.out.println("cars �迭�� ��� ��� (�⺻ for) : " + cars[i]);
		
			//enhanced for��
		}
		
		//6.�ʱⰪ { {1, 2, 3, 4}, {5, 6, 7} }�� ���� myNumbers�迭 �����
		int[][] myNumbers = {{1, 2, 3, 4},{5, 6, 7}};
		//System.out.println("myNumbers �迭 �� ��� : " + Arrays.deepToString(myNumbers));
			
			//7. myNumbers�迭�� ��Ұ��� for���� �̿��� ���
			for(int j=0; j < myNumbers.length; j++) {
				System.out.println("myNumbers �迭�� ��Ұ� : " + Arrays.deepToString(myNumbers));
			}
			//8. cars �迭�� ����
			Arrays.sort(cars);
			//9. car �迭�� ���ڿ��� ��ȯ�Ͽ� ���
			System.out.println("cars �迭 ���� : " + Arrays.toString(cars));
			
		}
	
	
	//10. CarŬ������ ���ο��� ���� --������� : color,brand
		
		class Car{
			String color, brand;
		}
		
	}
	
/*
1. �ʱⰪ "Volvo", "BMW", "Ford"�� ���� �迭 cars�� ����
2. cars�迭�� 2��° �� ���
3. cars�� ��� Volvo�� Opel�� ������ �� ����� ��Ұ� ���
4. cars�迭�� ���Ұ��� ���
5. cars�迭�� ��Ҹ� for������ ���(�⺻ for��, enhanced for��)
6. �ʱⰪ { {1, 2, 3, 4}, {5, 6, 7} }�� ���� myNumbers�迭 �����
7. myNumbers�迭�� ��Ұ��� for���� �̿��� ���
8. cars �迭�� ����
9. car �迭�� ���ڿ��� ��ȯ�Ͽ� ���
10. CarŬ������ ���ο��� ����
 	--������� : color,brand
11. main�޼���ȿ� Car��ü�� ��ҷ� �ϴ� �迭 Car1�� ����� ���� 5���� ����(���ͷ� ��� x)
	�� ��ҿ� Car��ü�� ����� �־���
 
*/