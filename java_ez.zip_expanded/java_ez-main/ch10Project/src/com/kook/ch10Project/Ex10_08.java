package com.kook.ch10Project;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex10_08 {

	public static void main(String[] args) {
		Date today = new Date();
		
		Calendar cal = Calendar.getInstance();
		//Date date = new Date(cal.getTimeInMillis());
		
		System.out.println("today��ü : " + today);
		//Fri Jan 13 12:37:16 KST 2023
		
		SimpleDateFormat sdf1, sdf2, sdf3, sdf4;
		SimpleDateFormat sdf5, sdf6, sdf7, sdf8, sdf9;
		
		sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		sdf2 = new SimpleDateFormat("''yy�� MMM dd�� E����");
		//E�� ���� ǥ��, '�� Ư�����ھտ� �ٿ��� Ư�����ڸ� �Ϲ� ���ڷ� ó��
		sdf3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		//H�� �ð� ǥ�÷� 0~23, h�� 1~12, ǥ�� S�� �и�������
		sdf4 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss a");
		//a�� ����,���� ǥ�� h�� 1~12�� �ð� ǥ��
		sdf5 = new SimpleDateFormat("������ �� ���� D��° ��");
		//D�� ���� ���° �� ǥ��
		sdf6 = new SimpleDateFormat("������ �� ���� d��° ��");
		//d�� ���� ���° �� ǥ��		
		sdf7 = new SimpleDateFormat("������ �� ���� w��° ��");
		//w�� ���� ���° �� ǥ��
		sdf8 = new SimpleDateFormat("������ �� ���� W��° ��");
		//W�� ���� ���° �� ǥ��
		sdf9 = new SimpleDateFormat("������ �� ���� F��° ��");
		//F�� ���� ���° ���� ǥ��
		
		System.out.println(sdf1.format(today)); //format(Date d)
		System.out.println(sdf2.format(today));
		System.out.println(sdf3.format(today));
		System.out.println(sdf4.format(today));
		System.out.println(sdf5.format(today));
		System.out.println(sdf6.format(today));
		System.out.println(sdf7.format(today));
		System.out.println(sdf8.format(today));
		System.out.println(sdf9.format(today));
		
	}
}