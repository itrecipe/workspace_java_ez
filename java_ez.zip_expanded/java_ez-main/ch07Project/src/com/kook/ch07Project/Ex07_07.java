package com.kook.ch07Project;
//���� ���� ����(������ ����)
//��� ���� - instanceof(���翡 ���� ���� �߰�)
public class Ex07_07 {

	public static void main(String[] args) {
		//������
		Car car = null;
		FireEngine fe = new FireEngine(); //��ü����
		FireEngine fe2;
		
		fe.water();
		car = fe; //�������� ���� �θ� Ŭ������ ��ü���� �ڼ�Ŭ���� ��ü�� ������ �� ����, �� ���(�޼���,����)�� �θ�͸� ��밡��
		//car.water(); �ڽ��� ����޼����̹Ƿ� ���Ұ�
		
		fe2 = (FireEngine)car;
		//���� ��ü�� �ڽ� ��ü�� ����ȯ�Ͽ� �����ϸ� �ڼհ�ü�� ������� ��밡��
		fe2.water();
		
		//���� ���� car��ü
		Car car1 = new Car(); //Car ��ü�� ���� ����� ���
		
		//FireEngine fe3;
		
		//�������� ���� ��ü�� �ڼ����� ����ȯ�ϸ� �ڼ��� �޼��� ���Ұ�
		//fe3 = (FireEngine)car1;
		//fe3.water();
		
		/*instanceof�� �ڵ� ����ȯ�� �Ǵ� �������Ͻô� true�̳�,
		  �θ� �ڽ��� ���������� �����ҽ� ���� ����ȯ�ǹǷ� false�� ����
		  instanceof ���� �ǿ����ڴ� ���ǵ� �����������̰� �� �ǿ����ڴ� ������ ������ ���� ������ Ŭ����
		  ���� �ǿ����ڰ� �����̸� true
		 */
		if(fe instanceof FireEngine) {
			System.out.println("fe�� FireEngine���Դϴ�.");
		}
		if(fe instanceof Car) {
			//����� Ŭ������ ����ȯ�� ����(�ڽ��� �θ�� �ڵ� ����ȯ)
			System.out.println("fe�� Car������ ����ȯ �����մϴ�.");
		}
		if(fe instanceof Object) {
			//����� Ŭ������ ����ȯ�� ����(�ڽ��� �θ�� �ڵ� ����ȯ)
			System.out.println("fe�� Obeject������ ����ȯ �����մϴ�.");
		}
		if(car1 instanceof FireEngine) {
			//car1�� Car��ü�̹Ƿ� false, ���������� ���Ծ������Ƿ� false
			System.out.println("car1�� FireEngine������ ����ȯ �����մϴ�.");
		}
		//������ü�� ������ü�� ��ȯ�Ϸ��� �ٷ��ϸ� �ȵǰ� ���� ��ü�� ������ ������ü�� ���� �� �� ��ü�� ������ü�� ��ȯ
		Object obj = new FireEngine();
		FireEngine fo = (FireEngine) obj;
		fo.water();
	}
}

class Car { //���������� default
	String color; //���������� default
	int door;
	
	void drive() { //���������� default
		System.out.println("drive, Brrrr");
	}
	void stop() {
		System.out.println("stop!!");
	}
}

class FireEngine extends Car { //Car Ŭ������ ���
	//Car�� �ִ� ���(��������� ����޽��带 ��� --�� �����ڿ� �ʱ�ȭ ����� ��� x, private����� ��� x)
	void water() {
		System.out.println("water!!!");
	}
}