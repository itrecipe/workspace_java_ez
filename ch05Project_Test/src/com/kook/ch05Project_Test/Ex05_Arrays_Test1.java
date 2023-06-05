package com.kook.ch05Project_Test;

import java.util.Arrays;

public class Ex05_Arrays_Test1 {

	public static void main(String[] args) {
		/*Arrays Ŭ���� ��� �޼��尡 static(Ŭ������) �޼���� ȣ��� Ŭ������.�޼����()
		  Arrays.�޼����()
		*/
		int[] arr = {0,1,2,3,4};
		int[][] arr2D = {{11,12},{21,22}};
		
		//1���� �迭 ���ڿ�ȭ�� Arrays.toString(1���� �迭��);
		String strArr = Arrays.toString(arr);
		System.out.println("1���� �迭 ��� : " + strArr);
		
		//2���� �迭 ���ڿ�ȭ�� Arrays.deepToString(2���� �迭��);
		System.out.println("2���� �迭 ��� : " + Arrays.deepToString(arr2D));
		
		//�迭�� ������ Arrays.sort(�迭��);
		int[] arr2 = {5,3,15,6,9,8};
		Arrays.sort(arr2); //sort()�޼���� ���ϰ��� ���� �ڱ� �ڽ��� ����
		System.out.println("1���� �迭 ���� : " + Arrays.toString(arr2));
		
		/* �迭�� ����
		  - copyOf�� ������ ���� ��ŭ��
		  - copyOfRange()�� �迭�� ������ �����Ͽ� ������ �ٸ� �迭�� ����
		  - ��� �����Ͽ� ���ο� �迭�� ��ȯ
		*/
		int[] arr3 = {5,6,7,8,9};
		int[] arr4 = Arrays.copyOf(arr3, 3); //���ο� �迭�� ����
		System.out.println("�迭 ����, arr4 : " + Arrays.toString(arr4));
		
		int[] arr5 = Arrays.copyOf(arr3, 10);
		//�����ϴ� �迭�� ���Ұ��� ���� ������ �������� �⺻������ ä��
		System.out.println("�迭 ����, arr5 : " + Arrays.toString(arr5));
		
		//1�� ���� ���ι�ȣ 4�� ���� ���ι�ȣ(������ �� �ձ���)
		int[] arr6 = Arrays.copyOfRange(arr3, 1, 4);
		System.out.println("�迭 ����, arr6 : " + Arrays.toString(arr6));
		
		//System.arraycopy()�� ����� ����
		int[] scopyArr = {1,2,3,4,5};
		int[] scopyArr1 = new int[10];
		System.arraycopy(scopyArr, 0, scopyArr1, 0, 5);
		/* scopyArr�� ����迭, 0�� ����迭�� ���� ���ι�ȣ, scopyArr1�� ���纻 �迭,
		   0�� ���� ���ι�ȣ, 5�� ���Ұ���
		*/
		System.out.println("System.arraycopy()�� �̿��� ����, scopyArr : " + Arrays.toString(scopyArr));
		System.out.println("System.arraycopy()�� �̿��� ���� scopyArr1 : " + Arrays.toString(scopyArr1));
	}

}
