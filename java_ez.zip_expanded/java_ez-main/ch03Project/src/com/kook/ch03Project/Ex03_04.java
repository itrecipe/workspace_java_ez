package com.kook.ch03Project;

public class Ex03_04 {

	public static void main(String[] args) {
		
		int i = -10;
		i = +i; //+������ 1�� ���ϴ� ����
		System.out.println(i);
		
		i = -10;
		i = -i; // -��ȣ ������ -1�� ���ϴ� ����
		System.out.println(i);
		
		//���� ���� ����
		i = +10; // +��ȣ ������ �ƹ� �ǹ� ���� ���� �׳� �̷��͵� �ִٴ� ������ �˾ƵѰ�.
		i = +i;
		System.out.println(i);
	}

}
