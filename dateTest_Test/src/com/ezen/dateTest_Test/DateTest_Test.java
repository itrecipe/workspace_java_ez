package com.ezen.dateTest_Test;

import java.time.*;
import java.time.format.*;
import java.util.*;
//10��(����_Test)
public class DateTest_Test {

	public static void main(String[] args) {
		//1
		Date date1 = new Date();
		//2
		Calendar date2 = Calendar.getInstance();
		//3
		LocalDateTime date3 = LocalDateTime.now();
		//4
		System.out.println("1. format�����ð� : " + date3);
		//5
		DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-YYYY HH:mm:ss");
		//6
		String formattedDate = myFormatObj.format(date3);
		//7
		System.out.println("6. �������� : " + formattedDate);
	}

}
/*
1.���� �ð� date1�� DateŬ������ �̿��Ͽ� �ۼ��Ͻÿ�
2.���� �ð� date2�� CalendarŬ������ �̿��Ͽ� �ۼ��Ͻÿ�
3.����ð� date3�� LocalDateTimeŬ������ �̿��Ͽ� �ۼ��Ͻÿ�  
4.date3�� ����Ͻÿ�(��½� ��format�����ð��� ���ڿ� ������ ���)
5.date3�� ��dd-MM-yyyy HH:mm:ss���� ����ȭ�ϴ� ��ü myFormatObj�� ����ÿ�
6.date3�� ����ȭ�� ������ ���ڿ��� ��ȯ�Ͽ� formattedDate������ �����Ͻÿ�
7.formattedDate������ ����Ʈ ���ڿ� ���������� : �� ���ڿ��� �Բ� ����Ʈ �Ͻÿ�
*/