package com.kook.ch09Project;
//��.��
public class Ex09_15 {

	public static void main(String[] args) {
		
		int i = new Integer("100").intValue(); //������ �Ⱦ��� �����
		//���ڿ��� ���ڷ� �޾� Integer��ü�� ���� �� intValue()�� int������ ��ȯ
		int i2 = Integer.parseInt("100"); //parseInt�� int�� ��ȯ 
		Integer i3 = Integer.valueOf("100"); //valueOf�� wrapperŬ������ ��ȯ
		int ix = Integer.valueOf("100"); //��ȯ�� ����Ŭ������ Integer�� �ڵ� int�� ��ȯ(����ڽ� ������)
	
		//���� �����ؼ� ��ȯ
		int i4 = Integer.parseInt("100",2); //���ڿ� 100�� 2������ ó��
		System.out.println("2���� �� : " + i4); //����� 10���� 4�� ����
		int i5 = Integer.parseInt("100",8); //��� : 64
		int i6 = Integer.parseInt("100",16); //��� : 256
		int i7 = Integer.parseInt("FF",16); //��� : 16 * 15 + 15 = 255
		System.out.println(i7);
		//Integer.parseInt("FF")�� ����(10�����ε� 10�������� FF����)
	}
}
