package com.ezen.myProject1_Test;

import java.util.*;
//5��-�迭����(Test)
public class JavaStudyStudyClass_Test {

	public static void main(String[] args) {
		//��
		String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
		//��
		String[] cars2 = new String[] {"Volvo", "BWM", "Ford", "Mazda"};
		//��
		String[] cars3 = new String[4];
		cars3[0] = "Volvo";
		cars3[1] = "BMW";
		cars3[2] = "Ford";
		cars3[3] = "Mazda";
		//��
		for(int i=0; i < cars1.length; i++) {
			System.out.println("(��) cars1 ���Ұ��� �⺻ for������ ��� : " + cars1[i]);
		}
		System.out.println();
		//��
		for(String str : cars2) {
			System.out.println("(��) enhanced for�� ��� : " + str);
		}
		System.out.println();
		//��
		int[][] myNumbers = {
		       {1,2,3,4}, 
		       {5,6,7}
		};
		//��
		System.out.println("(��,��) myNumbers[][] 2�� 2�� �� ��� : " + myNumbers[1][1]);
		System.out.println();
		//��
		for(int j=0; j < myNumbers.length; j++) {
			System.out.println("(��) myNumbers[][] �迭�� �� ��Ұ� ��� : " + Arrays.deepToString(myNumbers));
		}
		//Ÿ
		Animal animal1 = new Animal();
		Animal animal2 = new Animal();
		//��
		animal1.kind = "bird";
		animal1.age = 10;
		animal1.kind = "puppy";
		
		animal2.kind = "fish";
		animal2.age = 10;
		animal2.kind = "kalchi";
		//��
		animal1.setAge(10);
		animal1.setAge(15);
		
	}
}

//��
class Animal{
	//��
	String kind;
	int age;
	String name;
	//ī
	public void setAge(int age) {
		this.age = age;
	}
}

/*
main�޼��� �ȿ��� ������ �����Ѵ� (�ڹٱ����� ch5 �迭���� �����Ѵ�)   
��. ���ڿ� �迭 cars1�� ����� �ʱⰪ�� �迭�� "Volvo", "BMW", "Ford", "Mazda"�� �ʱ�ȭ

��. ���ڿ� �迭 cars2�� new�� �̿��Ͽ� ����� �ʱⰪ�� "Volvo", "BMW", "Ford", "Mazda" ���

��. ���ڿ� �迭 cars3�� ũ�� 4�� �����Ͽ� ����� �����ҿ� "Volvo", "BMW", "Ford", "Mazda"�� �־���

��. cars1�� ���Ұ��� �⺻ for���� �̿��Ͽ� ���

��. cars2�� ���Ұ��� enhnaced for���� �̿��Ͽ� ���

��. int�ε� 2���� �迭 myNumbers�� ����� �ʱⰪ�� {1, 2, 3, 4}, {5, 6, 7}�� �̿�

��. 2��° ���� �ι�° ������ ���

��. for���� �̿��Ͽ� �� ���Ұ��� ���

��. AnimalŬ������ �� java���� �ȿ� ����

�� ��������� kind, age, name�� ���´�.(type�� age�� int �������� String)

ī. ��� �޼���� public void setAge(int age) {
       this.age = age;
 }

Ÿ. main�޼��� �ȿ��� Animal��ü animal1�� anlmal2�� ����

��. animal1�� kind�� bird, age�� 10, name�� puppy�� �ʱ�ȭ
   animal2�� kind�� fish, age�� 15, name�� kalchi�� �ʱ�ȭ
		
��. �޼��� setAge�� call�غ�����

*/