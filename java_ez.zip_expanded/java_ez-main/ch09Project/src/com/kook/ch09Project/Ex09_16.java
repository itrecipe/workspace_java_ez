package com.kook.ch09Project;

import java.util.ArrayList;

public class Ex09_16 {

	public static void main(String[] args) {
		int i = 10;
		
		/* �⺻���� ���������� ��������ȯ(casting) ����
		   ������ �ƴ�����, ������ �ش� ����� ����Ͽ��ٰ���
		*/
		Integer intg = (Integer)i;
		Object obj = (Object)i;
		
		Long lng = 100L; //100L�� �⺻���ε� Long��(wrapperŬ����)���� ��밡��(����ڽ�)
		int int2 = intg + 10;
		/* ���۰�ü�� + �⺻�� ������ JDK 1.5���� ����
		   intg�� intValue()�� �ڵ����� ÷����(�����Ϸ��� �ڵ����� ó����)
		*/
		
		long l = intg + lng; //���������� ���굵 ����
		
		ArrayList<Integer> list = new ArrayList<>();
		list = new ArrayList<>();
		/* ArrayList�� �迭�� ó���ϱ� ������ �� �÷���(�����͵��� ����)
		   <Integer>�� ���׸����� ���������� �����ϴ� �Ű�����(list��Ұ� ���� Integer������ �Ǿ�����)
		*/
		list.add(10); //�ڵ����� �ڽ�(����ڽ�)
		list.add(intg);
		int res = list.get(0);
		//Integer�� ��ȯ�ϳ� int�� ����, �� �ڵ����� ��ü���� ������ ��ȯ(��ڽ�)
		Integer res1 = list.get(1);
		
		System.out.println(res);
		System.out.println(res1);
		
	}
}