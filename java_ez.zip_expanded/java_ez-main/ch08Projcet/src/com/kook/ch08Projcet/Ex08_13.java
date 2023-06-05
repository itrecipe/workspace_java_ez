package com.kook.ch08Projcet;
//��.��
public class Ex08_13 {

	public static void main(String[] args) {
		try {
			install();
		}
		catch (InstallException e) {
			//���ο��� SpaceException2�� ��ϵ� InstallException���� ó��
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
		catch (Exception e) { //�ƴѰ͵��� �˴� Exception �ֻ����� �Ѿ��
			e.printStackTrace();
		}

	}
	
	static void install() throws InstallException {
		//InstallException���� �߻��� �ڽ��� ȣ���� main�޼���� ó�� ����
		try {
			startInstall();
		}
		catch (SpaceException2 e) {
			InstallException ie = new InstallException("��ġ �� ���� �߻�");
			ie.initCause(e); //�����̵Ǵ°��� �߻��� ���ܿ��� �����
			//SpaceException2 ��ü e�� ������ �Ǿ� InstallException���� ie�� �߻�
			//�ٸ� ���ܿ� ���� ������ ie�� ���� ���� e�� ���
			throw ie;
		}
	}
	
	static void startInstall() throws SpaceException2 {
		throw new SpaceException2("��ġ�� ���� ����");
		
	}
}

class SpaceException2 extends Exception {
	SpaceException2(String msg) {
		super(msg); //����Ŭ������ Exception(super)�� �������� ���ܳ����� ����ϴ� �����ڸ� ���
	}
}
class InstallException extends Exception {
	InstallException(String msg) {
		super(msg);
	}
}