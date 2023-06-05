package com.kook.ch07Projcet_Test;

public class Ex07Quiz2_Test {

	public static void main(String args[]) {
		// 4�� (������ ���)
		Animal myPig = new Pig();
			myPig.animalSound();
		// 5�� (������ ���)
		Animal myDog = new Dog();
			myDog.animalSound();
			
		// 6-(2)�� OuterClass, InnerClass ���� Ŭ���� ��ü ����
		OuterClass out = new OuterClass(); //�⺻������ out ��ü����
			System.out.println(out.x);
		
		/* �ٸ� Ŭ�������� ���� Ŭ���� �������� ������ �ܺ�Ŭ������.����Ŭ������, ����������
		 * �ν��Ͻ�����Ŭ���� ��ü�� �ܺ�Ŭ������ü.new ����Ŭ���� �����ڷ� ȣ�� �ؾ���
		 */
		OuterClass.InnerClass ic = out.new InnerClass();
			System.out.println(ic.y);
			
		//7~8��
		Animal2 dogi = new Dog1();
		dogi.animalSound1();
		dogi.sleep();
		dogi.def();
		Animal2.sta();
	}
}

// 1��
class Animal {
	void animalSound() { //�ν��Ͻ� �޼���
		System.out.println("The animal makes a sound");
	}
}

// 2��
class Pig extends Animal {
	@Override //������ �ߴٴ� �ǹ�
	void animalSound() {
		System.out.println("The pig says : wee wee");
	}
}

// 3��
class Dog extends Animal {
	@Override
	void animalSound() {
		System.out.println("The dog says : bow wow");
	}
}

// 6-(1)��
class OuterClass {
	int x = 10;
	
	class InnerClass {
		int y = 5;
	}
	
	static class StaticInnerClass {
		static int z = 15;
	}
}

// 7��
abstract class Animal1 {
	abstract void animalSound1();
	
	void sleep() {
		System.out.println("����");
	}
}

class Pig1 extends Animal1 {
	@Override
	void animalSound1() {
		System.out.println("�߻�޼ҵ� ����");
	}
}

// 8��

interface Animal2 {
	void sleep();
	void animalSound1();
	
	default void def() {
		System.out.println("�������̽��� default�޼���");
	}
	static void sta() {
		
	}
 }

class Dog1 implements Animal2 {
	@Override
	public void animalSound1() {
		System.out.println("�������̽� ���� -sound");
	}
	
	@Override
	public void sleep() {
		System.out.println("�������̽� ���� -sleep");
	}
}

/* 1. AnimalŬ������ ����Ÿ���� void�̰� �Ķ���ʹ� ������ �̸��� animalSound�� �ν��Ͻ� �޼��带 ���´�.
	�޼��� ������ The animal makes a sound�� ���
   2. Animal�� ����� pig Ŭ������ Aimal�� �޼��带 �������Ͽ� ���
	  �����ǵ� �޼��� ������ The pig says : wee wee�� ���
   3. Animal�� ����� Dog Ŭ������ Animal�� �޼��带 �������Ͽ� ���
	  �����ǵ� �޼��� ������ The dog says : bow wow�� ���
   4. main�޼��忡�� ���� Ŭ������ ��ü myPig�� ���� Ŭ���� Pig�� ����ϰ�
	  �޼��带 ����
   5. ���� Ŭ������ ��ü myDog�� ���� Ŭ���� Dog�� ����ϰ� �޼��带 ����
   6. OuterClass�� ����� default�� �ν��Ͻ�������� x�� �����ϰ� �ʱⰪ 10�� ��
      default�� �ν��Ͻ� ���� Ŭ���� InnerClass�� ����� default�� ������� int y�� �����ϰ� �ʱⰪ 5
      Ŭ������ default ����Ŭ���� StaticInnerClass�� ����� Ŭ������ ������� z�� ����� �ʱⰪ 15;
      main�޼��忡�� OuterclassŬ���� ��ü out�� ����
      ���� Ŭ���� InnerClass ��ü�� ����
   7. �߻�Ŭ������ Animal1�� ����� �߻�޼���(����Ÿ�� void �Ķ���� ���� �޼���� animalSound1)����
	  �Ϲ� �޼���� void �Ķ���� ���� sleep�� ����(������ ���� ���)
	  animal1�� ����� Ŭ���� Pig1 Ŭ������ ����(������ �޼��� ������ �������)
   8.�������̽� Animal2�� ����(�޼���� 7���� �޼��� 2�� ���)
	 ������ Ŭ���� Dog1 Ŭ������ ����(�޼��� ���� �������)
*/