package com.kook.ch14Project;
//����(���翡 ���� ����-�߰�����), �ڹ�������(����)-555p
public class Ex14_anony {

	public static void main(String[] args) {
		
		//�͸��� ��ü obj�� ����
		Object obj = new Object() {
			int max(int a, int b) {
				return a > b ? a : b;
			}
		};
		
		/* obj.max(5,3); ObjectŬ�������� max�޼��尡 ��� ����
		   ���ٽ����� �͸� ��ü�� �޼��带 �����ϱ� ���ؼ��� �Ʒ� �ڵ�ó�� �ۼ��Ѵ�.
		   �׷���, ���ٽ��� �͸��� ��ü�� �����Ϸ��� ���ٽĸ� ������ �ָ� �ǳ�,
		   (��, �͸��� ��ü�� �߻�޼��尡 �ϳ��� �ִ� �������̽� ��ü���� �Ѵ�.)
		   �߻�޼��尡 �ϳ��� �ִ� �������̽��� @FunctionalInterface
		   Objetct�� �߻�޼��� �ϳ��� �ִ� �������̽��� �ƴϹǷ� ������ �߻��Ѵ�.
		   
		   ex) �Ϻη� ������ �߻� �ǵ��� �ۼ��� �����ڵ�
			obj = (int a, int b) -> {
				return a > b ? a : b;
		 	}
		
		*/
	}

}
