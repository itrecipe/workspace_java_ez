package com.kook.ch12Project;

import java.util.*;

public class Ex12_01 {

	public static void main(String[] args) {
		ArrayList<Product> productList = new ArrayList/*<Procuct>*/();
		/* �������� ���׸����� java8���� ���������� ���� �ص� �ȴ�. ��, <>�� �����Ұ�
		   ���׸��� ���� ���������� ������ ���������̾���Ѵ�.(�⺻���� �Ұ�)
		   Class ArrayList<E>�� ���ǵ�
		*/
		ArrayList<Tv> tvlist = new ArrayList<Tv>();
		//���׸����� ���Ǵ� Ÿ�Ժ����� �������� ������ �ȵ�
		
		/*ArrayList<Product> tvlist1 = new ArrayList<Tv>(); //error
		  Product�� Tv�� ��Ӱ����̳� ���׸� Ÿ�ԸŰ������� ���ô� ��Ӱ��迡 �־ ����(�����ؾ��Ѵ�)
		*/
		List<Tv> tvlist1 = new ArrayList<Tv>();
		//���׸��� ������ Ŭ�������� �������� ����
		
		productList.add(new Tv());
		productList.add(new Audio());
		//���׸� ��ü�� ��� �߰��� ���� ��ü�� �߰��� �� ����
		printAll(productList);
	}
	static void printAll(ArrayList<Product> productList) {
		//�Ű������� ���׸� ��ü�� ����ϸ� ������ ���� ��ü�� ����Ҽ�����
		for(Product p : productList) {
			System.out.println(p);
		}
	}
}

class Product {
	
}

class Tv extends Product {
	
}

class Audio extends Product {
	
}