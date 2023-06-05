package com.kook.ch09Project;
//��.��
public class Ex09_02 {

	public static void main(String[] args) {
		Person p1 = new Person(8011081111222L); //long���̶� ���ڵ� L(�����̶�¶�)�� �ٿ���
		Person p2 = new Person(8011081111222L);
		//����������(�ּҰ�)�� �ٸ�, ����� ���� ������
		
		//equals()�޼���� PersonŬ�������� Object�� ���� �������� �޼���
		if(p1.equals(p1)) {
			System.out.println("p1�� p2�� ���� ����̴�.");
		} else { 
			System.out.println("p1�� p2�� �ٸ� ����̴�.");
			
		}
		p1.test("kook");
		p1.test1("kook1");
		
	}
}

/*extends Object : ������, ����ص� ����������� ���� �ۼ��� �ʿ�� ����*/
class Person {
	long id;
	//������
	Person() {
		super();
	}
	
	Person(long id) {
		this.id = id;
	}
	
	//����� Object�� equals()�޼��带 ������
	@Override
	public boolean equals(Object obj) { //����� Object�� ����� �״�� ���
		if(obj instanceof Person) {
			//PersonŬ������ ���� ��ü�Ͻÿ��� ��, �ٸ� Ŭ������ ���� ��ü�� ��� ������ false
			return id == ((Person)obj).id;
			/* obj�� ���� Ŭ������ Object�� ��ü�̹Ƿ� ����Ŭ������ Person�� ����� ����Ϸ���
			����Ŭ������ ����ȯ�� ������� */
		}
		return false;
	}
	//���翡 ���� ����
	public void test(Object obj) {
		String str = (String) obj; //����Ŭ������ ���ڿ��� �޾� ����Ŭ���� ojb�� ���ڿ��� ��ȯ
		//obj��ü�� ����Ŭ������ ��� �޼��峪 ��������� ���
		System.out.println("str�� : " + str);
		//���� ���� obj�� String�̰� String���� toString()�� �����Ǿ� �־� ���������� �� ��µ�.
		System.out.println("obj " + obj);
	}
	public void test1(String str) {
		Object obj = str; //���� Ŭ������ ����ϸ� Object�� ����� ��밡��
		//�Ķ���Ͱ� �ƴѰ��� ���� Ŭ������ �����ϸ� ���� ���Ե� ��ü�� ��� ���
		System.out.println("obj �� : " + str);
	}
}