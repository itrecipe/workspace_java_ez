package com.kook.ch09Project;

public class Ex09_11 {

	public static void main(String[] args) {
		//StringBuffer�� java.lang�� �ִ� �⺻ ũ����
		StringBuffer sb = new StringBuffer("abc");
		//�������� �Ķ���ͷ� ���ڿ��� ����ϴ� ������(���ڿ� + 16���� ���� ���� char[]�迭 ����)
		//StringBuffer sb1 = "abc"; //StringBuffer�� ���ͷ��� ��ü ���� �Ұ�
		StringBuffer sb2 = new StringBuffer("abc");
		
		//==�� ������ �ּ� ��
		System.out.println("sb == sb2 ? " + (sb == sb2));
		//StringBuffer�� equals ������ x
		System.out.println("sb.equals(sb2) ? " + sb.equals(sb2));
		
		/* StringBuffer�� ������ String���� ��ȯ�Ͽ� equals�� ��
		   toString()�� �����ǰ� �Ǿ� ���ڿ��� ���
		   ���ڿ��� equals�� �� �� ���� 
		*/
		String s = sb.toString(); //������ �Ǿ� �ְ� ������ String
		String s2 = sb2.toString();
		
		//String�� equals�� �� ��
		System.out.println("s.equals(s2) ? " + s.equals(s2));
	}

}
