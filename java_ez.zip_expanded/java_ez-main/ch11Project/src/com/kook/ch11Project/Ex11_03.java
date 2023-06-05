package com.kook.ch11Project;

import java.util.*;

public class Ex11_03 {

	public static void main(String[] args) {
		
		if(args.length != 1) {
			System.out.println("����� : ((2+3)*1)+3");
			//���۽� (�� �����ϰ� �������� )�� ���
			System.exit(0);
		}
		
		Stack st = new Stack();
		String express = args[0];
		
		System.out.println("�Է��� �� : " + express);
		
		try {			
			for(int i=0; i < express.length(); i++) {
				char ch = express.charAt(i);
				if(ch == '(') {
					st.push(ch + ""); //Stack�� �߰�
				} 
				else if(ch == ')') {
					st.pop(); //Stack�� �������� ����(������ �Է� �Ȱ� ��ȯ)
					//Object.pop()�� ���ܰ� �߻��� �� ����
					//���ܴ� Stack�� ��������� pop�� �ϸ� ����
				}
			}
			if(st.isEmpty()) {
				System.out.println("��ȣ�� ��ġ��!");
			}
			else {
				System.out.println("��ȣ�� ��ġ���� ����!");
			}
		}
		catch (EmptyStackException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println("��ȣ ����ġ!");
		}
	}

}
