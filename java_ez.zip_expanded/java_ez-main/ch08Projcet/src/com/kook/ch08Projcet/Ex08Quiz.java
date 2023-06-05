package com.kook.ch08Projcet;

public class Ex08Quiz {

	public static void main(String[] args) {
		//3��
		try {

			//1��
			int[] myNumber = {1, 2, 3, 4, 5};
			
			//2��
			System.out.println(myNumber[10]); //RuntimeException�߻�(unchecked)
		}
		catch (Exception e) {
			e.printStackTrace();
			System.out.println("���� : " + e.getMessage());
		}
		
		finally {
			System.out.println("try~catch�� ����");
		}
		
		checkAge(17);
	}
	//5��
	static void checkAge(int age) {
		if(age < 18) {
			try {				
				ArithmeticException ae = new ArithmeticException("���ܹ߻� ae");
				throw ae;
			
			} catch (ArithmeticException e) { //Ȯ���� �˰��ִ� ���ܴ� ���⼭ ó����
				e.printStackTrace();
				System.out.println("ae���� : " + e.getMessage());
			}
			catch (Exception e) { //�ָ� ��ȣ�� ��� ����ó���� ���⼭ ó����
				e.printStackTrace();
				System.out.println("ae���� : " + e.getMessage());
			}
		}
		else {
			//6��
			System.out.println("18�� �̻��̹Ƿ� ���!");
		}
	}
}

/* 1.int�迭 myNumber�� ��Ұ� 1,2,3,4,5�� ������ ���ͷ��� ����
   2.myNumber�� ���ι�ȣ 10�� ��� ���
   3.���ܰ� �߻��� ����ó���� �ϴµ� printStackTrace();�� ���ܳ���(���ܳ������ �޼��� ���)�� ���
   4.���ܹ߻��ó� �̹߻��ÿ� �������� ����� ������ try~catch�� ����� ���
   5.main�޼���ȿ��� �̸����� �ٷ� ȣ���ϴ� �޼��� checkAge�� ����Ÿ���� void,�Ķ���ʹ� int age��
   �ϸ� ���� ������ age�� 18 �̸��̸� ArithmeticException���ܸ� ���ܳ��� "���ܹ߻�"���� �Ͽ� �����Ͽ�
   ���ܸ� �߻���Ű�� ���� ó���� ����, ����ó�� ������ 3�� ó�� ����
   6.age�� 18�̻��̸� "18�� �̻��̹Ƿ� ���" ���
*/