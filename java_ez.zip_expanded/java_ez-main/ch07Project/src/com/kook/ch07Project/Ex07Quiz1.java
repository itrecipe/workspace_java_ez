package com.kook.ch07Project;

public class Ex07Quiz1 {

		public static void main(String[] args) {
			/*6. main �޼��忡�� StudentDTO��ü�� sdto�� �Ͽ� ����µ� ��ü ������ StudentDTO�� ��� ��� ������ ����ϴ�
		     �����ڸ� ����Ͽ� ����(���� �˾Ƽ� ����ֱ�) */
			StudentDTO sdto = new StudentDTO("ī����", 13, "2�г�", "������","010-1234-4321");
			
			//7. StudentDTO�� �� ��������� ���
			System.out.println("name : " + sdto.getName());
			System.out.println("no : " + sdto.getNo());
			System.out.println("grade : " + sdto.getGrade());
			System.out.println("adress : " + sdto.getAddress());
			System.out.println("phone : " + sdto.getPhone());
			
			//8. StudentDTO�� �� ��������� �����غ��ÿ�(�˾Ƽ� ����)
			sdto.setName("����");
			sdto.setNo(10);
			sdto.setGrade("1�г�");
			sdto.setAddress("��õ��");
			sdto.setPhone("010-1234-5678");
			
			//9. ���� �� ��������� ���
			System.out.println("name : " + sdto.getName());
			System.out.println("no : " + sdto.getNo());
			System.out.println("grade : " + sdto.getGrade());
			System.out.println("adress : " + sdto.getAddress());
			System.out.println("grade : " + sdto.getPhone());
		}
	}

	//1. StudentDTO�� ����(studentDTO.java)
	//2. ��������� ���� ���������ڸ� private�� �Ѵ�.
	//3. ��������� name, no(�й�), grade(�г�), address, phone���� �Ѵ�.
	//4. �����ڴ� �⺻���� ��� ��������� �Ķ���ͷ� �ϴ� ������, name, no, grade�� �Ķ���ͷ� �ϴ� �����ڸ� ����(3��)
	//5. GETTER�� SETTER �޼��带 ����
	/*6. main �޼��忡�� StudentDTO��ü�� sdto�� �Ͽ� ����µ� ��ü ������ StudentDTO�� ��� ��� ������ ����ϴ�
	     �����ڸ� ����Ͽ� ����(���� �˾Ƽ� ����ֱ�) */
	//7. StudentDTO�� �� ��������� ���
	//8. StudentDTO�� �� ��������� �����غ��ÿ�(�˾Ƽ� ����)
	//9. ���� �� ��������� ���