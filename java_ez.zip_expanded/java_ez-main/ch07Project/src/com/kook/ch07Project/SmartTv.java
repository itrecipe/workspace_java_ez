package com.kook.ch07Project;

public class SmartTv extends Tv {
	/* TvŬ������ ���
	 * TvŬ������ ��������� ����޼��带 ���(�����ڳ� �ʱ�ȭ ����� ��� x)
	   ������� power, chnnel�� ����޼��� power(), chnnelUp(), chnnelDown()�� ���
	   ��ӵ� ���� �߰��Ұ͸� �ۼ�
	*/
	boolean caption;
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
}
