package com.kook.ch09Project;

public class Ex09_03 {

	public static void main(String[] args) {
		
		String str1 = new String("abc");
		String str2 = new String("abc");
		//str1, str2�� �ּҰ� �ٸ�
		//StringŬ������ �̹� equals�� ���� ���ϵ��� ������ �ص�
		//hashCode�޼���� ���� ������ ������ �ּҰ� ��ȯ
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.hashCode()); //������ �� �ּ�
		System.out.println(str2.hashCode());
		
		//identityHashCode()�� �ּҰ� �ٸ��� �ٸ� ���� ��ȯ
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		
	}
}
