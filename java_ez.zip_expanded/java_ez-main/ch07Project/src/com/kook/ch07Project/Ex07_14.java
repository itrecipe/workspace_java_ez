package com.kook.ch07Project;
//���ܺ�������(����������)
public class Ex07_14 {
	//��� ����
	private int outerIv = 0; //Ex07_14Ŭ���� �ȿ����� ���
	static int outerCv = 0; 
	//���������ڰ� �����Ƿ� (default)�̹Ƿ� �� ��Ű���ȿ��� ��𼭳� ��밡��
	
	class InstanceInner { //�ν��Ͻ��� ���� Ŭ������ �θ�Ŭ������ ��� �̹Ƿ� �ٸ� ��� ��밡��
		int liv = outerIv;
		int liv2 = outerCv;
	}
	
	static class StaticInner { //Ŭ������ ���� Ŭ����
		//static�� static����� �״�� ����ϳ� �ν��Ͻ������ �ܺΰ�ü�� ����� ���
		//int siv = outerTv;
		static int scv = outerCv;
		
	}
	
	void myMethod() {
		int lv = 0; //�޼����� ������ ���� ����
		/*final*/ int LV = 0; 
		//�޼����� ������ ���� �����ε� LocalŬ�������� ����� ���� final���(�ڹ�1.8���� ��������)
		
		//���� Ŭ����
		class LocalInner {
			//�ܺ�Ŭ���� ����� ��� ��밡��(Ŭ������ �ν��Ͻ� �ٷ� ����)
			int liv = outerIv;
			int liv2 = outerCv;
			//�ڹ� 8������ final�� ���� ���������� ��밡�������� ������ final����
			//LV = 4; //final�̹Ƿ� ����Ұ�
			int liv3 = lv;
			int liv4 = LV;
		}
	}
	
	public static void main(String[] args) {

	}
}
