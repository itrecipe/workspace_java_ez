package com.kook.ch05Project;

public class Ex05_09 {

	public static void main(String[] args) {
		//���� ���� ����(��������¦�ٸ�)
		int[][] score = {
				//4�� * 3�� �迭 int[4][3]
				//����� ���ÿ� ���ͷ��� �ʱ�ȭ
				{100, 100, 100},
				{20, 30, 20},
				{30, 40, 50},
				{45, 55, 67}
		};
		
		//���� ����
		int korTotal = 0;
		int engTotal = 0;
		int mathTotal = 0;
		
		System.out.println("��ȣ ���� ���� ���� ���� ���");
		System.out.println("=============================");

		for(int i=0; i < score.length; i++) {
			int sum = 0; //��ȣ�� ����
			float avg = 0.0F; //��ȣ�� ���
			
			korTotal += score[i][0];
			engTotal += score[i][1];
			mathTotal += score[i][2];
			System.out.printf("%3d", i+1); //��ȣ �� ���(3ĭ���� ����) %n�� ��� �� �ȹٲ�
			
			for(int j=0; j < score[i].length; j++) { //�� ���� �迭��
				sum += score[i][j];	//�� ���� 3���� ���� ����
				System.out.printf("%5d", score[i][j]);
			}
			
			avg = sum/(float)score[i].length; //��հ��
			System.out.printf("%5d %5.1f%n", sum, avg);
		}
		System.out.println("=============================");
		System.out.printf("���� : %3d %4d %4d%n", korTotal, engTotal, mathTotal);
	}

}
