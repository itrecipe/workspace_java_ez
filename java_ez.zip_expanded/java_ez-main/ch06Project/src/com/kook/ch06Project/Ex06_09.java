package com.kook.ch06Project;

public class Ex06_09 {

	public static void main(String[] args) {
		//static �޼��� ȣ��
		System.out.println(MyMath2.add(200, 200L));
		System.out.println(MyMath2.subtract(200, 200L));
		System.out.println(MyMath2.multiply(200, 200L));
		System.out.println(MyMath2.divide(200, 200L));
	
		//�ν��Ͻ� �޼��� ȣ��
		MyMath2 mm = new MyMath2();
		mm.a = 200L;
		mm.b = 200L;
	}
}

class MyMath2 {
	long a, b; //�ν��Ͻ� ����(�۷ι� ������ Ŭ���� �� ��𼭳� ��밡��)
	
	long add() { //����Ÿ���� long��, �Ķ����x
		//�ν��Ͻ� �޼���� �ν��Ͻ� ��� or static��� Ŭ������ ��� ����
		return a + b; //a, b�� �ν��Ͻ� ���� ����ϹǷ� �ν��Ͻ� �޼���
	}

	long subtract() { 
		
		return a - b; //a, b�� �ν��Ͻ� ���� ����ϹǷ� �ν��Ͻ� �޼���
	}
	
	long multiply() { 
		
		return a * b; //a, b�� �ν��Ͻ� ���� ����ϹǷ� �ν��Ͻ� �޼���
	}

	long divide() { 
		
		return a / b; //a, b�� �ν��Ͻ� ���� ����ϹǷ� �ν��Ͻ� �޼���
	}
	
	//�ν��Ͻ� ������ �޼��带 ȣ������ �ʴ� ��쿣 static���� ����
	static long add(long a, long b) {
		return a + b; //�ν��Ͻ� ���� a,b�� �ƴ� ���޹��� ���� ��
		
	}
	static long subtract(long a, long b) {
		return a - b; //�ν��Ͻ� ���� a,b�� �ƴ� ���޹��� ���� ��
		
	}
	static long multiply(long a, long b) {
		return a * b; //�ν��Ͻ� ���� a,b�� �ƴ� ���޹��� ���� ��
		
	}
	static double divide(long a, long b) {
		return a / (double)b; //�ν��Ͻ� ���� a,b�� �ƴ� ���޹��� ���� ��
		
	}
}