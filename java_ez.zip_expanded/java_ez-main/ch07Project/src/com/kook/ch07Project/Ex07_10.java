package com.kook.ch07Project;

public class Ex07_10 {

	public static void main(String[] args) {
		Unit[] group = {new Marine(), new Tank(), new Dropship() };
		//�߻�Ŭ������ ��ü�� ����� �� �ִ�.(������)
		//�߻�Ŭ������ ����Ͽ� �߻�޼��带 ������ ���� Ŭ������ �Ϲ�Ŭ������ ��ü�� ����
		for(Unit u:group) {
			//u�� group�迭�� ���� ������ ��ü�� move �޼��� ȣ��
			u.move(100, 200);
		}

	}
}

