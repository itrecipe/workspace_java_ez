package com.kook.ch10Project;
//��.��
import java.util.Calendar;

public class Ex10_02 {

	public static void main(String[] args) {
		final String[] DAY_OF_WEEK = {"","��","��","ȭ","��","��","��","��"};
		//���ϰ��� ���ι�ȣ�� ���(���ϰ��� 1~7���� ��ȯ (1�� �Ͽ���))
		Calendar date1 = Calendar.getInstance(); //��ü���������� ����ð�
		Calendar date2 = Calendar.getInstance(); 
		
		//Calendar��ü�� �� ������Ҹ� �����ϱ� ���� set�޼��� ���
		date1.set(2019, 3, 29); //��,��,���� �����ϴ� set�޼���, ���� 0���� �������� ������ ���� ���� ����
		/* void java.util.Calendar.set, void set(int year, int month, intdate)
		   date.set(2019, Calendar.APRIL, 29)
		*/
		System.out.println("date1�� " + toString(date1) + " " + 
				DAY_OF_WEEK[date1.get(Calendar.DAY_OF_WEEK)] +" �����̰�, ");
		/* toString(date1)�� Object�� toString()�� �ƴ�
		   Calendar�� toString()�� �������̵�� �Ǿ� ������, Calendar�� ��� ��������� ǥ��
		   �ʿ��� Calendar�� ��Ҹ� ���ڿ��� ����ϵ��� �޼��带 toString(Calendar cal)�� ����
		   ������ ������ 2019.4.29�� ������ �� �迭�� ���ι�ȣ�� Ȱ���Ͽ� ���� ���
		*/
		System.out.println("����(date2)�� " + toString(date2) + " "
				+ DAY_OF_WEEK[date2.get(Calendar.DAY_OF_WEEK)] + " �����Դϴ�.");
		
		/* �� �ð��� ���̴� �и�������� ��ȯ�ϴ� getTimeInMillis()�� ����Ͽ� ���Ѵ�.
		   getTimeInMillis()�� ���ϰ��� posix(unix)Ÿ���� 1970.1.1 0�� �������� ����� �ð���
		   �и�������� ��ȯ
		*/
		long diff = (date2.getTimeInMillis()-date1.getTimeInMillis()) / 1000;
		//�� �ð��� ���� �ʷ� ��ȯ
		System.out.println("�׳�(date1)���� ����(date2)���� " + diff + " �ʰ� �������ϴ�.");
		System.out.println("��(day)�� ����ϸ� " + diff / (24*60*60) + " �� �Դϴ�.");
		// 1�� = 24 * 60 * 60
	}	
		static String toString(Calendar date) {
			String result = date.get(Calendar.YEAR) + "��"
					+ (date.get(Calendar.MONTH) + 1 ) + "��"
					+ (date.get(Calendar.DATE) + "��");
			return result;
		
	}
}