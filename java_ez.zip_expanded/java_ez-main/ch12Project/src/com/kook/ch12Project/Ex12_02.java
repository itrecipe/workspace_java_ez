package com.kook.ch12Project;
//��.��
import java.util.*;

public class Ex12_02 {

	public static void main(String[] args) {
		//LIST��ü�� ������ ��Ҵ� Student��ü�̴�.
		ArrayList<Student> list = new ArrayList<Student>();
		/* ArrayList�� ���(����,�޼���) �� ���׸��� ����ϴ� ��� ���� Student�� ���׸����� ���
		   ��ǥ���� �޼��� public boolean add(E e)�� ���׸� E�� ����ϹǷ� ���⼱ Student�� ���
		*/
		list.add(new Student("�ڹٿ�",1,1));
		list.add(new Student("�ڹ�¯",1,2));
		list.add(new Student("ȫ�浿",2,1));
		//list.add("kook"); -> Student��ü�� �ƴ� ���ڿ��� ����ϸ� ����
		
		Iterator<Student> it = list.iterator();
		//Iterator�� ���׸� �������̽��̹Ƿ� �̸� �����ϴ� list��ü�� ���׸� �Ķ���͸� ����Ͽ� �����Ѵ�.
		//Interface Iterator<E>
		while(it.hasNext()) {
			Student s = it.next(); //Student��ü s�� ���׸��� ����Ѵٸ� ����ȯ�� �ʿ����
			//E next()
			System.out.println(s.name);
		}
		
		HashMap<String, Student> map = new HashMap<String, Student>();
		/* public class HashMap<K, V>
		   K�� String, V�� Student
		   public V put(K key, V value) �ٳ����� ���� ���� ��ȯ�Ѵ�.
		   �������� ����� ��ü ������ ����� Ÿ�� �Ķ���ͷ� �޼����� �Ķ���Ͱ� �ٲ��,
		*/
		Student s0 = map.put("stu1", new Student("�ڹ�0", 1, 1));
		Student s1 = map.put("stu1", new Student("�ڹ�1", 1, 1));
		Student s2 = map.put("stu1", new Student("�ڹ�2", 1, 1));
	}
}

class Student {
	//��������� �ν��Ͻ���, ���������ڴ� default�� ������ ��Ű������ ��𼭳� ���ٰ����ϴ�.
	String name = "";
	int ban; //�ʱⰪ 0
	int no; //�ʱⰪ 0
	
	Student() {
		super();
	}
	
	Student(String name, int ban, int no) {
		super();
		this.name = name;
		this.ban = ban;
		this.no = no;
	}
}