package com.kook.ch06Project;

public class Ex06_04 {
	
	//���� ���� ����-��������¦�ٸ�
	public static void main(String[] args) {
		//MyMathŬ������ add,subtract,multiply,divide �޼��带 ȣ���Ͽ� ���
		//�޼���� ���� �ν��Ͻ� �޼����̹Ƿ� ��ü�� �����ؼ� ���
		MyMath mm = new MyMath();
		long result1 = mm.add(15L , 20L); //�޼��� ȣ��, �޼����� �Ķ���Ͱ� long������ int������ �ڵ� ����ȯ��
		long result2 = mm.subtract(5L , 3L); 
		long result3 = mm.multiuply(5L , 3L);
		double result4 = mm.divide(5L , 3L); //�Ķ���� double���̹Ƿ� �ڵ����� float������ �ڵ� ����ȯ
		//��ȯ���� ���� ������ �����Ͽ� Ȱ����.
		
		//�ν��Ͻ� ������� name�� ����
		mm.name = "kook";
		// Ŭ������ ������� price�� ����
		MyMath.price = 100;
		
		//Ŭ������ �޼��� ȣ��
		MyMath.smeth();
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		System.out.println("result4 : " + result4);
		System.out.println("name : " + mm.name);
		System.out.println("price : " + MyMath.price);
		
	}
}

class MyMath{
	String name; //�ν��Ͻ��� �������
	static int price; //Ŭ����(static)�� �������
	
	long add(long a, long b) {
		/*���(�����) long add(nong a, long b)
		 long�� ��ȯ��������(����Ÿ��) add�� �޼����, ()�Ķ���ͺ�, 
		 ���ú��� ��������� �Ķ���ͺ��� 
		 �Ķ���� ���� a,b�� ��Ͼȿ��� ���� ������ ����. 
		 a,b�� �����ϸ� �ش��ڵ� �ȿ����� ���� , ���޵� ȣ����� ���ڰ��� ���� �ȵ�.
		 */
		long result = a + b;
		return result;
	}
	
	long subtract(long a, long b) {
		long result = a - b;
		return result;
	};
	
	long multiuply(long a, long b) {
		long result = a * b;
		return result;
	};
	
	double divide(double a, double b) {
		double result = a / b;
		return result;
	}
	
	static void smeth() {
		System.out.println("smeth");
	}
}
