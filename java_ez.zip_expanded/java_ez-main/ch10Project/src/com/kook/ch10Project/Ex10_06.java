package com.kook.ch10Project;
//��.��
import java.text.DecimalFormat;

public class Ex10_06 {

	public static void main(String[] args) {
		double number = 1234567.89;
		
		String[] pattern = { //���ϱ�ȣ ���� �迭(������ ���ϱ�ȣ�� �̿��ؼ� ���ϴ� ������ �ۼ�)
			"0", //10������ ǥ��(�Ҽ��� x, �ڸ��� ���� x)
			"#", //10������ ǥ��(�Ҽ��� x, �ڸ��� ���� x)
			"0.0", //�Ҽ��� 1�ڸ� ǥ��
			"#.#", //�Ҽ��� 1�ڸ� ǥ��
			"#,###.##" //3�ڸ� �߶� ,���̰� �Ҽ��� ���ڸ� ǥ��
		
		};
		
		for(int i = 0; i < pattern.length; i++) {
			DecimalFormat df = new DecimalFormat(pattern[i]);
			//DecimalFormat�� ���ڸ� ����ȭ�켭 ǥ�����ִ� Ŭ����
			//format�޼���� ���ڰ��� ������ ���� �������� ��ȯ�� ���ڿ��� ��ȯ
			System.out.println("���� �� : " + pattern[i] + " , ��ȯ �� : " + df.format(number));
		}
	}

}