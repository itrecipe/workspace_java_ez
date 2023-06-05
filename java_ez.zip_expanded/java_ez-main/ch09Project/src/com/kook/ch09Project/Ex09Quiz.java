package com.kook.ch09Project;

public class Ex09Quiz {

	public static void main(String[] args) {
		//1
		Integer myInt = 5;
		//Integer myInt1 = new Integer(5); �ڹ�9���� ���� �ǰ�
		
		//2 
		Double myDouble = 5.99; // �Ҽ��� ���ڴ� �⺻�� double
		//3
		Character myChar = 'A';
		 
		//4. Wrapper Class�� toString()�� ������ ����ϵ��� �̹� Override��
		System.out.println(myInt.toString()); //toString()�� �ڹ������Ϸ��� �ڵ����� ��������
		System.out.println(myDouble);
		System.out.println(myChar);
		
		//5.
		//�� �ڵ�
		Integer strInt = Integer.valueOf(1);
		Double strDouble = Double.valueOf(2);
		Character strChar = Character.valueOf('3');
		
		/* �⺻���� String������ ��ȯ�ϴ� �޼��� valueOf()
		   �Ųٷ� ���ڿ� ��ü�� �⺻������ �ٲٴ� valueOf()�� ����(��ȯ�� wrapperŬ������ ��ȯ)
		   parseData��(���ڿ�)�� ����ϴ°͵� ����(��ȯ�� �⺻��)
		*/
		
		//�����ڵ�
		String strInt1 = String.valueOf(myInt);
		String strDouble1 = String.valueOf(myDouble);
		String strChar1 = String.valueOf(myChar);
		
		/* �̷��Ե� �ۼ�����
		   String strInt1 = myInt.toString();
		   String strDouble1 = myDouble.toString();
		   String strChar1 = myChar.toString();
		*/
		
		//6
		//�� �ڵ�
		System.out.println(strInt);
		System.out.println(strDouble);
		System.out.println(strChar);
		//�����ڵ�
		System.out.println(strInt1);
		System.out.println(strDouble1);
		System.out.println(strChar1);
		
		//7
		String greeting = "Hello World"; //new �����ڻ���ϴ°ͺ��� �ǰ���
		
		//8
		//���ڿ��� ���ڰ����� length()�޼��� ��� Ư������,���� ���� �������
		System.out.println("greeting ���ڼ�: " + greeting.length());
		
		//9
		greeting = greeting.toUpperCase();
		System.out.println(greeting);
		
		//10
		//���ڵ�
		System.out.println("john " + "Doe");
		System.out.println("john ".concat("Doe"));
		
		//���� �ڵ�
		String anNyoung = "Hello World";//�ǰ���� �Դϴ�
		StringBuffer a = new StringBuffer(anNyoung);
		System.out.println(a.append("John").append("Doe"));
		
		
		//11.
		//���ڵ�
		int idx = greeting.indexOf('e'); //���ڿ����� ��ó�� ��ġ�ϴ� ���� ���ι�ȣ ��ȯ
		System.out.println("index : " + idx);
		
		//�����ڵ�
		char result = greeting.charAt(1);
		System.out.println(result);
		
		//12
		//�� �ڵ�
		int x = 5;
		int y = 7;
		System.out.println(greeting.indexOf("e"));
		System.out.println(Integer.compare(x, y));
		
		//�� �ڵ�
		int x1 = 5;
		int y1 = 7;
		System.out.println(Math.max(x, y));
		System.out.println(Math.min(x, y));
		
		//13
		int z = (int) Math.sqrt(16);
		System.out.println(z);
		
		//14
		StringBuffer sb = new StringBuffer("abcdef"); 

		//15
		System.out.println(sb +"12345"); //StringBuffer�� toString()�� �������̵� ��
		System.out.println(sb.append("12345"));
	}
}

/* 1.int�� ��ü�� ���� myInt�� �����ϰ� �ʱⰪ 5�� ����
   2.double ��ü�� ���� myDouble�� �����ϰ� �ʱⰪ 5.99����
   3.char ��ü�� myChar�� �����ϰ� �ʱⰪ A����
   4.1,2,3 ���
   5.1,2,3 ������ ���ڿ� ���� strInt,strDouble,strChar�� ��ȯ
   6.5�� ������ �� ���� ���
   7.���� Hello World�� ���ڿ� ���� greeting�� ����
   8.7���� greeting ������ ���ڼ��� ���
   9.7���� ���ڿ��� ��� �빮�ڷ� ��ȯ�Ͽ� ���
   10.John�� Doe�� �����Ͽ� ���
   11.7�� greeting�������� e������ ���ι�ȣ �˾Ƴ���
   12.x�� 5�̰� y�� 7�ε� ���� ū���� ����
   13.z�� 16�ε� ��Ʈ�� ����
   14.���ڿ� abcdef�� ���� StringBuffer��ü sb ����
   15.sb�� ���ڿ� 12345 ���̱�
*/