package com.kook.ch06Projcet_Test;

//���� ����!
public class Ex06Quiz_Test {
	//1. �ν��Ͻ� ������ ���ڿ� ���� string
	String string;
	
	//2. Ŭ������ ���� int�� ���� number
	static int number;
	
	//11. static��� ����� ��Ͼ��� ���๮�� static���
	static {
	System.out.println();	
	}
	
	//12. �ν��Ͻ� ��� ����� ��Ͼ��� ���๮�� instance���
	
	public static void main(String[] args) {
	
		
	//4. 3���� �޼��� ȣ��
		myMethod();
		//6. 5���� �޼��带 ȣ���ϴµ� ���ڸ� kook���� �ؼ� ȣ��
		//8. �ν��Ͻ��޼��� instanceMethod�� ȣ���ϴµ� ���ڷ� "ȫ�浿"�� ���
		//9. �ν��Ͻ����� string�� abcde�� �ʱ�ȭ�ϰ� ���
			
		
	//10. Ŭ���� ���� number�� 30���� �ʱ�ȭ �ϰ� ���
		number = 30;
		System.out.println(number);
	}
	
	/* 3. Ŭ������ �޼��� myMethod�� ����Ÿ���� ���� �Ķ���͵� ������ ���๮��
	     System.out.println("I just got executed!"); */
	static void myMethod() {
		System.out.println("I just got executed!");
	}
	
	/* 5. 3���� myMethod�� �����ε��� �޼���� ����µ� �Ķ���͸� String name���� �ϰ�
	      ���๮�� name�� ��� */
	static void myMethod(String name) {
		System.out.println(name);
	}
	
	/* 7. �ν��Ͻ� �޼����� �̸� instanceMethod�̰� ����Ÿ���� ���ڿ��̸�
		 �Ķ���ʹ� ���ڿ��� �ϳ��� �Ǿ� �ְ� �Ķ���ͷ� ���� ���� ��� �ϰ� ���ϰ��� khs�� ���� */
	public String instanceMethod(String name) {
		return name;
	}
}