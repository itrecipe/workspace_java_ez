package com.kook.ch06Project;

import java.util.Arrays;

public class ArrayQuiz {

	//�ּ��� ���ڷ� �����ϴ� ���� ���� ���� �ڵ�� ���� ����
	public static void main(String[] args) {
		//1. �ʱⰪ "Volvo", "BMW", "Ford"�� ���� �迭 cars�� ����
		String[] cars = {"Volvo", "BMW", "Ford"};
		// String[] cars = new String[]{"Volvo","BMW","Ford"};	
		
		//2. cars�迭�� 2��° �� ���
		String rs = cars[1];
		System.out.println("Result �� : " + rs);
	
		//3. cars�� ��� Volvo�� Opel�� ������ �� ����� ��Ұ� ���
			cars[0] = "Opel";
				System.out.println("cars�� ��� Volvo�� Opel�� ���� : " + cars[0]);
				
		//4. cars�迭�� ���Ұ��� ���
		System.out.println("cars�迭�� ���Ұ��� : " + cars.length);
		
		//5. cars�迭�� ��Ҹ� for������ ���(�⺻ for��, enhanced for��)
			//�⺻ for
		for(int i=0; i < cars.length; i++) {
			System.out.println("cars �迭�� ��� ��� (�⺻ for) : " + cars[i]);
		
			//enhanced for��
			//�ַ� �迭�̳� collection��ü(����������ó��)���� ���
			String[] cars1 = {"Volvo", "BMW", "Ford"};
			for(String str:cars1) { //���ο� for��
				System.out.println("enhanced for�� : " + str);
				
			}
		}
		
		//6.�ʱⰪ { {1, 2, 3, 4}, {5, 6, 7} }�� ���� myNumbers�迭 �����
		int[][] myNumbers = {{1, 2, 3, 4},{5, 6, 7}};
		/* �迭÷��[]������ ������ ��Ÿ��
		2���� �迭�� ù������ ���� ����, �ι�°�� ���� ���� 
		���� ������ 2���̰� ���� ���� 
		myNumbers[0][0] ~ myNumbers[0][3]
		myNumbers[1][0] ~ myNumbers[1][2]
		int[][] myNumbers = new int[2][];
		myNumbers[0] = new int[4];
		myNumbers[0] = new int[3];
			 
		*/
		
		//System.out.println("myNumbers �迭 �� ��� : " + Arrays.deepToString(myNumbers));
			
			//7. myNumbers�迭�� ��Ұ��� for���� �̿��� ���
			
			for(int i=0; i<myNumbers.length;i++) {
				for(int j=0;j<myNumbers[i].length;j++) {
	            System.out.println(myNumbers[i][j]);
	         }
	      }

			for(int k=0; k < myNumbers.length; k++) {
				System.out.println("myNumbers �迭�� ��Ұ� : " + Arrays.deepToString(myNumbers));
			}
			
			//8. cars �迭�� ����
			Arrays.sort(cars);
			//Arrays�� �迭ó���� ���ϰ� �ϵ��� ���ִ� static�޼��� ����
			System.out.println("cars �迭 ���� : " + Arrays.toString(cars));
			
			//9. car �迭�� ���ڿ��� ��ȯ�Ͽ� ���
			//�迭�� ���ڿ��� ��ȯ toString(�迭) [��, ��, ��]
			// 2�����迭 ó���� ��� -> Arrays.deepToString();
			
			/* 11. main�޼��� �ȿ� Car��ü�� ��ҷ� �ϴ� �迭 Car1�� ����� ���� 5���� ����(���ͷ� ��� x)
			�� ��ҿ� Car��ü�� ����� �־��� */
			Car[] car1 = new Car[5];
			//car1 �迭�� ���� ��Ұ� CarŬ������ ��(Car��ü)
			car1[0] = new Car();
			car1[1] = new Car();
			car1[2] = new Car();
			car1[3] = new Car();
			car1[4] = new Car();
	}

 }
	//10. CarŬ������ ���ο��� ���� --������� : color,brand

class Car{
	//������� (�ν��Ͻ���)
	String color;
	String brand;
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
11. main�޼��� �ȿ� Car��ü�� ��ҷ� �ϴ� �迭 Car1�� ����� ���� 5���� ����(���ͷ� ��� x)
	�� ��ҿ� Car��ü�� ����� �־���
 
*/
