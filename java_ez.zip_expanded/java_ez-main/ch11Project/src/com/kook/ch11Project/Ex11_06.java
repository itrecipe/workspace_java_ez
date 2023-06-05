package com.kook.ch11Project;
//��.��
import java.util.*;

public class Ex11_06 {

	public static void main(String[] args) {
		//ArraysŬ������ �޼���(static)
		int[] arr = {1,2,3,4,5}; //1���� �迭
		int[][] arr2D = {{11,12,13},{21,22,23}}; //2���� �迭
		
		System.out.println("arr = " + Arrays.toString(arr));
		//Arrays.toString()�� �Ķ���ͷδ� �⺻�� �迭, ������ �迭 ��� ��밡��
		System.out.println("Object�� toString() :" + arr.toString());
		//�������̵��� �ȵǼ� [I@5e91993f <- ������ ��µ�
		System.out.println("arr2D = " + Arrays.toString(arr2D));
		//2���� �迭�� toString()����ϸ� �ּҰ��� ���
		System.out.println("arr2D = " + Arrays.deepToString(arr2D));
		//2���� �̻��� ���ڿ� ��ȯ�� Arrays.deepToString(2�����̻� �迭��)
		
		/* copyOf(ó��, �ι�°)�� 1��° �Ķ������ �迭�� 2��° �Ķ���ͷ� ������ ũ��� �����Ͽ� 
		   ����� �迭�� ��ȯ
		*/
		int[] arr2 = Arrays.copyOf(arr, arr.length); //arr��ü�� �����Ͽ� arr2�� ����
		int[] arr3 = Arrays.copyOf(arr, 3); //arr���� �տ��� 3���� ������ arr3�� ����
		int[] arr4 = Arrays.copyOf(arr, 7); 
		//arr�� �ڿ� ������ ���ں��� ������ �������� �⺻������ ä��
		
		//�迭 ������ ������ �����ҽ� copyOfRange(���迭, ���ۻ��ι�ȣ, ������ι�ȣ)
		int[] arr5 = Arrays.copyOfRange(arr4, 2, 4);
		//2�� ���ۻ��ι�ȣ 4�� ������ι�ȣ ���� ī�� ������ 2������ 4-1������ ����
		int[] arr6 = Arrays.copyOfRange(arr, 0, 7); //���迭 ���� �̻��� �⺻������ ä��
		
		System.out.println();
		System.out.println("arr2=" + Arrays.toString(arr2));
		System.out.println("arr3=" + Arrays.toString(arr3));
		System.out.println("arr4=" + Arrays.toString(arr4));
		System.out.println("arr5=" + Arrays.toString(arr5));
		System.out.println("arr6=" + Arrays.toString(arr6));
		
		int[] arr7 = new int[5];
		Arrays.fill(arr7, 9); //arr7�迭�� ��� 9�� ä��
		System.out.println("arr7=" + Arrays.toString(arr7));
		
		//setAll(�迭��, ���ٽ� or �Լ����������̽����� ��ü)�� ��� ���Ҹ� ä��
		Arrays.setAll(arr7, (i) -> (int)(Math.random() * 6) + 1);
		System.out.println("arr7=" + Arrays.toString(arr7));
	
		for(int x : arr7) {
			char[] graph = new char[x];
			Arrays.fill(graph, '*');
			System.out.println(new String(graph) + x);
		}
		
		String[][] str2D = new String[][] {{"aaa"}, {"bbb"}, {"AAA"}, {"BBB"}};
		String[][] str2D2 = new String[][] {{"aaa"}, {"bbb"}, {"AAA"}, {"BBB"}};
		//2�����迭 �� �񱳴� deepEquals�� �Ѵ�
		System.out.println(Arrays.equals(str2D, str2D2)); //1�����迭 equals��� false
		System.out.println(Arrays.deepEquals(str2D, str2D2)); //2�����迭 �� true
		
		char[] chArr = { 'A', 'D', 'C', 'B', 'E' };
		System.out.println("chArr=" + Arrays.toString(chArr));
		//toString(���⺻���迭, ������ �迭)
		//binarySearch(chArr, 'B')�� chArr�迭���� 2�� �˻������� B�� ã�� ���ι�ȣ ��ȯ
		//�����Ŀ� ����ؾ߸� ��
		System.out.println("������ index of B =" + Arrays.binarySearch(chArr, 'B'));
		
		Arrays.sort(chArr); //sort�� �������� ����(���ڿ��� ����, �빮��, �ҹ��� -> �̷� ������� ���ĵ�)

		System.out.println("������ chArr=" + Arrays.toString(chArr));
		
		System.out.println("������ index of B =" + Arrays.binarySearch(chArr, 'B'));
	}
}