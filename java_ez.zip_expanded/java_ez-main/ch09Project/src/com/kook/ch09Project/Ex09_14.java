package com.kook.ch09Project;

public class Ex09_14 {

	public static void main(String[] args) {
		/* Integer i = new Integer(100); -> ���� �Ұ�
		   �ڹ� 9�������� �����ڸ� �̿��Ͽ� wrapperŬ���� ��ü ����°��� ������  
		*/
		Integer i = 100; //�⺻������ ��ü������ �ڵ����� �ڽ�(����ڽ�)����
		Integer i2 = 100;
		
		//Stringó�� ���ͷ��� �ʱ�ȭ�Ͽ� ��ü�� �����ϸ� JVM���� ������ ���̸� �������� ���(�ּҴ� ����)
		System.out.println("i==i2 ? " + (i == i2));
		System.out.println("equals�� �� : " + i.equals(i2));
		//wrapperŬ������ equals�� ���� ���ϵ��� �������̵� ��
		
		/* ������ wrapperŬ������ ��ü�� �� ������ �ȵǼ� compareTo()�޼��带 �������
		   ������ �� ������ �� ����� (�����ϸ� compareTo()�� ������� �������� �ǰ�)
		*/
		System.out.println("i.compartTo(i2) = " + i.compareTo(i2));
		//compareTo�� ������ 0 �ٸ��� 0�� �ƴ� �� ��� (���� 1�� ��µ�)
		
		//toString()�� Overriding�Ǿ� wrapperŬ���� ��ü�� ���ڿ��� ��ȯ
		System.out.println("i.toString() = " + i.toString());
		
		//�� wrapperŬ������ ����� �����Ǿ� ����
		System.out.println("MAX_VALUE = " + Integer.MAX_VALUE);
		System.out.println("MIN_VALUE = " + Integer.MIN_VALUE);
		System.out.println("SIZE = " + Integer.SIZE + " bits");
		System.out.println("BYTES = " + Integer.BYTES + " bytes");
		System.out.println("TYPE = " + Integer.TYPE); //�⺻���� ��ȯ
		
	}
}