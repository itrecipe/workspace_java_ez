package com.kook.ch10Project;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Ex10_10 {

	public static void main(String[] args) {
		String pattern = "yyyy/MM/dd";
		DateFormat df = new SimpleDateFormat(pattern);
		
		Scanner scanner = new Scanner(System.in);
		
		Date inDate = null;
		
		System.out.println("��¥�� " + pattern + "�� ���·� �Է�!"
				+ "(�Է¿� : 2022/11/03)");
		
		//scanner.hasNextLine()�� ��ó�� ���� �����ÿ� �����
		while(scanner.hasNextLine()) {
			try {
				inDate = df.parse(scanner.nextLine()); //�Է´�� 
				/* ���� ���� ������ �ƴϸ� Date��ü�� ��ȯ����(���� �߻�)
				   ���ܰ� �߻��ϸ� catch������ ���� �ƴϸ� break; -> ������ Ż��!
				  .parse() ���� ���ڿ��� ������ ��ü�� ��ȯ
				*/
				break;
			}
			catch (Exception e) {
				//e.printStackTrace();
				System.out.println("��¥�� " + pattern + "�� ���·� �ٽ� �Է�!"
						+ "(�Է¿� : 2019/12/31)");
			}
		}

		Calendar cal = Calendar.getInstance(); //���� �ð� ��ü
		
		cal.setTime(inDate); //�Է��� ��¥�� ��ü
		
		Date d = new Date(cal.getTimeInMillis());
		
		Calendar today = Calendar.getInstance(); //���� �ð� ��ü
		
		long day = (today.getTimeInMillis() - cal.getTimeInMillis()) / (1000 * 60 * 60);
		
		System.out.println("�Է°� ������ �ð����� : " + day + " �ð� ���̳�");
	}

}
