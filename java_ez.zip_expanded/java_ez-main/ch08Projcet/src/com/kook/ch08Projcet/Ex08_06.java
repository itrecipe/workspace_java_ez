package com.kook.ch08Projcet;

public class Ex08_06 {

	public static void main(String[] args) {
		
		try {
			//���ܸ� �߻���Ű���� ���� ��ü�� �����ؾ���,���Ƿ� �߻���ų ���� ��ü ����
			Exception e = new Exception("���� �߻� ����");
			//���� ��ü ������ �޽����� �־ ��ü ����
			throw e; //���� ��ü�� catch������� ����,���� ������ ���� catch��� ����
		}
		catch(Exception e) {
			System.out.println("���ܸ޽��� : " + e.getMessage());
			e.printStackTrace();
		}
		System.out.println("try~catch��");
	}

}
