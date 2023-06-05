package com.kook.ch07Project;

public class Ex07Quiz2 {

	public static void main(String[] args) {
		/* 1. AnimalŬ������ ����Ÿ���� void�̰� �Ķ���ʹ� ������ �̸��� animalSound�� �ν��Ͻ� �޼��带 ���´�.
	          �޼��� ������ The animal makes a sound�� ��� */
		Animal a = new Animal();
		a.animalSound();
	
		 /* 2. Animal�� ����� Pig Ŭ������ Animal�� �޼��带 �������Ͽ� ���
	          �����ǵ� �޼��� ������ The pig says : wee wee�� ��� */
		Pig p = new Pig();
		p.animalSound();
		
		 /* 3. Animal�� ����� Dog Ŭ������ Animal�� �޼��带 �������Ͽ� ���
		      �����ǵ� �޼��� ������ The dog says : bow wow�� ��� */
		 Dog d = new Dog();
		 d.animalSound();
		 
		 /* 4. main�޼��忡�� ���� Ŭ������ ��ü myPig�� ���� Ŭ���� Pig�� ����ϰ� �޼ҵ� ���� */
			Animal myPig = new Pig(); //�������� �ǰ� ���� Ŭ������ ����Ŭ������ ����(�θ�Ŭ������ ����ϰ� �ִٴ� �ǹ�)
			myPig.animalSound(); //����� ���� Ŭ����
		 
		 // 5. ���� Ŭ������ ��ü myDog�� ���� Ŭ���� Dog�� ����ϰ� �޼��带 ����
			Animal myDog = new Dog();
			myDog.animalSound();
		  	
		 /* 6. OuterClass�� ����� default�� �ν��Ͻ�������� x�� �����ϰ� �ʱⰪ 10�� ��
		  default�� �ν��Ͻ� ���� Ŭ���� InnerClass�� ����� default�� ������� int y�� �����ϰ� �ʱⰪ 5
		  Ŭ������ default ����Ŭ���� StaticInnerClass�� ����� Ŭ������ ������� z�� ����� �ʱⰪ 15;
		  main�޼��忡�� OuterclassŬ���� ��ü out�� ����, ���� Ŭ���� InnerClass ��ü�� ���� */
		 OuterClass out = new OuterClass();
		 OuterClass.InnerClass inner = out.new InnerClass();
		 //�ٸ� Ŭ�������� ���� Ŭ���� �������� ������ �ܺ�Ŭ������.����Ŭ������ ����������
		 //�ν��Ͻ�����Ŭ���� ��ü�� �ܺ�Ŭ������ü.new ����Ŭ���� ������ 
		 OuterClass.StaticInnerClass sinner = new OuterClass.StaticInnerClass();
		 //���� Ŭ���� ������ Ŭ������ ���� Ŭ���� ��η� ������ ȣ��
		
		// 7~8�� ����
		 Animal2 dogi = new Dog1();
		 dogi.animalSound1();
		 dogi.sleep();
		 dogi.def(); //�������̽��� default�޼ҵ� ȣ��
		 Animal2.sta(); //�������̽��� static�޼ҵ� ȣ��,static�� �������̽��� �ٷ� ���ٽ�Ų��.
	}	
}

/* 1. AnimalŬ������ ����Ÿ���� void�̰� �Ķ���ʹ� ������ �̸��� animalSound�� �ν��Ͻ� �޼��带 ���´�.
     �޼��� ������ The animal makes a sound�� ��� */
class Animal {
	void animalSound() {
		System.out.println("The animal makes a sound");
	}	
}


/* 2. Animal�� ����� Pig Ŭ������ Animal�� �޼��带 �������Ͽ� ���
     �����ǵ� �޼��� ������ The pig says : wee wee�� ��� */
class Pig extends Animal {
	
	@Override //������ ������̼�(������ �޼����� ���� üũ)
	void animalSound() {
		System.out.println("The pig says : wee wee");
	}
}

/* 3. Animal�� ����� Dog Ŭ������ Animal�� �޼��带 �������Ͽ� ���
      �����ǵ� �޼��� ������ The dog says : bow wow�� ��� */
class Dog extends Animal {
	@Override
	void animalSound() {
		System.out.println("The dog says : bow wow");
	}
}

/* 6. OuterClass�� ����� default�� �ν��Ͻ�������� x�� �����ϰ� �ʱⰪ 10�� ��
default�� �ν��Ͻ� ���� Ŭ���� InnerClass�� ����� default�� ������� int y�� �����ϰ� �ʱⰪ 5
Ŭ������ default�� ����Ŭ���� StaticInnerClass�� ����� Ŭ������ ������� z�� ����� �ʱⰪ 15;
main�޼��忡�� OuterclassŬ���� ��ü out�� ����, ���� Ŭ���� InnerClass ��ü�� ���� */
class OuterClass {
	int x = 10;
	
	class InnerClass {
		int y = 5;
	}
	
	static class StaticInnerClass {
		static int z = 15;
	}
}

/* 7. �߻�Ŭ������ Animal1�� ����� �߻�޼���(����Ÿ�� void �Ķ���� ���� �޼���� animalSound1)����
	  �Ϲ� �޼���� void �Ķ���� ���� sleep�� ����(������ ���� ���)
	  animal1�� ����� Ŭ���� Pig1 Ŭ������ ����(������ �޼��� ������ �������) */
abstract class Animal1 {
	 abstract void animalSound1(); //�޼����� �����(������Ÿ��)�� ����
	   
	   void sleep() { //�Ϲݸ޼���(�ν��Ͻ���)
	      System.out.println("����");
	   }
	}

	class Pig1 extends Animal1{
		//�߻�޼��� ������ ����� �� �Ϲ� Ŭ����
	   @Override
	   void animalSound1() {
		   System.out.println("�߻� �޼ҵ� ����");
	   }
	}
	//�Ϲݸ޼ҵ� sleep()�� �������ص� �ǰ� �׳� ����ص� ��.
	
/* 8.�������̽� Animal2�� ����(�޼���� 7���� �޼��� 2�� ���)
     ������ Ŭ���� Dog1 Ŭ������ ����(�޼��� ���� �������) */
	interface Animal2{
		//�������̽��� �߻�޼����� ���(public static final)�� �־����
		//�ڹ� 1.8���� default�� �ν��Ͻ� �޼���� static�޼��� �߰���.
		
		//���
		public static final int CONST = 10;
		
		//�߻�޼��� 2��
		/*public abstract*/ void animalSound1();
		void sleep();
		
		default void def() {
			System.out.println("�������̽��� default�޼ҵ�");
		}
		
		static void sta() {
			
		}
	}

	class Dog1 implements Animal2 {
		@Override
		public void animalSound1() {
			System.out.println("�������̽� ����-sound");
		}
		
		@Override
		public void sleep() {
			System.out.println("�������̽� ����-sleep");			
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
