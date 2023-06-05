package com.kook.ch11Project;
//��.��
import java.util.*;
import static java.util.Collections.*;
// CollectionsŬ������ ��� static����� Collections.���� ���

public class Ex11_19 {

	public static void main(String[] args) {
		// CollectionsŬ����
		List<Integer> list = new ArrayList<Integer>();
		//List�迭���� toStoring()�޼��尡 �׻� �������̵�(������) �Ǿ� �ִ�.
		System.out.println("list : " + list);
		
		/*Collections.(������)addAll()*/addAll(list, 1, 2, 3, 4, 5); //import static Collections ��������
		/*<Integer> boolean addAll(Collection<? super Integer> c, Integer... elements)
 		  addAll�޼����� ��ȯ�� boolean�̰� c �÷��ǰ�ü(���(���εǴµ�����)�� Integer�� ���� Ŭ���� Collection)
		  ���� Integer�� �Ķ���ͷ� ����
		*/
		System.out.println("addAll : " + list);
		
		rotate(list, 2); //list�� ������Ҹ� �ڷ� 2ĭ�� �о ȸ����Ų��.
		System.out.println("rotate : " + list);
		
		swap(list, 0, 2); //ù ������ �� ��°�� ��ȯ(swap)
		System.out.println("swap : " + list);
		
		shuffle(list); //����� ����� ��ġ�� ���Ƿ� ����
		System.out.println("shuffle : " + list);
		
		System.out.println("============================");
		sort(list); //�������� ����
		System.out.println("sort �������� ���� : " + list);
		
		sort(list, reverseOrder()); //���� ����(��������) reverse(list); �� �����ϴ�.
		System.out.println("sort, reverseOrder() �������� : " + list);
		
		reverse(list); //list�� �������� ����
		System.out.println("reverse : " + list);
		
		//2���˻�(binarySearch)�� ���� ����
		sort(list); //�������� ����
		System.out.println("sort �������� ���� : " + list);
		
		int idx = binarySearch(list, 3); //3�� ����� ��ġ(index)�� ��ȯ, ������ ���
		System.out.println("index of 3 = " + idx);
		
		//Collections.max(list), ������ �̸� import�� ���־��� ������ �÷��� ����
		System.out.println("max : " + max(list)); 
		System.out.println("min : " + min(list));
		
		System.out.println("reverseOrder(), min : " + max(list, reverseOrder()));
		
		fill(list, 9); //list�� 9�� ä��
		System.out.println("fill(), list : " + list);
		
		//list�� ���� ũ���� ���ο� list�� �����ϰ� 2�� ä���. ��, ����� ����Ұ�
		List newList = nCopies(list.size(),2);
		System.out.println("nCopies(list.size(),2), newList : " + newList);
		
		/* disjoint(list, list2)�� ����� �κ��� �ִ��� ������ ã�� �޼���
		   ����� ��Ұ� �ϳ��� ������ true, (�� ����� ���� �ϳ��� ���ٴ� �ǹ�)
		*/
		System.out.println("disjoint : " + disjoint(list, newList));
		
		copy(list, newList); //newList���� list�� ����
		System.out.println("copy(list, newList), newList : " + newList);
		System.out.println("copy(list, newList), list : " + list);
		
		replaceAll(list, 2, 1); //list���� 2�� 1�� ��ü
		System.out.println("replaceAll(), list : " + list);
		
		Enumeration e = /*Collections.(������)*/enumeration(list);
		/* � �÷��� ��ҿ� �����Ҽ� �ִ� �������̽����� Iterator�� ������
		   list ��ü�� �ݺ� ���� ������ Enumeration���� ��ȯ
		*/
		ArrayList list2 = list(e);
		System.out.println("ArrayList, list2 : " + list2);
		
	}
}
