package com.kook.ch09Project;

import static java.lang.Math.*; //MathŬ������ ��� ����� Math.���� ���
import static java.lang.System.*; //System�� ��� ����� System.���� ���

public class Ex09_13 {

	public static void main(String[] args) {
		double val = 90.7552;
		out.println("round(" + val + ") = " + round(val));
		/* System�� Math��� �����ϰ� ��� ���
		   long round��(double d)���� ó��- �Ҽ��� ù�ڸ����� �ݿø� long�� ����
		*/
		
		val *= 100; //val = val * 100;
		out.println("round(" + val + ") = " + round(val));
		//�Ҽ��� 3° �ڸ����� �ݿø�
		out.println("round(" + val + ")/100 = " + round(val) / 100);
		out.println("round(" + val + ")/100.0 = " + round(val) / 100.0);
		//long�� double�� ������ double
		out.println(); //�׳� ���� ����ִ� �뵵
		out.printf("ceil(%3.1f) = %3.1f%n", 1.1, ceil(1.1));
		//double java.lang.Math.ceil(double a)�� double�� �޾Ƽ� ������ �ø��� double�� ��ȯ
		out.println("floor()�޼���� ������ ����" + floor(1.5));
		//double java.lang.Math.floor(double a)�� double���� �޾� ������ ������ double�� ��ȯ
		out.println("rint()�޼���� ���� ����� ������ ���� ��ȯ�ϳ�, ���߾��� ���� .5��" 
		            + "¦������ ��ȯ" + rint(1.5));
		
		//����ó��
		out.println("����� ó���� ����� ������ �ݿø� -1.6 : " + round(-1.6));
		out.println("����� ó���� ����� ������ �ݿø� : " + round(-1.3));
		out.println("����� ó���� �߾� ū���� �ݿø� -1.5 : " + round(-1.5));
		out.println("����� ó���� ū������ ������ �ø� : " + ceil(-1.5));
		out.println("����� ó���� �������� ������ ���� : " + floor(-1.5));
		
	}
}
