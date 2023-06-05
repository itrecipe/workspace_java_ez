package com.kook.ch12Project;
//��.��
public class Ex12_06 {

	public static void main(String[] args) {
		for(Direction2 d : Direction2.values()) {
			//enum��.values()�� enum���� ���� �ִ� ������ ����(���)��ü�� �迭�� ��ȯ
			System.out.printf("%s=%d%s%n", d.name(),d.getValue(),d.getSymbol());
		}
		
		Direction2 d1 = Direction2.EAST; //enum�� ������ ����� ��ü�� ó��
		Direction2 d2 = Direction2.SOUTH;
		
		System.out.printf("d1=%s, %d%n", d1.name(), d1.getValue());
		System.out.printf("d2=%s, %d%n", d2.name(), d2.getValue());
	}
}

enum Direction2 {
	EAST(1, ">"), SOUTH(2,"V"), WEST(3,"<"), NORTH(4,"^");
	/* - ��� ���� ������ �ο��ҽ� ( )�ȿ� �ο��Ѵ�.(���⼭�� 2������ ��)
	   - ��� �����Ŀ� ;�� ���
	   - ��ȣ���� ù��° ���ڴ� value, �ι�° ���ڴ� symbol������ ��Ÿ����.
	   - ��ȣ���� 2�� ���ڸ� �ʱ�ȭ�ϴ� �����ڿ� �ΰ� ���ڸ� ��Ÿ���� ��������� ����� �����.
	*/
	
	private final int value;
	private final String symbol;
	
	Direction2(int value, String symbol) { //���������ڴ� ���������� private
		this.value = value;
		this.symbol = symbol;
	}
	
	//�ܺο��� ������� ������ �����ϵ����ϴ� get�޼��� ����
	public int getValue() {
		return value;
	}
	public String getSymbol() {
		return symbol;
	}
	public String toString() {
		return name()+getSymbol();
	}
}