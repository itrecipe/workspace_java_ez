package com.kook.ch05Project;

public class Ex05_06 {

	public static void main(String[] args) {
		//String �迭�� �ʱ�ȭ
		String[] names = {"kim", "Park", "Yi"};
		//����� ���ÿ� ���ͷ��� �ʱ�ȭ
		//String[] names = new String[]{"kim", "Park", "Yi"};
		//String[] names = new String[3]; names = {"kim", "Park", "Yi"};
		
		for(int i=0; i < names.length; i++)
			System.out.println("names["+i+"] : " + names[i]);
		
		String tmp = names[2]; //�迭 ��ҿ� ���ι�ȣ�� ����
		System.out.println("tmp : " + tmp);
		names[0] = "Yu"; //ù��° �迭���� Yu�� ����
		names[1] = "Ko";
		
		//�⺻ for���� (�ʱ��;���ǽ�;������)���� ó��
		//�迭�̳� ������ó���÷��ǿ����� ������ for��(enhanced for)�� ���
		
		//���� ����(�Ʒ� for����)
		for(String str : names) {
			//ù��° �Ķ���ʹ� ����� ���������� ����, �ι�° �Ķ���ʹ� �迭��
			System.out.println("str�� ��� : " + str);
		}
		
		for(int i=0; i < names.length; i++)
			System.out.println(names[i]);
 	}
}
