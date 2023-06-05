package com.kook.ch06Project;
import java.util.Arrays;

//���� ���� ����(������ ����)
public class Ex06_15 {
	static int[] arr = new int[10];
	//Ŭ������ �ε��ɽ� static��������� ����
	//Ŭ���� �ε��� arr�迭�� ���� ��
	static {
		for(int i=0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 10) + 1;
		}
		System.out.println("static ��� : " + Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		System.out.println("main�޼��� ��");
		for(int x : arr) {
			System.out.print(x + ",");
		}
		System.out.println();
	}
}
