package com.kook.ch13Project;

import java.util.*;

public class Ex13_15 {

	public static void main(String[] args) throws Exception {
		Table table = new Table();
		new Thread(new Cook(table), "COOK").start(); //"COOK"�� �������, Runnable��ü�� ���ٷ� �ۼ��Ͽ� ����
		new Thread(new Customer(table, "donut"),"CUST1").start(); //�ۼ��� �迭�� �ִ� ���� ����Ѵ�. ex)"donut"
		new Thread(new Customer(table, "burger"),"CUST2").start(); //�ۼ��� �迭�� �ִ� ���� ����Ѵ�. ex)"burger"
		
		Thread.sleep(2000);
		System.exit(0);
	}

}
class Customer implements Runnable {
	private Table table;
	private String food;
	
	Customer(Table table, String food) {
		super();
		this.table = table;
		this.food = food;
	}
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(100);
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
			String name = Thread.currentThread().getName();
			
			table.remove(food);
			System.out.println(name + " ate a " + food);
		}
	}
}

class Cook implements Runnable {
	private Table table;
	
	Cook(Table table) {
		this.table = table;
	}
	
	@Override
	public void run() {
		while(true) {
			int idx = (int)(Math.random() * table.dishNum());
			//���ι�ȣ�� ���Ƿ� ����
			table.add(table.dishNames[idx]); //�丮�簡 �����ϴ� �丮�� ���̺� �߰�
			try {
				Thread.sleep(10);
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}	
}

class Table { //Cook�� Customer�� �������� ����ϴ� �ڿ��� Ŭ����
	String[] dishNames = { "donut", "donut", "burger" }; //�����Ǵ� �丮
	final int MAX_FOOD = 6; //���̺��� �����Ǵ� �ִ� �丮����
	private ArrayList<String> dishes = new ArrayList<String>(); //���̺� �����Ǵ� �丮�� ����
	
	public synchronized void add(String dish) { //����ȭ �޼���� 1���� �����常 ��밡��
		while(dishes.size() >= MAX_FOOD) {
			String name = Thread.currentThread().getName(); //���� �޼��带 ����ϴ� ������ Ȯ��
			System.out.println(name + " is waiting"); //���̺�� �ִ� �丮���� �ʰ��̹Ƿ� ����ϱ� ���� ����
			try {
				wait(); //Cook�����带 ��� ��Ų��, wait(), notify���� Object���̹Ƿ� ���⼭�� Table�� �޼���
				//wait()�� ���� ����ȭ �����带 ����ϴ� thread�� Table��ü�� waiting pool�� ������.
				Thread.sleep(500); //sleep(500)�� 0.5�� ����϶�� �ǹ�
			}
			catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		dishes.add(dish); //�ش� add�� ArrayList�� add�̴�.
		notify(); //��ٸ��� �ִ� Customer�����带 ����� ����
		System.out.println("Dishes : " + dishes.toString());
	}
	
	public void remove(String dishName) { //dishName�� ���� �丮
		synchronized (this) { //����ȭ�� ���� Table��ü�� ����
			String name = Thread.currentThread().getName(); //���� �޼��带 ����ϴ� �����带 Ȯ��
			
			while(dishes.size()==0) {
				System.out.println(name + " is waiting"); //Customer������ ���
				try {
					wait(); //Customer�����带 ��ٸ��� �Ѵ�.
					Thread.sleep(500);
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			//���̺� �丮�� �ִ� ���
			while(true) {
				for(int i=0; i < dishes.size(); i++) {
					if(dishName.equals(dishes.get(i))) {
						dishes.remove(i); //ArrayList�� remove(���ι�ȣ)�� �ش� ����� ���� ����
						notify(); //wait�ϰ� �ִ� Cook�� ����� ����
						return;
				}
			}
			//���̺��� �Ծ �����ϰ� ���Ŀ��� �丮 ���޽ñ��� wait
			try {
				System.out.println(name + " is wating");
				wait(); //���ϴ� ������ ���� Customer�����带 ��ٸ��� �Ѵ�.
				Thread.sleep(500);
			}
			catch(Exception e) {
				System.out.println(e.getCause());
			}
		} //while(true)
	} //while(synchronized)
} //remove
	public int dishNum() {
		return dishNames.length;
	}
}