package com.kook.ch08Projcet;
//��.��
public class Ex08_02 {

	public static void main(String[] args) {
		System.out.println(1);
		
		try {
			System.out.println(0/0); 
			//���п��� 0�� 0���� ������(�׷��� ������ܰ� ArithmeticException�߻���!)
			System.out.println(2); //�� �κп��� ���� �߻��� �ش� ���� ���� �Ұ�(catch������ ��)
		}
		catch (ArithmeticException e) {
			//���ܰ� ArithmeticException(������꿹��:����ϴٿ����߻�)�Ͻ� ó��
			//���⼭ ����ó�� �Ǹ� try~catch�� ����
			System.out.println(3);
			e.printStackTrace();
		}
		catch (Exception e) {
			//Exception�� ���� Ŭ������ �ֻ��� Ŭ�����̹Ƿ� ��� ���ܸ� ó��
			//ArithmeticException�� ������ ���� ó��
			System.out.println("ArithmeticException �ƴ� ���� �߻�");
		}
		
		//���ܰ� ���ų� catch�� ����ó�� �� ����Ǵ� ����
		//���ܰ� �߻� ������ catch�� ����ó�� �ȵǸ� �̰����� �ȿ��� ���α׷� ����
		System.out.println("try~catch ���� ��");
	}
}
