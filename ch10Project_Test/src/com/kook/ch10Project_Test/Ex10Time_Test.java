package com.kook.ch10Project_Test;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ex10Time_Test {
	//���翡 ���� ���� - ���� �߰����� ����
	public static void main(String[] args) {
		//�ڹ� 1.8���� �߰��� time��Ű���� Ŭ������
		LocalDate myobj = LocalDate.now(); //���� ��¥(��,��,��)�� ��Ÿ���� ��ü
		System.out.println(myobj); //2023-01-16
		//LocalDateŬ������ Object���� ����� toString()�� ������(�������̵�)��
		//ex)System.out.println(myobj.toString());
		
		LocalTime myobj1 = LocalTime.now(); //���� �ð��� ��Ÿ���� ��ü
		System.out.println(myobj1); //21:49:53.926021400(10����� 1�ʱ��� ǥ��)
		//LocalTimeŬ������ Object���� ����� toString()�� ������ ��
		//ex)System.out.println(myobj1.toString());
		
		LocalDateTime myobj2 = LocalDateTime.now(); //���� ��¥ + �ð��� ǥ���ϴ� ��ü
		System.out.println(myobj2); 
		//2023-01-16T21:54:23.247806800 ��¥�� �ð� ���̿� T�� ÷����
		
		//myDateObj ��ü ����
		LocalDateTime myDateObj = LocalDateTime.now();
		System.out.println("Before Formatting : " + myDateObj);
		
		DateTimeFormatter myformatObj = DateTimeFormatter.ofPattern("dd-mm-yyyy HH:mm:ss");
		
		//����ȭ ��ü�� �̿��� ��¥�ð� ��ü�� ��ȯ
		//SimpleDateFormat���� �޸� ��¥��ü.format(����ȯ��ü)
		String formattedDate = myDateObj.format(myformatObj);
		System.out.println("After formatting : " + formattedDate);
	}
}