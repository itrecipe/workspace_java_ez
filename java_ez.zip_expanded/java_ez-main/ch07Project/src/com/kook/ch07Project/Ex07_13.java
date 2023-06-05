package com.kook.ch07Project;
//���ܺ�������(����������)
public class Ex07_13 {
	
	int outerV = 100;
	
	class InstanceInner { //�ν��Ͻ��� ���� Ŭ����
		
	}
	
	static class StaticInner { //staticŬ����(Ŭ������)
		
	}
	
	InstanceInner iv = new InstanceInner();
	//�ν��Ͻ��� ������� iv �ν��Ͻ� ����Ŭ������ ��ü�� �ٷ� ���
	static StaticInner cv = new StaticInner();
	//Ŭ������ ��� ���� cv�� Ŭ������ ���� Ŭ������ �ٷ� ���
	
	//outerŬ������ Ŭ������ ��� �޼���
	static void staticMethod() {
		//static�޼���� �ν��Ͻ������ ���� ������ �� ����.(�ν��Ͻ������ü�� ����� ����)
		//InstanceInner obj1 = new InstanceInner(); //���� �Ұ�
		//static�޼��� �ȿ��� static���� Ŭ�����δ� �ٷ� ���ٰ���
		StaticInner obj2 = new StaticInner();
		//�ν��Ͻ� ���� Ŭ������ �����Ϸ��� �θ�(outer��ü)��ü�� ����� ����
		Ex07_13 outer = new Ex07_13();
		InstanceInner obj3 = outer.new InstanceInner();
		//�Ϲ�Ŭ������ static�޼���ȿ��� �ڱ� Ŭ������ �ν��Ͻ���� ���ٽ� �ڱ�Ŭ���� ��ü�� �����Ͽ� ����
	}
	
	void instanceMethod() {
		/* �Ϲ�Ŭ������ �ν��Ͻ��޼��忡�� �ڱ� Ŭ������ �ν��Ͻ������ Ŭ������� ���ٽô� ��ü�� ����ų�
		   �ڱ� Ŭ����(�ܺ�Ŭ����) �̸� ���� �ٷ� �����ϴ� ��Ģ�� ��� */
		InstanceInner obj1 = new InstanceInner();
		StaticInner obj2 = new StaticInner();
		//LocalŬ������ �ۿ��� ������(���ú���ó�� ���x)
		//LocalInner Iv  = new LocalInner();
	}
	
	void myMethod() {
		class LocalClass {
			
		}
		LocalClass lv = new LocalClass(); //�޼���ȿ����� �ٷ� ��밡��
	}
	
	//main�޼���
	public static void main(String[] args) {
		staticMethod(); //main�� static�̹Ƿ� static����� staticMethod()�� �ٷ� ȣ����
		
		Ex07_13 outer = new Ex07_13();
		outer.instanceMethod(); 
		//static�޼���ȿ��� �ڱ� Ŭ������ �ν��Ͻ���� ���ٽ� �ڱ� Ŭ���� ��ü ����� ����
		//outer.staticMethod(); //�ڱ�Ŭ������ü.Ŭ��������� ��������� ���� �ǰ�
	}
}