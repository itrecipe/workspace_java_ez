package com.kook.ch06Project;

public class Ex06_08 {

	public static void main(String[] args) {
		Data3 d = new Data3(); //�ּҰ��� ������ ������ ����, new�����ڷ� ��ü �ν��Ͻ�ȭ
		d.x = 10;
		Data3 d2 = copy(d); //return���� tmp��
		
		System.out.println("d.x : " + d.x);
		System.out.println("d2.x : " + d2.x);
	}
	
	static Data3 copy(Data3 d) {
		//static�޼���, Ex06_08Ŭ������ ����޼���, ����Ÿ���� Data3��ü, �Ķ���͵� Data3��ü
		Data3 tmp = new Data3();
		//tmp.x = 0;
		tmp.x = d.x;
	
		return tmp;
	}
}

class Data3 { 
	int x;
}