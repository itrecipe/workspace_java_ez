package com.kook.ch09Project;

import java.util.StringJoiner;

//��.��
public class Ex09_09 {

	public static void main(String[] args) {
		// ���ڿ��� ��ȯ
		String animals = "dog,cat,bear";
		//�켱 ���ڿ��� �迭�� ��ȯ
		String[] arr = animals.split(","); //split("���ڿ� �߰��߰� �������ִ� ����")
		//arr = {"dog","cat,"bear"}
		//�迭�� ���ϴ� ���й��ڸ� �־� ���ڿ��� ��ȯ
		animals = String.join("-",arr);
		//join�� String static�޼��� join("���й���",����ҹ迭)�� ���ڿ��� ��ȯ		
		System.out.println("animals : " + animals);
		
		/* StringJoiner��ü�� �����Ͽ� add�޼���� �迭�� ���Ҹ� ���ڿ��� ��ȯ��,
		   �׸��� ������ ������ �����ڿ� ���λ�, ���̻縦 ÷�� 
		*/
		StringJoiner sj = new StringJoiner("/","[","]");
		//�����ÿ� ���й��� / ,��ó�� ���ڴ� [, ������ ���ڴ� ]�� ���
		for(String s : arr) {
			sj.add(s); //StringJoiner��ü�� ��ȯ(�� �ڽ��� ��ȯ)
		}
		System.out.println(sj.toString());
		//StringJoiner���� toString()�� Override�س���
		System.out.println(sj); //print���� ��ü�� ���ÿ� �ڵ����� toString()�� �پ�����
	}
}