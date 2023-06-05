package com.kook.ch07Project;
//���ܿ���-(����������)
public class Ex07_09 {
	public static void main(String[] args) {
		Buyer0709 b = new Buyer0709();
		
		b.buy(new Tv0709()); //Product0709�� �ڼ��̹Ƿ� ���ڷ� ��� ����
		b.buy(new Computer0709()); 
		b.buy(new Audio0709());
		
		b.buy(new Tv0709()); //Product0709�� �ڼ��̹Ƿ� ���ڷ� ��� ����
		b.buy(new Computer0709()); 
		b.buy(new Audio0709());
		
		b.buy(new Tv0709()); //Product0709�� �ڼ��̹Ƿ� ���ڷ� ��� ����
		b.buy(new Computer0709()); 
		b.buy(new Audio0709());
		
		//�迭 10������ ����, �̻󰡸� �迭 ũ�⸦ �ʰ��ϱ⿡ �����߻�
		b.summary();
		
	}
}

class Product0709 {
	int price;
	int bonusPoint;
	
	Product0709() {
		
	}
	
	Product0709(int price) {
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}
}

class Tv0709 extends Product0709{
	Tv0709() {
		super(100);
	}
	
	@Override
	// ObjcetŬ������ toString()�� �������̵��Ѵ�.
	public String toString() {
		return "Tv";
	}
}

	class Computer0709 extends Product0709 {
		Computer0709() {
		super(200);
	}

	@Override
	// ObjcetŬ������ toString()�� �������̵��Ѵ�.
	public String toString() {
		return "Computer";
	}
}
	class Audio0709 extends Product0709 {
		Audio0709() {
		super(50);
	}
	
	@Override
	public String toString() {
		return "Audio";
	}
}

class Buyer0709 {
	int money = 1000; //�����ݾ�
	int bonusPoint = 0; //���ʽ�����
	Product0709[] cart = new Product0709[10]; //���Ҹ� 10���� ����, ũ�� : 10, �迭�� ���ι�ȣ : 10
	
	//Vector cart - new Vector(); //�⺻ 10�� �߰��� �� �ִ� ��ü ����
	int i = 0; //�迭�� ���ι�ȣ�� Ȱ��
	
	void buy(Product0709 p) {
		if(money < p.price) {
			System.out.println("�ܾ��� ������ ���� ����");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		
		cart[i++] = p;
		//cart.add(p);
		System.out.println(p + "��/�� �����ߴ�");
	}
	void summary() {
		int sum = 0;
		String itemList = "";
		for(int i=0; i < cart.length; i++ ) {
			if(cart[i]==null) {
				break;
			}
			sum += cart[i].price;
			itemList += cart[i] + ", ";
		}
		System.out.println("�ѱݾ� : " + sum);
		System.out.println("��ǰ ����Ʈ : " + itemList);
	}
}