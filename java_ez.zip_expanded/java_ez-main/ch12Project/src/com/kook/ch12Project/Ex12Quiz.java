package com.kook.ch12Project;

import java.util.*;

public class Ex12Quiz {

	//1
	enum Level {
		LOW,MEDIUM,HIGH
	}
	
	public static void main(String[] args) {
	//2.
	Level myVar = Level.MEDIUM;
	
	//3
	System.out.println("3�� : " + myVar);
	
	System.out.println();
	
	//4
	switch(myVar) {
		case LOW : //case�������� ����� ��밡��
			System.out.println("4�� : LOW ���");
			break;
		case MEDIUM :
			System.out.println("4�� : MEDIUM ���");
			break;
		case HIGH :
			System.out.println("4�� : HIGH ���");
			break;
		default : 
			break;
	}
	
	System.out.println();
	
	//5
	Level[] myArr = Level.values();
	
	for(Level l : myArr) {
		System.out.println("enhanced for 5�� : ");
		System.out.printf("%s=%d%n", l.name(), l.ordinal());
	}
	
	System.out.println();
	
	//6
	ArrayList<String> cars = new ArrayList<>();
	cars.add("QM6");
	cars.add("Ʈ����XG");
	System.out.println("6�� : " + cars);
	
	System.out.println();
	
	//7
	LinkedList<String> cars1 =  new LinkedList<>();
	cars1.add("����Ƽ��");
	cars1.add("xc90");
	cars1.add(0, "sonata");
	cars1.add(3, "santafe");
	System.out.println("7�� : " + cars1);

	System.out.println();

/* 7���� �̷��Ե� Ǯ �� �ִ�. (�ٸ� �ڵ�)
	LinkedList<String> cars1 = new LinkedList<String>();
	cars1.add("����Ƽ��");
	cars1.add("xc90");
	cars1.add("sonata");
	cars1.add("santafe");

	System.out.println("   "+cars1.getFirst());
	System.out.println("   "+cars1.getLast());
*/
	
	//8
	HashMap<String, Integer> people = new HashMap<String, Integer>();
	people.put("Q-Ran", 2020); //Integer��ü�� �⺻�� int�� ����ϸ� �ڵ� �ڽ��� �Ǿ� Integer�� ��
	people.put("H", 29);
	System.out.println("8�� : " + people);
	
	System.out.println();
	
	//9
	for(String key : people.keySet()) {
		System.out.println("9�� : " + key + " (key��) : " + people.get(key));
	}
	
	System.out.println();
	
	//10
	HashSet<Integer> numbers = new HashSet<>();
	numbers.add(4);
	numbers.add(7);
	
	//���ڵ�
	for(int i=1; i <= 10; i++) {
	
	if(numbers.contains(i)) {
		System.out.println("10-1�� i�� ������ : " + i);			
	}		
	else {
		System.out.println("10-2�� i�� ������ : " + i);
	}
}
	System.out.println();
	
	//(�ٸ� �ڵ�) 10�� �̷��Ե� Ǯ �� ����
	for(int j = 1; j <= 10; j++) {
		if(numbers.contains(j))  {
			System.out.println("10��(�ٸ��ڵ�) : ���� �ִ� ��: "+ j);
		}
		else {
			System.out.println("10��(�ٸ��ڵ�) : �� ���� �ִ� �� : " + j);
		}
	}
	
	System.out.println();
	
	//11
	Iterator<String> it = cars.iterator();
	
	while(it.hasNext()) {
		System.out.println("11�� : " + it.next());
	}
	
	System.out.println();
	
	//(�ٸ� �ڵ�)11�� �̷��Ե� Ǯ �� �ִ�.
	Iterator it1 = cars.iterator();
	while (it1.hasNext()) {
		String str = (String) it1.next();
		System.out.println("11�� : " + str);
	}
	
	}
	
   }

/* 1. ������ Level�� ����� ���� ����� LOW,MEDIUM,HIGH�� �Ѵ�.
   2. main�޼��� �ȿ��� Level��ü myVar�� ����� ���� MEDIUM�� �����Ѵ�.
   3. myVar��ü�� ����Ʈ �Ѵ�.
   4. myVar��ü�� �Ķ���ͷ� �ϴ� swithc���� �����. �� case�� LOW,MEDIUM,HIGH ���
   5. enhanced for���� �̿��� enum Level�� �� ������� ��� �غ���.
   6. �����Ķ���Ͱ� String�� ArrayList��ü cars�� ������� 2�� ���� �߰� �غ���
   7. �����Ķ���Ͱ� String�� LinkedList��ü cars1�� ���� ���� 2�� ���� �߰� �غ���.
   	  cars1�� ù��° ��ҷ� sonata�� �߰��ѵ� ������ ��ҷ� santafe�� �߰��Ѵ�.
   	  cars1�� ù��°�� ������ ��Ҹ� ���غ���. 
   8. �����Ķ����(���׸����)�� String�� Integer�� HashMap��ü people�� 
      ����� 2������ �߰��غ���.(�̸�,����)
   9. enhanced for���� �̿��� key Set�� ���� ���� key�� ���� ���ؼ� ��� �غ���.
   10.�����Ķ����(���׸�) Integer�� HashSet��ü numbers�� ����� 2�� ���� �߰��Ѵ�.(4�� 7)
      for���� �ݺ��� i�� 1���� 10���� �ݺ��ϸ鼭 numbers�� i���� ���� ������ ���� ���� + i�� ����ϰ�,
      ������ �Ȱ��� ���� + i�� ���
   11. 6�� cars��ü�� �̿��� Iterator��ü it�� �����, ����Ÿ�Ժ����� �̿��Ͽ� �����.
   	   it�� �̿��� cars�� ��ҵ��� ��� �غ��� 
*/