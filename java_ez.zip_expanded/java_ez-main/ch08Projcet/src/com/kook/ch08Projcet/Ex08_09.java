package com.kook.ch08Projcet;
//��.��
public class Ex08_09 {
	//�޼ҵ忡 throws�� ����ϸ� ��ó�� try~catchó���� �޼ҵ���� ��� ����ó���� ����
	public static void main(String[] args) {
		
		try {
			method1(); //�޼ҵ������ ȣ��� static�̾�߸� ȣ�Ⱑ��
		}
		catch (Exception e) {
			System.out.println("main�޼������ ����ó�� �����Ͽ� main���� ó��");
		}

	}
	static void method1() throws Exception {
	//�޼ҵ忡 throws ����Ŭ������ �ϸ� ����ó���� �ڽ� �޼��忡�� ���ϰ� �ڽ��� ȣ���� �޼���� �����Ѵ�.
		method2();
	}
	static void method2() throws Exception {
		throw new Exception();
	}
}
