package com.kook.ch11Project;

import java.util.*;

public class Ex11_07 {

	public static void main(String[] args) {
		String[] strArr = {"cat", "Dog", "lion", "tiger", "02"};
		
		Arrays.sort(strArr);
		//���ڿ� �迭�� �����ϹǷ� StringŬ������ ������ Comparable
		//�������̽��� compareTo()�޼��带 ���� ����
		System.out.println("strArr=" + Arrays.toString(strArr)); //����
		/* String�� ������������ ����(�ڵ��ȣ�� �������� ��ȣ�� �����Ϳ��� ū������ ����)
		   �빮�ڰ� �ҹ��� ���� ������ ���ڰ� �빮�� ���� ������.
		*/
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		//CASE_INSENSITIVE_ORDER�� Comparator��ü������ �߰����� ���� ����(��ҹ��� �Ȱ���, �ҹ��ں�ȯ)
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr, new Descending());
		//Descending���� �����ķ� ���� �����Ƿ� ������
		
		System.out.println("strArr=" + Arrays.toString(strArr));
		
		Arrays.sort(strArr,Collections.reverseOrder());
		//�����Ľ� Collections.reverseOrder()�޼��� ���
		System.out.println("strArr=" + Arrays.toString(strArr));
		
	}
}

class Descending implements Comparator {
	//�߰����� ���� ���� ���� Ŭ����
	//Comparator�������̽��� ���� �߻�޼��带 ����
	@Override
	public int compare(Object o1, Object o2) {
		if( o1 instanceof Comparable && o2 instanceof Comparable) {
			//Comparable�� ������ ��ü���� �� ����
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			
			//o1�� o2�� String�̰� String�� Comparable�� comparaTo�� �ִ�.
			//c1.compareTo(c2)�� �������� ����
			return c1.compareTo(o2) * -1; // -1�� �����ָ� ������(��������) ����
		}
		return -1;
	}
}