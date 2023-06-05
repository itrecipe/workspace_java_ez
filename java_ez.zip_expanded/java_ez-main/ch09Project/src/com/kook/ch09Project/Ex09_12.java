package com.kook.ch09Project;

public class Ex09_12 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("01");
		/* ������ �� ���ڿ��� �Ķ���ͷ� ���� ������(���ڿ� + 16������ ���� char�迭 ����� ó��)
		   new StirngBuffer()�� �ʱ�ȭ ���ڿ� ���� ũ�Ⱑ 16�� char�迭 ����� ó��
		   new StirngBuffer(int length)�� �ʱ�ȭ ���ڿ��� ���� char�迭 ũ�⸸ ����
		*/
		
		StringBuffer sb2 = sb.append(23);
		/* append�� �Ķ���ͷ� ��� ���������� ����� �� �ִ� �����ε��� �޼����̰�
		   ������ �ڱ� �ڽ� ��ü sb2�� sb�� �ּҰ� ���� ��ü
		   append�� chaining���(�޼��带 ��� �����Ͽ� ��밡��)
		*/
		sb.append('4').append(56); //sb�� ���� ����Ǹ� �ּ� ���� sb2�� ���� �����ϰ� �����
		
		StringBuffer sb3 = sb.append(56);
		sb3.append(9.0); //sb,sb2,sb3�� ���� ��� �����
		
		System.out.println("sb = " + sb);
		System.out.println("sb2 = " + sb2);
		System.out.println("sb3 = " + sb3);
		
		System.out.println("sb = " + sb.deleteCharAt(10)); 
		//sb(������).deleteCharAt(10) : ���ι�ȣ 10���� �ִ� ���� �ϳ��� �����ϰ� sb�ڽ��� ��ȯ 
		System.out.println("sb = " + sb.delete(3,6));
		//���ι�ȣ 3������ 6-1������ ���ڸ� ������ �ڽ��� ��ȯ
		System.out.println("sb = " + sb.insert(3,"abc"));
		//���ι�ȣ 3���տ� abc ����
		System.out.println("sb = " + sb.replace(6, sb.length(), "END"));
		//���ι�ȣ 6������ ũ��-1(������ ���ι�ȣ)������ END�� ��ü
		
		System.out.println("capacity = " + sb.capacity()); //������ũ��
		System.out.println("length = " + sb.length()); //���ڰ���
		
		boolean b = Boolean.parseBoolean("Valid");
		/* boolean���� ���ڿ� true,false boolean���� ��ȯ
		   �������� ��� false
		*/
		
		System.out.println(b);

		boolean b1 = Boolean.getBoolean("isValid");
		System.out.println(b1);
	}

}
