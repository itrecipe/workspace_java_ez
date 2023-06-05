package com.kook.ch11Project;

import java.util.*;

public class Ex11_18 {

	public static void main(String[] args) {
		//key�� ����� ����
		//�ߺ����� ���� key�� value�� 1�� �ߺ��Ǹ� value�� 1����
		String[] data = {"A","K","A","K","D","A","K","K","K","Z","D"};
		HashMap map = new HashMap();
		
		for(int i=0; i < data.length; i++) {
			if(map.containsKey(data[i])) {
				//containsKey(key)�� (���ԵǴ� key�� �ִ���), key���翩�� �ľ�(������ true)
				int value = (int)map.get(data[i]); //get(key)�� key�� ���� value��ȯ
				map.put(data[i], value + 1);
				//map�� ������ key�� ������ �� ���� �ٲ۴�.
			}
			else { 
				map.put(data[i], 1);
			}
		}
		
		Iterator it = map.entrySet().iterator();
		//map.entrySet()�� Set�� ��ȯ�ϰ� Set�� iterator()�� it�� �������.
		while(it.hasNext()) {
			Map.Entry entry = (Map.Entry)it.next();
			int value = (int)entry.getValue();
			String key = (String)entry.getKey();
			
			System.out.println(entry.getKey() + " : " + printBar('#', value) + " " + value);
		}
	} //main
	
	public static String printBar(char ch, int value) {
		char[] bar = new char[value];
		
		for(int i=0; i < bar.length; i++)
			bar[i] = ch;			
		
		return new String(bar);
		
	}
}