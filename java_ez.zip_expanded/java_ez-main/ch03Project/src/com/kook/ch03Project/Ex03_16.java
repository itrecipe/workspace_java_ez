package com.kook.ch03Project;

public class Ex03_16 {

	public static void main(String[] args) {
		boolean b = true;
		char ch = 'C';
		
		System.out.printf("b=%b%n", b);
		System.out.printf("!b=%b%n", !b); // !�� ������ �����ڷμ� boolean���� �ݴ�� ��ȯ
		System.out.printf("!!b=%b%n", !!b);
		System.out.printf("!!!=%b%n", !!!b);
		System.out.println();

		System.out.printf("ch=%c%n", ch);
		//char�� format�����ڴ� %c
		System.out.printf("ch < 'a' || ch > 'z'=%b%n", ch < 'a' || ch > 'z');
		// ||�̹Ƿ� �ϳ��� true�̸� true
		System.out.printf("!('a' <=ch && ch<='z')=%b%n", !('a' <= ch && ch<='z'));
		//������ ������ !�� ����� �ݴ��
		System.out.printf("  'a' <=ch && ch<='z' = %b%n", 'a'<=ch && ch<='z');
	}
}