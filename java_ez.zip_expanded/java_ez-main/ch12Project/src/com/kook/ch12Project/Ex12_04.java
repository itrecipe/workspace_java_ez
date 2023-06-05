package com.kook.ch12Project;
//��.��
import java.util.ArrayList;

public class Ex12_04 {

	public static void main(String[] args) {
		//FruitBox2 ���׸� <T extends Fruit2>
		FruitBox2<Fruit2> fruitBox = new FruitBox2<Fruit2>();
		FruitBox2<Apple2> appleBox = new FruitBox2<Apple2>(); 
		//Fruit2�� �ڼ��� Apple�� ���׸����� �����

		//���� ���׸� ������ Fruit2�� ����� fruitBox�� ���� ��ü�� ����� �� ����
		fruitBox.add(new Apple2());
		fruitBox.add(new Grape2());
		//����Ŭ������ Apple2�� ���׸����� ����ϸ� ������ �ٸ� ��ü�� ����� �� ����
		appleBox.add(new Apple2());
		appleBox.add(new Apple2());
		
		Juicer.makeJuice(fruitBox);
		Juicer.makeJuice(appleBox);
	}
}

class Fruit2 {
	@Override
	public String toString() {
		return "fruit2";
	}
}

class FruitBox2<T extends Fruit2> extends Box2<T> {
	//<T extends Fruit2>�� Fruit2���� �ڼ�Ŭ������
}

//Fruit2�� ����� Ŭ������ FruitBox2�� ���׸� Ÿ�� �Ű������� ��밡��
class Apple2 extends Fruit2 {
	@Override
	public String toString() {
		return "Apple2";
	}
}

class Grape2 extends Fruit2 {
	@Override
	public String toString() {
		return "Grape2";
	}
}

class Box2<T> {
	ArrayList<T> list = new ArrayList<T>(); //list������ T���
	void add(T item) { //�ν��Ͻ� �޼����� �Ķ���ͷ� ���
		list.add(item);
	}

	@Override
	public String toString() {
		return list.toString();
	}
	
	ArrayList<T> getList() {
		return list;
	}
}

class Juicer {
	/* �Ķ���ͷ� ���׸����ε� ��ü�� ����ҽÿ��� �������� �����ϴ�.
	   static�޼��忡�� Ÿ�Թ��� T,E���� ��� ���ϳ� ���� ���� ���Ե� ���׸� Ÿ�� ������ ��밡��
	*/
	static void makeJuice(FruitBox2 <? extends Fruit2> box) {
		//Fruit2�� ������ ��� �ڼհ�ü���� ��밡��, �� �޼����� Ÿ�Ժ����� �������� �����ȴ�.
		for(Fruit2 f : box.getList()) {
			System.out.println(f);
			
		}
	}
}