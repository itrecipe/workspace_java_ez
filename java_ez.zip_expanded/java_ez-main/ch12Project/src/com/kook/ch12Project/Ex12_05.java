package com.kook.ch12Project;

public class Ex12_05 {

	public static void main(String[] args) {
		/* enum �������� ������ Ŭ����ó�� ����, (enum��, ����������)
		   enum�� ���� (enum��.��������� ǥ��), (Ŭ������ ����ó�� ����)
		*/
		Direction d1 = Direction.EAST; //���� 0
		Direction d2 = Direction.valueOf("WEST"); //���� 2
		Direction d3 = Direction.valueOf(Direction.class, "EAST");
		
		//enum ��ü�� ������� ����
		System.out.println("d1 : " + d1);
		System.out.println("d2 : " + d2);
		System.out.println("d3 : " + d3);
		
		/* enum��ü �񱳴� ���Ϻ񱳴� ==, compartTo()�� ���
		   �ٸ� �� �����ڴ� ���Ұ� >, <, >=, <= ��... ���(x)
		*/
		System.out.println("d1==d2 ? " + (d1==d2));
		System.out.println("d1==d3 ? " + (d1==d3));
		//equals()�� ��밡��
		System.out.println("d1.equals(d3) ? " + d1.equals(d3));
		/* System.out.println("d2 > d3 ? " + (d1 > d3)); //�ٸ��񱳿����ڴ� ���Ұ�
		   - compareTo�� ��밡�� �հ�ü-�ް�ü(0,-,+)
		   - compareTo�� enum ����� ���� ��
		   - enum��ü�� Enum(�ֻ���Ŭ����)��ü�̴�.
		*/
		System.out.println("d1.compartTo(d3) ? " + (d1.compareTo(d3)));
		System.out.println("d1.compartTo(d2) ? " + (d1.compareTo(d2)));
		
		switch(d1) {
			case EAST: //switch case���� ����ҽ� ����� ���(enum��.����δ� ���Ұ�)
				System.out.println("The direction is EAST.");
				break;
			case SOUTH: 
				System.out.println("The direction is SOUTH.");
				break;
			case WEST: 
				System.out.println("The direction is WEST.");
				break;
			case NORTH: 
				System.out.println("The direction is NORTH.");
				break;
			default : 
				System.out.println("Invalid direction");
				break;
		}
		
		Direction[] dArr = Direction.values();
		/* values() enum������ ����(static��), enum�迭�� ��ȯ(enum���� Enum��ü)
		   values�� valueOf�� staticó�� enum������ ����
		*/
		for(Direction d : dArr) {
			/* name()�� ordinal()�޼���� �ֻ��� Ŭ���� Enum�� �����ϴ� �޼���
			   ordinal()�� ���ڰ�(�����) ��ȯ
			   name()�� ordinal()�� �ν��Ͻ������� ����
			*/
			System.out.println("����� : " + d.name());
			System.out.println("����� : " + d.ordinal());
		}
	}
}

enum Direction { //enum���� Ŭ����ó�� �̸��� �빮�ڷ� ����
	/* enum�� ������� �����̹Ƿ� �̸��� ��� �빮�ڷ� �ۼ�
	   ���� ������ ; ����
	   ���� �ڵ����� 0���� 1�� �����Ͽ� ������ ����� �־���
	*/
	EAST,SOUTH,WEST,NORTH
}