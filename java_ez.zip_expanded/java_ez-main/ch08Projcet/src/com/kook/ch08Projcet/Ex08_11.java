package com.kook.ch08Projcet;
//��.��
public class Ex08_11 {

	public static void main(String[] args) {
		try {
			startInstall();
			copyFiles();
		}
		catch (SpaceException se) {
			//�����ڰ� ���� SpaceException ���
			System.out.println("���� �޽��� : " + se.getMessage());
		}
		catch (MemoryException me) {
			//�����ڰ� ���� MemoryException ���
			System.out.println("���� �޽��� : " + me.getMessage());
		}
		finally {
			//���ܰ� �ִ� ���� ������ ó��
			deleteTempFiles();
		}
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		//�� �޼��� ����� ������ SpaceException, MemoryException ����ó��
		if(!enoughSpace()) {
			throw new SpaceException("��ġ���� ����");
		}
		if(!enoughMemory()) {
			throw new SpaceException("�޸� ����");
		}
	}
	
	static boolean enoughSpace() {
		return true;
	}
	static boolean enoughMemory() {
		return false;
	}
	
	static void copyFiles() {
		System.out.println("���� ī��");
	}
	
	static void deleteTempFiles() {
		System.out.println("delete �ӽ� ����");
	}
}

class SpaceException extends Exception {
	//����ó�� Ŭ���� - Exception(�ֻ��� ����)�� ����� �����ڰ� ����� ����ó�� Ŭ����
	//�����ڿ��� ����� JDK�� �����ڸ� Ȱ��
	SpaceException(String msg) {
		// ���ܰ��� �޽����� ���� ��ü�� �߰����ֱ�� super(Exception�� Ȱ��)
		super(msg);
	}
}

class MemoryException extends Exception {
	//����ó�� Ŭ���� - Exception(�ֻ��� ����)�� ����� �����ڰ� ����� ����ó�� Ŭ����
	MemoryException(String msg) {
		super(msg);
	}
}