package com.kook.ch04Project;

public class Ex04_19 {

	public static void main(String[] args) {
		
		Loop1 : for(int i=2; i<=9; i++) { //Loop1�� ���� �ǹ�
			for(int j=1; j<=9; j++) {
				if(j==5)
					//�� Loop1�� for���� ����,�� j�� 4������ �ݺ��ϰ� 2�� 4��°�ٿ��� ���� ������ ����
					break Loop1;
					
					//break;
					//continue Loop1; //4������ ���ϰ� ���� �ݺ����� �̵��Ͽ� 9�ܱ��� ó��
					//continue;
					System.out.println(i + "*" + j +"="+ i*j);
			}
			System.out.println();
		}
	}
}