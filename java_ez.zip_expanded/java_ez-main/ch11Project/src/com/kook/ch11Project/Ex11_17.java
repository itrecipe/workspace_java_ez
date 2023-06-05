package com.kook.ch11Project;
//��.��
import java.util.*;

public class Ex11_17 {

	public static void main(String[] args) {
		// Map�� �޼��� ���
		HashMap map = new HashMap();
		
		//put(Ű, ��), Ű�� �����ڶ�� ����ȴ�.
		map.put("���ڹ�", 90);
		map.put("���ڹ�", 100); //���� ���ڹٴ� �ߺ��Ǿ� �������.
		map.put("���ڹ�", 100);
		map.put("���ڹ�", 80);
		map.put("���ڹ�", 90);
		
		/* Map�� Colection�������̽��� ������� �ʾ� ���ҿ� �����ϴ� iterator()�� ��������.
		   �׷��� Set���� ��ȯ�ѵ� Set���� Iterator�� �����.
		*/
		Set set = map.entrySet();
		//map.ketSet()�� Set��ȯ, map.entrySet() : ��ȯ�� ��Ʈ����
		System.out.println("entrySet()�� ��ȯ �� : " + set);
		Set set1 = map.keySet();
		System.out.println("keySet()�� ��ȯ �� : " + set1);
		Iterator it = set.iterator(); //iterator() : ���ҿ� �����Ѵ�.
		
		while(it.hasNext()) {
			/* key�� value�� ��������� ������ �ִ� Ŭ������ HashMap�� ����Ŭ������ Entry�̴�.
			   Map��ü�� iterator�� Entry��ü�� ��ȯ(��������� key�� value�� ó��)
			*/
			HashMap.Entry e = (HashMap.Entry)it.next();
			System.out.println("�̸�(key) : " + e.getKey());
			System.out.println("����(value) : " + e.getValue());
		}
		
		set = map.keySet(); //map�� key���� set���� ����
		for(Object str : set) {
			String key = (String)str;
			System.out.println(key);
			System.out.println(map.get(key)); //key�� value�� ������ get(key)���
		}
		
		Collection values = map.values();
		/* Collection values()�� map�� ���Ե� value�� Collection���� ��ȯ
		   �� map���� ���� �����ý� values()�޼���� Collection��ü�� ��� ���
		*/
		it = values.iterator();
		
		int total = 0;
		while(it.hasNext()) {
			int i = (int)it.next(); //next()�� ���ϰ��� Object�̹Ƿ� int�� ��ȯ
			total += i;
		}
		
		System.out.println("���� : " + total);
		System.out.println("��� : " + (float)total/map.size());
		System.out.println("�ְ����� : " + Collections.max(values));
		System.out.println("�������� : " + Collections.min(values));
		
	}
}