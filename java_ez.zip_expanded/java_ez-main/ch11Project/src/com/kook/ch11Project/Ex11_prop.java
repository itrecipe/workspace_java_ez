package com.kook.ch11Project;

import java.io.*;
import java.util.*;
//���翡 ���� ����-���ܿ���
public class Ex11_prop {

	public static void main(String[] args) {
		/* Propertise���, (���α׷��� ���� ���Ϸ� ���)
		   HashTable�� �̿��ϹǷ� Mapó�� ���
		   (��, key�� value�� String, String)
		*/
		Properties prop = new Properties();
		
		//setProperty(String key, String value)
		prop.setProperty("timeout", "30");
		prop.setProperty("language", "Korean");
		prop.setProperty("size", "10");
		prop.setProperty("capacity", "10");
		
		//���� Properties�� �ܺ� ���Ͽ� ����
		
		try {
			//�Ϲ� �ؽ�Ʈ���� ����
			prop.store(new FileOutputStream("output.properties"), "Properties Exam"); 
			/*-store(������ ���� ����, �ּ�)
			   public void store(OutputStream out, String comments)
               throws IOException
			  -FileOutputStream�� �ڹ��� ����� ó������ Ŭ������ ���Ͽ� ������ �ۼ��ҽ� ���
			  -OutputStream outsms ��� ��ü, comments�� ������Ƽ���Ͽ� �ۼ��� �ּ�
		    */
			
			//�ۼ��� ������ ������ xml������
			prop.storeToXML(new FileOutputStream("output.xml"), "Properties Exam");
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
}