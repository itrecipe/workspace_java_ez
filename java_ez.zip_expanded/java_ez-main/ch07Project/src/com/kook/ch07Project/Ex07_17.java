package com.kook.ch07Project;
//���ܺ�������(����������)

//�͸� Ŭ���� �����
public class Ex07_17 {
	//�ٷ� �ش� ���� Ŭ������ �������̽� ��������(��ü)�� ���ϴ� ��ġ�� ����� ���
	
	//�ν��Ͻ���
	Object iv = new Object() { //������ �� �����θ� ����� ���� Ŭ������ ó���� ������ �ۼ���
		void method() {
			
		}
	};
	
	//Ŭ������
	static Object cv = new Object() {
		void method() {
			
		}
	};
	
	//������
	void myMetgod() {
		Object lv = new Object() {
			void method() {
				
			}
		};
	}
}
