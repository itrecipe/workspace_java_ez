package com.kook.ch08Projcet;

public class Ex08_NonException {
	//����ó�� ������ main������ ���ϰ� throwsgkaus JVM���� �ѱ�
	public static void main(String[] args) throws Exception {
		method1();

	}
	static void method1() throws Exception {
		throw new Exception("���� �߻�!");
	}

}
