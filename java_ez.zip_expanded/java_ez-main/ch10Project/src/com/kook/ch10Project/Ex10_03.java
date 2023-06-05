package com.kook.ch10Project;
//��.��
import java.util.Calendar;

public class Ex10_03 {

	public static void main(String[] args) {
		//Calendar�� �ð� ���� set�޼��� ����, ������ ���� set�޼��带 �̿���
		final int[] TIME_UNIT = {3600, 60, 1};
		final String[] TIME_UNIT_NAME = {"�ð�", "�� ", "�� "};
		
		Calendar time1 = Calendar.getInstance();
		Calendar time2 = Calendar.getInstance();
		
		/* set�޼��忡 ��,��,��,��,��,�ʸ� �Բ� �Ķ���ͷ� ����ϴ� �޼���� ������,
		   �ð�, ��, �ʸ� ó�� ���ִ� �޼���� ����
		*/
		time1.set(Calendar.HOUR_OF_DAY, 10); //24�� ���� �ð��� 10�÷� ����
		time1.set(Calendar.MINUTE, 20); 
		time1.set(Calendar.SECOND, 30);
		
		time2.set(Calendar.HOUR_OF_DAY, 20); //24�� ���� �ð��� 20�÷� ����
		time2.set(Calendar.MINUTE, 30);
		time2.set(Calendar.SECOND, 10);
		
		//�� �ð� ����
		long diff = Math.abs((time2.getTimeInMillis() - time1.getTimeInMillis()) / 1000); //�ʷ� ����
		//System.currenTimeMillis();�� getTimeInMillis()�� ���� posix��ȯ(����ð��� ó��)
		
		String tmp = "";
		for(int i = 0; i < TIME_UNIT.length; i++) {
			tmp += diff / TIME_UNIT[i] + TIME_UNIT_NAME[i];
			//diff�� i�� 0�Ͻ� 3600���� diff�� ������ �ð�(����)�� ������ �ڿ� �ð��� ����
			diff %= TIME_UNIT[i]; //3600���� ���� ������(�� �ð��� ���Ե��� ���� ��)
		}
		System.out.println("�ú��ʷ� ��ȯ�ϸ� : " + tmp + " �̴�.");
	}
}
