package com.kook.ch11Project;

import java.util.*;

public class Ex11_10 {

	public static void main(String[] args) {
		//�ζ� ��÷��ȣ ����� �ߺ��� ��ȣ�� ���ϱ� ���� Set���
		Set set = new HashSet();
		for(int i=0; set.size() < 6; i++) {
			/* �ݺ� �������� set�� �߰��Ǵ� ���� ������ ���
			   �ζ� ���ǹ�ȣ�� 6���̹Ƿ� 5�� �߰��ǰ� ��Ͽ��� ������ �ϳ� �߰�
			*/
			int num = (int)(Math.random() * 45) + 1;
			set.add(num);
		}
		
		System.out.println(set);
		
		List list = new LinkedList(set);
		//�迭�̸� Arrays.sort(�迭)�� �����ϳ� set�� �迭�� �ƴ�
		Collections.sort(list);
		//sort(list��ü)�� ���
		System.out.println("�ζǹ�ȣ ���� (�ߺ�x) : " + list);
	}
}