package com.kook.ch11Project;
//��.��
import java.util.*;

public class Ex11_08 {

	public static void main(String[] args) {
		Integer[] arr = { 30, 50, 10, 40, 20 };
		//�⺻���� �ڽ��� wrapperŬ������ Integer�� ��ȯ�� ����ڽ����� �ڵ�ó����
		
		Arrays.sort(arr);
		/* sort�ÿ��� wrapperŬ������ Integer Ŭ������ ������ Comparable�� 
		   CompareTo�� ���� ���İ��� ���� ������������ ����
		*/
		System.out.println(Arrays.toString(arr));
		
		//������(��������)���� ����
		Arrays.sort(arr, Collections.reverseOrder());
		//Ex11_07 ����ó�� �߰��� DescendingŬ������ ����� ���
		System.out.println(Arrays.toString(arr));
	}

}