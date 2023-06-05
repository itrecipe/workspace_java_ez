package com.kook.ch10Project;

import java.util.Calendar;

public class Ex10_04 {

	public static void main(String[] args) {
		Calendar date = Calendar.getInstance(); //���� �ð�
		date.set(2019, 7, 31);
		System.out.println(toString(date));
		
		/* Calendar��ü�� ������ҿ� ���� ���ϰų� ���� ����ϴ� add�޼���
		   add�޼���� ���õ� �ٸ� ������ҵ� ������
		*/
		
		date.add(Calendar.DATE, 1); //date��ü�� ��¥�� 1�� ����
		System.out.println(toString(date));
		
		date.add(Calendar.MONTH, -6); //6���� ��
		System.out.println(toString(date));
		
		//roll�޼��嵵 ������ҿ� ���� ���ϰų� �� �� ������ ���� ��Ҵ� ���� ����(�ڱ��ڽŸ� �����)
		date.roll(Calendar.DATE, 31); //�ڱ��ʵ常 ����, ���� ���� �ȵǰ� �ϸ� 1�� ����
		System.out.println(toString(date));
		
		date.add(Calendar.DATE, 31); //���õ� ���� �ٲ�
		System.out.println(toString(date));
	
		/* ppt ���� �߰� ����
		 add�� role�޼���
		 add(int field, int amount)�� Carendar�� �ʵ忡 
		 amount��ŭ ���ϰų� ���� ��� (���ϰų� ���� �ð��� ��ȯ)
         
         role(int field, int amount)�� ������ ���̴� �ٸ� �ʵ忡�� ������ ����
         (������ ���п�һ�� field�� �ش��ϴ� ��Ҹ� ����)
         (�� ���Ͽ� �� ��Ҹ� �����ϸ� �Ͽ�ҿ� ������ �� �� ����)
         
         �̹��� ���� �ľ��� ������ 1�Ͽ��� �Ϸ� ���� ��
         �Ǵ� getActualMaximum(Calendar.DATE)���
		  
		*/
	}
	
	static String toString(Calendar date) {
		
		String result = date.get(Calendar.YEAR) + "��"
				+ (date.get(Calendar.MONTH) + 1 ) + "��"
				+ (date.get(Calendar.DATE) + "��");
		
		return result;
	
	}
}