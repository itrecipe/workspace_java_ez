package com.kook.ch13Project;

public class Ex13_02 {

	public static void main(String[] args) {
		//main������ �ϳ��� ����Ͽ� �۾� (��, �̱۽������϶�)
		long startTime = System.currentTimeMillis();
		//currentTimeMillis()�� �и�������� �� posixŸ��
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("-"));
			/* "-"�� ������� �ʰ� ���ڿ� new String("-")���� �ϸ� �ð��� ���� �� �ɸ��� �ȴ�.
			   (��, new�����ڸ� ������� ����� �̾߱�, ���⼭�� �Ϻη� �ð��� �ɸ����ϱ� ���� ����)
			*/
		}
		
		long endTime = System.currentTimeMillis();
		System.out.println("�ҿ�ð� : " + (endTime-startTime));
		
		for(int i = 0; i < 300; i++) {
			System.out.printf("%s", new String("|"));
			//"-"�� ������� �ʰ� ���ڿ� new String("|")���� �ϸ� �ð��� ���� �� �ɸ��� �ȴ�.
		}
		endTime = System.currentTimeMillis();
		System.out.println("�ҿ�ð�2 : " + (endTime-startTime));
		
	}

}
