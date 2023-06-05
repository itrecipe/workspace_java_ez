package com.kook.ch07Project;
//���� ���� - ���翡 ���� ����

//ĸ��ȭ�� ���� Ŭ����
public class TimeDTO {
	//ĸ��ȭ�� ���ؼ� �ٸ� Ŭ�������� ��������� �ٷ� ������ �Ұ����� private�� ���
	//������� ������ getter�� setter�޼��带 ���ؼ� ��
	//private ���������ڴ� �ڱ�Ŭ������������ ���ٰ���
	private int hour;
	private int minute;
	private int second;

	//��Ŭ���� ���� getter, setter, �����ڸ� ������ֱ� Ȱ��
	/* ��� Ŭ������ Ŀ���� ��� ��Ŭ�� -> source���� -> 
	   1.generate constructor using superclass(����Ŭ����(�⺻) ������ �������)
	   2.generate constructor using fields(��������������� �����ϴ±��) 
	   3.gennerate getters and setters (getter & setter �������)
	*/
	
	//�⺻ ������
	public TimeDTO() {
		super();
	}

	//��� ��������� ����ϴ� ������
	public TimeDTO(int hour, int minute, int second) {
		super();
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//�� ��������� ���� get�޼���� set�޼���
	//get�޼���� ������� ��ȯ
	//set�޼���� ������� ����
	//�̸��� get���������, set��������� (��������� ù�ڸ� �빮��(ī�����̽�)�� ���)
	//get�޼���� ���ϰ��� �ش� ����������� ��ȯ(�������� ��������� ������ ��)
	//set�޼���� return���������� void, �Ķ���ʹ� ������ ��������� ���
	public int getHour() {
		return hour;
	}

	public int getMinute() {
		return minute;
	}

	public int getSecond() {
		return second;
	}

	public void setHour(int hour) {
		this.hour = hour;
	}

	public void setMinute(int minute) {
		this.minute = minute;
	}

	public void setSecond(int second) {
		this.second = second;
	}
}
