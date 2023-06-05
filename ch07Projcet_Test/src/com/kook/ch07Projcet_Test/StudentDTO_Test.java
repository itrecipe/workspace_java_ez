package com.kook.ch07Projcet_Test;

//1. StudentDTO�� ����(studentDTO.java)
public class StudentDTO_Test {
	//2. ��������� ���� ���������ڸ� private�� �Ѵ�.
	//3. ��������� name, no(�й�), grade(�г�), address, phone���� �Ѵ�.
	private String name;
	private int no;
	private String grade;
	private String address;
	private String phone;
	
	//4. �����ڴ� �⺻���� ��� ��������� �Ķ���ͷ� �ϴ� ������, name, no, grade�� �Ķ���ͷ� �ϴ� �����ڸ� ����(3��)
	
	//(1)�⺻ ������ ����
	public StudentDTO_Test() { //�⺻ ������ ����
		super();
	}
	
	//(2)��� ��������� ����ϴ� ������
	public StudentDTO_Test(String name, int no, String grade, String address, String phone) {
		super();
		this.name = name;
		this.no = no;
		this.grade = grade;
		this.address = address;
		this.phone = phone;
	}

	//(3)name,no,grade�� �Ķ���� ������ �Ѱܹ޴� ������
	public StudentDTO_Test(String name, int no, String grade) {
		super();
		this.name = name;
		this.no = no;
		this.grade = grade;
	}
	
	//5. GETTER�� SETTER �޼��带 ����
	public String getName() {
		return name;
	}

	public int getNo() {
		return no;
	}

	public String getGrade() {
		return grade;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setNo(int no) {
		this.no = no;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
}