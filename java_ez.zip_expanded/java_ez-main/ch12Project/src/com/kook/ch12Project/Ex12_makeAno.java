package com.kook.ch12Project;
//���ܿ���(���翡 ���� ����-�߰�����)
@TestInfo(
	count=3, testedBy="kim",testTools= {"JUnit", "AutoTester"}, testType=TestType.FIRST,
	testDate=@DateTime(yymmdd="160101", hhmmss="235959") 
)
public class Ex12_makeAno {

	public static void main(String[] args) {
		
		System.out.println("������̼� Ȱ��");
	}
}

//������̼� �����
@interface TestInfo { //@interface�� ������̼��� ����
	//�߻�޼��� �������� ������̼ǿ��� ����� ��Ҹ� �����(��, �Ķ���ʹ� ���� �޼��� ����)
	int count();
	String testedBy();
	String[] testTools();
	TestType testType(); //enum�� ����Ҷ� ���, enum TestType{FIRST,SECOND}
	DateTime testDate(); //TestDate�� �ٸ� ������̼�
}

enum TestType {
	FIRST, SECOND
}

@interface DateTime {
	//�������̽� ������Ҵ� �߻�޼��� ����
	String yymmdd(); //�߻�޼�������
	String hhmmss();
}