package com.kook.ch14Project;
//����(���翡 ���� ����-�߰�����), �ڹ�������(����)-556p

/* - ���ٽ��� ����Ϸ��� @FunctionalInterface�� �߻�޼��忡 �����ϴ�
     ���ٽ��� �������̽� ��ü�� �����Ͽ� ���
   
   - ���ٽ� ����ҽÿ��� ���ٽ����� ������ �߻�޼��带 ȣ���ؾ��Ѵ�.
*/
public class Ex14_fuctional {

	public static void main(String[] args) {
		//�͸��� ��ü�� �����Ͽ� ����ҽ�(������ �ڹ� (��)���)
		MyFunction f = new MyFunction() {
			@Override
			public int max(int a, int b) {
				return a > b ? a : b;
			}
	};
	
	int res = f.max(5, 10);
	System.out.println("res : " + res);
	
	System.out.println("���ٽ� ���");
	
	//�͸��� ��ü�� ����� ��� �ش� �������̽��� �߻�޼��带 ���ٽ����� �����Ͽ� ����
	MyFunction f1 = (a,b) -> a > b ? a : b;
	
	int res1 = f1.max(11, 6);
	System.out.println("res1 : " + res1);

	}
}	

@FunctionalInterface
interface MyFunction {
	/*public abstarct (������)*/ int max(int a, int b);
}
