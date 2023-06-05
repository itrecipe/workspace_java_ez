package com.kook.ch11Project;
//��.��
import java.util.*;

public class Ex11_11 {

	public static void main(String[] args) {
		// HashSet�� Ŭ������ ��ü�� add�� ��ü�� Ư�� ��������� �ߺ��� ���� ���ϱ� ���� ���
		HashSet set = new HashSet();
		
		boolean res = set.add("abc");
		boolean res1 = set.add("abc");
		//��Ұ� abc�� ���� �����Ƿ� �ߺ��Ǿ� �ؿ� �߰��� ���� add()�޼���� �� ��� ����

		System.out.println("res : " + res);
		System.out.println("res1 : " + res1);
		
		/* ������ ��������� ���� Ŭ������ ��ü�� add�� �� ��ü�� Ư�� ��������� ��������
		   �ߺ� üũ�� �ϱ� ���ؼ�Object�� equals�� hashCode�޼��带 ������ �Ͽ� ���Ѵ�.
		   add�� equals�� hashCode�޼��带 �ڹٿ��� ȣ���Ͽ� üũ, Person��ü�� add��
		   new�� �����ϴ� ��ü�� �ּҰ� �ٸ� ��ü�̴�.
		   equals�� HashCode�� ���������� �ʰ� Object�� ����ϸ� ������ �������
		   ���� ������ ����ȴ�.
		   ������������� ���Ϸ��� equals�� hashCode�� PersonŬ�������� ������
		*/
		set.add(new Person("David", 10));
		set.add(new Person("David", 10));
	
		System.out.println(set);
	}

}

class Person {
	String name;
	int age;
	
	//�����ڸ� ����
	Person() {
		super(); //�⺻�����ڿ����� �ڵ��߰��Ǵϱ� ���������ϳ� �׳� ���־���. �˰��ֵ�������
	}
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return name + ":" + age;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) {
			return false;
		}
		
		Person p = (Person)obj;
		
		return name.equals(p.name) && age==p.age;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(name, age);
	/* Objects�� java.util�� �ִ� Object�� ���ϰ� ó���ϴ� Ŭ����
	   hash(Object ...values)�� values�� �̿��Ͽ� hashCode�� ����
	*/
		
	}
	
}