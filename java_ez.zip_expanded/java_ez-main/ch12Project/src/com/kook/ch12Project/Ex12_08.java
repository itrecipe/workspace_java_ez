package com.kook.ch12Project;

import java.lang.annotation.*;
@Deprecated
@SuppressWarnings("1111") //value��� �ϳ��̹Ƿ� value�� ���� ���� 1111, ��ȿ���� ���� �ֳ����̼��� ���õȴ�.
/*
@Target(value={TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
@Retention(value=SOURCE)
 */
@TestInfo1(testedBy="kim", testDate=@DateTime1(yymmdd="160101", hhmmss="235959"))
//������ ��� count, testTools, testType�� default���� �����ϹǷ� �ۼ� ����
public class Ex12_08 { //@Derprecated�� ����ؼ� deprecated(�輱)ǥ�ð� ��

	public static void main(String[] args) {
		//Class Class<T>
		Class<Ex12_08> cls = Ex12_08.class; //��� Ŭ������ ��ü�� �ڹ������� �������� Ŭ���������� �ȴ�.
		
		TestInfo1 anno = cls.getAnnotation(TestInfo1.class);
		System.out.println("anno.testedBy() : " + anno.testedBy());
		/* - ������̼��� ����ϴ� Ŭ������ ���Ե� ������̼� ��ü�� getAnnotation(TestInfo1.class)���� ��´�.
	       - ������̼ǿ� ������ ��ҵ��� ���� �˾Ƴ���� ������̼� ��ü.������̼��� ���(�޼��� ����)
	    */
		System.out.println("anno.testDate().yymmdd() : " + anno.testDate().yymmdd());
		System.out.println("anno.testDate().hhmmss() : " + anno.testDate().hhmmss());
		
		for(String str : anno.testTools())
			System.out.println("testTools : " + str);
		
		System.out.println(); //�ڹٴ� JUnit ���
		
		/* getAnnotations()�� Ŭ�������Ͽ� ����ϴ� ��� ������̼��� �迭�� ��ȯ
		   ��ȿ���� ���� SuppressWarnings�� �����ϰ� ��ȯ (��, ������ Ʋ���ٴ� �ǹ��̴�.)
		*/
		Annotation[] annoArr = cls.getAnnotations();
		
		for(Annotation a : annoArr)
			System.out.println(a);
	}
}

@Retention(RetentionPolicy.RUNTIME) //����� ��밡���ϵ��� ����(RetentionPolicy : CLASS, SOURCE �����ϰ� ����)
@interface TestInfo1 {
	int count() default 1;
	String testedBy();
	String[] testTools() default "JUnit"; //�迭�ε� ���� �ϳ��̹Ƿ� { } ����
	TestType1 testType() default TestType1.FIRST; //enum�� ����Ҷ� ���, enum TestType{FIRST,SECOND}
	DateTime1 testDate(); //TestDate�� �ٸ� ������̼�
}

@Retention(RetentionPolicy.RUNTIME) //����� ��밡���ϵ��� ����
@interface DateTime1 {
	String yymmdd();
	String hhmmss();
}

enum TestType1 {
	FIRST, FINAL
}