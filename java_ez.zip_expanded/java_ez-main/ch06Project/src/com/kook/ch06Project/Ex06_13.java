package com.kook.ch06Project;
//���� ���� ����(������ ������)
public class Ex06_13 {

	public static void main(String[] args) {
		Car0613_01 c1 = new Car0613_01();
		Car0613_01 c2 = new Car0613_01("dark");
	}
}

class Car0613_01{
	String color;
	String gearType;
	int door;
	
	Car0613_01(){
		this("white"); //�ڱ� Ŭ������ �ٸ� �������� �Ķ���� �ϳ� ���� ���� ȣ��
	}
	
	Car0613_01(String color){
		this(color,"auto",4); //�ڱ� Ŭ������ �ٸ� �������� �Ķ���� ���� ���� ���� ȣ��
		//color�� ���� �Ķ���͸� Ȱ��
	}
		
	Car0613_01(String color, String gearType, int door){
		//���������� �Ķ���͸��� ������ ��������� this�� ����Ͽ� ����
		//this�� �ڱ�Ŭ������ ��ü
		super();
		//this�� �ڽ� ��ü�� ��Ÿ���� �ν��Ͻ� ��ü�� ��� �޼��忡�� ���� ������ ����
		this.color = color;
		this.gearType = gearType;
		this.door = door; 
	}
	int sum(int a, int b) {
		return a + b;
	}
	
	void call() {
		/* �ڱ�Ŭ������ �ν��Ͻ� �޼��� ȣ��� �̸����� ȣ�� �ص� ������, 
		 * sum(5,10) <- �̷��� ȣ���ص� �������
		   ��� �޼��忡 ������ �ڽ��� �ν��Ͻ� ��ü�� this�� ����ص� �����ϴ�(�ǰ����)
		 */
		this.sum(5,10);
	}
}

class Car0613_02 {
	String color;
	String gearType;
	int door;
	
	//������� ������ x
	//�ڹ������Ϸ��� �⺻�����ڸ� �߰���(�Ⱥ��ϻ���)
}