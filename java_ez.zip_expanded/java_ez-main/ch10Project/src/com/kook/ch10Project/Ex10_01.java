package com.kook.ch10Project;

import java.util.*;

public class Ex10_01 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		/* CalendarŬ������ �߻� Ŭ�����̸� DateŬ���� ���Ŀ� ����
		   ������ Calendar��ü�� ���� �ð��� ��Ÿ���� ��ü
		   ���� �ð��� �� ��������� ��,��,��,�ð� ���� get(������Ҹ� ��Ÿ���� �����)
		   �ν��Ͻ� = ��ü ��� ����
		*/
		
		System.out.println("�� ���� �⵵ : " + today.get(Calendar.YEAR));
		//public static final Calendar.YEAR = 1;�� ���� ��
		System.out.println("��(0~11, 0:1��) : " + today.get(Calendar.MONTH));
		//���� 0������ 11������ ����
		System.out.println("�� ���� �� ° �� : " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("�� ���� �� ° �� : " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("�� ���� �� �� : " + today.get(Calendar.DATE));
		System.out.println("�� ���� �� �� : " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("�� ���� �� �� : " + today.get(Calendar.DAY_OF_YEAR));
		
		System.out.println("����(1~7, 1:�Ͽ���) : " + today.get(Calendar.DAY_OF_WEEK));
		// 1:�Ͽ���, 2:������, ... 7:�����
		System.out.println("�� ���� �� ° ���� : " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		//���° �ָ� ��ȯ
		System.out.println("����_����(0:����, 1:����) : " + today.get(Calendar.AM_PM));
		System.out.println("�ð�(0~11) : " + today.get(Calendar.HOUR));
		System.out.println("�ð�(0~23) 24�ð� ���� : " + today.get(Calendar.HOUR_OF_DAY));
		System.out.println("��(0~59) : " + today.get(Calendar.MINUTE));
		System.out.println("��(0~59) : " + today.get(Calendar.SECOND));
		System.out.println("1000���� 1��(0~999) : " + today.get(Calendar.MILLISECOND));
		System.out.println("Timezone(~12~+12) : " + today.get(Calendar.ZONE_OFFSET)/(60*60*1000));	
		/* TimeZone�� ����ǥ�ؽð�(UTC)�� �������� ���� �ð��� ��ð� �ʴ��� �ƴ� �������� ��Ÿ��
		   UTC���� ���̰� �и�������� ���ͼ� �ʷ� ȯ��� 1000���� ������ �ʴ� ������ ȯ�� 60���� ������
		   ���� �ð����� ȯ���ϱ� ���� 60���� ����
		*/
		System.out.println("�� ���� ������ �� : " + today.getActualMaximum(Calendar.DATE)); //�� ���� ������ ���� ã�´�.
	}
}
