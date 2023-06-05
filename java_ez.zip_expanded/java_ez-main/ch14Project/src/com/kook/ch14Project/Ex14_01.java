package com.kook.ch14Project;

public class Ex14_01 {

	public static void main(String[] args) {
		
		//MyFunction �������̽� ��ü�� ���ٽ����� �߻�޼��带 �����Ͽ� ����
		MyFunction01 f1 = () -> {
			System.out.println("f1.run()");
		};
		
		/*
		  - ������ (�Ʒ��ڵ�ó�� ���ٷε� �ۼ������ϴ�.)
		  MyFunction f1 = () -> System.out.println("f1.run()");
		*/
		
		//����ó�� �͸��� ��ü ���
		MyFunction01 f2 = new MyFunction01() {
			@Override
			public void run() {
				System.out.println("f2.run()");
				
			}
		};
		
		MyFunction01 f3 = getMyFunction();
		
		//���� ���ô� ���ٽ����� ������ �߻�޼��带 ȣ���Ͽ� ���
		f1.run();
		f2.run();
		f3.run();
		
		//�Ķ���ͷ� ���ٽ��� ����ϴ� �Լ��� �������̽� ��ü ���
		execute(f1);
		execute(() -> System.out.println("run()"));
	}	
		static MyFunction01 getMyFunction() {
			//��ȯ�� MyFunction��ü�� ���ٽ��� �̿��� ���� ��ȯ
			MyFunction01 f = ()-> System.out.println("f3.run()");
			return f;
			//������ return()-> System.out.println("f3.run()");
		}
		
		//�Ķ���ͷ� ���ٽ��� ����ϴ� �Լ��� �������̽� ��ü ��� �޼���
		static void execute(MyFunction01 f) {
			f.run();
		}
		
	}


/* - ���ٽ��� ����Ϸ��� ���ٽ��� ������ �߻�޼��尡 �ִ� �Լ��� �������̽��� ����
   - �Լ��� �������̽��� �߻�޼��尡 �ϳ��� �ִ� �������̽�
*/
@FunctionalInterface
interface MyFunction01 {
	//�Լ��� �������̽��̹Ƿ� �߻�޼��� �ϳ��� ����
	/*public abstract : �����ص� �Ǹ�, �߻��̹Ƿ� ��常 �ִ�.*/ void run();
}