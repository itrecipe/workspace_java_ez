package com.kook.ch04Project;

public class Ex04_11 {

	public static void main(String[] args) {
		//��ø for��
		//for�� �ȿ� for���� �ٱ��� for���� �ݺ� ������ ����
		//��ø�� �ݺ����� ��� �ݺ��� ó���� �� ���� �ݺ����� �ݺ� ������ ��������
		//�ٽ� ���� �ݺ��� ��� ó��
		for(int i=1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				//���ǽ��� ���� �ݺ����� ���Ͻÿ��� �ݺ�
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
