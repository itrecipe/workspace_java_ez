package com.kook.ch06Project;

public class Ex06_06 {

	public static void main(String[] args) {
		// �⺻�� ���� �Ű������� ����
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x); //change�޼��� ȣ��
		/*main�޼��� �ȿ��� �޼�������� �ٷ� ȣ���� ������ ����
		main�޼���� ���� Ŭ������ static�޼��常 ����
		static�޼��� �ȿ��� ���� Ŭ������ static�޼��� ȣ���� �޼����
		�Է��Ͽ� ��밡�� */
		System.out.println("After change(d.x) : " + d.x);
	}
	static void change(int x) {
		/*���ڰ��� �޴� �⺻���Ͻ� �ش� �ڵ� �ȿ��� ���� ������ �ۿ�
		  ����� ���� ���ڰ��� ���� ������ ���Ѵ�.
		*/
		x = 1000;
		System.out.println("change() : x = " + x);
	} 
}

class Data {
	int x;
}