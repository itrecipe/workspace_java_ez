package com.kook.ch11Project;

import java.util.*;

public class Ex11_12 {

	public static void main(String[] args) {
		HashSet setA = new HashSet(); 
		HashSet setB = new HashSet(); 
		HashSet setHab = new HashSet(); //������ 
		HashSet setKyo = new HashSet(); //������
		HashSet setCha = new HashSet(); //������

		setA.add("1");
		setA.add("2");
		setA.add("3");
		setA.add("4");
		setA.add("5");
	
		System.out.println("A : " + setA);

		setB.add("4");
		setB.add("5");
		setB.add("6");
		setB.add("7");
		setB.add("8");
	
		System.out.println("B : " + setB);
		
		/* Iterator(�������̽�) : ��� �÷��� ��ü�� �����ϱ� ���� �������̽�
		   set�� ��Ҹ� �ϳ��� ���ϱ� ���� Iterator(�������̽�)��ü ����
		*/
		Iterator it = setB.iterator();
		while(it.hasNext()) {
			Object tmp = it.next(); //next()�� Object�� ��ȯ
			if(setA.contains(tmp)) { 
				/* contains() : setA�� ����� ���� �ִ��� ������ Ȯ��,
				   ���� ���ԵǴ°��� �ִ��� üũ���ִ� �޼���
				*/
				setKyo.add(tmp);
			}
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			Object tmp = it.next();
			if(!setB.contains(tmp)) {
				setCha.add(tmp);
			}
		}
		
		it = setA.iterator();
		while(it.hasNext()) {
			setHab.add(it.next()); //setA�� ��Ҹ� setHab�� �߰�
		}
		
		it = setB.iterator();
		while(it.hasNext()) {
			setHab.add(it.next()); //setB�� ��Ҹ� setHab�� �߰�
		}
		
		/* ��� ������ Ư�����ڴ� �ѱ� "��"�� �Է��ϰ� ���� ���ó���� �� ���¿��� 
		   ����Ű�� ���� �Ʒ������� �����鼭 ã�ƺ��� �ִ�. ��(������), ��(������)
		*/
		System.out.println("A �� B = " + setKyo);
		System.out.println("A �� B = " + setHab);
		System.out.println("A - B = " + setCha);
	}
}