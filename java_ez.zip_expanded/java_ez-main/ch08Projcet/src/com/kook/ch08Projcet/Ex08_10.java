package com.kook.ch08Projcet;
//��.��
import java.io.File;

public class Ex08_10 {

	public static void main(String[] args) {
		
		try {
			File f = createFile(args[0]); //main�޼��忡�� ȣ��
			System.out.println(f.getName() + "������ ���������� ������");
		}
		catch(Exception e) {
			System.out.println(e.getMessage()+" �ٽ� ���ϸ� �Է�");
		}

	}
	
	static File createFile(String fileName) throws Exception {
		//�ڽ� �޼ҵ带 ȣ���� main�޼ҵ�� ����ó�� ����
		if(fileName==null || fileName.equals("")) {
			throw new Exception("���ϸ��� ��ȿ���� ����");
			//���� �߻��� �� �޼��� �ȿ��� try~catch�� ó�� ���ϰ� ȣ���� �޼���� ó�� ����
			//����ó���� ���Ƿ� ȣ�� �޼���� ��
		}
		File f = new File(fileName);
		f.createNewFile(); //File��ü�� ���� ���� �����
		
		System.out.println("������ ������Ʈ �ؿ� ������--refresh�ؾ� ����");
		return f;
	}
}
