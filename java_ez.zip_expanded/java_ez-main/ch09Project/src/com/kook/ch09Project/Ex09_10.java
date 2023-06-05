package com.kook.ch09Project;
//��.��
public class Ex09_10 {

	public static void main(String[] args) {
		int iVal = 100;
		String strVal = String.valueOf(iVal);
		/* StringŬ������ Ŭ������(static)�޼����� valueOf()�� 
		   �Ķ����; ���������� �޸��ϴ� �����ε��� �޼������ 
		*/
		
		double dVal = 200.0;
		String strVal2 = dVal + ""; //���ڿ��� �����ϸ� ���ڿ�(+�� ���տ�����)
		
		//�� wrapperŬ����(�⺻���� Ŭ���������� ó��)�� parse�������� �޼��带 �̿� �⺻������ ����
		double sum = Integer.parseInt("+" + strVal) + Double.parseDouble(strVal2);
		/* parse(�������¹��ڿ�)�� �ƴϸ� ��ȯ x
		   +���� ���ڿ� ��ȯ�� JDK 1.7���� ����
		   valueOf()�޼��带 ����Ͽ� ��ȯ
		*/
		double sum2 = Integer.valueOf(strVal) + Double.valueOf(strVal2);
		//parse�� �⺻������ ��ȯ�ϰ�, valueOf�� Ŭ���������� ��ȯ
		//�⺻���� Ŭ���������� ��ȯ�� �ڽ�(����)����� ó����
		System.out.println(sum);
		System.out.println(sum2);
	
		System.out.println(String.join("",strVal,"+",strVal2," = ") + sum);
		/* String join(CharSequence delimiter, CharSequence... elements)
		   Join(������, ���� �Ķ���ʹ� ���ڿ��� �̿��� ����� ���ڿ��� ����� ��
		   ...�� �Ķ���� ���� ������(varargs) --���⼱ 4���� �Ķ����(����) ���
		*/
		System.out.println(strVal + "+" + strVal2 + " = " + sum2);
		
		//parseInt("���ڹ��ڿ�",����)�� ������ ���� �ִ� ���ڵ� ��밡��
		//parseInt("abc123",16)�� 16������ a,b,c,d,e,f�� �����Ƿ� ��ȯ ����
	}
}