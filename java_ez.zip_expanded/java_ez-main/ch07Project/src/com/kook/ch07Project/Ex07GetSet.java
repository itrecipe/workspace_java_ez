package com.kook.ch07Project;
//���� ���� - ���翡 ���� ����
public class Ex07GetSet {

	public static void main(String[] args) {
		//TimeDTO�� �̿��ϱ�
		TimeDTO dto = new TimeDTO(12,35,40);
		//int hour = dto.hour; TimeDTO�� ����������� ��� ���������ڰ� private�̹Ƿ� ������ �Ұ�
		//������ ���������ڰ� public�� �޼��带 ���� �����ؾ���.
		//����������� get�޼���� ��� ����, (����)�� set�޼���� ����.
		System.out.println("hour : " + dto.getHour());
		System.out.println("minute : " + dto.getMinute());
		System.out.println("second : " + dto.getSecond());
	
		//���� ����� �ش� ��������� set�޼��带 ���
		dto.setHour(10);
		dto.setMinute(32);
		dto.setSecond(44);

		System.out.println("hour : " + dto.getHour());
		System.out.println("minute : " + dto.getMinute());
		System.out.println("second : " + dto.getSecond());
	}
}
