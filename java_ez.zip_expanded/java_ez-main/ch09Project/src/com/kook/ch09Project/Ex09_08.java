package com.kook.ch09Project;
//��.��
public class Ex09_08 {

	public static void main(String[] args) {
		//�迭�� ���̰� 0�� �迭
		char[] cArr = new char[0]; //char[] = {};�� ������

		String s = new String(cArr);
		//String������ �� char[]�� ���ڷ� ����ϴ� �޼��� ���
		String s1 = new String("");
		String s2 = "";
		
		System.out.println("cArr.length = " + cArr.length);
		System.out.println("@@@" + s + "@@@");
		
		System.out.println("s�� s1�� : " + s.equals(s1));
		System.out.println("s1�� s2�� : " + s1.equals(s2));
		
		//���ڿ��� ���� ���� �ʱ�ȭ�� null���ٴ� ���ͷ��� ""�� ����ϴ°��� ������
		//char�� ���� ���� �ʱ�ȭ�� null�� \u0000���� ' '(����)�� ����ϴ°��� ������
	}
}

/* ���� �޼ҵ� �����̳� Ÿ�� �� ������ �� �𸦶���
   ������� String s1 = new String(""); �ش� ���忡 String �κп�
   Ŀ���� ���ٴ�� shift + F2Ű ������ �ش� ���� API ���� �������� �̵���
*/