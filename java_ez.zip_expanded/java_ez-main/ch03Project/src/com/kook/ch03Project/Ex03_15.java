package com.kook.ch03Project;

import java.util.Scanner; 
//�⺻Ŭ������ java.lang��Ű���� �����ڰ� ���� ������ ��Ű���� ���� Ŭ������ import�� �������.

public class Ex03_15 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		char ch = ' '; //char�� �⺻���� ' '(����)���� ���ش�.
		
		System.out.printf("���ڸ� �ϳ� �Է� �ϼ���.>");
		
		String input = scanner.nextLine(); //.nextLine : ���� �Է¹��������� ������
		
		ch = input.charAt(0); 
		//String�� charAt(���ι�ȣ)�� ���ڿ��� ���ι�ȣ�� �ִ� �����ϳ��� ��ȯ����.
		
		if('0' <= ch && ch <= '9') {
			//if�� ()�ȿ��� boolean�� ��ȯ�ϴ� ������� ����,true�̸� ��Ͼȿ��� ó���ϰ�
			//false�� ��� ��Ͼȿ� ������ ó���� �ȵ�.
			System.out.printf("�Է��Ͻ� ���ڴ� �����Դϴ�.%n");
		}
		if(('a' <= ch && ch <= 'z') || ('A' <= ch && ch <= 'z')) {
			System.out.printf("�Է��Ͻ� ���ڴ� �������Դϴ�.%n");
		}
	} //main
}