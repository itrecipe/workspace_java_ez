package com.kook.ch06Projcet_Test;

public class Ex06_invoke_Test {

	public static void main(String[] args) {
		
		TestClass tc = new TestClass();
		tc.instanceMethod2(); //다른 클래스의 클래스 메서드 클래스명 메서드명으로 사용가능
		 TestClass.staticMethod2();
		
	}
}
		class TestClass{
						//동일 클래스에서 메서드 호출
			int iv; //	인스턴스 변수
			static int sv; //클래스 변수
			
			void instanceMethod() { //인스턴스 메서드
						//인스턴스 메서드 안에서는 동일 클래스의 인스턴스 변수나 클래스 변수 모두 변수명으로 접근
				iv = 10;
				sv = 20;
				
			}
			static void staticMethod() { //클래스 메서드
				//iv = 20; 클래스 메서드 안에선 인스턴스 변수는 이름으로 접근x
				
				TestClass tc = new TestClass();
				tc.iv = 20;
				sv = 30;
			}
				void instanceMethod2() { //인스턴스 메서드
					instanceMethod();
					//인스턴스 메서드 안에서 동일 클래스의 인스턴스 메서드 호출은 동일 메서드명으로 호출
				   staticMethod();
				   //인스턴스 메서드 안에서 동일 클래스의 클래스 메서드 호출은 동일 메서드명으로 호
					
				}
				static void staticMethod2() {//클래스 메서드
					//instanceMethod(); 클래스 메서드내에서 동일 클래스 인스턴스메서드는 메서드명으로 호출x
					TestClass tc = new TestClass();
					tc.instanceMethod(); //객체를 생성해서 사용하는것은 가능
					staticMethod();
					
					
				}
			}
		