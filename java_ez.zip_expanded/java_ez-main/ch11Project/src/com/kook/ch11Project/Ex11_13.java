package com.kook.ch11Project;

import java.util.*;

public class Ex11_13 {

	//TreeSet�� �ִٴ� ������ �˸� �ȴٰ��� -feat.����
	public static void main(String[] args) {
		Set set = new TreeSet();
		
		for(int i = 0; set.size() < 6; i++) {
			//�ߺ����� �ʴ� �� 6���� set�� �־���
			int num = (int)(Math.random()*45) + 1;
			set.add(num);
		}
		//TreeSet�� ���ĵǾ� ó���ǹǷ� sort�� ���� �ʾƵ� �������� ���ĵǾ� �ִ�.
		System.out.println(set); 
	}
}