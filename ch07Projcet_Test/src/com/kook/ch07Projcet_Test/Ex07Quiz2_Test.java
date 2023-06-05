package com.kook.ch07Projcet_Test;

public class Ex07Quiz2_Test {

	public static void main(String args[]) {
		// 4번 (다형성 사용)
		Animal myPig = new Pig();
			myPig.animalSound();
		// 5번 (다형성 사용)
		Animal myDog = new Dog();
			myDog.animalSound();
			
		// 6-(2)번 OuterClass, InnerClass 내부 클래스 객체 생성
		OuterClass out = new OuterClass(); //기본형으로 out 객체생성
			System.out.println(out.x);
		
		/* 다른 클래스에서 내부 클래스 참조변수 선언은 외부클래스명.내부클래스명, 참조변수명
		 * 인스턴스내부클래스 객체는 외부클래스객체.new 내부클래스 생성자로 호출 해야함
		 */
		OuterClass.InnerClass ic = out.new InnerClass();
			System.out.println(ic.y);
			
		//7~8번
		Animal2 dogi = new Dog1();
		dogi.animalSound1();
		dogi.sleep();
		dogi.def();
		Animal2.sta();
	}
}

// 1번
class Animal {
	void animalSound() { //인스턴스 메서드
		System.out.println("The animal makes a sound");
	}
}

// 2번
class Pig extends Animal {
	@Override //재정의 했다는 의미
	void animalSound() {
		System.out.println("The pig says : wee wee");
	}
}

// 3번
class Dog extends Animal {
	@Override
	void animalSound() {
		System.out.println("The dog says : bow wow");
	}
}

// 6-(1)번
class OuterClass {
	int x = 10;
	
	class InnerClass {
		int y = 5;
	}
	
	static class StaticInnerClass {
		static int z = 15;
	}
}

// 7번
abstract class Animal1 {
	abstract void animalSound1();
	
	void sleep() {
		System.out.println("쿨쿨");
	}
}

class Pig1 extends Animal1 {
	@Override
	void animalSound1() {
		System.out.println("추상메소드 구현");
	}
}

// 8번

interface Animal2 {
	void sleep();
	void animalSound1();
	
	default void def() {
		System.out.println("인터페이스의 default메서드");
	}
	static void sta() {
		
	}
 }

class Dog1 implements Animal2 {
	@Override
	public void animalSound1() {
		System.out.println("인터페이스 구현 -sound");
	}
	
	@Override
	public void sleep() {
		System.out.println("인터페이스 구현 -sleep");
	}
}

/* 1. Animal클래스는 리턴타입이 void이고 파라미터는 없으며 이름은 animalSound인 인스턴스 메서드를 갖는다.
	메서드 내용은 The animal makes a sound를 출력
   2. Animal을 상속한 pig 클래스는 Aimal의 메서드를 재정의하여 사용
	  재정의된 메서드 내용은 The pig says : wee wee을 출력
   3. Animal을 상속한 Dog 클래스는 Animal의 메서드를 재정의하여 사용
	  재정의된 메서드 내용은 The dog says : bow wow를 출력
   4. main메서드에서 상위 클래스의 객체 myPig는 하위 클래스 Pig를 사용하고
	  메서드를 실행
   5. 상위 클래스의 객체 myDog는 하위 클래스 Dog를 사용하고 메서드를 실행
   6. OuterClass를 만들고 default형 인스턴스멤버변수 x를 정의하고 초기값 10을 줌
      default형 인스턴스 내부 클래스 InnerClass를 만들고 default형 멤버변수 int y를 정의하고 초기값 5
      클래스형 default 내부클래스 StaticInnerClass를 만들고 클래스형 멤버변수 z를 만들고 초기값 15;
      main메서드에서 Outerclass클래스 객체 out를 만듬
      내부 클래스 InnerClass 객체를 만듬
   7. 추상클래스는 Animal1을 만들고 추상메서드(리턴타입 void 파라미터 없고 메서드명 animalSound1)만듬
	  일반 메서드는 void 파라미터 없는 sleep를 만듬(내용은 쿨쿨 출력)
	  animal1을 상속한 클래스 Pig1 클래스를 만듬(구현한 메서드 내용은 마음대로)
   8.인터페이스 Animal2를 만듬(메서드는 7번의 메서드 2개 사용)
	 구현한 클래스 Dog1 클래스를 만듬(메서드 내용 마음대로)
*/