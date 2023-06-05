package com.kook.ch12Project;

import java.util.*;

public class Ex12_03 {

	public static void main(String[] args) {
		FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
		/* FruitBox�� ���׸��� <T extends Fruit & Eatable>�� ���ǵ�.
	       Fruit���� ���� Ŭ�����̸� �������̽� Eatable������ Ŭ������ �Ű������� Ÿ�Ժ����� ��밡��
	    */
		FruitBox<Apple> appleBox = new FruitBox<Apple>(); //Fruit�ļ� �̹Ƿ� ����
		FruitBox<Grape> grapeBox = new FruitBox<Grape>();
		
		//FruitBox<Grape> grapeBox = new FruitBox<Apple>(); //����, Ÿ�� ����ġ
		//FruitBox<Toy> ToyBox = new FruitBox<Toy>(); //Fruit�ļ��� �ƴϹǷ� ����
		
		/* ������ ���ҿ� ���� �߰��ô� ��Ӱ��迡 �ִ°��� ����
		   Box<T>�� add�޼��带 ����Ͽ� Fruit�� ����� ��ü�� �����Ͽ� ArrayList�� ����
		*/
		
		fruitBox.add(new Fruit());
		fruitBox.add(new Apple()); //�� �߰��� ����Ŭ���� ��ü�� �����ϴ�.
		fruitBox.add(new Grape());
		appleBox.add(new Apple());
		
		//appleBox.add(new Grape()); //����, Grape Apple�� �ڼ��� �ƴ�
		grapeBox.add(new Grape());
		
		System.out.println("fruitBox : " + fruitBox);
		System.out.println("appleBox : " + appleBox);
		System.out.println("grapeBox : " + grapeBox);
		
	}
}

class Fruit implements Eatable {
	@Override
	public String toString() {
		return "fruit";
	}
}

interface Eatable {
	
}

class FruitBox<T extends Fruit & Eatable> extends Box<T> {
	/* ���׸��� ��Ӱ���� �������踦 �̿��Ͽ� ���� �� �� ����
	   �̶� extendsŰ����� ����(�ڽ� ���� ���� Ŭ����)
	   Box<T>�� ����Ͽ� Box�� ��� �޼��� ��밡��
	*/
	
}

class Box<T> {
	ArrayList<T> list = new ArrayList<T>(); //list������ T���
	void add(T item) { //�ν��Ͻ� �޼����� �Ķ���ͷ� ���
		list.add(item);
	}
	@Override
	public String toString() {
		return list.toString();
	}
}

class Apple extends Fruit {
	@Override
	public String toString() {
		return "Apple";
	}
}

class Grape extends Fruit {
	@Override
	public String toString() {
		return "Grape";
	}
}

class Toy extends Fruit {
	@Override
	public String toString() {
		return "Toy";
	}
}