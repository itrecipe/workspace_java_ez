package com.kook.ch07Project;
//���� ���� ����-(������ ����)
public class Ex07_08 { //����Ŭ����(Ŭ�������� �ڹ����ϸ�� �����ؾ���)

	public static void main(String[] args) {
		//�Ű�����(�Ķ����)�� ������
		Buyer b = new Buyer(); //�⺻ ������ ���
		b.buy(new TVex0708()); //Product�Ķ���Ϳ� ���� Ŭ������ TVex0708���
		b.buy(new Computer());
		
		System.out.println("���� ���� : " + b.money);
		System.out.println("���ʽ��� : " + b.bonusPoint);
	}
}

class Product { /* extends Object �����Ǿ� ���� */
	//���� Ŭ����(�ϳ��� �ܵ� Ŭ������ ����°��� ������ ���ǻ� ����� ����)
	//����Ŭ������ public(�������)�� �Ⱥ���, �� (default)���� �Ѵ�(��� ������ ���� �ϰ͵� �Ⱥٿ��� ��)
	int price; //���� ������ default
	int bonusPoint;
	
	Product() {
		//���������ڴ� default ���� Ŭ������ ���������ڸ� ����
		//�ٸ� �����ڰ� ������� ������ �⺻�����ڵ� ����Ϸ��� �� ��������� �ۼ� �������

	}
	
	Product(int price) {
		this.price = price; //��������� �Ķ���ͺ������� �����ҽ� �����ϱ� ���� this���
		bonusPoint = (int)(price/10.0);
	}
}
	class TVex0708 extends Product {
		//������
		TVex0708() {
			//����Ŭ���� �������� �Ķ���� 1�� �ִ� �����ڸ� ȣ��
			super(100);
		}
		
		@Override //����Ŭ������ �޼��带 ������(override)�ҽ� ����ϴ� ������̼� (���븸 ����)
		//toString()�޼���� Object�� Ŭ������ �޼���
		//��ü���� ���ڿ��� ��ȯ
		public String toString() {
			return "Tv";
		}
	}
	
	class Computer extends Product {
		Computer() {
			super(200);
			
		}
		
		@Override
		//ObjectŬ������ toString()�� �������̵��Ѵ�.
		public String toString() {
			return "Computer";
		}	
	}
	
	class Buyer { //�� �����ڸ� classȭ��
		int money = 1000; //�� ������
		int bonusPoint = 0;
		
		//���� �����ϴ� �޼���
		void buy(Product p) {
			//�޼����� �Ķ���Ϳ� ����Ŭ������ Product�� �̿��� ������ ����
			//�������� Ȱ������ ������ �Ķ���Ͱ� TVex0708�� Computer�� ���� �޼��带 ���� ���� ����� �����.
			//buy�޼��带 ���� ���ڷ� Product�� ����Ŭ������ TVex0708�� Computer ��ü ���
			//�Ķ���ͷ� ���� ����Ŭ���� ��ü�� ���⼱ ��밡��(����Ŭ���� �޼��� ��밡��)
		if(money < p.price) {
			System.out.println("�� ��� ���� ����");	
			return; //�޼��带 ���� �϶�� �ǹ�
		}
		
		money -= p.price; //money = money - p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "�� ���� ����");
		//print������ ��ü�� ����ϸ� �ڵ����� .toString()�޼��尡 �߰���.
		System.out.println(p.toString() + "�� ���� ����");
		}
}