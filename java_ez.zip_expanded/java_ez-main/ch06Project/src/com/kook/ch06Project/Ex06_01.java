package com.kook.ch06Project;

//��� ���� ����(��������¦�ٸ�)
public class Ex06_01 {
	public static void main(String[] args) {
		//Ŭ����(����� �ν��Ͻ����� ������)�� ����Ϸ��� ��ü�� �����ؼ� �����.
		Tv t = null; //�޼������ ���� �̹Ƿ� ���� ������ �⺻���� ����
		System.out.println(t); //t���� �������̹Ƿ� �ּҰ���
		
		t = new Tv(); //��ü����(�ν��Ͻ�), t�� �ּҰ� �����.
		
		Tv t1 = new Tv(); //t1��ü �����ϰ� �ּҰ� �־���.
		System.out.println(t1);
		//�ν��Ͻ��� ��������� ��� �޼���� ��ü.�̸����� ����
		t.channel = 6;
		t1.channel = 7;
		
		t.chnnelDown();
		t1.chnnelDown();
		System.out.println("���� ä�� t��  " + t.channel + " �Դϴ�.");
		System.out.println("���� ä�� t1�� " + t1.channel + " �Դϴ�.");

	}
}

//���� Ŭ������ ������ �ۼ��ϱ����� �ٸ� Ŭ������ ���� �����Ұ�
class Tv {
	//Ŭ������ ��������� ��� �޼���� ������(Ư�� �޼����� ������ ����)
	//����� �ν��Ͻ����� static��(Ŭ������)���� ���е�.
	//�ν��Ͻ����� ��ü�� �����ؼ� ����ϰ�, Ŭ�������� ��ü�� �������� �ʰ� Ŭ���������� �����.
	//�ν��Ͻ����� String str; str.charAt(3)
	//Ŭ�������� Math.random(_)
	
	//��������� ��� ��������(�⺻��,������) ���
	//��������� ���� ������ �޸� �⺻���� ����(���� ����)
	//�⺻ �� �������� 0,0,0 char�� ' ', boolean false, �������� �⺻���� null
	String color; //null
	boolean power; //false
	int channel; //0
	
	//����޼���
	void power() { 
		power = !power; 
	} //!�����������ڷ� �ݴ밪���� ����
	
	void chnnelUp() {
		++channel; 
	}
	void chnnelDown() {
		--channel; 
	} 
	
	//Ư�� �޼����� �����ڴ� ��������� ������ �ڹ� �����Ϸ��� ���� �����ڸ� �߰�
	/*
	 * public Tv(){
	 * 	super(); <- ������ �̰� �ִµ� ������.
	 * }
	 * 
	 * */
}