package com.kook.ch09Project;

public class Ex09_06 {

	public static void main(String[] args) {
		String str1 = "abc";
		/* String��ü�� ���ͷ��� ����� ���ͷ� ���� Ŭ�����޸𸮿� ����Ǿ�
		   ���ͷ� ���� ���ɶ����� ���Ͽ� �������� ������ ���� ���� ���(�ּҰ� ����) 
		*/
		String str2 = "abc";
		System.out.println("String str1 = \"abc\";");
		/* "String str1 = "abc";" �ε� ""�ȿ� �ٸ� ""�� �Ѵ� ���� ���� �Ǿ�
		    escape sequence���� \�� �տ� �ٿ��� ����� */
		System.out.println("String str2 = \"abc\";");
		
		System.out.println("str1 == str2 ? " + (str1 == str2));
		// ==�����ڴ� �ּ� ��
		System.out.println("str1.equals(str2) ? " + str1.equals(str2));
		//String�� equals�� �ڹٿ��� �̹� ���� ���ϵ��� �����ǵ�
		System.out.println();
		
		String str3 = new String("abc");
		String str4 = new String("abc");
		//new�����ڷ� ��ü�� ����� ���ο� ������ġ�� ã�� ����ϹǷ� �ּҰ� ������ �ٸ� 
		
		System.out.println("String str3 = new String(\"abc\");");
		System.out.println("String str4 = new String(\"abc\");");
		
		System.out.println("str3 == str4 ? " + (str3 == str4));
		// ==�����ڴ� �ּ� ��
		System.out.println("str3.equals(str4) ? " + str3.equals(str4));
		//String�� ���� ���ϵ��� �̸� �����ǵ� equals ���
	}
}
