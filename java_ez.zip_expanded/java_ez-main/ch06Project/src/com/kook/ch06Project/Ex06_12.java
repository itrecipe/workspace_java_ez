package com.kook.ch06Project;
//���� ���� ����(������ ����)
public class Ex06_12 {

	public static void main(String[] args) {
		Car01 c1 = new Car01();
		/* �⺻�� �����ڷ� ����� CarŬ���� ��ü c1�� ��������� �ʱⰪ�� �⺻������ ������
		 * color�� null, gearType�� null, door�� 0 
		*/
		
		//��ü�� ���� �Ŀ� ������� �ʱ�ȭ
		c1.color = "white";
		c1.gearType = "auto";
		c1.door = 4;
		
		//��ü ������ �����ڸ� �̿��Ͽ� �ʱ�ȭ
		Car01 c2 = new Car01("dark", "manual", 3);
		System.out.println("c2 color = " + c2.color);
		System.out.println("c2 gear = " + c2.gearType);
		System.out.println("c2 door = " + c2.door);
	
		System.out.println("c1 color = " + c1.color);
		System.out.println("c1 gear = " + c1.gearType);
		System.out.println("c1 door = " + c1.door);
	}
}

//������ package���� ������ �̸��� Ŭ������ �����ϴ� ��� �ν� x
class Car01 {
	String color;
	String gearType;
	int door;
	
	//�������� ���� �����ڴ� class�� ���� �����ڿ� ��ġ
	Car01() {
		
	}
	
//�Ķ���͸� ���� ������ ����(�⺻�� �����ڴ� ��� �Ұ� �ϹǷ� ��������� ����)
Car01(String c, String g, int d){
	color = c;
	gearType = g;
	door = d;
	
	}
}