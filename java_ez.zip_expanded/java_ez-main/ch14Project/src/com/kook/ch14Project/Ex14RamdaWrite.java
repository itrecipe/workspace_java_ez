package com.kook.ch14Project;
//����-(���翡 ���� ����-�߰�����), java������ ������ - 554p
public class Ex14RamdaWrite {

	public static void main(String[] args) {
		
		/* - ���ٽ� �ۼ�����
		 
		 - ���� ���� ���� ���� ���
		(int a, int b) -> {
			return a > b ? a : b;
		}
		
		(int a, int b) -> a > b ? a : b 
		- return���� ���ÿ��� ������ �ƴ� �����̹Ƿ� ;�� ����
		  {}���� ������ �ϳ��Ͻÿ��� { }������ �����ϴ�.
		  (��, return�� ����ҽÿ��� ������ �Ұ����ϴ�.)
		
		(a,b) -> a > b ? a : b
		- �Ķ������ ���������� ��������(�߷п��� �������� ��������)
		
		- ���� ��Ģ���� ���
		(String name, int i) -> {
			System.out.println(name + "=" + i);
		}
		
		(name, i) -> {
		System.out.println(name + "=" + i);
		}
		
		- �� ���̹Ƿ� {}�����ϰ� ; ������
		(name, i) -> 
		System.out.println(name + "=" + i);
		
		- ���� ���� ���
		(int x) -> {
			return x * y;
		}
		
		(int x) -> x * x
		
		- ���������� ������ ���
		(x) -> x * x  
		- �Ķ���� �Ű������� �ϳ��ϰ�� ()���� ����, 
		(��, ���������� �����ÿ��� �Ұ��� int x -> �� ����)
		
		- return�� ���� �� ; �������, return���ÿ��� �����̶� {}���
		() -> {return (int)(Math.random() * 6);}
		
		- �����̹Ƿ� return�� �����Ƿ� {}���� �� ;�� ���� 
		() -> (int)(Math.random() * 6)
		
		(int[] arr) -> {
			int sum = 0;
			for(int i : arr)
				sum += i;
			return sum;
		}
		
		*/
	}
	
	int max(int a, int b) {
		return a > b ? a : b;
	}
	
	void printVar(String name, int i) {
		System.out.println(name + "=" + i);
	}
	
	int square(int x) {
		return x * x;
	}
	
	int roll() {
		return (int)(Math.random() * 6); 
				
	}
	
	int sumArr(int[] arr) {
		int sum = 0;
		for(int i : arr)
			sum += i;
		return sum;
	}
}