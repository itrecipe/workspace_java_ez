package com.kook.ch11Project;
//��.��
import java.util.*;

public class Ex11_14 {

	public static void main(String[] args) {
		// TreeSet �޼���
		TreeSet set = new TreeSet();

		String from = "b";
		String to = "d";
		
		set.add("car");
		set.add("abc");
		set.add("alien");
		set.add("bat");
		set.add("Car");
		set.add("disc");
		set.add("dance");
		set.add("dZZZZ");
		set.add("dzzzz");
		set.add("elephant");
		set.add("fan");
		set.add("flower");
		
		System.out.println("set�� ���Ҽ� : " + set.size());
		System.out.println(set); //Set�� toStrong()�� ������(�������̵�) ��
		System.out.println("���� �˻� : from : " + from + " to " + to);
		SortedSet ss = set.subSet(from, to);
		/* public SortedSet<E> subSet(E fromElement, E toElement)
		   subSet�޼���� SortedSet�� ��ȯ
		   from���� to�ձ��� �����Ͽ� SortedSet���� ��ȯ
		   TreeSet�� �������̽� SortedSet�� ������
		   ���� ������ ����, �빮��, �ҹ��� ����
		*/
		System.out.println(ss);

		SortedSet ss1 = set.subSet(from, to + "zzz"); //b���� dzzz
		System.out.println(ss1);
	}
}