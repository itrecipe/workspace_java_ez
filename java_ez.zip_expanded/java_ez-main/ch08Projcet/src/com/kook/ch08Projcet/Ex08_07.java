package com.kook.ch08Projcet;
//��.��
public class Ex08_07 {

	public static void main(String[] args) {
		
		//throw new Exception();
		//Exception���ܴ� ������ ����(cheaked����)�� �����Ͽ��� �߻�
		//������ ������ ��������� ���� ó��
		try {
			throw new Exception();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}
