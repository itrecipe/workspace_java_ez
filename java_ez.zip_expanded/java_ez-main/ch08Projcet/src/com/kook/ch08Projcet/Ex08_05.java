package com.kook.ch08Projcet;
//��.��
public class Ex08_05 {

	public static void main(String[] args) {
		
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(0/0);
			System.out.println(4);
		}
		catch(Exception e) { //�ֻ��� ����(Exception)�̹Ƿ� ��� ���ܰ� ���İ� 
			e.printStackTrace();
			//call stack�޸𸮿� �ִ� �޼����� �������� �������� �ܼ�â�� ���
			System.out.println(e.getMessage());
			//�ش� ���� ��ü�� ���ǵ� ���� �޽���
		}
		System.out.println("try~catch �ܺ�");
	}

}
