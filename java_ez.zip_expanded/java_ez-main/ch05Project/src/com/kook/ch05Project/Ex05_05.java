package com.kook.ch05Project;

public class Ex05_05 {

	public static void main(String[] args) {
		//�ζǹ�ȣ 1���� 45������ ��ȣ�� ���� �迭 ����(1,2,3...45)
		int[] ball = new int[45];
		
		//for������ �迭 ball�� ��Ұ� ����
		for(int i=0; i < ball.length; i++)
			ball[i] = i+1; //1���� 45�� �־�� �ϹǷ� ���ι�ȣ + 1
			
		int tmp = 0; //��ȯ�� �ӽ÷� ��ȯ�� ���� �����ϴ� ����
		int j = 0; //��ȯ�� ������ ���ι�ȣ
		
		//���ι�ȣ 1������ 5������ 6�� ���Ҹ� ���Ƿ� ���� ���ι�ȣ(j)�� ��Ұ����� ��ȯ
		for(int i=0; i < 6; i++) {
			j = (int)(Math.random() * 45);
			tmp = ball[i];
			ball[i] = ball[j];
			ball[j] = tmp;
		}
		//ball�迭���� ���� 6���� ���
		for(int i=0; i < 6; i++)
		System.out.printf("ball[%d]=%d%n", i, ball[i]);	
		}
	}