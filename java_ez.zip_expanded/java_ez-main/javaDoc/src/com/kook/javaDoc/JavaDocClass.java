package com.kook.javaDoc;

/**
 * 
 * @author Kook
 * Date : 2023-01-25
 *
 */

public class JavaDocClass {
	/**
	 * 
	 * @param args
	 * main method
	 */
	public static void main(String[] args) {
		myMethod();
	}
	
	/**
	 * �޼��� ����
	 * this method is made by kook
	 * test method
	 */
	static void myMethod() {
		System.out.println("javadoc test");
	}
}

/* javadoc ���� ���� �� ����� ������Ʈ ��Ŭ�� exportŬ�� javadocŬ��
   ������ ������Ʈ Ȯ���Ŀ� �����Ұ� �� ������ next �����Ұ� ���ų� �ڵ����� �Ǿ������� �ٷ� finish
   ��ư ������ �����ϸ� �ȴ�. 
   
   (������ �������� pakege�� �����ؾ� �����а͵���(������,public,default�� �޼ҵ��� ��...)
   �� ���̸�, private�� �Ⱥ��̴°� ������ ���� ������ �ؼ� �������� ���δٴ°� ���� 
   �ش� �κ��� ���� �˾ƺ��� �����Ұ�!)
   
   �ѱ� ������ ������ �־����� ���� ������� JDK1.5 ~ 1.7 ������ ������Ʈ�� �� �Ǿ� �־� �ȱ����°� ����
*/
