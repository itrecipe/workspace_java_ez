package com.kook.ch06Project;
//���� ���� ����(������ ����)
public class Ex06_14 {
	/* �⺻���� ���ϸ��� �ε�
	 * �ʱ�ȭ�� ����� �ι�° �ε�
	 * static�� Ŭ���� �ε��� static ��� �ε�
	 * �ν��Ͻ� ����� ������ ����� ���� �ε��� ������ �ʱ�ȭ
	 */
	
	int x;
	static int y;
	int k = 5;
	static int j = 10;
	
	//Ŭ������ ���
	static {
		System.out.println(y);
		System.out.println("static{}");
	}
	
	//�ν��Ͻ��� ���
	{
		System.out.println("{}");
	}
	
	//������
	public Ex06_14() { //Ŭ������ public�̸� �����ڵ� public���� �ۼ�
		System.out.println("������");
	}
	
	public static void main(String[] args) {
		System.out.println("Ex6_14 bt = new Ex6_14();");
		
		Ex06_14 bt = new Ex06_14(); //������ ����
		//�����ڰ� ����ɶ����� �ν��Ͻ��� ����� ���� ����ǰ� �� ���� �����ڰ� ����ȴ�.
		
		System.out.println("Ex6_14 bt = new Ex6_14();");
		Ex06_14 bt1 = new Ex06_14(); //������ ����
	}
}