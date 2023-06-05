package com.kook.ch10Project;
//��.��
import java.util.*;

public class Ex10_05 {

	public static void main(String[] args) {
		
		if(args.length !=2) {
			System.out.println("�Է¹� : 2022 11");
			return;
		}
		
		int year = Integer.parseInt(args[0]);
		int month = Integer.parseInt(args[1]);
		
		int START_DAY_OF_WEEK = 0;
		int END_DAY = 0;
		
		Calendar sDay = Calendar.getInstance(); //����ð��� ��Ÿ���� ��ü
		Calendar eDay = Calendar.getInstance(); //����ð��� ��Ÿ���� ��ü
		
		//args�� �Է� ���� ���� 1�Ϸ� sDay�� ����
		sDay.set(year, month-1, 1);
		//eDay�� �� ������ 1�Ϸ� ����
		eDay.set(year, month, 1);
		
		//������ ������ �˾Ƴ��� ���� ������ 1�Ϸ� �� eDay���� 1�� ��
		eDay.add(Calendar.DATE, -1); //eDay��ü�� ���� �����ڰ� ������ ��ü�� ����
		//eDay Camendar��ü�� ���� ��¥ ���� ������(���� ��������)
		END_DAY = eDay.get(Calendar.DATE);
		//END_DAY = sDay.getActualMaximum(Calendar.DATE);�� ����ص� ��
		
		//ù��° ������ ���� �������� �˾Ƴ���.
		START_DAY_OF_WEEK = sDay.get(Calendar.DAY_OF_WEEK);
		
		//DAY_OF_WEEK�� 1(�Ͽ���)���� 7, sDay�� �Ϸ¹��� ���� 1���̹Ƿ� 1���� ���ϰ� ��ȯ
		System.out.println("     " + args[0] + "�� " + args[1] + "��");
		
		//1���� ��� �����̳Ŀ� ���� ���� ���� ���� ����
		//i�� ��¥, n�� ����
		for(int  i = 1, n = START_DAY_OF_WEEK; i <= END_DAY; i++, n++) {
			if(i==1) {
				System.out.println("  SU  MO  TU  WE  TH  FR  SA");
				//1���� ���� �������� �������� ä��
				for(int j = 1; j < START_DAY_OF_WEEK; j++) {
					System.out.print("        ");
				}
			}
			System.out.print((i < 10) ? "  " + i : " " + i);
			//���� �ڸ����� ���� ���� �߰�����(10�� �̻��� 2�ڸ� �̹Ƿ� ������ �ϳ� ����)
			if(n%7==0) {
				System.out.println(); //�ٹٲٱ�
			}
		}
		
		//Calendar��ü�� Date�� ��ȯ
		Calendar cal = Calendar.getInstance();
		Date d = new Date(cal.getTimeInMillis());
		
		//Date��ü�� Calendar ��ü�� ��ȯ
		Date d1 = new Date();
		Calendar call = Calendar.getInstance();
		call.setTime(d1);
		
	}
}