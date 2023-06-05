package com.kook.ch11Project;
//���ܿ���(���翡���� ����-�߰�����)
import java.util.*;

public class Ex11_mapIter {

	public static void main(String[] args) {
		/* Map�� Collection�������̽��� �������� ���� �����ͱ׷�ó�� �������̽�
		   Map��ü�� iterator()�޼��尡 ��� �ٷ� ����� �� ����
		   Collection �������̽��� ����� Set�迭�� ��ȯ�ϴ� �޼��带 �̿��ؼ� ��ȯ�� ���
        */
		Map map = new HashMap();
		
		Set kset = map.keySet(); //HashMap�� key�� Set�� ��ȯ
		Set vset = map.entrySet(); //HashMap value(��)�� Set�� ��ȯ
		
		map.put("age", 50);
		map.put("name", "kim");
		
		Iterator it = vset.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
			//key = ��
		}

		Iterator kit = kset.iterator();
		
		while(kit.hasNext()) {
			System.out.println(kit.next());
			//key��
		}
	}

}
