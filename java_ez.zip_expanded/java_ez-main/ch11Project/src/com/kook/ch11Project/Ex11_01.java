package com.kook.ch11Project;

import java.util.*;

public class Ex11_01 {

	public static void main(String[] args) {
		//ArrayList��ü�� �����ڸ� �̿�
		//ArrayList list1 = new ArrayList(10); //������ �ۼ���� 
		//10�� �ʱ� �뷮
		//ArrayListŬ������ ���׸� Ŭ������ ��� ���ϸ� ���� Ÿ���̴�.
		ArrayList<Integer> list1 = new ArrayList<Integer>(10); // <- �̷��� �ۼ��ϴ°��� ����
		//List�������̽� �迭�� �迭 ������μ� ������ �����ϰ� �ߺ��� ����ϰ� ���� �޸𸮰� ���ӵǾ� ���
		//ArrayList��ü�� ��Ұ��� �߰��ҽ� add�޼��带 ���
		list1.add(5); //5�� �⺻���̳� �ڵ� �ڽ�(����ڽ�)�� ���� IntegerŸ������ ��ȯ
		list1.add(4);
		list1.add(2);
		list1.add(0);
		list1.add(1);
		list1.add(3);

		list1.add(5); //���� ���
		
		ArrayList<Integer> list2 = new ArrayList<Integer> (list1.subList(1, 4));
		//List<Integer> subList(int fromIndex, int toIndex)�޼����
		//list ��ü�� ���ι�ȣ fromIndex���� toIndex-1�� ������ List��ü�� ��ȯ
		//�������� �Ķ���ͷ� Collection��ü�� ��밡��
		print(list1,list2);
		
		Collections.sort(list1); //�ڽ��� ����
		//<Integer> void sort(List<Integer> list)
		//Collections�� Ŭ������ �������̽��� Collection�� ����
		//public class Collections extends Object�� Collection�� ���� ����
		//Collections Ŭ������ collection���� Ŭ���� ó���� ������ �޼��� ���� ����
		//List ��ü�� ���� ����
		Collections.sort(list2);
		
		print(list1, list2);
		
		System.out.println("list1.containsAll(list2) : " 
		          + list1.containsAll(list2)); //list1�� list2��� �����ϴ°�?
		
		list2.add(6);
		list2.add(7);
		//add(��)�� ������ ��ҵڿ� �߰�
		list2.add(3, 8); //�� ����� �ӵ��� �ʾ����Ƿ� ���� ���� �����
		//add(���ι�ȣ, ��)�� ���ι�ȣ�� ���� �߰�
		//���� ���Ҵ� �ڷ� �и�
		print(list1, list2);
		
		list2.set(3, 44); //set�� ���ι�ȣ 3���� ����
		print(list1, list2);
		
		/* list1���� list2�� ��ġ�� �κи� ����� �������� ������(retainAll�޼���)
		   ��ȯ�� boolean.(list1���� ��ġ�� �κи� ����)
		*/
		System.out.println("list1.retainAll(list2) : " + list1.retainAll(list2));
		print(list1, list2);
		
		//list2���� list1�� ���Ե� ��ü���� ����
		for(int i = list2.size()-1; i >= 0; i--) {
			/* size()�޼���� List�� ���Ұ���
			   get(���ι�ȣ)�� ���ι�ȣ�� ����� ���Ұ�
			   contains(��)�� ���� ���� ����
			   remove(���ι�ȣ)�� ���ι�ȣ�� ���Ұ� ����(����)
			   ���ų� �߰��� �ǳ����� �ϴ� ���� �ٷ� ó���� �� 
			   ��ó���̳� �߰����� ó���� ���ο� �迭�� ����� ó��(ó�� �ӵ��� �ʾ���)
			   ���� for�������� �Ǹ����� ���Һ��� ó�� (������ �ӵ��� �ʾ����� �ʰ� �ϱ� ����)
			*/
			if(list1.contains(list2.get(i))) {
				list2.remove(i);
			}
		}
		print(list1, list2);
		
		Vector v = new Vector(5);
		v.add("5");
		v.add("6");
	}
	
	static void print(ArrayList list1, ArrayList list2) {
		//List�迭�� toString()�� ������ ǥ�õǵ��� �������̵� ��
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
		System.out.println();
	}
}