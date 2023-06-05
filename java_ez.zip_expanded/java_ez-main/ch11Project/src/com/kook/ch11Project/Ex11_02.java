package com.kook.ch11Project;

import java.util.*;

public class Ex11_02 {

	public static void main(String[] args) {
		
		Stack st = new Stack(); //Stack�� Vector(List�迭)�� ����� Ŭ����
		Queue q = new LinkedList();
		/* Queue�� �������̽��̹Ƿ� �̸� ������ LinkedList�� ����
		   LIFO�� �Ǹ����� �߰��Ȱ��� ���� ���� ��ȯ��
		*/
		st.push("0"); //push()�� Stack�� ���� �߰�
		st.push("1");
		st.push("2");
		//public E push(E item) ��ü�� E�� �Ķ���ͷ� ���, ��ü�� E�� ��ȯ
		
		//Queue�� FIFO�� �߰��� ������� ��ȯ
		q.offer("0"); //offer�޼���� �߰�
		q.offer("1");
		q.offer("2");
		//boolean offer(E e)�� ��ü�� E�� �Ķ���ͷ� ����Ͽ� �߰��ϰ� ��ȯ�� boolean
		
		System.out.println("= Stack =");
		while(!st.empty()) {
			//empty()�޼���� Stack�� ����� ���Ұ� ������ true
			System.out.println(st.pop()); //(�Է� ���� �ݴ� - ���� ������ ���Ҹ� ��ȯ)
		}
		System.out.println("= Queue =");
		while(!q.isEmpty()) {
			System.out.println(q.poll()); //FIFO�� ��ȯ(�Է� ����)
		}

	}

}
