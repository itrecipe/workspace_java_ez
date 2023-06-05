package com.kook.ch11Project;
//��.��
import java.util.*;

public class Ex11_05 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		/* ArrayList�� List�������̽��� �����߰� List�������̽��� Collection�������̽��� ���
		   genneric(���׸�)�� �̿��Ͽ� ��ü ����
		   ���׸��� ArrayList�� �����͵��� ���������� ����
		   list��ü�� ���Ǵ� ��Ҵ� String�̾�߸���
	    */
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		
		/* list�� ��ҿ� �����ϱ� ���� Iterator�� ���
		   Interface Iterator<E>�� ���ǵǾ� ���׸��� �������̽�
		*/
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			String str = it.next();
			System.out.println(str);
		}
		
		//��������� ������ Iterator
		//Interface ListIterator<E> ���׸� �������̽� List�迭������ ���
		ListIterator<String> lit = list.listIterator();
		
		while(it.hasNext()) {
			//Iterator���� �߰��� �޼��带 ����
			String str = lit.next();
			System.out.println(str);
		}
	}
}