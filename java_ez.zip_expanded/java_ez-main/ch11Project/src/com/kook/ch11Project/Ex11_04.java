package com.kook.ch11Project;
//��.��
//�ּ����� vǥ�ð� ������ �߿��Ѱ͵�(����صѰ͵�)
import java.util.*;

public class Ex11_04 {
	static Queue q = new LinkedList(); //Ŭ������ �������(�޼���鿡�� ��� ��밡��) v
	//Queue�� �������̽��̹Ƿ� ���� ��ü�� ���� ���ϹǷ� �ڱ⸦ ������ Ŭ������ ����
	static final int MAX_SIZE = 5; //�ֱ� 5��
		
	public static void main(String[] args) {
		System.out.println("help�� �Է��ϸ� ������ �� �� �ִ�.");
		
		while(true) {
			System.out.print(">>");
			
			//Ű����� �ܼ�â���� �Է� �ޱ�
			try {
				Scanner s = new Scanner(System.in);
				String input = s.nextLine().trim();
				//trim()�� ���ڿ� �յ� ���� ����
				//equals() ���ڿ� �� �޼���, ��ҹ��� ����
				if("".equals(input)) {
					continue;
				}
				
				if(input.equalsIgnoreCase("q")) {
					System.exit(0);
				}
				else if(input.equalsIgnoreCase("help")) {
					System.out.println(" help - ������ ������!");
					System.out.println(" q �Ǵ� Q - ���α׷� ����!");
					System.out.println(" history - �ֱٿ� �Է��� ��ɾ"
										+ MAX_SIZE + "�� �����ݴϴ�.");
				}
				//history�Է½� ó��
				//equalsIgnoreCase() ���ڿ� �� �޼���, ��ҹ��� ���� x
				else if(input.equalsIgnoreCase("history")) { 
					int i = 0; //i�� ��� ����
					save(input);
					LinkedList tmp = (LinkedList)q; //v
					/* Queue�� LinkedList�� ������ ��, �������̽� ����������
					   �ڱ⸦ ������ ����Ŭ���� ��ü�� ��ȯ�Ϸ��� ����ȯ�� �ʿ���
					   LinkedList�� �ִ� ��ҵ鿡 ������ �Ϸ��� ListIterator��ü�� �ʿ���
					   ListIterator ��ü�� LinkedList�� listIterator()�޼��带 �̿�
					*/
					ListIterator it = tmp.listIterator();
					
					while(it.hasNext()) {
						System.out.println(++i + "." + it.next());
						//�����ִ� ���߿��� ó�� ���� ��ȯ
					}
				}
				else {
					save(input);
					System.out.println(input);
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	static void save(String input) {
		//Queue q�� ����
		if(!("".equals(input))) {			
			q.offer(input); //Queue�� �����Ҷ� offer()�޼��� ���q
		}
		
		if(q.size() > MAX_SIZE) {
			q.remove(); //v
			/* Queue�� (FIFO)-First in First out(��ó�� �Է��� ��ó�� ���)
			   ù��°�� ������ ��� ����
			*/
		}
	}
}