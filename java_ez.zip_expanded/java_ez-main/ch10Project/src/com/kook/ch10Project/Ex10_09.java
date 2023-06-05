package com.kook.ch10Project;
//��.��
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ex10_09 {

	public static void main(String[] args) {
		// SimpleDateFormat�� format�� parse�޼��� ���
		// format�� date��ü�� ���� ������ ���ڿ��� ��ȯ, parse ���ڿ��� ���� ������ Date������ ǥ��
		DateFormat df1 = new SimpleDateFormat("yyyy��MM��dd��");
		//DateFormat�� �߻�Ŭ������ SimpleDateFormat�� �θ� Ŭ����
		DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");
		
		Date d = null;
		
		try {
			d = df1.parse("2019�� 11�� 23��");
			//d = df1.parse("2019/11�� 23��"); //������ �ٸ��Ƿ� ����
			//���� ������ ���ڿ� ���� Date��ü�� ��ȯ
			//���Ͽ��� ������ ó��
			//���ϰ� �ٸ� ���ڿ��� �ָ� ���� �߻�
			System.out.println(d); //���� Date������ ���
			
			//���Ͽ��� ������ ó��
			//���ϰ� �ٸ� ���ڿ��� �ָ� ���� �߻�
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		String ds = df2.format(d); //���� ���� ���ڿ��� ��ȯ
		System.out.println(ds);
		
	}
}