package com.kook.ch11Project;

import java.util.*;

public class Ex11_16 {

	public static void main(String[] args) {
		// HashMap
		HashMap map = new HashMap();
		//public class HashMap<K,V>
		
		map.put("myId","1234");
		/* HashMap�� map��ü�� ���� ���� �������� put()���
		   public V put(K key, V value)
		   put�޼���� ���׸��� �̿��� key�� value�Ķ���͸� ���
		   ��ȯ�� V��ü�� ��ȯ
		   K�� key�� ���������ε� �̸��̹Ƿ� ���� String���̴�.
		*/
		map.put("asdf","1111");
		map.put("asdf","1234");
		/* key�� �ߺ��� �ȵǹǷ� ������ key���� �����ϸ� ������ key�� value(��)�� ������Ʈ �Ѵ�. 
		   key�� �ٸ��� value(��)�� �ߺ� �ص� �ȴ�.
		*/
		
		System.out.println(map); //HashMap�� toString()�� ������(�������̵�)��
		//{myId=1234, asdf=1234}
		
		Scanner s = new Scanner(System.in);
		
		while(true) {
			System.out.println("id�� password�� �Է��ض�!");
			System.out.print("id :");
			String id = s.nextLine().trim(); 
			//trim()�� ���ڿ� �յ� ���� ����, �Է��� ���� key�� ����� ����
			System.out.print("password :");
			String password = s.nextLine().trim(); //�Է��� ���� value(��)���� ���
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("�Է��� id�� �������� ������ �ٽ� �Է��ض�!!");
				continue; //�����ݺ� ������ �̵��ؾ��ϴ� continue; ���
			}
			
			if(!map.get(id).equals(password)) {
				//get(key)�� key�� �ش��ϴ� value�� ��ȯ
				System.out.println("��й�ȣ�� ��ġ���� ������ �ٽ� �Է��ض�!!!");
				continue;
			}
			else {
				System.out.println("id�� ��й�ȣ�� ��ġ��!");
				break;
			}
			
		}
	}

}
