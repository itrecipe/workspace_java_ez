package com.kook.ch11Project;
//��.��
import java.util.*;

public class Ex11_09 {

	public static void main(String[] args) {
		Integer i1 = 1;
		Object[] objArr = {"1",i1,"2","2","3","3","4","4","4"};
		//���ڿ����� Integer ��ü�� ���Ҹ� ���ǹǷ� ���������� Object
		Set set = new HashSet();
		for(int i=0; i < objArr.length; i++) {
			//�迭�� ���Ҹ� set��ü�� �߰�(�ߺ����� �߰��δ� �ȵ�)
			set.add(objArr[i]);
			//"1"�� Integer i1=1�� �ٸ��ɷ� ó��
		}
		System.out.println(set);
		//Set�� Object�� toString�� �������̵���
		
		//HashSet�� ����� ��ҵ��� ���(Iterator���)
		Iterator it = set.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}